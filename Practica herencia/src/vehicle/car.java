package vehicle;

public class car extends vehicle {
    private boolean convertible;


    public car(String owner, int doors, int wheels, boolean convertible) {
        super(owner, doors, wheels);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }


    public void getDown(){
        System.out.println("Me estoy bajando");


    }
    public void getUp(){
        System.out.println("Me estoy subiendo");

    }
    private static String isConvertable(boolean con){
        if (con){
            return "Es convertible";
        }else {
            return "No es convertible";
        }

    }

     public void caracteristics (){
         System.out.println("Dueño del auto: "+this.getOwner()+"\nCantidad de puertas: "+this.getDoors()+"\nCantidad de ruedas: "+this.getWheels()+"\n¿Convertible?: "+(isConvertable(this.isConvertible())));

    }
}
