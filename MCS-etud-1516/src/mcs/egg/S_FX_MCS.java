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
public class S_FX_MCS {
LEX_MCS scanner;
  S_FX_MCS() {
    }
  S_FX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  DTYPE att_type;
  String att_hcode;
  private void regle72() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_72(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_a_72(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_72(x_3, x_5);
  }
  private void regle71() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_71();
  }
  private void regle74() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_ES_MCS x_3 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_6 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_74(x_3, x_6);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htds_74(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_type_74(x_3, x_6);
if  (att_eval)      action_gen_74(x_3, x_6);
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_3, x_4);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
if  (att_eval)      action_type_73(x_3, x_4);
if  (att_eval)      action_gen_73(x_3, x_4);
  }
private void action_auto_inh_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_ident=this.att_ident;
x_4.att_htype=this.att_htype;
x_4.att_tds=this.att_tds;
x_4.att_hcode=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident FX1 #type #gen ;"});
}
  }
private void action_htds_74(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_6.att_tds=x_3.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","FX -> paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_auto_inh_74(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_6.att_ident=this.att_ident;
x_6.att_htype=this.att_htype;
x_3.att_tds=this.att_tds;
x_6.att_hcode=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_a_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_type_74(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_type=x_6.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_type_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident FX1 #type #gen ;"});
}
  }
private void action_gen_74(S_ES_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_machine.addCurrentDep(3);
this.att_code=this.att_machine.genArgs(x_3.att_stds)+this.att_machine.genCall(this.att_ident);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_gen_71() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> #gen ;"});
}
  }
private void action_gen_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> arrow ident FX1 #type #gen ;"});
}
  }
private void action_auto_inh_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_ident=this.att_ident;
x_5.att_htype=this.att_htype;
x_5.att_tds=this.att_tds;
x_5.att_hcode=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_gen_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> pt ident #a FX1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 3462
        regle71 () ;
      break ;
      case LEX_MCS.token_div : // 3463
        regle71 () ;
      break ;
      case LEX_MCS.token_mod : // 3464
        regle71 () ;
      break ;
      case LEX_MCS.token_et : // 3465
        regle71 () ;
      break ;
      case LEX_MCS.token_plus : // 3459
        regle71 () ;
      break ;
      case LEX_MCS.token_moins : // 3460
        regle71 () ;
      break ;
      case LEX_MCS.token_ou : // 3461
        regle71 () ;
      break ;
      case LEX_MCS.token_inf : // 3453
        regle71 () ;
      break ;
      case LEX_MCS.token_sup : // 3455
        regle71 () ;
      break ;
      case LEX_MCS.token_infeg : // 3454
        regle71 () ;
      break ;
      case LEX_MCS.token_supeg : // 3456
        regle71 () ;
      break ;
      case LEX_MCS.token_eg : // 3457
        regle71 () ;
      break ;
      case LEX_MCS.token_neg : // 3458
        regle71 () ;
      break ;
      case LEX_MCS.token_affect : // 3426
        regle71 () ;
      break ;
      case LEX_MCS.token_virg : // 3423
        regle71 () ;
      break ;
      case LEX_MCS.token_pv : // 3425
        regle71 () ;
      break ;
      case LEX_MCS.token_parf : // 3420
        regle71 () ;
      break ;
      case LEX_MCS.token_pt : // 3424
        regle72 () ;
      break ;
      case LEX_MCS.token_arrow : // 3451
        regle73 () ;
      break ;
      case LEX_MCS.token_paro : // 3419
        regle74 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
