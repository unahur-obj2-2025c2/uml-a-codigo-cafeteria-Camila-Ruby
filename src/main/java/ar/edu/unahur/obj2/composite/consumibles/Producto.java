package ar.edu.unahur.obj2.composite.consumibles;

public abstract class Producto implements Consumible{
    private String nombre;
    private Double precioBase;

    public Producto(String nombre, Double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecioBase() {
        return precioBase;
    }
    
}
