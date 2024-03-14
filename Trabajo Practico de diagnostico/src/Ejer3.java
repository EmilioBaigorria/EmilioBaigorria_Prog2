import java.util.Random;
import java.util.Scanner;

//3.	Pide por teclado dos números y genera 10 números aleatorios entre esos números.
// Usa el método Math.random para generar un número entero aleatorio.
public class Ejer3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random random=new Random();
        int num1,num2;
        System.out.println("Ingrese el primer numero");
        num1=input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2=input.nextInt();
        for (int i=1;i<11;i++){
            System.out.println("Numero aleotoreo "+i+":  "+random.nextInt(num1,num2+1));
        }

    }
}
