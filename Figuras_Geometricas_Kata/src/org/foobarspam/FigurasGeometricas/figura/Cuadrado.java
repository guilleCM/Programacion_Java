package org.foobarspam.FigurasGeometricas.figura;

public class Cuadrado extends FiguraGeometrica implements Drawable {

	private double lado = 0d;
	
	public Cuadrado(){
		super();
	}
	public Cuadrado(double lado){
		super();
		this.lado = lado;
	}
	public Cuadrado(String nombre, double lado){
		super(nombre);
		this.lado = lado;
	}
	
	public double getLado(){
		return this.lado;
	}
	
	public void setLado(double lado){
		this.lado = lado;
	}
	
	@Override
	public double area(){
		double area = getLado() * getLado();
		return area;
	}
	// Implementamos el método draw() de la interfaz Drawable
	public void draw(){
		System.out.println(getNombre() + ", que es un Cuadrado, ha sido dibujado");
	}
	
	public void aplicarTema(){
		System.out.println(getNombre() + " ha aplicado un tema reshulo");
	}
}
