// Crea al menos un objeto de cada subclase y añádelos a una lista llamada vehiculos.

// Realiza una función llamada catalogar() que reciba la lista de vehiculos y los
//  recorra mostrando el nombre de su clase y sus atributos.

// Modifica la función catalogar() para que reciba un argumento optativo ruedas,
//  haciendo que muestre únicamente los que su número de ruedas concuerde con el
//  valor del argumento. También debe mostrar un mensaje "Se han encontrado {}
//  vehículos con {} ruedas:" únicamente si se envía el argumento ruedas. Ponla a
//  prueba con 0, 2 y 4 ruedas como valor.

import Vehicles.*;

import java.util.ArrayList;

public class Ejer1 {
    public static void main(String[] args) {
        ArrayList<vehicles> vehiculos=new ArrayList<>();
        car c1=new car("Negro",4,2,13);
        truck t1=new truck("Azul",4,2,10,200);
        bicycle b1=new bicycle("Rojo",2,"Urbana");
        motorcycle m1=new motorcycle("Morado",2,"Urbana",1,3);
        vehiculos.add(c1);
        vehiculos.add(t1);
        vehiculos.add(b1);
        vehiculos.add(m1);
        System.out.println("Prueba basica");
        catalogar(vehiculos,-1);
        System.out.println("Prueba con 0");
        catalogar(vehiculos,0);
        System.out.println("Prueba con 2");
        catalogar(vehiculos,2);
        System.out.println("Prueba con 4");
        catalogar(vehiculos,4);


    }


    public static void catalogar(ArrayList<vehicles> vehiculos,int wheelFilter){
        int machingWheel=0;
        boolean pass=true;
        if (wheelFilter!=-1){
            pass=false;
        }
        for (int i=0;i<vehiculos.size();i++){
            if(vehiculos.get(i).getClass()== car.class){
                car c1=(car) vehiculos.get(i);
                if (wheelFilter!=-1 && wheelFilter== c1.getWheelAmount()) {
                    System.out.println("Tipo: Auto" + "\nVelocidad maxima: " + c1.getSpeed() + "km/h\nCilindrana: " + c1.getCilindrada() + "cc\nColor: " + c1.getColor() + "\nCantidad de ruedas: " + c1.getWheelAmount() + "\n");
                    machingWheel++;
                    pass=false;
                } else if (pass) {
                    System.out.println("dasdsadsaTipo: Auto" + "\nVelocidad maxima: " + c1.getSpeed() + "km/h\nCilindrana: " + c1.getCilindrada() + "cc\nColor: " + c1.getColor() + "\nCantidad de ruedas: " + c1.getWheelAmount() + "\n");
                    pass=true;
                }
            } else if (vehiculos.get(i).getClass()== truck.class) {
                truck t1=(truck) vehiculos.get(i);
                if (wheelFilter!=-1 && wheelFilter== t1.getWheelAmount()) {
                    System.out.println("Tipo: Camion"+"\nVelocidad maxima: "+t1.getSpeed()+"km/h\nCilindrana: "+t1.getCilindrada()+"cc\nColor: "+t1.getColor()+"\nCantidad de ruedas: "+t1.getWheelAmount()+"\nCarga actual: "+t1.getLoad()+"\n");
                    machingWheel++;
                    pass=false;
                } else if (pass) {
                    System.out.println("Tipo: Camion"+"\nVelocidad maxima: "+t1.getSpeed()+"km/h\nCilindrana: "+t1.getCilindrada()+"cc\nColor: "+t1.getColor()+"\nCantidad de ruedas: "+t1.getWheelAmount()+"\nCarga actual: "+t1.getLoad()+"\n");
                    pass=true;
                }
            } else if (vehiculos.get(i).getClass()== bicycle.class) {
                bicycle b1=(bicycle) vehiculos.get(i);
                if (wheelFilter!=-1 && wheelFilter== b1.getWheelAmount()) {
                    System.out.println("Tipo: Bicicleta"+"\nColor: "+b1.getColor()+"\nCantidad de ruedas: "+b1.getWheelAmount()+"\nTipo: "+b1.getType()+"\n");
                    machingWheel++;
                    pass=false;
                } else if (pass) {
                    System.out.println("Tipo: Bicicleta"+"\nColor: "+b1.getColor()+"\nCantidad de ruedas: "+b1.getWheelAmount()+"\nTipo: "+b1.getType()+"\n");
                    pass=true;
                }
            } else if (vehiculos.get(i).getClass()== motorcycle.class) {
                motorcycle m1=(motorcycle) vehiculos.get(i);
                if (wheelFilter!=-1 && wheelFilter== m1.getWheelAmount()) {
                    System.out.println("Tipo: Motocicleta"+"\nVelocidad maxima: "+m1.getSpeed()+"km/h\nCilindrana: "+m1.getCilindrada()+"cc\nColor: "+m1.getColor()+"\nCantidad de ruedas: "+m1.getWheelAmount()+"\nTipo: "+m1.getType()+"\n");
                    machingWheel++;
                    pass=false;
                } else if (pass) {
                    System.out.println("Tipo: Motocicleta"+"\nVelocidad maxima: "+m1.getSpeed()+"km/h\nCilindrana: "+m1.getCilindrada()+"cc\nColor: "+m1.getColor()+"\nCantidad de ruedas: "+m1.getWheelAmount()+"\nTipo: "+m1.getType()+"\n");
                }
            }

        }
        if (wheelFilter!=-1){
            System.out.println("Se han encontrado "+machingWheel+" vehículos con "+wheelFilter+" ruedas");
        }

    }
}