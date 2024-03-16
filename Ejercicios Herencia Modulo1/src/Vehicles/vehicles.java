package Vehicles;

public class vehicles {
    private String color;
    private int wheelAmount;

    public vehicles(String color, int wheelAmount) {
        this.color = color;
        this.wheelAmount = wheelAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelAmount() {
        return wheelAmount;
    }

    public void setWheelAmount(int wheelAmount) {
        this.wheelAmount = wheelAmount;
    }
}
