package clase_04_10;

public class Auto extends Vehiculo{
    private int cpu;

    public Auto(String den, String mar, int stock, int precio, int id, int cpu) {
        super(den, mar, stock, precio, id);
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
        return a;
    }
    
    
    
    
    
    
    
    
}
