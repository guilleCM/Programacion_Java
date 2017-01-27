package figuras;

public class Elipse extends FiguraGeometrica {
	
	private double semiEjeMayor;
	private double semiEjeMenor;
	private final double PI = Math.PI;
	
	Elipse() {
		this.semiEjeMayor = 0.0;
		this.semiEjeMenor = 0.0;
	}
	
	Elipse(double semiEjeMayor) {
		this.semiEjeMayor = semiEjeMayor;
	}
	
	Elipse(double semiEjeMayor, double semiEjeMenor) {
		this.semiEjeMayor = semiEjeMayor;
		this.semiEjeMenor = semiEjeMenor;
	}
	
	Elipse (String nombre, double semiEjeMayor, double semiEjeMenor) {
		this.nombre = nombre;
		this.semiEjeMayor = semiEjeMayor;
		this.semiEjeMenor = semiEjeMenor;
	}
	
	public void setSemiEjeMayor (double semiEjeMayor) {
		this.semiEjeMayor = semiEjeMayor;
	}

	public double getSemiEjeMayor () {
		return this.semiEjeMayor;
	}
	
	public void setSemiEjeMenor (double semiEjeMenor) {
		this.semiEjeMenor = semiEjeMenor;
	}
	
	public double getSemiEjeMenor () {
		return this.semiEjeMenor;
	}
	
	public double area(){
		return this.semiEjeMayor*this.semiEjeMenor*PI;
	}
}
