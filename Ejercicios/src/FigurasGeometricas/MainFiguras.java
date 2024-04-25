package FigurasGeometricas;

import FigurasGeometricas.Interfaces.ICalculadoraPoligonos;
import FigurasGeometricas.Interfaces.IFigura;
import FigurasGeometricas.Modelos.Circulo;
import FigurasGeometricas.Modelos.Rectangulo;
import FigurasGeometricas.Modelos.Triangulo;
import FigurasGeometricas.Utils.CalculadoraPoligonos;

public class MainFiguras {
	public static void main(String[] args) {
		
		IFigura rectangulo = new Rectangulo(20.0, 10.0);
		IFigura triangulo = new Triangulo(10.0, 20.0);
		IFigura circulo = new Circulo(2.0);

		System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
		System.out.println("El área del triangulo es: " + triangulo.calcularArea());
		System.out.println("El área del circulo es: " + circulo.calcularArea());

		ICalculadoraPoligonos calculadora = new CalculadoraPoligonos();

		calculadora.mostrarPoligono(rectangulo);
		calculadora.multiplicarAreas(rectangulo, triangulo);
		calculadora.dividirAreas(triangulo, circulo);

	}
}
