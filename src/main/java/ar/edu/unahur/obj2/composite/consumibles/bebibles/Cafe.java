package ar.edu.unahur.obj2.composite.consumibles.bebibles;

public class Cafe extends Bebible{
    private Boolean contLeche;

    public Cafe(String nombre, Double precioBase, Integer capacidadMl, Boolean contLeche) {
        super(nombre, precioBase, capacidadMl);
        this.contLeche = contLeche;
    }

    @Override
    public Double costo() {
        return this.doCosto();
    }

    @Override
    protected Double doCosto() {
        return this.getPrecioBase() + (this.getCapacidadMl() * 0.5);
    }

    public Boolean getContLeche() {
        return contLeche;
    }

    
}
