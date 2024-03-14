
import java.util.Scanner;
import java.math.*;

//7.Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int) y
// un signo aritmético (String), según este último se realizara la operación correspondiente.
// Al final mostrara el resultado en un cuadro de dialogo.
//Los signos aritméticos disponibles son:
//
//a.	+: suma los dos operandos.
//b.	-: resta los operandos.
//c.	*: multiplica los operandos.
//d.	/: divide los operandos, este debe dar un resultado con decimales (double)
//e.	^:  1º operando como base y 2º como exponente.
//f.	%:  módulo, resto de la división entre operando1 y operando2.
public class Ejer7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int operator1, operator2;
        String arithmeticSymbol;
        System.out.println("Introduce el primer operador");
        operator1=input.nextInt();
        System.out.println("Intruduce el segundo operador");
        operator2=input.nextInt();

        input.nextLine();//limpiar el buffer

        while (true){
            System.out.println("Ingrese el signo aritmetico que desea usar\nLista de operadores:\n + suma\n - resta\n * multiplicacion\n / division\n ^ operador 1 como base y operador 2 como exponente\n % modulo");
            arithmeticSymbol=input.nextLine();
            if (arithmeticSymbol.equals("+")){
                System.out.println(operator1+arithmeticSymbol+operator2+"="+(operator1+operator2));
                break;
            } else if (arithmeticSymbol.equals("-")) {
                if (operator1>operator2){
                    System.out.println(operator1+arithmeticSymbol+operator2+"="+(operator1-operator2));
                }else {
                    System.out.println(operator1+arithmeticSymbol+operator2+"="+(operator2-operator1));
                }
                break;
            } else if (arithmeticSymbol.equals("*")) {
                System.out.println(operator1+arithmeticSymbol+operator2+"="+(operator1*operator2));
                break;
            } else if (arithmeticSymbol.equals("/")) {
                System.out.println(operator1+arithmeticSymbol+operator2+"="+(operator1/operator2));
                break;
            } else if (arithmeticSymbol.equals("^")) {
                System.out.println(operator1+arithmeticSymbol+operator2+"="+(Math.pow(operator1,operator2)));
                break;
            } else if (arithmeticSymbol.equals("%")) {
                System.out.println(operator1+arithmeticSymbol+operator2+"="+(operator1%operator2));
                break;
            }else {
                System.out.println("El simbolo aritmetico ingresado no es valido, intenta denuevo");
            }
        }
    }

}
