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
  private void regle75() throws Exception {

    //declaration
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_ES_MCS x_4 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_FX_MCS x_7 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_75(x_4, x_7);
if  (att_eval)      action_tds_75(x_4, x_7);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htds_75(x_4, x_7);
    x_7.analyser() ;
if  (att_eval)      action_type_75(x_4, x_7);
if  (att_eval)      action_gen_75(x_4, x_7);
  }
  private void regle72() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_72();
  }
  private void regle74() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_74(x_3, x_4);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
if  (att_eval)      action_type_74(x_3, x_4);
if  (att_eval)      action_gen_74(x_3, x_4);
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_a_73(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_73(x_3, x_5);
  }
private void action_auto_inh_73(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_ident=this.att_ident;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_auto_inh_74(T_MCS x_3, S_FX_MCS x_4) throws Exception {
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
private void action_auto_inh_75(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_7.att_ident=this.att_ident;
x_7.att_htype=this.att_htype;
x_7.att_hcode=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_tds_75(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_tds= new TDS(null);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_htds_75(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_7.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_type_74(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident FX1 #type #gen ;"});
}
  }
private void action_type_75(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
this.att_type=x_7.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_a_73(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
if (this.att_htype instanceof STRUCT ){
loc_s=((STRUCT)this.att_htype);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercherChamp(x_3.att_txt);
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_not_found, MCSMessages.champ_not_found,new Object[]{""+loc_lc, ""+x_3.att_txt});

}
else {
x_5.att_htype=loc_c.getType();
x_5.att_hcode=this.att_hcode+this.att_machine.genAdrField(loc_c.getDep());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+this.att_htype.getNom()});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_gen_75(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// locales
INFO loc_i;
INFOFONC loc_infofonc;
TDS loc_tdsParam;
// instructions
System.out.print(""+"Appel fonction : "+this.att_ident+"\n");
loc_i=this.att_tds.chercherGlobalement(this.att_ident);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_var_not_found, MCSMessages.var_not_found,new Object[]{""+this.att_ident, ""+"null"});

}

if (loc_i instanceof INFOFONC ){
loc_infofonc=((INFOFONC)loc_i);
loc_tdsParam=loc_infofonc.getParams();
if (!(x_4.att_stds.compareTypeTo(loc_tdsParam))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_call_nomatch, MCSMessages.call_nomatch,new Object[]{""+this.att_ident});

}
else {
this.att_code=this.att_machine.genArgs(x_4.att_stds)+this.att_machine.genCall(this.att_ident);
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_wrong_typeFonc, MCSMessages.wrong_typeFonc,new Object[]{""+this.att_ident, ""+loc_i.getType()});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_gen_74(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> arrow ident FX1 #type #gen ;"});
}
  }
private void action_gen_73(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_gen_72() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 10311
        regle72 () ;
      break ;
      case LEX_MCS.token_div : // 10312
        regle72 () ;
      break ;
      case LEX_MCS.token_mod : // 10313
        regle72 () ;
      break ;
      case LEX_MCS.token_et : // 10314
        regle72 () ;
      break ;
      case LEX_MCS.token_plus : // 10308
        regle72 () ;
      break ;
      case LEX_MCS.token_moins : // 10309
        regle72 () ;
      break ;
      case LEX_MCS.token_ou : // 10310
        regle72 () ;
      break ;
      case LEX_MCS.token_inf : // 10302
        regle72 () ;
      break ;
      case LEX_MCS.token_sup : // 10304
        regle72 () ;
      break ;
      case LEX_MCS.token_infeg : // 10303
        regle72 () ;
      break ;
      case LEX_MCS.token_supeg : // 10305
        regle72 () ;
      break ;
      case LEX_MCS.token_eg : // 10306
        regle72 () ;
      break ;
      case LEX_MCS.token_neg : // 10307
        regle72 () ;
      break ;
      case LEX_MCS.token_affect : // 10275
        regle72 () ;
      break ;
      case LEX_MCS.token_virg : // 10272
        regle72 () ;
      break ;
      case LEX_MCS.token_pv : // 10274
        regle72 () ;
      break ;
      case LEX_MCS.token_parf : // 10269
        regle72 () ;
      break ;
      case LEX_MCS.token_pt : // 10273
        regle73 () ;
      break ;
      case LEX_MCS.token_arrow : // 10300
        regle74 () ;
      break ;
      case LEX_MCS.token_paro : // 10268
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
