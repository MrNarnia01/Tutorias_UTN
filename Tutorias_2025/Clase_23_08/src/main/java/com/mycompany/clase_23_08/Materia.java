package com.mycompany.clase_23_08;

import javax.swing.JOptionPane;

public class Materia {
    private String nom;
    private String turno;
    private boolean prom;
    private float nota;

    public Materia(String nom, String turno, boolean prom, float nota) {
        this.nom = nom;
        this.turno = turno;
        this.prom = prom;
        this.nota = nota;
    }
    
    public Materia() {
        this.nom = "";
        this.turno = "";
        this.prom = false;
        this.nota = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public boolean isProm() {
        return prom;
    }

    public void setProm(boolean prom) {
        this.prom = prom;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    
     @Override
    public String toString() {
        String mos="";
        mos+="\nNombre: "+this.getNom();
        mos+="\nTurno: "+this.getTurno();
        mos+="\nPromocionable: ";
        if(this.isProm()) mos+="Si";
        else mos+="No";
        mos+="\nNota: "+this.getNota();
        return mos;
    }
    
    public void regis(){
        String n="";
        do{
            n=JOptionPane.showInputDialog("Ingrese el nombre de la materia");
        }while(n.isBlank());
        this.nom=n;
        
        do{
            n=JOptionPane.showInputDialog("Ingrese el turno");
        }while(n.isBlank());
        this.turno=n;
        
        do{
            n=JOptionPane.showInputDialog("Ingrese es promocinable(Si/No)");
        }while(n.isBlank());
        this.prom=n.equalsIgnoreCase("si");
        
        do{
            n=JOptionPane.showInputDialog("Ingrese la nota");
        }while(Float.parseFloat(n)<=0);
        this.nota=Float.parseFloat(n);
    }
    
    
}
