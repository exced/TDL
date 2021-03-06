package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_WHILE_MCS {
LEX_MCS scanner;
  S_WHILE_MCS() {
    }
  S_WHILE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_identSuper;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  String att_identClasse;
  private void regle29() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_5 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_29(x_5);
    x_2.analyser(LEX_MCS.token_while);
    x_3.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_hcond_29(x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_gen_29(x_5);
  }
private void action_gen_29(S_E_MCS x_5) throws Exception {
try {
// locales
String loc_code;
// instructions
loc_code="";
if (!(x_5.att_type.compareTo( new DTYPEImpl("bool", 1)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_bool, MCSMessages.not_bool,new Object[]{""+x_5.att_type.getNom()});

}
else {
if (x_5.att_estTestRel){
loc_code="";
}
else {
loc_code=this.att_machine.genCst("1")+this.att_machine.genOp("IEq");
}
}
this.att_code=x_5.att_code+loc_code+this.att_machine.genJumpIf(1, this.att_ident);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","WHILE -> while paro #hcond E parf #gen ;"});
}
  }
private void action_hcond_29(S_E_MCS x_5) throws Exception {
try {
// instructions
x_5.att_estConditionnelle=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hcond","WHILE -> while paro #hcond E parf #gen ;"});
}
  }
private void action_auto_inh_29(S_E_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_identSuper=this.att_identSuper;
x_5.att_identClasse=this.att_identClasse;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","WHILE -> while paro #hcond E parf #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle29 () ;
  }
  }
