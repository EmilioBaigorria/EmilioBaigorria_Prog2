
import java.util.Scanner;

//8.Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
//Al terminar, mostrará lo siguiente:
//a.mayor numero introducido
//b.menor numero introducido
//c.suma de todos los numeros
//d.suma de los numeros positivos
//e.suma de los numeros negativos
//f.media de la suma (la primera que pido)
//El número -1 no contara como número.
public class Ejer8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float maxNumber=0,minNumber=0,totalSum=0,totalSumPositive=0,totalSumNegative=0,totalNumberAmount=0,temp;
        boolean firstLoop=true;
        while (true){
            System.out.println("Ingrese un numero, para dejar de ingresar numeros ingrese -1");
            temp=input.nextFloat();
            if (temp==-1){
                break;
            }else {
                if (firstLoop){
                    maxNumber=temp;
                    minNumber=temp;
                    firstLoop=false;
                }else {
                    if (temp>maxNumber){
                        maxNumber=temp;
                    }
                    if (temp<minNumber){
                        minNumber=temp;
                    }
                }
                totalSum=totalSum+temp;
                if (temp>0){
                    totalSumPositive=totalSumPositive+temp;
                } else if (temp<0) {
                    totalSumNegative=totalSumNegative+temp;
                }
                totalNumberAmount++;
            }

        }
        System.out.println("Informacion recolectada:\nMayor numero introducido: "+maxNumber+"\nMenor numero introducido: "+minNumber+"\nSuma de todos los numeros: "+totalSum+"\nSuma de todos los numeros positivos: "+totalSumPositive+"\nSuma de todos los numeros negativos: "+totalSumNegative+"\nPromedio de todos los numeros ingresados: "+(totalSum/totalNumberAmount));

    }

}
