package figuras;

public class Circulo extends FiguraGeometrica {
	
	private double radio;
	private final double PI = Math.PI;

	Circulo(){
		this.nombre = "desconocido";
		this.radio = 0.0;
	}

	Circulo(double radio) {
		this.radio = radio;
	}
	
	Circulo(String nombre, double radio) {
		this.nombre = nombre;
		this.radio = radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	public double getRadio() {
		return this.radio;
	}
	
	@Override
	public double area() {
		return (this.radio*this.radio)*PI;
	}
}
