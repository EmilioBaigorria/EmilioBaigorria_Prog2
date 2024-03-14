
import java.util.Scanner;

//6.Pide al usuario que ingrese una frase y devuelve la cantidad de vocales y consonantes que tiene esa frase.
public class Ejer6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int vocalsAmount=0,consonantsAmount=0;
        String frase;
        System.out.println("Ingrese una frase y contare las vocales y consonantes");
        frase=input.next();
        frase=frase.toLowerCase();
        for (int i=0;i<frase.length();i++){
            if (frase.substring(i,i+1).contains("a")||frase.substring(i,i+1).contains("e")||frase.substring(i,i+1).contains("i")||frase.substring(i,i+1).contains("o")||frase.substring(i,i+1).contains("u")){
                vocalsAmount++;
            }else {
                consonantsAmount++;
            }
        }
        System.out.println("La frase ingresada contiene un total de "+vocalsAmount+" vocales y un total de "+consonantsAmount+" consonantes.");
    }

}
