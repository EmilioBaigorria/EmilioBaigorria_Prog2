
import java.util.Scanner;

//5.Crea un programa que pida al usuario un número mínimo y un máximo y muestre por
// pantalla todos los números primos incluidos en ese rango. Validar que mínimo sea menor que máximo.
public class Ejer5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min,max,primeAmount=0;
        System.out.println("A continuacion pedire dos numeros y mostrare  todos los numeros existentes entre ambos numeors(el primer numero debe ser menor al segudno)");
        while (true){
            System.out.println("Ingresa el minimo");
            min=input.nextInt();
            System.out.println("Ingresa el maximo");
            max=input.nextInt();
            if (min>=max){
                System.out.println("Error, el numero minimo debe ser menor al numero maximo, intenta denuevo");
            }else {
                break;
            }
        }
        for (int i=min;i<=max;i++){
            if (isPrime(i)){
                System.out.println(i+" es primo");
                primeAmount++;
            }
        }
        if (primeAmount==0){
            System.out.println("No habia ningun numero primo entre "+min+" y "+max);
        }else {
            System.out.println("El numero total de numeros primos es: "+primeAmount);
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
