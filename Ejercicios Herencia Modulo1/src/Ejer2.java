import Animal.*;
public class Ejer2 {
    public static void main(String[] args) {
        cat c1=new cat("Leopoldo",12,"Masculino","British Shorthair");
        parrot p1=new parrot("Polly",7,"Femenino","Rojo y azul");
        whale w1=new whale("Old Tom",35,"Masculino","Sureste Australiano");

        c1.makeSound();
        System.out.println("Informacion del gato\n");
        c1.information();

        System.out.println("\n");
        p1.makeSound();
        System.out.println("Informacion del loro\n");
        p1.information();

        System.out.println("\n");
        w1.makeSound();
        System.out.println("Informacion de la ballena\n");
        w1.information();



    }

}