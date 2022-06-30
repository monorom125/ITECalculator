/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.View;
import itecalculatorgui.src.itecalculatorgui.Controller.Controller_MoneyExchange;

import javax.swing.*;
import java.awt.*;
import java. awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *this is view of MoneyExchange
 * @author BTS071016
 */
public class MoneyExchange extends JPanel{
    Color lightBlue = new Color(51,153,255);
    private JLabel result,label1,label2,label3,label4;
     private JButton [] numberButton = new JButton[10];
     private JComboBox choice1,choice2;
     private JButton resultB,delete,clear;
     private JLabel to;
     private JPanel subPanel1;
     private Controller_MoneyExchange money;
     
     
     public MoneyExchange()
     {
        money = new Controller_MoneyExchange(this);
        result = new JLabel();
        result.setPreferredSize(new Dimension(100,200));
        result.setLayout(new GridLayout(2,2));
        result.setBackground(Color.LIGHT_GRAY);
        
        label1 = new JLabel("Rile=");
        label1.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        label1.setHorizontalAlignment(SwingConstants.LEFT);
        
        label2 = new JLabel("Rile=");
        label2.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        label2.setHorizontalAlignment(SwingConstants.LEFT);
        
        label3 = new JLabel("0");
        label3.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        label3.setHorizontalAlignment(SwingConstants.RIGHT);
        
        label4 = new JLabel("0");
        label4.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        label4.setHorizontalAlignment(SwingConstants.RIGHT);
   
        result.add(label1);
        result.add(label3);
        result.add(label2);
        result.add(label4);
        
         to = new JLabel("To");
         to.setBackground(Color.LIGHT_GRAY);
         to.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
         to.setHorizontalAlignment(SwingConstants.CENTER);
         
        
        String[] choice = {"Rile", "Dollar", "Euro","France","Pund","Bath"};
        choice1 = new JComboBox(choice);
        choice1.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        choice1.addActionListener(new ActionListener(){
             @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object item = choice1.getSelectedItem();
                 int index = choice1.getSelectedIndex();
                 money.setindexl(index);
                 label1.setText((String) item );
                 
                 }
            
        });
        
        
        choice2 = new JComboBox(choice);
        choice2.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        choice2.addActionListener(new ActionListener(){
             @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object item2 = choice2.getSelectedItem();
                 int index2 = choice2.getSelectedIndex();
                 money.setindex2(index2);
                 if(money.getindex1()!= 0){
                      choice2.removeItem("Dollar");
                      choice2.removeItem("Euro");
                      choice2.removeItem("France");
                      choice2.removeItem("Pund");
                      choice2.removeItem("Bath");
                 }
                 label2.setText((String) item2 );
                 
                 }
            
        });
        
            
        
        // create Buttons 
        
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
        resultB     = new JButton("=");
        resultB.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        resultB.setBackground(lightBlue);
        resultB.addActionListener(new ActionListener(){
             @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 money.Exchange();
                 
                 }
        });
        
        delete    = new JButton("del");
        delete.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        delete.setBackground(Color.LIGHT_GRAY);
        delete.addActionListener(new ActionListener(){
            @Override
                 public void actionPerformed(ActionEvent e) {
                  String value= label3.getText();
                 label3.setText("");
                 for(int i =0;i<value.length()-1;i++)
               {
                label3.setText(label3.getText()+value.charAt(i));
                     }
                     }   
     
                 
           });
        
         numberButton= new JButton[10];
        for(int i=0;i<10;i++)
        {
            numberButton[i]= new JButton(String.valueOf(i));
            numberButton[i].setFont(new Font("Arail",Font.BOLD,24));
            numberButton[i].setBackground(Color.white);
            numberButton[i].addActionListener(new ActionListener(){ 
                @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object source = e.getSource();
                 for(int i=0;i<10;i++)  
                 { 
                    if(source == numberButton[i]){
                        if(label3.getText().length()>20)
                        {
                            return;
                        }
                        if(label3.getText().equalsIgnoreCase("0"))
                        {
                            label3.setText("");

                        }    
                    label3.setText(label3.getText().concat(String.valueOf(i)));
             
                      }
                  
                 }
                 }       //To change body of generated methods, choose Tools | Templates.
               });
            }
        
        
        
        // create subpanel
        subPanel1= new JPanel();
        subPanel1.setBackground(Color.LIGHT_GRAY);
        subPanel1.setLayout(new GridLayout(4,4,1,1));
        
        subPanel1.add(choice1);
        subPanel1.add(to);
        subPanel1.add(choice2);
        subPanel1.add(clear);
        
        subPanel1.add(numberButton[9]);
        subPanel1.add(numberButton[8]);
        subPanel1.add(numberButton[7]);
        subPanel1.add(delete);
        
        subPanel1.add(numberButton[6]);
        subPanel1.add(numberButton[5]);
        subPanel1.add(numberButton[4]);
        subPanel1.add(numberButton[3]);
        
        subPanel1.add(numberButton[1]);
        subPanel1.add(numberButton[2]);
        subPanel1.add(numberButton[0]);
        subPanel1.add(resultB);
        
        //add components in this Storage panel
        this.setLayout(new BorderLayout());
        this.add(result,BorderLayout.NORTH);
        this.add(subPanel1,BorderLayout.CENTER);    
        } 
        public double Num(){
           return Double.parseDouble(label3.getText());
        }
        public JLabel label3(){
            return label3;
        }
         public JLabel label4(){
            return label4;
        }
         public JComboBox choice2(){
             return choice2;
         }
         public JComboBox choice1(){
             return choice1;
         }
       }


