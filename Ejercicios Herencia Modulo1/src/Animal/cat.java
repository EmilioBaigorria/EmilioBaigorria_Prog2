package Animal;

public class cat extends animal{
    private String race;

    public cat(String name, int age, String gender, String race) {
        super(name, age, gender);
        this.race = race;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    @Override
    public void makeSound(){
        System.out.println("Meoooooowwww");
    }
    @Override
    public void information(){
        System.out.println("Nombre: "+this.getName()+"\nEdad: "+this.getAge()+"\nGenero: "+this.getGender()+"\nRaza: "+this.getRace());
    }

}
