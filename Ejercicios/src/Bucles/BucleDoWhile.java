package Bucles;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;

        System.out.println("Ingresa su números (0 para salir):");
        do {
            System.out.print("Número: ");
            numeroIngresado = scanner.nextInt();
        } while (numeroIngresado != 0);

        System.out.println("Fin del programa");
        
        scanner.close();
    }
}