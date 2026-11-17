package parcial;

public class Auto extends Vehiculo{
    
    int cPuer;
    boolean aCond;

    public Auto(int cPuer, boolean aCond, int cod, String nom, int cDias, float pre) {
        super(cod, nom, cDias, pre);
        this.cPuer = cPuer;
        this.aCond = aCond;
    }

    public Auto() {
        super(0, "", 0, 0);
        this.cPuer = 0;
        this.aCond = false;
    }
    
    
    
    public float preFinal() {
        float precio=super.getPre()*super.getcDias();
        
        if(aCond) precio+=super.getPre()*0.15;
        else precio+=super.getPre()*0.05;
        
        return precio;
    }
    
    public float deposito(){
        return (float) (preFinal()*0.2);
    }
    
}
