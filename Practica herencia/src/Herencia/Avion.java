package Herencia;

public class Avion extends vehiculo{
    private int velocidadMaxima;

    public Avion(String marca, int cantidadRuedas, int velocidadMaxima) {
        super(marca, cantidadRuedas);
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    void mover() {
        System.out.println("Me muevo como avion");

    }
}
