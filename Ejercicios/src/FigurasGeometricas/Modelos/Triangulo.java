package FigurasGeometricas.Modelos;

import FigurasGeometricas.Interfaces.IFigura;

public class Triangulo implements IFigura {

	private double base;
	private double altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return (this.base * this.altura) / 2;
	}
	
}
