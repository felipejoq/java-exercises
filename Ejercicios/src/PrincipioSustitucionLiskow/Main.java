package PrincipioSustitucionLiskow;

import PrincipioSustitucionLiskow.Modelos.Circulo;
import PrincipioSustitucionLiskow.Modelos.FiguraGeometrica;
import PrincipioSustitucionLiskow.Modelos.Rectangulo;
import PrincipioSustitucionLiskow.Modelos.Triangulo;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<FiguraGeometrica> figuras = List.of(
                new Circulo("Circulo", 5),
                new Triangulo("Triangulo", 10, 5),
                new Rectangulo("Rectangulo", 10, 5)
        );

        for (FiguraGeometrica figura : figuras) {
            System.out.println("--------------------");
            System.out.println("🏷️ Nombre: " + figura.obtenerNombre()
                    + " 📐 Area: " + figura.calcularArea());
        }
    }
}
