package parcial;

public class Camioneta extends Vehiculo{
    
    int kg;
    boolean cab;

    public Camioneta(int kg, boolean cab, int cod, String nom, int cDias, float pre) {
        super(cod, nom, cDias, pre);
        this.kg = kg;
        this.cab = cab;
    }

    public Camioneta() {
        super(0, "", 0, 0);
        this.kg = 0;
        this.cab = false;
    }
    
    
    
    public float preFinal() {
        float precio=super.getPre()*super.getcDias();
        
        if(kg<1000) precio+=super.getPre()*0.1;
        else precio+=super.getPre()*0.2;
        
        if(cab) precio+=precio*0.05;
        
        return precio;
    }
    
    public float deposito(){
        return (float) (preFinal()*0.3);
    }
    
}
