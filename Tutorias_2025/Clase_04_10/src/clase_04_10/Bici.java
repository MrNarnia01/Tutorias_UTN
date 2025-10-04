package clase_04_10;

public class Bici extends Vehiculo{
    private int cb;

    public Bici(String den, String mar, int stock, int precio, int id, int cb) {
        super(den, mar, stock, precio, id);
        this.cb=cb;
    }

    public int getCb() {
        return cb;
    }

    public void setCb(int cb) {
        this.cb = cb;
    }
    
    @Override
    public String toString() {
        String a = "\nVehiculo: Bici    -   Id: "+super.getId();
        a+=super.toString();
        a += "  C.Cambios:  "+cb;
        return a;
    }
}
