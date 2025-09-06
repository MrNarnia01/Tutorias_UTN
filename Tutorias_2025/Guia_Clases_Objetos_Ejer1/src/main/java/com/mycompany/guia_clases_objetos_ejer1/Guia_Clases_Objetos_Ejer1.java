package com.mycompany.guia_clases_objetos_ejer1;

import javax.swing.JOptionPane;

public class Guia_Clases_Objetos_Ejer1 {
    public static int n;

    public static void main(String[] args) {
        String val="";
        int op=0;
        do{
            do{
                val=JOptionPane.showInputDialog("Ingrese su cant. de alumnos");
            }while(!isN(val));
        }while(Integer.parseInt(val)<=0);
        
        n=Integer.parseInt(val);
        Alumno v[] = new Alumno[n];
        
        for (int i = 0; i < n; i++) {
            v[i] = new Alumno(i);
            v[i].regis();
            JOptionPane.showMessageDialog(null, v[i].toString());
        }
        
        String []bot={"List alu aprobados",
                        "List alu mayores y men",
                        "List alu libres",
                        "Bus y act alu",
                        "Bus y elm alu",
                        "Bus por curso y turno",
                        "Pasar de curso",
                        "Salir"
                        };
        do {
            val=(String)JOptionPane.showInputDialog(null, "Listado", "Menu de opciones", 1, null, bot, bot[0]);
            switch(val){
                case "List alu aprobados":
                    String ap="";
                    for (int i = 0; i < n; i++) {
                        if(v[i].prom()>=6 && v[i].getAsis()>=70){
                            ap+="\n"+v[i].toString();
                        }
                    }
                    
                    if(ap.equals("")){
                        JOptionPane.showMessageDialog(null, "No hay alumnos aprobados");
                    }else{
                        JOptionPane.showMessageDialog(null, ap);
                    }
                break;
                case "Bus y act alu":
                    op=bus(v);
                    
                    if(op!=-1){
                        v[op].regis();
                    }else{
                        JOptionPane.showMessageDialog(null, "No encontrado");
                    }
                    
                break;
                case "Bus y elm alu":
                    op=bus(v);
                    
                    if(op!=-1){
                        
                        for (int i = op; i < n-1; i++) {
                            v[i]=v[i+1];
                        }
                        n--;
                    }else{
                        JOptionPane.showMessageDialog(null, "No encontrado");
                    }
                    
                break;
                case "Bus por curso y turno":
                    cyt(v);
                break;
                case "Pasar de curso":
                    String a="";
                    
                    for (int i = 0; i < n; i++) {
                        if(v[i].prom()>=6 && v[i].getAsis()>=70){
                            if(v[i].getCur()<5){
                                v[i].setCur( v[i].getCur()+1 );
                            }else if(v[i].getCur()==5){
                                v[i].setCur(6);
                                JOptionPane.showMessageDialog(null, "Se egreso:"+v[i].getNom());
                            }
                        }
                    }
                break;
            }
        }while(!val.equals("Salir"));
        
        
        
    }
    
    public static boolean isN(String s) {
        try {
            Integer.valueOf(s);
            //Float.valueOf(pru);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static int bus(Alumno v[]){
        String bus="";
        int b=-1;
        bus=JOptionPane.showInputDialog("Ingrese el nombre a buscar");
        
        for (int i = 0; i < n; i++) {
            if(v[i].getNom().equalsIgnoreCase(bus)) b=i;
        }
        
        return b;
    }

    public static void cyt(Alumno v[]){
        int c=Integer.parseInt( JOptionPane.showInputDialog("Ingrese el curso"));
        String t=JOptionPane.showInputDialog("Ingrese el turno");
        
        
         String ap="";
            for (int i = 0; i < n; i++) {
                if(v[i].getCur()==c && v[i].getTur().equalsIgnoreCase(t)){
                    ap+="\n"+v[i].toString();
                }
            }
                    
        if(ap.equals("")){
            JOptionPane.showMessageDialog(null, "No hay alumnos");
        }else{
            JOptionPane.showMessageDialog(null, ap);
        }
    }






}
    
