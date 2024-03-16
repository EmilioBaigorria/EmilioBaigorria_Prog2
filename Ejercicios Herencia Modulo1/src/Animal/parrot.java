package Animal;

public class parrot extends animal {
    private String plumeColor;

    public parrot(String name, int age, String gender, String plumeColor) {
        super(name, age, gender);
        this.plumeColor = plumeColor;
    }

    public String getPlumeColor() {
        return plumeColor;
    }

    public void setPlumeColor(String plumeColor) {
        this.plumeColor = plumeColor;
    }
    @Override
    public void makeSound(){
        System.out.println("Squawk Squawk");
    }
    @Override
    public void information(){
        System.out.println("Nombre: "+this.getName()+"\nEdad: "+this.getAge()+"\nGenero: "+this.getGender()+"\nColor de las plumas: "+this.getPlumeColor());
    }
}
