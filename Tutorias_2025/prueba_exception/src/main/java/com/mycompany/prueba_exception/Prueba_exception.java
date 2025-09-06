package com.mycompany.prueba_exception;

import javax.swing.JOptionPane;

public class Prueba_exception {

    public static void main(String[] args) {
       String pru="";
       
        do{
            
            do{
                pru = JOptionPane.showInputDialog("Number");
                if(!isN(pru)) JOptionPane.showMessageDialog(null, "Deben ser numeros");
            }while(!isN(pru));
            
            if(Integer.parseInt(pru)<=0) JOptionPane.showMessageDialog(null, "Deben ser positivo");
        }while(Integer.parseInt(pru)<=0);
       
        int n= Integer.parseInt(pru);
        
    }
    
    public static boolean isN(String s){
        try {
            Integer.valueOf(s);
            //Float.valueOf(pru);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}
