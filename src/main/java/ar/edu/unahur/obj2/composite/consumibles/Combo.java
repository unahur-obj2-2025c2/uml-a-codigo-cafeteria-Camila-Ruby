package ar.edu.unahur.obj2.composite.consumibles;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Consumible{
    private String nombre;
    private Double precio;
    private List<Producto> productos = new ArrayList<>();

    public Combo(String nombre, Double precio, List<Producto> productos) {
        this.nombre = nombre;
        this.precio = precio;
        this.productos = productos;
    }

    public Combo(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public Double costo() {
        return productos.stream().mapToDouble(p -> p.costo()).sum();
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public List<Producto> getProductos() {
        return productos;
    }

}
