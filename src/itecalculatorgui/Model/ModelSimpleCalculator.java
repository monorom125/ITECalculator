/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Model;

/**
 * This class is model of SimpleCalculator.it does Arithmetic operator and store the result. 
 *
 * @author BTS071016
 */
public class ModelSimpleCalculator {
     private double calculateValue;
  
     public void addOperation(double num1, double num2)
     {
      calculateValue= num1+ num2;
      
     }
     public void SubOperation(double num1, double num2)
     {
      calculateValue= num1- num2;
     }
     public void mulOperation(double num1, double num2)
     {
      calculateValue= (num1*num2);
     }
     public void divideOpeation(double num1, double num2)
     {
      calculateValue= (num1/num2);
     }
     public void mudOperation(double num1,double num2)
     {
      calculateValue= num1%num2;
     }
     public void rootOperator(double num1)
     {
      calculateValue= (Math.sqrt(num1));
     }
     public void sqrOperator(double num1,double num2)
     {
      calculateValue= Math.pow(num1,num2);
     }
     public void Divide1Operator(double num1)
     {
      calculateValue= (1/num1);
     }
     
     public double getCalculation(){
         return calculateValue;
     } 
}
