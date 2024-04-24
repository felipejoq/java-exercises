package Models;

import Interfaces.IAnimal;

public class Animal implements IAnimal {
    private String nombre;
    private Double peso;

    public Animal(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public void hacerRuido(String ruido) {
        System.out.println("El animal hace el siguiente ruido: " + ruido);
    }

    @Override
    public void comer(String comida) {
        System.out.println("El animal está comiendo: " + comida);
    }

    @Override
    public void moverse(String movimiento) {
        System.out.println("El animal se está moviendo así: " + movimiento);
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

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

}