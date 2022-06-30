/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose   Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.View;
import itecalculatorgui.src.itecalculatorgui.Controller.ControllerSimple;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author BTS071016
 */
public class SimpleCalculator extends JPanel
{
   private ControllerSimple scontroll;
   JLabel resultLabel;
    public JLabel display1;
    public JLabel display2;
   JPanel menuPanel ;
   JPanel subPanel  ;
   JLabel history;
   String s="0";
   JButton [] numberButton = new JButton[10];
   JButton addbutton, minus, mul, divide,resultB,power, clear, point, root,cle
            ,divide1, negative,delete,mudulos;
public SimpleCalculator()
{
    
    Color lightBlue = new Color(51,153,255);
    setLayout(new BorderLayout());
    setPreferredSize(new Dimension(500,500));
    
    
    //add result Label to SubPanel at borderLayout north
    resultLabel = new JLabel();
    resultLabel.setPreferredSize(new Dimension(100,200));
    resultLabel.setLayout(new BorderLayout());
    resultLabel.setBackground(Color.LIGHT_GRAY);
    
    display1 = new JLabel("",SwingConstants.RIGHT);
    display1.setPreferredSize(new Dimension(100,100));
    display1.setFont(new Font("Arail",Font.BOLD,18));
    display1.setBackground(Color.LIGHT_GRAY);
    display1.setForeground(Color.GRAY);
    
    
    display2 = new JLabel("0",SwingConstants.RIGHT);
    display2.setPreferredSize(new Dimension(100,100));
    display2.setFont(new Font("Arail",Font.BOLD,26));
    display2.setBackground(Color.LIGHT_GRAY);
    
    
    
    resultLabel.add(display1,BorderLayout.NORTH);
    resultLabel.add(display2,BorderLayout.CENTER);
    
    scontroll = new ControllerSimple(this);
  
    Color lightGray = new Color(204,204,204);
    addbutton = new JButton("+");
    addbutton.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    addbutton.setBackground(Color.LIGHT_GRAY);
    addbutton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          scontroll.setfirstnum(getNum());
          scontroll.setOpertor("+");
          
        }
    });
    
    minus     = new JButton("-");
    minus.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    minus.setBackground(Color.LIGHT_GRAY);
    minus.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
           scontroll.setfirstnum(getNum());
           scontroll.setOpertor("-");
        }
    });
    
    
    mul       = new JButton("x");
    mul.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    mul.setBackground(Color.LIGHT_GRAY);
    mul.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
           scontroll.setfirstnum(getNum());
           scontroll.setOpertor("x");
            
        }
    });
    
    divide    = new JButton("/");
    divide.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    divide.setBackground(Color.LIGHT_GRAY);  
    divide.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            scontroll.setfirstnum(getNum());
            scontroll.setOpertor("/");
        }
    });
    
    
    resultB   = new JButton("=");
    resultB.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    resultB.setBackground(lightBlue);
    resultB.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            scontroll.result();
        }
    });    
    
    power     = new JButton("^");
    power.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    power.setBackground(Color.LIGHT_GRAY);
    power.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            scontroll.setfirstnum(getNum());
            scontroll.setOpertor("^"); 
        }
    });    
    
    
    clear     = new JButton("C");
    clear.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    clear.setBackground(Color.LIGHT_GRAY);
    clear.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
           display2.setText("0");
        }
    });    
    
    
    point     = new JButton(".");
    point.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    point.setBackground(Color.LIGHT_GRAY);
    point.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            if(display2.getText().contains(".")){
             return;
            }
            display2.setText(display2.getText().concat("."));
        }
    });    
    
    
    cle       = new JButton("CE");
    cle.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    cle.setBackground(Color.LIGHT_GRAY);
    cle.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            display1.setText("");
            display2.setText("0");
        }
    });    
    
    
    mudulos   = new JButton("%");
    mudulos.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    mudulos.setBackground(Color.LIGHT_GRAY); 
    mudulos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            scontroll.setfirstnum(getNum());
            scontroll.setOpertor("%");
        }
    });    
    
    divide1   = new JButton(" 1/x");
    divide1.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    divide1.setBackground(Color.LIGHT_GRAY);
    divide1.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            scontroll.setfirstnum(getNum());
            scontroll.setOpertor("1/x");
        }
    });    
    negative  = new JButton("+/-");
    negative.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    negative.setBackground(Color.LIGHT_GRAY);
    negative.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            scontroll.negative();
        }
    });    
    
    delete    = new JButton("del");
    delete.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    delete.setBackground(Color.LIGHT_GRAY);
    delete.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            String value= display2.getText();
            display2.setText("");
            for(int i =0;i<value.length()-1;i++)
            {
                display2.setText(display2.getText()+value.charAt(i));
            }
        }
    });    
    root      = new JButton("square");
    root.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
    root.setBackground(Color.LIGHT_GRAY);
    root.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            scontroll.setfirstnum(getNum());
            scontroll.setOpertor("square");
        }
    });    
    numberButton = new JButton[10];
        for(int i=0;i<10;i++)
        {
            numberButton[i]= new JButton(String.valueOf(i)); 
            numberButton[i].setFont(new Font("Arail",Font.BOLD,24));
            numberButton[i].setBackground(Color.white);
            numberButton[i].addActionListener(new ActionListener() {
              @Override
                 public void actionPerformed(ActionEvent e) {
                    
                 Object source = e.getSource();
                 for(int i=0;i<10;i++)  
                 { 
                    if(source == numberButton[i]){
                        if(display2.getText().length()>20)
                        {
                            return;
                        }
                        if(display2.getText().equalsIgnoreCase("0"))
                        {
                            display2.setText("");

                        }    
                    display2.setText(display2.getText().concat(String.valueOf(i)));
             
                 }
                  }       //To change body of generated methods, choose Tools | Templates.
               }
            });
            
        }
      //create a Panel is to contian numberButton at centreLayout in subPanel
      // and then add components
      
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6,4,1,1));
        panel.setBackground(lightGray);
        panel.add(mudulos);
        panel.add(cle);
        panel.add(clear);
        panel.add(delete);
        panel.add(divide1);
        panel.add(root);
        panel.add(power);
        panel.add(divide);
        panel.add(numberButton[7]);
        panel.add(numberButton[8]);
        panel.add(numberButton[9]);
        panel.add(mul);   
        panel.add(numberButton[4]);
        panel.add(numberButton[5]);
        panel.add(numberButton[6]);
        panel.add(addbutton); 
        panel.add(numberButton[1]);
        panel.add(numberButton[2]);
        panel.add(numberButton[3]);
        panel.add(minus);   
        panel.add(negative);
        panel.add(numberButton[0]);
        panel.add(point); 
        panel.add(resultB); 
        
        this.add(panel,BorderLayout.CENTER);
        this.add(resultLabel,BorderLayout.NORTH);
              
    }
    public JLabel getdisplay1()
    {
        return display1;
    }
    public JLabel getdisplay2()
    {
        return display2;
    }
    public double getNum()
    {
        return Double.parseDouble(display2.getText());
    }       
           
     
}

        