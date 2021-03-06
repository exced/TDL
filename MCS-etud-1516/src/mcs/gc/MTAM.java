package mcs.gc;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import mcs.tds.INFO;
import mcs.tds.INFOCLASSE;
import mcs.tds.INFONAMESPACE;
import mcs.tds.INFOVAR;
import mcs.tds.TDS;
import mcs.type.*;

/**
 * La machine TAM et ses fonctions de generation
 * @author marcel
 *
 */
public class MTAM extends AbstractMachine {

	private String nom;

	/**
	 *  compteur pour le generateur d'etiquettes
	 */
	private static int cpt = 0;

	/**
	 *  déplacement courant dans un bloc (relatif par rapport à LB)
	 */
	private int currentDep;

	/**
	 *  liste des namespaces du programme pour faciliter la recherche
	 */
	private LinkedHashMap<String,INFONAMESPACE> lNS;

	/**
	 *  liste des classes du programme pour faciliter la recherche
	 */
	private LinkedHashMap<String,INFOCLASSE> lCL;

	/**
	 * liste des namespace used (using)
	 */
	private LinkedHashMap<String, INFONAMESPACE> usedNS;


	public MTAM(String fname) {
		if (fname.endsWith(".mcs")) {
			nom = fname.substring(0, fname.length() - 5);
		} else {
			nom = fname;
		}
		usedNS = new LinkedHashMap<String, INFONAMESPACE>();
		lNS = new LinkedHashMap<String,INFONAMESPACE>();
		lCL = new LinkedHashMap<String,INFOCLASSE>();
		currentDep = 0;
	}

	public int getCurrentDep() { return currentDep; }


	public void addCurrentDep(int dep){
		currentDep += dep;
	}

	public void resetCurrentDep(){
		currentDep = 0;
	}	

	public String genFonction(String etiquette, int taillepars,
			int tailleretour, String code) {
		return "_" + etiquette + ":\n" + code + "\tRETURN (" + taillepars + ") "
				+ tailleretour + "\n";

	}


	public String genArgs(TDS t){
		StringBuffer sb = new StringBuffer();
		Set<Map.Entry<String, INFO>> s = t.entrySet();
		for (Map.Entry<String, INFO> e : s) {
			sb.append( e.getKey() );
		}
		return sb.toString();
	}

	public String genCall(String etiquette) {
		return "; Appel a " + etiquette + "\n" + "\tCALL(SB) _" + etiquette
				+ "\n";
	}

	// genere le code pour une declaration (avec initialisation)
	public String genDecl(String n, INFOVAR i, String t) {
		int taille = i.getType().getTaille();
		return "   ; declaration de " + n + " en " + i.getDep() + "/LB"
		+ " taille = " + taille + "\n" + t + "; fin de declaration de "
		+ n + "\n";
	}

	// genere une etiquette differente des autres
	public String genEtiq() {
		return "X" + cpt++;
	}

	public String getXEtiq() { return "X"+ cpt; }

	// genere le code pour l'arret de la machine
	public String genFin() {
		return "\tHALT\n";
	}

