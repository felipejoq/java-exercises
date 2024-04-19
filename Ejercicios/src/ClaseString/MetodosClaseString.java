package ClaseString;

public class MetodosClaseString {
    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Perez";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("nombreCompleto = " + nombreCompleto);

        System.out.println("nombreCompleto.toUpperCase() = " + nombreCompleto.toUpperCase());
        System.out.println("nombreCompleto.toLowerCase() = " + nombreCompleto.toLowerCase());
        System.out.println("nombreCompleto.length() = " + nombreCompleto.length());

        // Comparar Strings
        System.out.println("nombreCompleto.equals(\"Juan Perez\") = " + nombreCompleto.equals("Juan Perez"));
        // ==
        System.out.println("nombreCompleto == \"Juan Perez\" = " + (nombreCompleto == "Juan Perez"));
        // equalsIgnoreCase
        System.out.println("nombreCompleto.equalsIgnoreCase(\"Juan Perez\") = " + nombreCompleto.equalsIgnoreCase("Juan Perez"));
        // compareTo
        System.out.println("nombreCompleto.compareTo(\"Juan Perez\") = " + nombreCompleto.compareTo("Juan Perez"));
        // compareTo
        System.out.println("nombreCompleto.compareTo(\"Aaron\") = " + nombreCompleto.compareTo("Aaron"));
        // charAt
        System.out.println("nombreCompleto.charAt(0) = " + nombreCompleto.charAt(0));
        // charAt largo variable
        System.out.println("nombreCompleto.charAt(nombreCompleto.length()-1) = " + nombreCompleto.charAt(nombreCompleto.length()-1));
        // indexOf
        System.out.println("nombreCompleto.indexOf(\"P\") = " + nombreCompleto.indexOf("P"));
        //replace
        System.out.println("nombreCompleto.replace(\"a\", \"A\") = " + nombreCompleto.replace("a", "A"));
        // substring
        System.out.println("nombreCompleto.substring(1) = " + nombreCompleto.substring(1));
    }
}