package clase_04_10;

public class Bici extends Vehiculo{
    private int cb;

    public Bici(String den, String mar, int stock, int id, int cb) {
        super(den, mar, stock, id);
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
        a += "  Precio:  "+precio();
        return a;
    }
    
    public int precio(){
        int p=1000;
        p=p+(200*this.cb);
        return p;
    }
}
