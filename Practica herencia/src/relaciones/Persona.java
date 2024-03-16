package relaciones;

public class Persona {
    private int edad;
    private String nombre;
    private  Libro libro;//agregacion
    private Domicilio domicilio;//composicion

    public Persona(int edad, String nombre, String calle1,int numero) {
        this.edad = edad;
        this.nombre = nombre;
        this.domicilio = new Domicilio(calle1,numero);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public void agregarLibro(Libro libro1){
        this.libro=libro1;
    }
}
