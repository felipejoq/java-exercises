package FigurasGeometricas.Modelos;

import FigurasGeometricas.Interfaces.IFigura;

public class Rectangulo implements IFigura {
	
	private double base;
	private double altura;
	
	public Rectangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		
		return this.base * this.altura;
	}
	
}
