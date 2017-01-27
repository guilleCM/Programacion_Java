package figuras;


class Rectangulo extends FiguraGeometrica {
	
	private double ladoA;
	private double ladoB;
	
	Rectangulo(double ladoA, double ladoB) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	Rectangulo() {
		this.nombre = "desconocido";
		this.ladoA = 0.0;
		this.ladoB = 0.0;
	}
	
	Rectangulo(String nombre, double ladoA, double ladoB) {
		this.nombre = nombre;
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public double getLadoA(){
		return this.ladoA;
	}

	public double getLadoB(){
		return this.ladoB;
	}
	
	public void setLadoA(double ladoNuevo){
		this.ladoA = ladoNuevo;
	}

	public void setLadoB(double ladoNuevo){
		this.ladoB = ladoNuevo;
	}
	
	@Override
	public double area() {
		return this.ladoA*this.ladoB; 
	}
}
