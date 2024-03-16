package vehicle;

public class truck extends vehicle {
    private float load;


    public truck(String owner, int doors, int wheels, float load) {
        super(owner, doors, wheels);
        this.load = load;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    public void caracteristics(float load){
        super.caracteristics();

    }
    public void loadUp(){

    }
}
