package ar.edu.unahur.obj2.composite.consumibles.comestibles;

public class Medialuna extends Comestible{
    private TipoMedialuna tipo;

    public Medialuna(String nombre, Double precioBase, Integer pesoGr, TipoMedialuna tipo) {
        super(nombre, precioBase, pesoGr);
        this.tipo = tipo;
    }
    

    @Override
    public Double costo() {
        return this.doCosto();
    }

    @Override
    protected Double doCosto() {
        return this.getPrecioBase() + (this.getPesoGr() * 0.5);
    }


    public TipoMedialuna getTipo() {
        return tipo;
    }

}
