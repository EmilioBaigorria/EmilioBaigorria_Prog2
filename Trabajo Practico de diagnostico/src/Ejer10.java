
import java.util.ArrayList;
import java.util.Scanner;

//10.	Crea un programa en Java que solicite al usuario ingresar las notas de un
// conjunto de estudiantes y luego calcule el promedio de esas notas. El programa
// debe preguntar al usuario cuántas notas desea ingresar, luego leer las notas y
// finalmente calcular y mostrar el promedio..
public class Ejer10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float totalGrade=0,temp,gradeAmount;
        ArrayList<Float> grades=new ArrayList<>();
        while (true){

            System.out.println("¿Cuantas notras desea ingresar?");
            gradeAmount=input.nextInt();
            if (gradeAmount<=0){
                System.out.println("El numero de notas ingresadas debe ser mayor a 0, intenta denuevo");
            }else {
                break;
            }
        }
        for (int i=0;i<gradeAmount;i++){
            System.out.println("Ingresa la nota del alumno numero "+(i+1));
            temp=input.nextFloat();
            totalGrade=totalGrade+temp;
            grades.add(temp);
        }
        for (int i=0;i<gradeAmount;i++){
            System.out.println(" nota del alumno  "+(i+1)+": "+grades.get(i));
        }
        System.out.println("El promedio de las notas es:"+totalGrade/gradeAmount);


    }


}
