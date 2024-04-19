package Models;

public class Animal {
    private String nombre;
    private Double peso;

    public Animal(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public void comer(String comida) {
        System.out.println("El animal está comiendo: " + comida);
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

    public void emitirSonido(String ruido) {
        System.out.println("Ruido del animal");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}