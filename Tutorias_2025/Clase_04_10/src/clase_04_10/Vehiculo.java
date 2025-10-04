/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_04_10;

/**
 *
 * @author narnia
 */
public class Vehiculo {
    private int id;
    private String den;
    private String mar;
    private int st;
    private int pre;

    public Vehiculo(String den, String mar, int stock, int precio, int id) {
        this.id=id+1;
        this.den = den;
        this.mar = mar;
        this.st = stock;
        this.pre = precio;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDen() {
        return den;
    }

    public void setDen(String den) {
        this.den = den;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public int getStock() {
        return st;
    }

    public void setStock(int stock) {
        this.st = stock;
    }

    public int getPrecio() {
        return pre;
    }

    public void setPrecio(int precio) {
        this.pre = precio;
    }

    @Override
    public String toString() {
        String a="Denominacion: "+den;
        a+="    Marca: "+mar;
        a+="    Stock: "+st;
        a+="    Precio: "+pre;
        
        return a;
    }
    
    
    
    
    
    
}
