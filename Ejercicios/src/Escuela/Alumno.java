package Escuela;

public class Alumno extends Persona {

    private int edad;

    public Alumno(String nombre, int edad) {
        super(nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
