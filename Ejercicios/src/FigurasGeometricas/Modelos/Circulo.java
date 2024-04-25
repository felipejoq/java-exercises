package FigurasGeometricas.Modelos;

import FigurasGeometricas.Interfaces.IFigura;

public class Circulo implements IFigura {
	private double radio;

	
	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.pow(radio, 2) * Math.PI;
	}
	
	
}
