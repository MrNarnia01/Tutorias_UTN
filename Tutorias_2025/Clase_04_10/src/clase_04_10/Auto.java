package clase_04_10;

public class Auto extends Vehiculo{
    private int cpu;

    public Auto(String den, String mar, int stock, int id, int cpu) {
        super(den, mar, stock, id);
        this.cpu=cpu;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        String a = "\nVehiculo: Auto    -   Id: "+super.getId();
        a+=super.toString();
        a += "  C.Puertas:  "+cpu;
        a += "  Precio:  "+precio();
        return a;
    }
    
    public int precio(){
        int p=1000;
        p=p+(1000*this.cpu);
        return p;
    }
    
    
    
    
    
    
}
