package ar.edu.unahur.obj2.composite.consumibles.bebibles;

import ar.edu.unahur.obj2.composite.consumibles.Producto;

public abstract class Bebible extends Producto{
    private Integer capacidadMl;

    public Bebible(String nombre, Double precioBase, Integer capacidadMl) {
        super(nombre, precioBase);
        this.capacidadMl = capacidadMl;
    }

    public Integer getCapacidadMl() {
        return capacidadMl;
    }
    protected abstract Double doCosto();

    
}
