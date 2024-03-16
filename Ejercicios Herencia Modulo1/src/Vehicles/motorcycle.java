package Vehicles;

public class motorcycle extends  bicycle{
    private float speed; //km/h
    private float cilindrada; //cc

    public motorcycle(String color, int wheelAmount, String type, float speed, float cilindrada) {
        super(color, wheelAmount, type);
        this.speed = speed;
        this.cilindrada = cilindrada;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(float cilindrada) {
        this.cilindrada = cilindrada;
    }
}
