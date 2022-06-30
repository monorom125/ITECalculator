/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.Controller;

import itecalculatorgui.src.itecalculatorgui.Model.Model_Storage;
import itecalculatorgui.src.itecalculatorgui.View.StoragePanel;

/**
 *
 * @author BTS071016
 */
public class Controller_Storage {
    private Model_Storage model;
    private StoragePanel view;
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
    public void Convert(){
        Double value= view.Num();
        if((getindex1()==0) && (getindex2()==1))
        {
            view.label4().setText(Double.toString(model.byte2kB(value)));
        }
        else if((getindex1()==0) && (getindex2()==2))
        {
            view.label4().setText(Double.toString(model.byte2MB(value)));
        }
         else if((getindex1()==0) && (getindex2()==3))
        {
            view.label4().setText(Double.toString(model.byte2GB(value)));
        }
         else if((getindex1()==0) && (getindex2()==4))
        {
            view.label4().setText(Double.toString(model.byte2TB(value)));
        }
         else if((getindex1()==0) && (getindex2()==5))
        {
            view.label4().setText(Double.toString(model.byte2PB(value)));
        }
         
      //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
         else if((getindex1()==1) && (getindex2()==0))
        {
            view.label4().setText(Double.toString(model.kb2Byte(value)));
        }
        else if((getindex1()==1) && (getindex2()==2))
        {
            view.label4().setText(Double.toString(model.kb2MB(value)));
        }
         else if((getindex1()==1) && (getindex2()==3))
        {
            view.label4().setText(Double.toString(model.kb2GB(value)));
        }
         else if((getindex1()==1) && (getindex2()==4))
        {
            view.label4().setText(Double.toString(model.kb2TB(value)));
        }
         else if((getindex1()==1) && (getindex2()==5))
        {
            view.label4().setText(Double.toString(model.kb2PB(value)));
        }
        
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       else if((getindex1()==2) && (getindex2()==0))
        {
            view.label4().setText(Double.toString(model.mb2Byte(value)));
        }
        else if((getindex1()==2) && (getindex2()==1))
        {
            view.label4().setText(Double.toString(model.mb2KB(value)));
        }
         else if((getindex1()==2) && (getindex2()==3))
        {
            view.label4().setText(Double.toString(model.mb2GB(value)));
        }
         else if((getindex1()==2) && (getindex2()==4))
        {
            view.label4().setText(Double.toString(model.mb2TB(value)));
        }
         else if((getindex1()==2) && (getindex2()==5))
        {
            view.label4().setText(Double.toString(model.mb2PB(value)));
        }
         
      //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
         else if((getindex1()==3) && (getindex2()==0))
        {
            view.label4().setText(Double.toString(model.gb2byte(value)));
        }
        else if((getindex1()==3) && (getindex2()==1))
        {
            view.label4().setText(Double.toString(model.gb2KB(value)));
        }
         else if((getindex1()==3) && (getindex2()==2))
        {
            view.label4().setText(Double.toString(model.gb2MB(value)));
        }
         else if((getindex1()==3) && (getindex2()==4))
        {
            view.label4().setText(Double.toString(model.gb2TB(value)));
        }
         else if((getindex1()==3) && (getindex2()==5))
        {
            view.label4().setText(Double.toString(model.gb2PB(value)));
        }
      //++++++++++++++++++++++++++++++++++++++++++++++++++
        else if((getindex1()==4) && (getindex2()==0))
        {
            view.label4().setText(Double.toString(model.Tb2byte(value)));
        }
        else if((getindex1()==4) && (getindex2()==1))
        {
            view.label4().setText(Double.toString(model.Tb2KB(value)));
        }
         else if((getindex1()==4) && (getindex2()==2))
        {
            view.label4().setText(Double.toString(model.Tb2MB(value)));
        }
         else if((getindex1()==4) && (getindex2()==3))
        {
            view.label4().setText(Double.toString(model.TB2GB(value)));
        }
         else if((getindex1()==4) && (getindex2()==5))
        {
            view.label4().setText(Double.toString(model.TB2PB(value)));
        }
         
      //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++   
         else if((getindex1()==5) && (getindex2()==0))
        {
            view.label4().setText(Double.toString(model.PB2byte(value)));
        }
        else if((getindex1()==5) && (getindex2()==1))
        {
            view.label4().setText(Double.toString(model.PB2kB(value)));
        }
         else if((getindex1()==5) && (getindex2()==2))
        {
            view.label4().setText(Double.toString(model.PB2MB(value)));
        }
         else if((getindex1()==5) && (getindex2()==3))
        {
            view.label4().setText(Double.toString(model.PB2GB(value)));
        }
         else if((getindex1()==5) && (getindex2()==4))
        {
            view.label4().setText(Double.toString(model.PB2TB(value)));
        }
    }

    public Controller_Storage(StoragePanel view) 
    {
        this.view = view;
         model = new Model_Storage();
         
    }
    
}
