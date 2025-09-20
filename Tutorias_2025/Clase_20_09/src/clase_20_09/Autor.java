package clase_20_09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Autor {
    private String nom;
    private Date fnac;
    private int cantl;

    public Autor(String nom, Date fnac, int cantl) {
        this.nom = nom;
        this.fnac = fnac;
        this.cantl = cantl;
    }
    
    public Autor() {
        this.nom = "";
        this.fnac = null;
        this.cantl = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getFnac() {
        return fnac;
    }

    public void setFnac(Date fnac) {
        this.fnac = fnac;
    }

    public int getCantl() {
        return cantl;
    }

    public void setCantl(int cantl) {
        this.cantl = cantl;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        String a="Nombre: "+this.nom;
        a+="    Fnac: "+formato.format(fnac);
        a+="    Cantidad de libros: "+this.cantl+"\n";
        return a;
    }
    
    
    
    
}
