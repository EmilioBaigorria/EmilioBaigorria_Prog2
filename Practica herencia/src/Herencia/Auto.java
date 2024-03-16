package Herencia;

public class Auto extends vehiculo{
    private int matricula;

    public Auto(String marca, int cantidadRuedas, int matricula) {
        super(marca, cantidadRuedas);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    void mover() {
        System.out.println("Me estoy moviendo como auto");

    }
}
