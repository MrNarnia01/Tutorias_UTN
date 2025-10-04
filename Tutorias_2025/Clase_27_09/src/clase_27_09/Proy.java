package clase_27_09;

import java.util.ArrayList;


public class Proy {
    private int id;
    private String nom;
    private int dur;
    private ArrayList<MEquipo> vMiem;
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

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public ArrayList<MEquipo> getvMiem() {
        return vMiem;
    }

    public void setvMiem(ArrayList<MEquipo> vMiem) {
        this.vMiem = vMiem;
    }

    public static int getMaxid() {
        return maxid;
    }

    public static void setMaxid(int aMaxid) {
        maxid = aMaxid;
    }

    public Proy(String nom, int dur, ArrayList<MEquipo> vMiem) {
        this.id=getMaxid();
        setMaxid(getMaxid()+1);
        this.nom = nom;
        this.dur = dur;
        this.vMiem = vMiem;
    }
    
    public void agMiem(MEquipo me){
        vMiem.add(me);
    }
    
    public void elmMiem(MEquipo me){
        vMiem.remove(me);
    }

    @Override
    public String toString() {
        String a="\nId: "+id;
        a+=" Nombre: "+nom;
        a+=" Duracion: "+dur;
        a+=" Miembros:";
        for (int i = 0; i < vMiem.size(); i++) {
            a+=vMiem.get(i).toString();
        }
        a+="\n\n";
        return a;
    }
    
    
}
