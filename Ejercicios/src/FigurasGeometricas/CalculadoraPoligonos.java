package FigurasGeometricas;

public class CalculadoraPoligonos implements ICalculadoraPoligonos {

    @Override
    public void mostrarPoligono(Figura figura) {
        System.out.println("El área del polígono es: " + figura.calcularArea());
    }

    @Override
    public void multiplicarAreas(Figura figura1, Figura figura2) {
        System.out.println("El área del polígono 1 multiplicado por el área del polígono 2 es: "
                + figura1.calcularArea() * figura2.calcularArea());
    }

    @Override
    public void dividirAreas(Figura figura1, Figura figura2) {
        System.out.println("El área del polígono 1 dividido por el área del polígono 2 es: "
                + figura1.calcularArea() / figura2.calcularArea());
    }
}
