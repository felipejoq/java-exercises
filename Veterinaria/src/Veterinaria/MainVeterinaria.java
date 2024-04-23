package Veterinaria;

import Models.*;

import java.util.ArrayList;
import java.util.List;

public class MainVeterinaria {
    public static void main(String[] args) {

    	// Creamos los animalitos
        Animal boby = new Perro("Boby",30.0,"Mestizo");
        Animal toby = new Perro("Toby",20.0,"Salchicha");
        Animal michi = new Gato("Michi", 5.0);
        Animal firulais = new Gato("Firulais", 6.0);
        Animal flipy = new Pez("Flipy", 100.00, "Delfín");
        Animal galloClaudio = new Ave("Gallo Claudio", 2.00);

        // Creamos nuestra lista o granja? 🤔 jeje
        List<Animal> animalesList = new ArrayList<>();
        animalesList.add(boby);
        animalesList.add(michi);
        animalesList.add(toby);
        animalesList.add(firulais);
        animalesList.add(flipy);
        animalesList.add(galloClaudio);

        // Vamos a llamar a los animalitos uno por uno con un foreach
        for(Animal animal : animalesList) {
        	System.out.println("----------");
            switch(animal.getClass().getSimpleName()) {
                case "Perro":
                    animal.hacerRuido("Guau!");
                    animal.comer("Croquetas");
                    animal.moverse("Corre");
                    break;
                case "Gato":
                    animal.hacerRuido("Miau!");
                    animal.comer("Pescado");
                    animal.moverse("Salta");
                    break;
                case "Pez":
                    if (((Pez) animal).getEspecie().equals("Delfín")) {
                        animal.hacerRuido("silva");
                    } else {
                        animal.hacerRuido("...");
                    }
                    animal.comer("Algas");
                    animal.moverse("Nada");
                    break;
                case "Ave":
                    animal.hacerRuido("Cucurucucu!");
                    animal.comer("Maíz");
                    animal.moverse("Vuela");
                    break;
                default:
                    animal.hacerRuido("...");
                    break;
            }
        }
    }
}
