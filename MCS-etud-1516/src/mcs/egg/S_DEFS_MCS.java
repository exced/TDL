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
public class S_DEFS_MCS {
LEX_MCS scanner;
  S_DEFS_MCS() {
    }
  S_DEFS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  LCHAMPS att_hchamps;
  LCHAMPS att_champs;
  IMachine att_machine;
  TDS att_stds;
  LEX_MCS att_scanner;
  private void regle93() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_93();
  }
  private void regle94() throws Exception {

    //declaration
    S_ACCES_MCS x_2 = new S_ACCES_MCS(scanner,att_eval) ;
    S_DEF_MCS x_3 = new S_DEF_MCS(scanner,att_eval) ;
    S_DEFS_MCS x_5 = new S_DEFS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_94(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_def_94(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_94(x_2, x_3, x_5);
  }
private void action_def_94(S_ACCES_MCS x_2, S_DEF_MCS x_3, S_DEFS_MCS x_5) throws Exception {
try {
// locales
CHAMP loc_c;
INFOVAR loc_iv;
INFOFONC loc_inf;
CHAMP loc_ch;
// instructions
loc_c=this.att_hchamps.chercherChamp(x_3.att_sident);
if (loc_c!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_def_defined, MCSMessages.def_defined,new Object[]{""+x_3.att_sident, ""+this.att_hchamps});

}
else {
if (x_3.att_sinfo instanceof INFOVAR ){
loc_iv=((INFOVAR)x_3.att_sinfo);
loc_iv.setAcces(x_2.att_acces);
loc_ch= new CHAMP(x_3.att_sident, ((INFOVAR)x_3.att_sinfo), this.att_hchamps.getCurrentDep(), x_2.att_acces);
this.att_hchamps.inserer(loc_ch);
this.att_tds.inserer(x_3.att_sident, loc_iv);
}
else if (x_3.att_sinfo instanceof INFOFONC ){
loc_inf=((INFOFONC)x_3.att_sinfo);
loc_inf.setAcces(x_2.att_acces);
loc_ch= new CHAMP(x_3.att_sident, ((INFOFONC)x_3.att_sinfo), this.att_hchamps.getCurrentDep(), x_2.att_acces);
this.att_hchamps.inserer(loc_ch);
this.att_tds.inserer(x_3.att_sident, loc_inf);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_def, MCSMessages.not_def,new Object[]{""+x_3.att_sident, ""+x_3.att_sinfo});


}
x_5.att_hchamps=this.att_hchamps;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#def","DEFS -> ACCES DEF #def DEFS1 #gen ;"});
}
  }
private void action_gen_93() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
this.att_champs=this.att_hchamps;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEFS -> #gen ;"});
}
  }
private void action_auto_inh_94(S_ACCES_MCS x_2, S_DEF_MCS x_3, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEFS -> ACCES DEF #def DEFS1 #gen ;"});
}
  }
private void action_gen_94(S_ACCES_MCS x_2, S_DEF_MCS x_3, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_5.att_code;
this.att_champs=x_5.att_champs;
this.att_stds=x_5.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEFS -> ACCES DEF #def DEFS1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 4512
        regle93 () ;
      break ;
      case LEX_MCS.token_public : // 4530
        regle94 () ;
      break ;
      case LEX_MCS.token_private : // 4531
        regle94 () ;
      break ;
      case LEX_MCS.token_void : // 4519
        regle94 () ;
      break ;
      case LEX_MCS.token_int : // 4521
        regle94 () ;
      break ;
      case LEX_MCS.token_char : // 4522
        regle94 () ;
      break ;
      case LEX_MCS.token_identc : // 4561
        regle94 () ;
      break ;
      case LEX_MCS.token_struct : // 4523
        regle94 () ;
      break ;
      case LEX_MCS.token_bool : // 4533
        regle94 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
