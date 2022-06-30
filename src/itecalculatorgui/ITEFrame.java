/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itecalculatorgui.src.itecalculatorgui;
import itecalculatorgui.src.itecalculatorgui.View.*;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java. awt.event.ActionListener;


/**
 *In this Class is to create GUI ITECalculator Frame c.
 * @author BTS071016
 */
public class ITEFrame extends JFrame implements ActionListener {
 
SimpleCalculator simple ;
 MoneyExchange money  ;
StoragePanel storage   ;
  NumberSystem number     ;
  itecalculatorgui.src.itecalculatorgui.View.SetThoery setthoery     ;
 
  private JLabel resultLabel;
  private JPanel menuPanel ;
  private JPanel panel  ;
  private JButton minuButton;
  private JLabel history;
  private JButton [] numberButton = new JButton[10];
  private JButton addbutton, minus, mul, divide,resultB,power, clear, point, root,cle
            ,divide1, negative,delete,mudulos;
  private JMenuBar menuBar;
  private JMenuItem simpleCalculator,moneyExchange
            ,storageConvertor,numberSystem,binaryArithmetic,SetThoery;
  
  //create contructor
  public ITEFrame()
  {
    //Started to create frame 
    
    Color lightGray = new Color(204,204,204);
    setTitle("ITECalculator"); 
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(new Dimension(800,600)); 
    
  
     //create layoutmanager
    int hga =0;
    int vgap=0;
    setLayout(new BorderLayout(hga,vgap));
    //create menuPanel
    
    
    simple      = new SimpleCalculator();
    storage     = new StoragePanel();
    number      = new NumberSystem();
    money       = new MoneyExchange();
    setthoery   = new SetThoery();
    
    panel=new JPanel();
    panel.setPreferredSize(new Dimension(500,500));
    panel.setLayout(new BorderLayout());
    
    panel.add(simple,BorderLayout.CENTER);
    history();
    menu();
    
       // divide these two panels by BoderLayout
    this.add(panel,BorderLayout.CENTER);
    this.add(history,BorderLayout.EAST);
    this.setJMenuBar(menuBar);
  
   
  }
    public void menu()
    {   
        menuBar = new JMenuBar();
        JMenu  menu = new JMenu("Menu");
        menu.setFont(new Font("Arail",Font.ROMAN_BASELINE,14));
        
        simpleCalculator = new JMenuItem("SimpleCalculator");
        simpleCalculator.addActionListener(this);
        simpleCalculator.setFont(new Font("Arail",Font.ROMAN_BASELINE,14));
        menu.add(simpleCalculator);
        
        moneyExchange = new JMenuItem("MoneyExchange");
        moneyExchange.addActionListener(this);
        moneyExchange.setFont(new Font("Arail",Font.ROMAN_BASELINE,14));
        menu.add(moneyExchange);
        
        storageConvertor = new JMenuItem("Storage");
        storageConvertor.addActionListener(this);
        storageConvertor.setFont(new Font("Arail",Font.ROMAN_BASELINE,14));
        menu.add(storageConvertor);
        
        numberSystem = new JMenuItem("NumberSystem");
        numberSystem.addActionListener(this);
        numberSystem.setFont(new Font("Arail",Font.ROMAN_BASELINE,14));
        menu.add(numberSystem);
        
        SetThoery = new JMenuItem("SetThoery");
        SetThoery.addActionListener(this);
        SetThoery.setFont(new Font("Arail",Font.ROMAN_BASELINE,14));
        menu.add(SetThoery);
        
        menuBar.add(menu);
        
    }
    public void history ()
    {
    history =new JLabel("SimpleCalculator");
    history.setFont(new Font("Arail",Font.LAYOUT_LEFT_TO_RIGHT,20));
    history.setPreferredSize(new Dimension(200,200));
    history.setBackground(Color.LIGHT_GRAY);
    history.setHorizontalAlignment(JLabel.CENTER);
    history.setVerticalAlignment(JLabel.TOP);
    }  

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(source == simpleCalculator)
        {
         panel.removeAll();
         panel.add(simple,BorderLayout.CENTER);
         history.setText("SimpleCalculator");
         panel.validate();
        
        }
        else if(source == moneyExchange)
        {  
         panel.removeAll();
         panel.add(money ,BorderLayout.CENTER);
         history.setText("MoneyExchange");
         panel.validate();
        }    
        else if(source == numberSystem)
        {  
         panel.removeAll();
         panel.add(number,BorderLayout.CENTER);
         history.setText("NumberSystem");
         panel.validate();
        }
        else if(source == storageConvertor)
        {  
         panel.removeAll();
         panel.add(storage,BorderLayout.CENTER);
         history.setText("StorageConvertor");
         panel.validate();
         
        }
        else if(source == SetThoery)
        {
         panel.removeAll();
         panel.add(setthoery,BorderLayout.CENTER);
         history.setText("SetThoery");
         panel.validate();   
        }
    }
  }
  
    

