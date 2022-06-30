/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Controller;
import itecalculatorgui.src.itecalculatorgui.Model.ModelSimpleCalculator;
import itecalculatorgui.src.itecalculatorgui.View.SimpleCalculator;

/**
 *
 * @author BTS071016
 */
public class ControllerSimple {
    
    private SimpleCalculator sview;//view  object  of simpleCalculator
    private ModelSimpleCalculator smodel;// model of object simplleCalculator
    private String Operator;
    private double firstnum;
    String checkNum;
    
     public ControllerSimple(SimpleCalculator sview)
     {
         this.sview = sview;
         smodel = new ModelSimpleCalculator();
     }
     public void setOpertor(String Operator)
     {
         sview.getdisplay1().setText(sview.getdisplay2().getText()+Operator);
         sview.getdisplay2().setText("0");
         this.Operator = Operator;
        
     }
     public String getOperator()
     {
        return Operator; 
     }
     public void setfirstnum(Double num)
     {
       firstnum= num;   
     }
     public double getfirstnum()
     {
         return firstnum;
     }
     
        
     public void result()
     {
         double solution =0,secondnum;
         secondnum=sview.getNum();
         
         if(getOperator()=="+")
         {
            smodel.addOperation(getfirstnum(),secondnum);
            solution=smodel.getCalculation();
            
         }
         else if(getOperator()=="-")
         {
             smodel.SubOperation(getfirstnum(), secondnum);
             solution=smodel.getCalculation();
         }
         else if(getOperator()== "x")
         {
              smodel.mulOperation(getfirstnum(),secondnum);
              solution=smodel.getCalculation();
         }
         else if(getOperator()== "/")
         {
              smodel.divideOpeation(getfirstnum(), secondnum);
              solution=smodel.getCalculation();
         }
         else if(getOperator()== "%")
         {
              smodel.mudOperation(getfirstnum(), secondnum);
              solution=smodel.getCalculation();
         }
         else if(getOperator()== "^")
         {
              smodel.sqrOperator(getfirstnum(), secondnum);
              solution=smodel.getCalculation();
         }
         else if(getOperator()=="square")
         {
              smodel.rootOperator(getfirstnum());
              solution=smodel.getCalculation(); 
         }
         else if(getOperator()=="1/x")
         {
              smodel.Divide1Operator(getfirstnum());
              solution=smodel.getCalculation(); 
         }
         
         sview.display1.setText(sview.getdisplay1().getText()+(sview.display2.getText())+("="));
         sview.display2.setText(Double.toString(solution));
         if(sview.display2.getText().endsWith(".0")){
            sview.display2.setText(sview.display2.getText().replace(".0", ""));
         }
         if(getOperator()=="1/x")
            
             sview.display1.setText("1/("+Double.toString(getfirstnum())+(")="));
            
        if(getOperator()=="square")
            
             sview.display1.setText("sqrt("+Double.toString(getfirstnum())+(")="));  
     }
     public void negative()
     {
         double negative=(sview.getNum()*(-1));
         sview.display2.setText(Double.toString(negative));
     }
     
}
