
import java.util.Scanner;

//4.Pide un número por teclado e indica si es un número primo o no.
public class Ejer4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num1,temp;
        System.out.println("Ingresa un numero y te dire si es primo o no");
        num1=input.nextInt();
        if (isPrime(num1)){
            System.out.println("Es primo");
        }else {
            System.out.println("No es primo");
        }


        }

    public static boolean isPrime(int num){
        int temp=num*num;
        if (num<=1){
            return false;
        }
        for(int i=2;i<=temp;i++) {
            if (num % i == 0 && i!=num) {
                return false;
            }
        }
        return true;
    }
}
