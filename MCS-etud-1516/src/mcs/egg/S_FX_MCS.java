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
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_74(x_3, x_5);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_74(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_74(x_3, x_5);
if  (att_eval)      action_gen_74(x_3, x_5);
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
private void action_type_74(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident #htype FX1 #type #gen ;"});
}
  }
private void action_type_75(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
this.att_type=x_7.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
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
private void action_gen_74(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> arrow ident #htype FX1 #type #gen ;"});
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
private void action_auto_inh_73(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_ident=this.att_ident;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_auto_inh_74(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_ident=this.att_ident;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident #htype FX1 #type #gen ;"});
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
private void action_a_73(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
DTYPE loc_t;
POINTEUR loc_p;
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
if (this.att_htype instanceof POINTEUR ){
loc_p=((POINTEUR)this.att_htype);
loc_t=loc_p.getType();
if (loc_t instanceof STRUCT ){
loc_s=((STRUCT)loc_t);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercherChamp(x_3.att_txt);
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_not_found, MCSMessages.champ_not_found,new Object[]{""+loc_lc, ""+x_3.att_txt});

}
else {
x_5.att_htype= new POINTEUR(loc_c.getType());
x_5.att_hcode=this.att_hcode+this.att_machine.genPointeurField(loc_c.getDep());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+((POINTEUR)this.att_htype).getNom(), ""+x_3.att_txt});


}
}
else if (this.att_htype instanceof STRUCT ){
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
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+this.att_htype.getNom(), ""+x_3.att_txt});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_htype_74(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
DTYPE loc_t;
POINTEUR loc_p;
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
if (this.att_htype instanceof POINTEUR ){
loc_p=((POINTEUR)this.att_htype);
loc_t=loc_p.getType();
if (loc_t instanceof STRUCT ){
loc_s=((STRUCT)loc_t);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercherChamp(x_3.att_txt);
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_not_found, MCSMessages.champ_not_found,new Object[]{""+loc_lc, ""+x_3.att_txt});

}
else {
x_5.att_htype=loc_c.getType();
x_5.att_hcode=this.att_hcode+this.att_machine.genPointeurField(loc_c.getDep());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+((POINTEUR)this.att_htype).getNom(), ""+x_3.att_txt});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_access_not_pointeur, MCSMessages.access_not_pointeur,new Object[]{""+x_3.att_txt});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> arrow ident #htype FX1 #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 14393
        regle72 () ;
      break ;
      case LEX_MCS.token_div : // 14394
        regle72 () ;
      break ;
      case LEX_MCS.token_mod : // 14395
        regle72 () ;
      break ;
      case LEX_MCS.token_et : // 14396
        regle72 () ;
      break ;
      case LEX_MCS.token_plus : // 14390
        regle72 () ;
      break ;
      case LEX_MCS.token_moins : // 14391
        regle72 () ;
      break ;
      case LEX_MCS.token_ou : // 14392
        regle72 () ;
      break ;
      case LEX_MCS.token_inf : // 14384
        regle72 () ;
      break ;
      case LEX_MCS.token_sup : // 14386
        regle72 () ;
      break ;
      case LEX_MCS.token_infeg : // 14385
        regle72 () ;
      break ;
      case LEX_MCS.token_supeg : // 14387
        regle72 () ;
      break ;
      case LEX_MCS.token_eg : // 14388
        regle72 () ;
      break ;
      case LEX_MCS.token_neg : // 14389
        regle72 () ;
      break ;
      case LEX_MCS.token_affect : // 14357
        regle72 () ;
      break ;
      case LEX_MCS.token_virg : // 14354
        regle72 () ;
      break ;
      case LEX_MCS.token_pv : // 14356
        regle72 () ;
      break ;
      case LEX_MCS.token_parf : // 14351
        regle72 () ;
      break ;
      case LEX_MCS.token_pt : // 14355
        regle73 () ;
      break ;
      case LEX_MCS.token_arrow : // 14382
        regle74 () ;
      break ;
      case LEX_MCS.token_paro : // 14350
        regle75 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
