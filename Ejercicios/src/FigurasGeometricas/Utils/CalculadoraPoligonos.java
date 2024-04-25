package FigurasGeometricas.Utils;

import FigurasGeometricas.Interfaces.ICalculadoraPoligonos;
import FigurasGeometricas.Interfaces.IFigura;

public class CalculadoraPoligonos implements ICalculadoraPoligonos {

    @Override
    public void mostrarPoligono(IFigura figura) {
        System.out.println("El área del polígono es: " + figura.calcularArea());
    }

    @Override
    public void multiplicarAreas(IFigura figura1, IFigura figura2) {
        System.out.println("El área del polígono 1 multiplicado por el área del polígono 2 es: "
                + figura1.calcularArea() * figura2.calcularArea());
    }

    @Override
    public void dividirAreas(IFigura figura1, IFigura figura2) {
        System.out.println("El área del polígono 1 dividido por el área del polígono 2 es: "
                + figura1.calcularArea() / figura2.calcularArea());
    }
}
