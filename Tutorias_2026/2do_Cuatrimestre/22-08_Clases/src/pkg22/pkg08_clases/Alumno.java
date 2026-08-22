package pkg22.pkg08_clases;

import javax.swing.JOptionPane;

public class Alumno {

    private int leg;
    private String nom;
    private String ape;
    private int edad;

    private Alumno(int leg, String nom, String ape, int edad) {
        this.leg = leg;
        this.nom = nom;
        this.ape = ape;
        this.edad = edad;
    }
    
    public Alumno() {
        this.leg = 0;
        this.nom = "";
        this.ape = "";
        this.edad = 0;
    }

    public int getLeg() {
        return leg;
    }

    public boolean setLeg(int leg) {
        if(leg>0){
            this.leg = leg;
            return true;
        }else return false;
    }
    
    public void setLegAuto() {
        String a=JOptionPane.showInputDialog("Ingrese legajo Auto");
        int leg=Integer.parseInt(a);
        if(leg>0){
            this.leg = leg;
            JOptionPane.showMessageDialog(null, "Legajo aceptado Auto");
        }else JOptionPane.showMessageDialog(null, "Legajo erroneo Auto");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
