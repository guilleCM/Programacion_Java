package org.foobarspam.FigurasGeometricas.figura;

public class Circulo extends FiguraGeometrica implements Drawable {
	//Inicializamos las variables para calcular el area
	private double PI = 3.141592;
	private double radio = 0d;
	
	// Sobrecarga de los constructores
	public Circulo(){
		super();
	}
	
	public Circulo(double radio){
		super();
		this.radio = radio;
	}
	
	public Circulo(String nombre, double radio){
		super(nombre);
		this.radio = radio;
	}
	
	public double getRadio(){
		return this.radio;
	}
	
	public void setAltura(double radio){
		this.radio = radio;
	}

	//Sobreescribimos el metodo area para circulo
	public double area(){
		double area = PI * this.radio * this.radio;
		return area;
	}
	
	// Implementamos el método draw() de la interfaz Drawable
	public void draw(){
		System.out.println(getNombre() + ", que es un Circulo, ha sido dibujado");
	}
	
	public void aplicarTema(){
		System.out.println(getNombre() + " ha aplicado un tema reshulo");
	}
	
}