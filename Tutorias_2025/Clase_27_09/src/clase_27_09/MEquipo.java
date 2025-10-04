package clase_27_09;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MEquipo {
    private int id;
    private String nom;
    private String rol;
    private Date fincor;
    private Date fBaja;
    private static int maxid=1;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Date getFincor() {
        return fincor;
    }

    public void setFincor(Date fincor) {
        this.fincor = fincor;
    }

    public Date getfBaja() {
        return fBaja;
    }

    public void setfBaja(Date fBaja) {
        this.fBaja = fBaja;
    }

    public static int getMaxid() {
        return maxid;
    }

    public static void setMaxid(int aMaxid) {
        maxid = aMaxid;
    }

    public MEquipo(String nom, String rol, Date fincor, Date fBaja) {
        this.id=getMaxid();
        setMaxid(getMaxid()+1);
        this.nom = nom;
        this.rol = rol;
        this.fincor = fincor;
        this.fBaja = fBaja;
    }

    @Override
    public String toString() {
        SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy");
        String a="\nId: "+id;
        a+="    Nombre: "+nom;
        a+="    Rol: "+rol;
        a+="    F.Incorporacion: "+formato.format(fincor);
        a+="    F.Baja: "+formato.format(fBaja);
        return a;
    }
    
    
    
    
    
}
