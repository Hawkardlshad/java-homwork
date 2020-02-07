/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentsystemmanagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class frame   {
    JButton b1=new JButton("house for rent");
    JButton b2=new JButton("house for sale");
    JButton b3=new JButton("car for rent");
    JButton b4=new JButton ("car for sale");
    JPanel p=new JPanel();
    JFrame f=new JFrame();
    JTextField t=new JTextField("hi choose one",30);
    JCheckBox niw;
     JCheckBox old;

    public frame()   {
        f.setTitle("Rent System Management");
        f.add(p);
      niw=new JCheckBox("niw");
      old=new JCheckBox("old");
        p.setLayout(new FlowLayout(1,100,100));
       t.setBackground(Color.red);
        p.setBackground(Color.GREEN);
   
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
         p.add(t);
       p.add(niw);
p.add(old);
   
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,600);
        f.setVisible(true);
        b1.addActionListener(new Action());
        
       
    }

    
static class Action implements ActionListener{
   
    public void actionPerformed(ActionEvent e) {
        JFrame f2=new JFrame();
        f2.setVisible(true);
    f2.setSize(300,300);
    JLabel label=new JLabel("u clicked me");
    JPanel p2=new JPanel();
    f2.add(p2);
    p2.add(label);
    
    
    
    }
      
    
    
}   
}