	public void genAsm(String nomf, String code) {
		try {
			PrintWriter pw = new PrintWriter(new FileOutputStream(nom + ".tam"));
			pw.println(";;; code TAM engendre pour " + nom + "\n");
			pw.print(genCall(nomf));
			pw.print(genFin());
			pw.print(code);
			pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public String genVar(int taille){
		return "\tPUSH " + taille + "\n";
	}

	public String genCst(String v) {
		return "\tLOADL " + v + "\n";
	}

	public String genChar(String v) {
		return "\tLOADL " + v + "\n";
	}

	public String genChaine(String v) {
		return "\tLOADL " + v + "\n" + genOp("SAlloc");
	}

	public String genFree(int dep){
		return "\tPOP (0) " + dep + "\n"; 
	}

	public String genReadMem(int dep, int taille) {
		return "\tLOAD(" + taille + ") " + dep + "[LB]\n";
	}

	public String genWriteMem(int dep, int taille) {
		return "\tSTORE(" + taille + ") " + dep + "[LB]\n";
	}

	public String genReadIndirectMem(int taille) {
		return "\tLOADI(" + taille + ")\n";
	}

	public String genWriteIndirectMem(int taille) {
		return "\tSTOREI(" + taille + ")\n";
	}

	public String genIf(String code, String code2, String code3) {
		String sinon = genEtiq();
		String fin = genEtiq();
		return "\t; if\n" + code + "\n" + "\tJUMPIF(0) " + sinon + "\n" + code2
				+ "\n" + "\tJUMP " + fin + "\n" + sinon+":" + "\n" + code3 + "\n"
				+ fin+":" + "\n" + "\t; fin if\n";
	}

	public String genJumpIf(int taille, String etq) {
		return "\tJUMPIF(" + taille + ") " + etq + "\n";
	}


	public String genMalloc(int taille) {
		return "\tLOADL " + taille + "\n" + "\tSUBR Malloc\n";
	}

	public String genAdr(int dep) {
		return "\tLOADA " + dep + "[LB]\n";
	}

	public String genAdrField(int dep) {
		return "\t;Calcul deplacement struct " + dep + "\n" + "\tLOADL " + dep
				+ "\n\tSUBR Iadd\n";
	}

	public String genComment(String c) {
		return "; " + c + "\n";
	}	

	public String genOp(String op) {
		return "\tSUBR " + op + "\n";
	}

	public String genJump(String etq){
		return "\tJUMP " + etq + "\n";
	}

	@Override
	public String getSuffixe() {
		return "tam";
	}

	public boolean stringEquals(String sg, String sd){
		return sg.equals(sd);
	}

	public LinkedHashMap<String,INFONAMESPACE> getNamespaces() { return lNS; }

	public LinkedHashMap<String,INFOCLASSE> getClasses() { return lCL; }

	public void addNamespace(String s, INFONAMESPACE i) { lNS.put(s,i); }

	public void addClasse(String s,INFOCLASSE i) { lCL.put(s,i); }

	public void addUsedNS(String n, INFONAMESPACE ins){
		usedNS.put(n,ins);
	}

	public INFO chercherNS(String n) {
		return lNS.get(n);
	}

	public INFO chercherNS(String n, TDS tds){
		return tds.chercherLocalement(n) != null ? lNS.get(n) : null;
	}

	public INFO chercherCL(String n) {
		return lCL.get(n);
	}


	/*
	 * chercher un namespace avec un nom composé
	 */
	public INFO chercherNamespace(String n) {
		String[] strings = n.split(Pattern.quote("."));
		INFO i = null;
		INFO ip = null;
		boolean b = true;
		// nom simple
		if (strings.length == 1){
			return chercherNS(n) instanceof INFONAMESPACE ? chercherNS(n) : null;
		}
		else {
			ip = chercherNS(strings[0]);
			for (int j = 1; j <= strings.length; j++){
				i = chercherNS(strings[j]);
				// composition
				if (!((INFONAMESPACE) i).getNSParent().equals(ip))
					return null;
				ip = i;
				b = b && (i != null);
			}
		}
		return b ? i : null;
	}


	public INFO chercherClasse(String n){
		String[] strings = n.split(Pattern.quote("."));
		String ins = "";
		String inc;
		INFO info = null;
		INFO infoC = null;
		boolean b = true;
		// nom simple + INFOCLASSE
		if (strings.length == 1){
			return chercherCL(n) instanceof INFOCLASSE ? chercherCL(n) : null;
		}
		// nom composé + INFONAMESPACE...S + INFOCLASSE
		for (int i = 0; i < strings.length - 1; i++){
			ins = ins + strings[i];
			if (i != strings.length - 2)
				ins = ins + ".";
		}
		inc = strings[strings.length - 1];
		info = chercherNamespace(ins);
		infoC = chercherCL(inc);
		// composition
		if (!((INFONAMESPACE) infoC).getNSParent().equals(info))
			return null;
		b = (info != null) && (infoC != null);
		return b ? infoC : null;
	}

}
