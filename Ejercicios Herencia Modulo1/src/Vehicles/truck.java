package Vehicles;

public class truck extends car {
    private float load;

    public truck(String color, int wheelAmount, float speed, float cilindrada, float load) {
        super(color, wheelAmount, speed, cilindrada);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }
}
