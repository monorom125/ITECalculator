/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Controller;
import itecalculatorgui.src.itecalculatorgui.Model.Model_NumberSystem;
import itecalculatorgui.src.itecalculatorgui.View.NumberSystem;

/**
 * this class is controller of NumberSystem (view). it take whatever input from view and calculate using Model
  and respond answer.
 * @author BTS071016
 */
public class controller_NumberSystem {
    private Model_NumberSystem model;
    private NumberSystem nView;
    private int index1,index2;
    
    public  controller_NumberSystem(NumberSystem nView){
        this.nView = nView;
        model= new Model_NumberSystem ();
    }
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
    public void Binary(){
       for(int i=0;i<10;i++){
         
       if(getindex1()==1){
            if(i!=1 || i!= 0){
         nView.number[i].setEnabled(false);
             }
             }
       }
    }
    public void octal(){
       for(int i=0;i<10;i++){
         
       if(getindex1()==2){
            if(i==9 || i==8){
         nView.number[i].setEnabled(false);
                     }
                   }
       }
    }
    public int getindex2()
    {
        return index2;
    }
    public void change()
    {
        int value= nView.num();
        if((getindex1()==0)){
            Binary();
            if(getindex2()==0){
                nView.label4().setText(nView.label3().getText());     
            }
            else if(getindex2()==1){
                nView.label4().setText(model.binary2Decimal(value));     
            }
            else if(getindex2()==2){
                nView.label4().setText(model.binay2otcal(value));     
            }
            else
                nView.label4().setText(model.binary2Hex(value)); 
        }
        
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        else if((getindex1()==1)){
            if(getindex2()==1){
                nView.label4().setText(nView.label3().getText());     
            }
            else if(getindex2()==0){
                nView.label4().setText(model.decimal2Binary(value));     
            }
            else if(getindex2()==2){
                nView.label4().setText(model.decimal2Octal(value));     
            }
            else
                nView.label4().setText(model.decimal2Hex(value)); 
        }
     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        else if((getindex1()==2)){
            octal();
            if(getindex2()==2){
                nView.label4().setText(nView.label3().getText());     
            }
            else if(getindex2()==0){
                nView.label4().setText(model.Octal2binary(value));     
            }
            else if(getindex2()==1){
                nView.label4().setText(model.Octal2decimal(value));     
            }
            else
                nView.label4().setText(model.Octal2hex(value)); 
        }  
        else if((getindex1()==3)){
            if(getindex2()==3){
                nView.label4().setText(nView.label3().getText());     
            }
            else if(getindex2()==0){
                nView.label4().setText(model.hex2binary(nView.label3().getText()));     
            }
            else if(getindex2()==1){
                nView.label4().setText(model.Hex2decimaL(nView.label3().getText()));     
            }
            else
                nView.label4().setText(model.hex2octal(nView.label3().getText())); 
        }
     //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
  }
}
