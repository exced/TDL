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
public class S_OPREL_MCS {
LEX_MCS scanner;
  S_OPREL_MCS() {
    }
  S_OPREL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle40() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_inf);
if  (att_eval)      action_type_40();
  }
  private void regle41() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_sup);
if  (att_eval)      action_type_41();
  }
  private void regle42() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_infeg);
if  (att_eval)      action_type_42();
  }
  private void regle43() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_supeg);
if  (att_eval)      action_type_43();
  }
  private void regle44() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_eg);
if  (att_eval)      action_type_44();
  }
  private void regle45() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_neg);
if  (att_eval)      action_type_45();
  }
private void action_type_45() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELNEG", 1);
this.att_code=this.att_machine.genOp("INeq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> neg #type ;"});
}
  }
private void action_type_43() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELSUPEG", 1);
this.att_code=this.att_machine.genOp("IGeq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> supeg #type ;"});
}
  }
private void action_type_44() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELEG", 1);
this.att_code=this.att_machine.genOp("IEq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> eg #type ;"});
}
  }
private void action_type_41() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELSUP", 1);
this.att_code=this.att_machine.genOp("IGtr");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> sup #type ;"});
}
  }
private void action_type_42() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELINFEG", 1);
this.att_code=this.att_machine.genOp("ILeq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> infeg #type ;"});
}
  }
private void action_type_40() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELINF", 1);
this.att_code=this.att_machine.genOp("ILss");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> inf #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
<<<<<<< HEAD
      case LEX_MCS.token_inf : // 40874
=======
<<<<<<< HEAD
      case LEX_MCS.token_inf : // 174
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 176
        regle41 () ;
      break ;
      case LEX_MCS.token_infeg : // 175
        regle42 () ;
      break ;
      case LEX_MCS.token_supeg : // 177
        regle43 () ;
      break ;
      case LEX_MCS.token_eg : // 178
        regle44 () ;
      break ;
      case LEX_MCS.token_neg : // 179
=======
      case LEX_MCS.token_inf : // 7643
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 40876
        regle41 () ;
      break ;
      case LEX_MCS.token_infeg : // 40875
        regle42 () ;
      break ;
      case LEX_MCS.token_supeg : // 40877
        regle43 () ;
      break ;
      case LEX_MCS.token_eg : // 40878
        regle44 () ;
      break ;
<<<<<<< HEAD
      case LEX_MCS.token_neg : // 40879
=======
      case LEX_MCS.token_neg : // 7648
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle45 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
