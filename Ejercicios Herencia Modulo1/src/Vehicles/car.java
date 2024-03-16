package Vehicles;

public class car extends vehicles{
    private float speed; //km/h
    private float cilindrada; //cc

    public car(String color, int wheelAmount, float speed, float cilindrada) {
        super(color, wheelAmount);
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
