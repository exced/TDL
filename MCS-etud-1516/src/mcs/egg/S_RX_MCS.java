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
public class S_RX_MCS {
LEX_MCS scanner;
  S_RX_MCS() {
    }
  S_RX_MCS(LEX_MCS scanner, boolean eval) {
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
  boolean att_hest_decl;
  LEX_MCS att_scanner;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_hcode_est_adresse;
  private void regle48() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_48();
  }
  private void regle47() throws Exception {

    //declaration
    S_OPADD_MCS x_2 = new S_OPADD_MCS(scanner,att_eval) ;
    S_T_MCS x_3 = new S_T_MCS(scanner,att_eval) ;
    S_RX_MCS x_4 = new S_RX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_47(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
if  (att_eval)      action_type_47(x_2, x_3, x_4);
if  (att_eval)      action_gen_47(x_2, x_3, x_4);
  }
private void action_auto_inh_47(S_OPADD_MCS x_2, S_T_MCS x_3, S_RX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_4.att_htype=this.att_htype;
x_3.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_3.att_hest_decl=this.att_hest_decl;
x_4.att_hest_decl=this.att_hest_decl;
x_4.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","RX -> OPADD T RX1 #type #gen ;"});
}
  }
private void action_gen_47(S_OPADD_MCS x_2, S_T_MCS x_3, S_RX_MCS x_4) throws Exception {
try {
// instructions
this.att_code_est_adresse=false;
this.att_code=x_3.att_code+x_4.att_code+x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","RX -> OPADD T RX1 #type #gen ;"});
}
  }
private void action_type_47(S_OPADD_MCS x_2, S_T_MCS x_3, S_RX_MCS x_4) throws Exception {
try {
// instructions
if (!(this.att_htype.compareOpBin(x_2.att_type, x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_2.att_type.getNom(), ""+x_3.att_type.getNom()});

}
else if (!(this.att_htype.compareOpBin(x_2.att_type, x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_2.att_type.getNom(), ""+x_4.att_type.getNom()});

}
else {
this.att_type=x_3.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","RX -> OPADD T RX1 #type #gen ;"});
}
  }
private void action_type_48() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code_est_adresse=this.att_hcode_est_adresse;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","RX -> #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
<<<<<<< HEAD
      case LEX_MCS.token_plus : // 40880
=======
<<<<<<< HEAD
      case LEX_MCS.token_plus : // 180
        regle47 () ;
      break ;
      case LEX_MCS.token_moins : // 181
        regle47 () ;
      break ;
      case LEX_MCS.token_ou : // 182
        regle47 () ;
      break ;
      case LEX_MCS.token_inf : // 174
        regle48 () ;
      break ;
      case LEX_MCS.token_sup : // 176
        regle48 () ;
      break ;
      case LEX_MCS.token_infeg : // 175
        regle48 () ;
      break ;
      case LEX_MCS.token_supeg : // 177
        regle48 () ;
      break ;
      case LEX_MCS.token_eg : // 178
        regle48 () ;
      break ;
      case LEX_MCS.token_neg : // 179
        regle48 () ;
      break ;
      case LEX_MCS.token_affect : // 147
        regle48 () ;
      break ;
      case LEX_MCS.token_virg : // 144
        regle48 () ;
      break ;
      case LEX_MCS.token_pv : // 146
        regle48 () ;
      break ;
      case LEX_MCS.token_parf : // 141
=======
      case LEX_MCS.token_plus : // 7649
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle47 () ;
      break ;
      case LEX_MCS.token_moins : // 40881
        regle47 () ;
      break ;
      case LEX_MCS.token_ou : // 40882
        regle47 () ;
      break ;
      case LEX_MCS.token_inf : // 40874
        regle48 () ;
      break ;
      case LEX_MCS.token_sup : // 40876
        regle48 () ;
      break ;
      case LEX_MCS.token_infeg : // 40875
        regle48 () ;
      break ;
      case LEX_MCS.token_supeg : // 40877
        regle48 () ;
      break ;
      case LEX_MCS.token_eg : // 40878
        regle48 () ;
      break ;
      case LEX_MCS.token_neg : // 40879
        regle48 () ;
      break ;
      case LEX_MCS.token_affect : // 40847
        regle48 () ;
      break ;
      case LEX_MCS.token_virg : // 40844
        regle48 () ;
      break ;
      case LEX_MCS.token_pv : // 40846
        regle48 () ;
      break ;
<<<<<<< HEAD
      case LEX_MCS.token_parf : // 40841
=======
      case LEX_MCS.token_parf : // 7610
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle48 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
