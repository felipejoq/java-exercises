package Ejercicios;

public class WhileDoWhileFor {
    public static void main(String[] args) {
        System.out.println("Ciclo while:");
        int i = 1, suma = 0;

        while (i <= 10) {
            suma =+ i;
            i++;

            System.out.println("La suma es:" + suma);
        }

        System.out.println("Ciclo do-while:");
        int i2 = 1, suma2 = 0;
        do {
            suma2 =+ i2;
            System.out.println("La suma2 es:" + suma2);
            i2++;

        } while (i2 <= 10);

        System.out.println("Ciclo For:");
        int suma3 = 0;

        for (int inicio = 1; inicio <= 10; inicio++) {
            suma3 =+ inicio;
            System.out.println("La suma3 es:" + suma3);
        }
    }
}