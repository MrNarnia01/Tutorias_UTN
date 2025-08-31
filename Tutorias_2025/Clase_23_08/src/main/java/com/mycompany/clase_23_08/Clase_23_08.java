package com.mycompany.clase_23_08;

import javax.swing.JOptionPane;

public class Clase_23_08 {
    public static int n;
    public static void main(String[] args) {
        String val="";
        int op=0;
        do{
            val=JOptionPane.showInputDialog("Ingrese su cant. de alumnos");
        }while(Integer.parseInt(val)<=0);
        n=Integer.parseInt(val);        
        
        Alumno v[] = new Alumno[n];
        
        for(int i = 0; i < n; i++) {
           v[i]=new Alumno();
           v[i].regis(i);
           JOptionPane.showMessageDialog(null, v[i].toString());
        }
        
        do {            
            val=JOptionPane.showInputDialog("""
                                            1- Buscar leg
                                            2- Buscar nombre
                                            3- Ordenar listado nombre
                                            4-Salir
                                            """);
            switch (val) {
                case "Buscar leg":
                    op=bus(1, v);
                    if(op!=-1){
                        JOptionPane.showMessageDialog(null, v[op].toString());
                        v[op].regis(v[op].getLeg()-1);
                        JOptionPane.showMessageDialog(null, v[op].toString());
                    }else er();
                break;
                case "Buscar nombre":
                    op=bus(2, v);
                    if(op!=-1){
                        JOptionPane.showMessageDialog(null, v[op].toString());
                    }else er();
                break;
                case "3":
                    ord(v);
                break;
                case "Salir":
                    break;
                default:
                    er();
            }
            
        } while (!val.equals("Salir"));
    }
    
    public static void er(){
        JOptionPane.showMessageDialog(null, "ERROR");
    }
    
    public static int bus(int t, Alumno v[]){
        int bus=-1;
        String b="Ingrese el ";
        if(t==1) b+="legajo a buscar";
        else b+="nombre a buscar";
        
        b=JOptionPane.showInputDialog(b);
        
        for (int i = 0; i < n; i++) {
                if(t==1){
                    if(v[i].getLeg()== Integer.parseInt(b)) bus=i;
                }else{
                    if(v[i].getNomyape().equalsIgnoreCase(b)) bus=i;
                }
        }
       
        return bus;
    }
    
    public static void ord(Alumno v[]){
        Alumno aux = new Alumno();
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(v[i].getNomyape().compareToIgnoreCase(v[j].getNomyape())>0){
                 //v[i].getLeg()>v[j].getLeg()
                    
                    aux=v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            JOptionPane.showMessageDialog(null, v[i].toString());
        }
    }
}
