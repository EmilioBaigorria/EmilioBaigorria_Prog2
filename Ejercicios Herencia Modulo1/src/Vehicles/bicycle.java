package Vehicles;

public class bicycle extends vehicles {
    private String type;

    public bicycle(String color, int wheelAmount, String type) {
        super(color, wheelAmount);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
