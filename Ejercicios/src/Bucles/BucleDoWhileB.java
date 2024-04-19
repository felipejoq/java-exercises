package Bucles;

import java.util.Scanner;

public class BucleDoWhileB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa en NUMERO límite positivo: ");
        int limite = scanner.nextInt();

        if (limite <= 0) {
            System.out.println("El valor límite debe ser positivo.");
            scanner.close();
            return;
        }

        int suma = 0;
        int numero;
        do {
            System.out.print("Ingresa un número: ");
            numero = scanner.nextInt();
            suma += numero;
        } while (suma <= limite);

        System.out.println("La suma de los números introducidos supera el límite inicial (" + limite + ").");

        scanner.close();
    }
}