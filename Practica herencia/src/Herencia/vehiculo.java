package Herencia;

public abstract class vehiculo {
    protected String marca;
    protected int cantidadRuedas;


    public vehiculo(String marca, int cantidadRuedas) {
        this.marca = marca;
        this.cantidadRuedas = cantidadRuedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }
    abstract void mover();
}
