import vehicle.*;
public class Main {
    public static void main(String[] args) {
        car c2=new car("emilio",7,5,false);

        car c1=new car("Emilio",4,4,true);

        truck t1=new truck("Emilio",2,8,1000);

        c1.caracteristics();
        c1.isConvertible()



    }
}