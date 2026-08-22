/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22.pkg08_clases;

import javax.swing.JOptionPane;

/**
 *
 * @author narnia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alumno alu= new Alumno();
        
        Alumno alu2= new Alumno();
        
        String a=JOptionPane.showInputDialog("Ingrese legajo");
        boolean l=alu.setLeg(Integer.parseInt(a));
        
        if(l)   JOptionPane.showMessageDialog(null, "Legajo aceptado");
        else   JOptionPane.showMessageDialog(null, "Legajo erroneo");
        
        alu2.setLegAuto();
    }
    
}
