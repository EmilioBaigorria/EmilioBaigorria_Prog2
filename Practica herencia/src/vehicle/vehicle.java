package vehicle;

public class vehicle {

    private String owner;
    protected  int doors;
    protected int wheels;

    public vehicle(String owner, int doors, int wheels) {
        this.owner = owner;
        this.doors = doors;
        this.wheels = wheels;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void caracteristics(){

    }
}
