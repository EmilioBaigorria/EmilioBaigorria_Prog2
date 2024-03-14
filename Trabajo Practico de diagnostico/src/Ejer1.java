import java.util.ArrayList;
import java.util.Scanner;

//1.Crea una calculadora simple en Java que pueda realizar operaciones básicas como suma, resta,
// multiplicación y división. El programa debe solicitar al usuario que ingrese dos números y luego
// le permitirle elegir la operación que desea realizar. Una vez completada la operación, debe mostrar
// el resultado al usuario. Cada operación debe implementarse en un método diferente. El programa principal
// debe llamar a estos métodos según la operación seleccionada por el usuario.
public class Ejer1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int rep;
        System.out.println("Bienvenido a la calculadora Bruce V 2.0");
        while (true){
            System.out.println("¿Que operacion le gustaria realizar?\n[1].Suma(+)\n[2].Resta(-)\n[3].Multiplicacion(x)\n[4].Division(/)");
            rep=input.nextInt();
            if (rep==1){
                ArrayList<Long> numbers=getNumbers();
                plus(numbers.get(0),numbers.get(1));
                break;
            } else if (rep==2) {
                ArrayList<Long> numbers=getNumbers();
                minus(numbers.get(0),numbers.get(1));
                break;
            } else if (rep==3) {
                ArrayList<Long> numbers=getNumbers();
                multiply(numbers.get(0),numbers.get(1));
                break;
            } else if (rep==4) {
                ArrayList<Long> numbers=getNumbers();
                divide(numbers.get(0),numbers.get(1));
                break;
            }else {
                System.out.println("Numero no valido, intente denuevo");

            }
        }



    }
    public static ArrayList<Long> getNumbers(){
        Scanner input=new Scanner(System.in);
        Long num1;
        Long num2;
        ArrayList<Long> numbers=new ArrayList<>();
        System.out.println("Ingrese el primer numero");
        numbers.add(input.nextLong());
        System.out.println("Ingrese el segundo numero numero");
        numbers.add(input.nextLong());
        return numbers;

    }
    public static void showResults(String operation,Long num1,Long num2,float results){
        System.out.println(num1+operation+num2+"="+results);

    }
    public static void plus(Long num1,Long num2){
     showResults("+",num1,num2,num1+num2);
    }
    public static void minus(Long num1,Long num2){
        if (num1>num2){
            showResults("-",num1,num2,num1-num2);
        }else {
            showResults("-",num2,num1,num2-num1);
        }
    }
    public static void multiply(Long num1,Long num2){

    }
    public static void divide(Long num1,Long num2){
        Scanner input=new Scanner(System.in);
        while (true){
            if (num2==0){
                System.out.println("Error, el segundo numero ingresado es 0, no es posible dividir por 0, intenten denuevo");
                num2=input.nextLong();
            }else {
                float num1temp=num1;
                float num2temp=num2;
                showResults("/",num1,num2,num1temp/num2temp);
                break;
            }
        }

    }
}