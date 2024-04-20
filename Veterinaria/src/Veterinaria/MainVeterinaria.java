package Veterinaria;

import Models.Animal;
import java.util.ArrayList;
import java.util.List;

import Models.Gato;
import Models.Perro;

public class MainVeterinaria {
    public static void main(String[] args) {

    	// Creamos los animalitos
        Animal boby = new Perro("Boby",30.0,"Mestizo");
        Animal toby = new Perro("Toby",20.0,"Salchicha");
        Animal michi = new Gato("Michi", 5.0);
        Animal firulais = new Gato("Firulais", 6.0);
        
        // Creamos nuestra lista o granja? 🤔 jeje
        List<Animal> animalesList = new ArrayList<Animal>();
        animalesList.add(boby);
        animalesList.add(michi);
        animalesList.add(toby);
        animalesList.add(firulais);
        
        // Vamos a llamar a los animalitos uno por uno con un foreach
        for(Animal animal : animalesList) {
        	System.out.println("----------");
        	// Qué animal es? 😮
        	if(animal.getClass() == Perro.class) {
        		animal.emitirSonido("Guau!");
        	} else {
        		animal.emitirSonido("Miau!");
        	}
        }
        
        Animal firu = (Gato) animalesList.get(3);
        
        System.out.println("Fir se llama: " + firu.getNombre());
        
        /* boby.mostrarDatos();
        boby.emitirSonido("Woof!");
        boby.comer("Chuleta");

        toby.mostrarDatos();

        firulais.comer("Atún");

        michi.dormir();
        michi.emitirSonido("grrrr");*/

    }
}
