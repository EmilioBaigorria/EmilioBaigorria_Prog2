package Animal;

public class whale extends animal {
    private String placeOfBirth;

    public whale(String name, int age, String gender, String placeOfBirth) {
        super(name, age, gender);
        this.placeOfBirth = placeOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
    @Override
    public void makeSound(){
        System.out.println("Guiiiiiiiiiiiii....Eeeeeeuuuuuuuuuuuuuuuuuuuu");
    }
    @Override
    public void information(){
        System.out.println("Nombre: "+this.getName()+"\nEdad: "+this.getAge()+"\nGenero: "+this.getGender()+"\nLugar de nacimiento: "+this.getPlaceOfBirth());
    }
}
