/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.View;
import itecalculatorgui.src.itecalculatorgui.Controller.controller_NumberSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/** 
 *this class is view of number System
 * @author BTS071016
 */
public class NumberSystem  extends JPanel
{
  private JButton minus, add, multiple , divide, point , mudulos, delete, clear,CE
                  ,result;
  public JButton[] number;
  private JComboBox choice1,choice2,choice3;
  private JLabel to, produce,label1,label2,label3,label4;
  private JPanel subpanel;
  private controller_NumberSystem system;
  
  public  NumberSystem()
  {
      Color lightBlue = new Color(51,153,255);
      system=new controller_NumberSystem(this) ;
        String[] choice = {"Binary", "Decimal", "Octal","Hexa"};
        String[] operator={"AND","OR","XOR","left-shift","right-shift" }; 
        choice1 = new JComboBox(choice);
        choice1.setFont(new Font("Arail",Font.CENTER_BASELINE,20));
        choice1.addActionListener(new ActionListener(){
             @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object item = choice1.getSelectedItem();
                 int index = choice1.getSelectedIndex();
                 system.setindexl(index);
                 label1.setText((String) item + "=" );
                 
                 }
            
        });
        choice2 = new JComboBox(choice);
        choice2.setFont(new Font("Arail",Font.CENTER_BASELINE,20));
        choice2.addActionListener(new ActionListener(){
             @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object item2 = choice2.getSelectedItem();
                 int index2 = choice2.getSelectedIndex();
                 system.setindex2(index2);
                 label2.setText((String) item2 +"=");
                 
                 }
            
        });
        choice3 = new JComboBox(operator);
        choice3.setFont(new Font("Arail",Font.CENTER_BASELINE,20));
         
        //create Nubmber Button 
        number = new JButton[10];
        for(int i=0;i<10;i++)
        {
            number[i]= new JButton(String.valueOf(i));
            number[i].setFont(new Font("Arail",Font.BOLD,24));
            number[i].setBackground(Color.white);
            number[i].addActionListener(new ActionListener() {
              @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object source = e.getSource();
                 
                 for(int i=0;i<10;i++)  
                 { 
                    if(source == number[i]){
                        
                        if(label3.getText().length()>20)
                        {
                            return;
                        }
                        if(label3.getText().equalsIgnoreCase("0"))
                        {
                            label3.setText("");

                        }    
                    label3.setText(label3.getText().concat(String.valueOf(i)));
                     if(system.getindex1()==1){
                         if(i!=1 && i!= 0){
                             number[i].setEnabled(false);
                         }
                     }
                     if(system.getindex1()==2){
                         if(i==8 && i == 9){
                             number[i].setEnabled(false);
                         }
                        }
                  }      
               }
              }
            });
        }
            
         
        //create Labels
        to = new JLabel("To");
        to.setFont(new Font("Arail",Font.CENTER_BASELINE,24));
        to.setHorizontalAlignment(SwingConstants.CENTER);
        // creare Label result
        produce= new JLabel();
        produce.setPreferredSize(new Dimension(100,200));
        produce.setBackground(Color.LIGHT_GRAY);
        
        produce.setLayout(new GridLayout(2,2));
        
        label2= new JLabel("Binary");
        label2.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label2.setBackground(Color.LIGHT_GRAY);
        
        label1= new JLabel("Binary");
        label1.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label1.setBackground(Color.LIGHT_GRAY);
         
        label3= new JLabel("0");
        label3.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label3.setBackground(Color.LIGHT_GRAY);
        label3.setHorizontalAlignment(SwingConstants.RIGHT);
        
        label4= new JLabel("0");
        label4.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label4.setBackground(Color.LIGHT_GRAY);
        label4.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // add labels to pruduce label
        
        produce.add(label1);
        produce.add(label3);
        produce.add(label2);
        produce.add(label4);
        
        //create Buttons for Operation Arithmetic
        clear     = new JButton("C");
        clear.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        clear.setBackground(Color.LIGHT_GRAY);
        clear.addActionListener(new ActionListener (){
           @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 label3.setText("0");
                 label4.setText("0");
                 
                 
                 }
                 
        });
        result  = new JButton("=");
        result.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        result.setBackground(lightBlue);
        result.addActionListener(new ActionListener (){
           @Override
                 public void actionPerformed(ActionEvent e) {
                    
                system.change();
                    
                 }
                 
        });
        delete    = new JButton("del");
        delete.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        delete.setBackground(Color.LIGHT_GRAY);
        add     = new JButton("+");
        add.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        add.setBackground(Color.LIGHT_GRAY);
        minus     = new JButton("-");
        minus.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        minus.setBackground(Color.LIGHT_GRAY);
        CE    = new JButton("CE");
        CE.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        CE.setBackground(Color.LIGHT_GRAY);
        CE.addActionListener(new ActionListener (){
           @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 label3.setText("0");
                 label4.setText("0");
                 
                 }
                 
        });
        divide     = new JButton("/");
        divide.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        divide.setBackground(Color.LIGHT_GRAY);
        multiple     = new JButton("*");
        multiple.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        multiple.setBackground(Color.LIGHT_GRAY);
        point    = new JButton(".");
        point.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        point.setBackground(Color.LIGHT_GRAY);
        point.setForeground(Color.GRAY);
        mudulos    = new JButton("%");
        mudulos.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        mudulos.setBackground(Color.LIGHT_GRAY);
        mudulos.setForeground(Color.GRAY);
        
        // Add all buttons in subpanel
        subpanel= new JPanel();
        subpanel.setBackground(Color.LIGHT_GRAY);
        subpanel.setLayout(new GridLayout(6,4,1,1));
         
        // start add components in GridLayout
        
        subpanel.add(choice1);
        subpanel.add(to);
        subpanel.add(choice2);
        subpanel.add(clear);
        
        subpanel.add(choice3);
        subpanel.add(CE);
        subpanel.add(divide);
        subpanel.add(delete);
        
        subpanel.add(number[9]);
        subpanel.add(number[8]);
        subpanel.add(number[7]);
        subpanel.add(multiple);
        
        subpanel.add(number[6]);
        subpanel.add(number[5]);
        subpanel.add(number[4]);
        subpanel.add(minus);
        
        subpanel.add(number[3]);
        subpanel.add(number[2]);
        subpanel.add(number[1]);
        subpanel.add(add);
           
        subpanel.add(mudulos);
        subpanel.add(number[0]);
        subpanel.add(point);
        subpanel.add(result);       
        
   // addsubpanel and produce label to NumberSystem Panel
   this.setLayout(new BorderLayout());
   this.add(produce,BorderLayout.NORTH);
   this.add(subpanel,BorderLayout.CENTER);       
  }
  public int num(){
     return Integer.parseInt(label3.getText());
    }
 public JLabel label3(){
     return label3;
        }
 public JLabel label4(){
       return label4;
        }
 
}



