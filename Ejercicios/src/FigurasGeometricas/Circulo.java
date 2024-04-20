package FigurasGeometricas;

public class Circulo extends Figura {
	private double radio;

	
	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public double calcularArea() {
		return Math.pow(radio, 2) * Math.PI;
	}
	
	
}
