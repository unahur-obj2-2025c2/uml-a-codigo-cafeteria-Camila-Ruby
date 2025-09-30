package ar.edu.unahur.obj2.composite.consumibles.comestibles;

public class Tostado extends Comestible{
    private TipoTostado tipo;

    public Tostado(String nombre, Double precioBase, Integer pesoGr, TipoTostado tipo) {
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


    public TipoTostado getTipo() {
        return tipo;
    }
}
