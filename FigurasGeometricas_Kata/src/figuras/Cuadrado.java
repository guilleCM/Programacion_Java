package figuras;

public class Cuadrado extends FiguraGeometrica {
	
	private double lado;
	
	Cuadrado() {
		this.nombre = "desconocido";
		this.lado = 0.0;
	}
	
	Cuadrado(double lado) {
		this.lado = lado;
	}
	
	Cuadrado(String nombre, double lado) {
		this.nombre = nombre;
		this.lado = lado;
	}
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double getLado() {
		return this.lado;
	}
	
	@Override
	public double area() {
		return this.lado*this.lado;
	}
}
