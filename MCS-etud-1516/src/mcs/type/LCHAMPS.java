package mcs.type;

import java.util.ArrayList;

public class LCHAMPS extends ArrayList<CHAMP> {

	private static final long serialVersionUID = 1L;

	public CHAMP chercher(String nom) {
		for (CHAMP c : this) {
			if (c.getNom().equals(nom))
				return c;
		}
		return null;

	}

	// Recuperer le deplacement d'un champ dans un struct
	public int getDep(String nom){
		int dep = 0;
		for(CHAMP c : this){
			if (c.getNom().equals(nom)) {
				break;
			}
			dep = dep + c.getType().getTaille();
		}
		return dep;
	}
	
	public int getTaille() {
		int t = 0;
		for (CHAMP c : this) {
			t += c.getType().getTaille();
		}
		return t;
	}

	public void inserer(CHAMP c) {
		add(c);
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (CHAMP c : this) {
			sb.append(c + ", ");
		}
		return sb.toString();
	}

	public boolean compareTo(LCHAMPS autre) {
		int lc = size();
		int lca = autre.size();
		if (lc != lca)
			return false;
		for (int i = 0; i < lc; i++) {
			CHAMP c = get(i);
			CHAMP ca = autre.get(i);
			if (!c.getNom().equals(ca.getNom())
					|| !c.getType().compareTo(ca.getType()))
				return false;
		}
		return true;
	}
}
