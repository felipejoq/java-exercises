package ClaseMath;

import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        // Todos los metodos de la clase Maths
        System.out.println("Valor absoluto de -5: " + Math.abs(-5));
        System.out.println("Redondeo de 5.5: " + Math.round(5.5));
        System.out.println("Redondeo hacia arriba de 5.1: " + Math.ceil(5.1));
        System.out.println("Redondeo hacia abajo de 5.9: " + Math.floor(5.9));
        System.out.println("Potencia de 2^3: " + Math.pow(2, 3));
        System.out.println("Raíz cuadrada de 9: " + Math.sqrt(9));
        System.out.println("Numero mayor entre 5 y 10: " + Math.max(5, 10));
        // numero minimo y maximo pero con decimales y más de 2 números
        System.out.println("Numero mayor entre 5.5, 10.5 y 7.5: " + Math.max(5.5, Math.max(10.5, 7.5)));
        // buscar el máximo de forma dinámica
        double[] numeros = {5.5, 10.5, 7.5};
        double max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            max = Math.max(max, numeros[i]);
        }
        System.out.println("Numero mayor entre 5.5, 10.5 y 7.5: " + max);

        System.out.println("Numero menor entre 5 y 10: " + Math.min(5, 10));
        System.out.println("Numero aleatorio entre 0 y 1: " + Math.random());
        // Pi
        System.out.println("Valor de PI: " + Math.PI);
        // raíz cubica
        System.out.println("Raiz cubica de 27: " + Math.cbrt(27));
        // seno
        System.out.println("Seno de 90: " + Math.sin(Math.toRadians(90)));
        // coseno
        System.out.println("Coseno de 0: " + Math.cos(Math.toRadians(0)));
        // tangente
        System.out.println("Tangente de 45: " + Math.tan(Math.toRadians(45)));
        // arcoseno
        System.out.println("Arcoseno de 1: " + Math.asin(1));
        // arcocoseno
        System.out.println("Arcocoseno de 1: " + Math.acos(1));

        // Numero random del 1 al 100
        System.out.println("Numero random del 1 al 100: " + (int) (Math.random() * 100 + 1));

        // fórmula para calcular el volumen de una esfera usando Math recibiendo el radio usando scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volumen de una esfera");
        System.out.println("Fórmula: (4/3) * PI * radio^3");
        System.out.println("Introduce el radio de la esfera: ");
        double radio = scanner.nextDouble();
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
        System.out.println("Volumen de la esfera con radio 5: " + volumen);

        // el doble y el triple de un número usando la clase Math
        System.out.println("Introduce un número: ");
        double numero = scanner.nextDouble();
        System.out.println("El doble de " + numero + " es: " + (numero * 2));
        System.out.println("El triple de " + numero + " es: " + (numero * 3));
        // la raiz cuadrada
        System.out.println("La raiz cuadrada de " + numero + " es: " + Math.sqrt(numero));
        // elevado a 7
        System.out.println(numero + " elevado a 7 es: " + Math.pow(numero, 7));
        scanner.close();
    }
}