package com.mycompany.clase_23_08;

import javax.swing.JOptionPane;

public class Alumno {
    private int leg;
    private String nomyape;
    private String mail;
    private String dom;
    private int tel;
    private Materia mat;

    public Alumno(int leg, String nomyape, String mail, String dom, int tel, Materia mat) {
        this.leg = leg;
        this.nomyape = nomyape;
        this.mail = mail;
        this.dom = dom;
        this.tel = tel;
        this.mat= mat;
    }
    
    public Alumno() {
        this.leg = 0;
        this.nomyape = "";
        this.mail = "";
        this.dom = "";
        this.tel = 0;
        this.mat= new Materia();
    }

    public int getLeg() {
        return leg;
    }

    private void setLeg(int leg) {
        this.leg = leg;
    }

    public String getNomyape() {
        return nomyape;
    }

    public void setNomyape(String nomyape) {
        this.nomyape = nomyape;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDom() {
        return dom;
    }

    public void setDom(String dom) {
        this.dom = dom;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public Materia getMat() {
        return mat;
    }
    
    public String getMatString() {
        return mat.toString();
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }
    
    @Override
    public String toString() {
        String mos="";
        mos+="\nLegajo: "+this.getLeg();
        mos+="\nNombre: "+this.getNomyape();
        mos+="\nMail: "+this.getMail();
        mos+="\nDomicilio: "+this.getDom();
        mos+="\nTelefono: "+this.getTel();
        mos+="\nMateria:";
        mos+=this.mat.toString();
        return mos;
    }

    public void regis(int l){
        this.leg=l+1;
        String n="";
        do{
            n=JOptionPane.showInputDialog("Ingrese el nombre");
        }while(n.isBlank());
        this.nomyape=n;
        
        do{
            n=JOptionPane.showInputDialog("Ingrese el mail");
        }while(n.isBlank());
        this.mail=n;
        
        do{
            n=JOptionPane.showInputDialog("Ingrese el domicilio");
        }while(n.isBlank());
        this.dom=n;
        
        do{
            n=JOptionPane.showInputDialog("Ingrese el telefono");
        }while(Integer.parseInt(n)<=0);
        this.tel=Integer.parseInt(n);
        
        this.mat.regis();
    }

    
    
    
}
