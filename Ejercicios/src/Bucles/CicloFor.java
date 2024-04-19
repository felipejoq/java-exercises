package Bucles;

public class CicloFor {
    public static void main(String[] args) {
        int num = 5;
        int hasta = 20;
        System.out.println("Multiplicar por 5:");
        for (int i = 1; i <= hasta; i++) {
            int resultado = num * i;
            System.out.println(num + " x " + i + " = " + resultado);
        }
    }
}