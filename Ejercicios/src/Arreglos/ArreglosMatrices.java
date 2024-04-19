package Arreglos;

public class ArreglosMatrices {
    public static void main(String[] args) {
        // declarar un array de enteros
        int[] numeros = new int[5];

        // completar el array con un ciclo for
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // imprimir el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento " + i + ": " + numeros[i]);
        }

        // usar foreach
        for (int numero : numeros) {
            System.out.println("Elemento con foreach: " + numero);
        }

        // declarar un array de Strings
        String[] paises = {"Argentina", "Brasil", "Chile", "Colombia", "Perú"};

        // imprimir el array de strings
        for (String pais : paises) {
            System.out.println("País: " + pais);
        }

        // Matriz de enteros
        int[][] matriz = new int[3][3];

        // completar la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i + j;
            }
        }

        // imprimir la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: " + matriz[i][j] + " | ");
            }
            System.out.println();
        }


    }
}