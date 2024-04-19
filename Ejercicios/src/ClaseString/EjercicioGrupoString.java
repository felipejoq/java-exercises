package ClaseString;

public class EjercicioGrupoString {
    public static void main(String[] args) {

        // Extraer las y contar las vocales de un string
        String texto = "La lluvia moja";
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println(letra);
                contador++;
            }
        }

        System.out.println("La cantidad de vocales es: " + contador);

        // Extraer la cuarta y quinta letra de un string
        String texto2 = "Hoypuede ser un gran día";
        String resultado = texto2.substring(3, 5);
        System.out.println("resultado = " + resultado);


    }
}