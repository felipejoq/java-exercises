package Arreglos;

import java.util.Scanner;

public class Arreglos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // declaramos el arreglo
        int[] numeros = new int[3]; // [] [] []

//        numeros[0] = "a";
//        numeros[1] = 10;
//        numeros[2] = -10;

        // llenamos el arreglo
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = scanner.nextInt();
        }

        int mayor = 0;
        // buscar el mayor
        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
        }

        System.out.println("El número mayor ingresado por ud, es: " + mayor);
        
        scanner.close();
    }
}