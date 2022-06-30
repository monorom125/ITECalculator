/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Controller;

import itecalculatorgui.src.itecalculatorgui.Model.Model_MoneyExchange;
import itecalculatorgui.src.itecalculatorgui.View.MoneyExchange;

/**
 *
 * @author BTS071016
 */
public class Controller_MoneyExchange {

    
    private Model_MoneyExchange model;
    private MoneyExchange view;
    private int index1,index2;
    
    
    public void setindexl(int item)
    {
      index1=item;  
    }
    public int getindex1()
    {
        return index1;
    }
     public void setindex2(int item)
    {
      index2=item;  
    }
    public int getindex2()
    {
        return index2;
    }
    public void Exchange(){
      Double money= view.Num();
      if(getindex1()==0){ 
        
        if((getindex1()==0) && (getindex2()==1))
        {
            view.label4().setText(Double.toString(model.RileToDollar(money)));
        }
        else if((getindex1()==0) && (getindex2()==2))
        {
            view.label4().setText(Double.toString(model.RileToEuro(money)));
        }
         else if((getindex1()==0) && (getindex2()==3))
        {
            view.label4().setText(Double.toString(model.RileToFrance(money)));
        }
         else if((getindex1()==0) && (getindex2()==4))
        {
            view.label4().setText(Double.toString(model.RileToPund(money)));
        }
         else if((getindex1()==0) && (getindex2()==5))
        {
            view.label4().setText(Double.toString(model.RileToBath(money)));
        }
    }
     else{
         
          
          if(getindex1()==1){
            view.label4().setText(Double.toString(model.DollarToRile(money)));
          }
          else if(getindex1()==2){
             view.label4().setText(Double.toString(model.EuroToRile(money))); 
          }
           else if(getindex1()==3){
             view.label4().setText(Double.toString(model.FranceToRile(money))); 
          }
           else if(getindex1()==4){
             view.label4().setText(Double.toString(model.PundTORile(money))); 
          }
           else if(getindex1()==5){
             view.label4().setText(Double.toString(model.BahtToRile(money))); 
          }
         }
    }

    public Controller_MoneyExchange(MoneyExchange view)
    {
        this.view = view;
         model = new Model_MoneyExchange ();
         
    }    
}
