/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui.View;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author BTS071016
 */
public class SetThoery extends JPanel{
    private JComboBox operator;
    private JButton result,space, clear,delete;
    private JLabel produce,label1,label2,label3,label4,label5,label6;
    private JButton[] number;
    private JPanel subPanel;
    
public SetThoery()
        
{   
    String[] choice = {"Union","set-Defference","Intersection"};
     operator = new JComboBox(choice);
     operator.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
     
     produce = new JLabel(); 
     produce.setPreferredSize(new Dimension(100,200));
     produce.setBackground(Color.LIGHT_GRAY);
     produce.setLayout(new GridLayout(3,2));
        
        label2= new JLabel("B =");
        label2.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label2.setBackground(Color.LIGHT_GRAY);
        
        label1= new JLabel("A =");
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
        
        label5= new JLabel("AUB =");
        label5.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label5.setBackground(Color.LIGHT_GRAY);
        label5.setForeground(Color.orange);
        
        label6= new JLabel("0");
        label6.setFont(new Font("Arail",Font.CENTER_BASELINE,18));
        label6.setBackground(Color.LIGHT_GRAY);
        label6.setHorizontalAlignment(SwingConstants.RIGHT);
        
        // add labels to pruduce label
        
        produce.add(label1);
        produce.add(label3);
        produce.add(label2);
        produce.add(label4);
        produce.add(label5);
        produce.add(label6);
        
     
      number = new JButton[10];
        for(int i=0;i<10;i++)
        {
            number[i]= new JButton(String.valueOf(i));
            number[i].setFont(new Font("Arail",Font.BOLD,24));
            number[i].setBackground(Color.white);
         }
     
        clear     = new JButton("C");
        clear.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        clear.setBackground(Color.LIGHT_GRAY);
        result     = new JButton("=");
        result.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        result.setBackground(Color.BLUE);
        delete    = new JButton("del");
        delete.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        delete.setBackground(Color.LIGHT_GRAY);
        space    = new JButton(",");
        space.setFont(new Font("Arail",Font.ROMAN_BASELINE,20));
        space.setBackground(Color.LIGHT_GRAY);
        
        subPanel = new JPanel();
        subPanel.setBackground(Color.gray);
        subPanel.setLayout(new GridLayout(5,3,1,1));
        
        subPanel.add(operator);
        subPanel.add(clear);
        subPanel.add(delete);
        
        subPanel.add(number[9]);
        subPanel.add(number[8]);
        subPanel.add(number[7]);
        
        subPanel.add(number[6]);
        subPanel.add(number[5]);
        subPanel.add(number[4]);
        
       subPanel.add(number[3]);
       subPanel.add(number[2]);
       subPanel.add(number[1]);
        
        subPanel.add(space);
        subPanel.add(number[0]);
        subPanel.add(result);
        
      this.setLayout(new BorderLayout());  
      this.add(produce,BorderLayout.NORTH); 
      this.add(subPanel,BorderLayout.CENTER);
        
     
}
            
    
}
