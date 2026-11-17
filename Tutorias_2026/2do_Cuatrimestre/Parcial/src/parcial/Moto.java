package parcial;

public class Moto extends Vehiculo{
    
    int cilin;
    boolean casco;

    public Moto(int cilin, boolean casco, int cod, String nom, int cDias, float pre) {
        super(cod, nom, cDias, pre);
        this.cilin = cilin;
        this.casco = casco;
    }

    public Moto() {
        super(0, "", 0, 0);
        this.cilin = 0;
        this.casco = false;
    }
    
    
    
    public float preFinal() {
        float precio=super.getPre()*super.getcDias();
        
        if(cilin<150) precio+=super.getPre()*0.05;
        else precio+=super.getPre()*0.12;
        
        if(casco) precio+=5000;
        
        return precio;
    }
    
    public float deposito(){
        return (float) (preFinal()*0.1);
    }
    
}
