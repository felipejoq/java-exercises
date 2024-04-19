package ClaseMath;

import java.util.Scanner;

public class EjercicioClaseMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar un numero entero: ");
        int numero = scanner.nextInt();

        System.out.println("El doble del numero " + numero + " es: " + (numero * 2));
        System.out.println("El doble del numero " + numero + " es: " + (numero * 3));
        System.out.println("La raiz cuadrada del numero " + numero + " es: " + Math.sqrt(numero));
        System.out.println("La potencia de " + numero + " elevado a 7 es: " + Math.pow(numero, 7));
        
        scanner.close();
    }
}