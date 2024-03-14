
import java.util.ArrayList;
import java.util.Scanner;

//9.	Crea un programa en Java que permita al usuario sumar dos matrices de tamaño NxM.
// El programa debe solicitar al usuario que ingrese las dimensiones de las matrices y
// luego ingresar los elementos de cada matriz. Después de eso, debe calcular la suma de las
// dos matrices (resultando una tercera matriz con la suma de los elementos de igual posición de las matrices operandos)
// e imprimir el resultado.
public class Ejer9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,M;
        System.out.println("A continuacion crearemos 2 matricez\nIngresa el tamaño lateral del la matriz");
        N=input.nextInt();
        System.out.println("Ingresa el tamaño vertical de la matriz");
        M=input.nextInt();

        System.out.println("Matriz 1");
        ArrayList<ArrayList<Integer>>mat1=createMatrix(N,M);
        System.out.println("Matriz 2");
        ArrayList<ArrayList<Integer>>mat2=createMatrix(N,M);

        ArrayList<ArrayList<Integer>>matSum=sumMatrix(mat1,mat2,N,M);

        System.out.println("Matriz 1");
        showMatrix(mat1);

        System.out.println("Matriz 2");
        showMatrix(mat2);

        System.out.println("Matriz suma");
        showMatrix(matSum);
    }
    public static ArrayList<ArrayList<Integer>> createMatrix(int N,int M){
        Scanner input=new Scanner(System.in);

        ArrayList<ArrayList<Integer>> vertical=new ArrayList<>();

        for (int i=0;i<M;i++){
            ArrayList<Integer> horizontal=new ArrayList<>();
            for (int p=0;p<N;p++){
                System.out.println("Ingresa el numero ubicado en la fila "+(i+1)+" columna "+(p+1));
                horizontal.add(input.nextInt());

            }
            vertical.add(horizontal);
        }
        return vertical;
    }
    public static ArrayList<ArrayList<Integer>> sumMatrix(ArrayList<ArrayList<Integer>> mat1,ArrayList<ArrayList<Integer>> mat2,int N,int M){
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> vertical=new ArrayList<>();
        for (int i=0;i<M;i++){
            ArrayList<Integer> horizontal=new ArrayList<>();
            for (int p=0;p<N;p++){
                horizontal.add((mat1.get(i).get(p)+mat2.get(i).get(p)));
            }
            vertical.add(horizontal);
        }
        return vertical;
    }
    public static void showMatrix(ArrayList<ArrayList<Integer>> mat){
        int N,M;
        M=mat.size();
        N=mat.get(0).size();
        for (int i=0;i<M;i++){
            System.out.println(mat.get(i));
        }
    }

}
