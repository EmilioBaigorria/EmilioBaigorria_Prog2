import java.util.ArrayList;
import java.util.Scanner;

//2.	Crea un programa en Java que convierta la temperatura de grados Celsius a Fahrenheit y
// viceversa. El programa debe permitir al usuario elegir la dirección de la conversión y
// luego ingresar la temperatura a convertir.
public class Ejer2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rep;
        System.out.println("Bienvenido al conversor Mister Freeze V 1.0");
        while (true){
            System.out.println("¿Que tipo de operacion desea hacer?\n[1].Celcius a Fahrenheit\n[2].Fahrenheit a Celcius");
            rep=input.nextInt();
            if (rep==1){
                System.out.println("Ingrese los grados Celcius");
                rep=input.nextInt();
                System.out.println(rep+" grados Celcius equivalen a "+((rep*9/5)+32)+" grados Fahrenheit");
                break;
            } else if (rep==2) {
                System.out.println("Ingrese los grados Fahrenheit");
                rep=input.nextInt();
                System.out.println(rep+" grados Fahrenheit equivalen a "+ 0.55*(rep-32) +" grados Celcius");
                break;

            }else {
                System.out.println("El numero ingresado no es valido, intente denuevo");
            }
        }




    }
}
