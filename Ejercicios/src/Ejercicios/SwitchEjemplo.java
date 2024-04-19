package Ejercicios;

import java.util.Scanner;

public class SwitchEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1
        System.out.print("Introduce un numero: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es positivo");
        } else {
            System.out.println(numero + " es negativo");
        }

        // Ejercicio 2
        System.out.print("Introduce un numero: ");
        int numero1 = scanner.nextInt();

        if (numero1 % 2 == 0) {
            System.out.println(numero1 + " es par");
        } else if (numero1 <= 0) {
            System.out.println("el numero es igual o menor a cero");
        } else {
            System.out.println(numero1 + " es impar");
        }

        // Ejercicio 3: Leer un número del 1 al 12. Mostrar la estación del año según corresponda.
        System.out.print("Introduce un numero del 1 al 12: ");
        int numeroMes = scanner.nextInt();
        String mesEstacion;
        // estaciones del año hemisferio sur
        switch (numeroMes) {
            case 1:
                mesEstacion = "Enero, es verano";
                break;
            case 2:
                mesEstacion = "Febrero, es verano";
                break;
            case 3:
                mesEstacion = "Marzo, dia 21 inicia el otoño";
                break;
            case 4:
                mesEstacion = "Abril, es otoño";
                break;
            case 5:
                mesEstacion = "Mayo, es otoño";
                break;
            case 6:
                mesEstacion = "Junio, dia 21 inicia el invierno";
                break;
            case 7:
                mesEstacion = "Julio, es invierno";
                break;
            case 8:
                mesEstacion = "Agosto, invierno";
                break;
            case 9:
                mesEstacion = "Septiembre, dia 21 inicia la primavera";
                break;
            case 10:
                mesEstacion = "Octubre, es primavera";
                break;
            case 11:
                mesEstacion = "Noviembre, es primavera";
                break;
            case 12:
                mesEstacion = "Diciembre, dia 21 inicia el verano";
                break;
            default:
                System.out.println("Número inválido. Ingresa un valor entre 1 y 12.");
                	scanner.close();
                return;
        }

        System.out.println("Resultado: " + mesEstacion );

        scanner.close();
    }
}