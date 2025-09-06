package com.mycompany.guia_clases_objetos_ejer1;

import javax.swing.JOptionPane;

public class Alumno {
    private int leg;
    private String nom;
    private int n1;
    private int n2;
    private int asis;
    private String tur;
    private int cur;

    public Alumno(int leg, String nom, int n1, int n2, int asis, String tur, int cur) {
        this.leg = leg;
        this.nom = nom;
        this.n1 = n1;
        this.n2 = n2;
        this.asis = asis;
        this.tur = tur;
        this.cur = cur;
    }
    
    public Alumno(int leg) {
        this.leg = leg+1;
        this.nom = "";
        this.n1 = 0;
        this.n2 = 0;
        this.asis = 0;
        this.tur = "";
        this.cur = 0;
    }

    public int getLeg() {
        return leg;
    }

    private void setLeg(int leg) {
        this.leg = leg;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getAsis() {
        return asis;
    }

    public void setAsis(int asis) {
        this.asis = asis;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public int getCur() {
        return cur;
    }

    public void setCur(int cur) {
        this.cur = cur;
    }

    @Override
    public String toString() {
        String mos="";
        mos+="Legajo: "+this.leg;
        mos+="  Nombre: "+this.nom;
        mos+="  Nota 1: "+this.n1;
        mos+="  Nota 2: "+this.n2;
        mos+="  Asis: "+this.asis;
        mos+="  Turno: "+this.tur;
        if(this.cur!=6) mos+="  Curso: "+this.cur;
        else mos+="  Curso: Egresado";
        return mos;
    }
    
    public void regis(){
        String v="";
        
        do{
            v=JOptionPane.showInputDialog("Ingrese el nombre");
        }while(v.isBlank());
        this.nom=v;
        
        do{
            
            do{
                v = JOptionPane.showInputDialog("Ingrese nota 1");
            }while(!isN(v));
        }while(Integer.parseInt(v)<0 || Integer.parseInt(v)>10);
        this.n1=Integer.parseInt(v);
        
        v = JOptionPane.showInputDialog("Ingrese nota 2");
        this.n2=Integer.parseInt(v);
        
        v = JOptionPane.showInputDialog("Ingrese asistencia");
        this.asis=Integer.parseInt(v);
        
        do{
            v=JOptionPane.showInputDialog("Ingrese el turno");
        }while(!v.equalsIgnoreCase("Mañana") &&
                !v.equalsIgnoreCase("Tarde") &&
                !v.equalsIgnoreCase("Noche"));
        this.tur=v;
        
        do{
            
            do{
                v = JOptionPane.showInputDialog("Ingrese curso");
            }while(!isN(v));
        }while(Integer.parseInt(v)<1 || Integer.parseInt(v)>5);
        this.cur=Integer.parseInt(v);
        
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
    
    public int prom(){
        return (n1+n2)/2;
    }
    
}
