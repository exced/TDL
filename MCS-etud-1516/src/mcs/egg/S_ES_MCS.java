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
public class S_ES_MCS {
LEX_MCS scanner;
  S_ES_MCS() {
    }
  S_ES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  TDS glob_76_tds;
  private void regle75() throws Exception {

    //declaration
    //appel
  }
  private void regle76() throws Exception {

    //declaration
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_4 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_76(x_3, x_4);
if  (att_eval)      action_tds_76(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_tds_76(S_E_MCS x_3, S_ESX_MCS x_4) throws Exception {
try {
// instructions
glob_76_tds= new TDS(this.att_tds);
x_3.att_tds=glob_76_tds;
x_4.att_tds=glob_76_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ES -> #tds E ESX ;"});
}
  }
private void action_auto_inh_76(S_E_MCS x_3, S_ESX_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ES -> #tds E ESX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 334
        regle75 () ;
      break ;
      case LEX_MCS.token_entier : // 366
        regle76 () ;
      break ;
      case LEX_MCS.token_chaine : // 368
        regle76 () ;
      break ;
      case LEX_MCS.token_caractere : // 367
        regle76 () ;
      break ;
      case LEX_MCS.token_plus : // 358
        regle76 () ;
      break ;
      case LEX_MCS.token_moins : // 359
        regle76 () ;
      break ;
      case LEX_MCS.token_non : // 365
        regle76 () ;
      break ;
      case LEX_MCS.token_null : // 351
        regle76 () ;
      break ;
      case LEX_MCS.token_paro : // 333
        regle76 () ;
      break ;
      case LEX_MCS.token_mult : // 361
        regle76 () ;
      break ;
      case LEX_MCS.token_ident : // 369
        regle76 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }