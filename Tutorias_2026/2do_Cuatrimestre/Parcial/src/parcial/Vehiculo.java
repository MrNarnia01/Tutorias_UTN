package parcial;


public abstract class Vehiculo {
    private int cod;
    private String nom;
    private int cDias;
    private float pre;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getcDias() {
        return cDias;
    }

    public void setcDias(int cDias) {
        this.cDias = cDias;
    }

    public float getPre() {
        return pre;
    }

    public void setPre(float pre) {
        this.pre = pre;
    }

    public Vehiculo(int cod, String nom, int cDias, float pre) {
        this.cod = cod;
        this.nom = nom;
        this.cDias = cDias;
        this.pre = pre;
    }
    
    
    public Vehiculo() {
        this.cod = 0;
        this.nom = "";
        this.cDias = 0;
        this.pre = 0;
    }
    
    public abstract float preFinal();
    public abstract float deposito();
}
