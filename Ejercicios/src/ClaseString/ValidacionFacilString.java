package ClaseString;

import java.util.Scanner;

public class ValidacionFacilString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa 8 caracteres: ");
        String input = scanner.nextLine();

        if (input.length() == 8) {
            System.out.println("CORRECTO");
            System.out.println(input.toUpperCase());
        } else {
            System.out.println("INCORRECTO");
            System.out.println(input.toLowerCase());
        }

        scanner.close();
    }
}