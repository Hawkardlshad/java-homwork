/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import javax.swing.JOptionPane;


public class Homework {

  
    public static void main(String[] args) {
        
      String name;
      String Fnumber;
      String Snumber;
      name =JOptionPane.showInputDialog("what is your name");
      Fnumber=JOptionPane.showInputDialog("enter first number");
      Snumber=JOptionPane.showInputDialog("what is your second number");
      int Inumber1=Integer.parseInt(Fnumber);
      int Inumber2=Integer.parseInt(Snumber);
        int sum = Inumber1+Inumber2;
        JOptionPane.showMessageDialog(null,"hallo  "+ name+"  the sum is "+sum);
        
        try {
           int tri=Integer.parseInt(name);
         int tri2=Integer.parseInt(Fnumber);
            
        } catch (Exception e) {
            System.out.println(e);
        }
       
    }
    
}
