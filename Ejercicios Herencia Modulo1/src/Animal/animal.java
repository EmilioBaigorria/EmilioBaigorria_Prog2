package Animal;

public class animal {
    private String name;
    private int age;
    private String gender;

    public animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void makeSound(){
        System.out.println("El animal hace un sonido generico");
    }
    public void information(){
        System.out.println("Informacion generica");
    }
}
