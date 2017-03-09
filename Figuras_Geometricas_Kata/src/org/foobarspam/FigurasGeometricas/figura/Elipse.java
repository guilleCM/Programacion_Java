package org.foobarspam.FigurasGeometricas.figura;

public class Elipse extends FiguraGeometrica implements Drawable{
	// Inicializamos los valores para el area de la elipse
	private double PI = 3.141592;
	private double semiejeMayor = 0d;
	private double semiejeMenor = 0d;
	
	public Elipse(){
		super();
	}
	
	public Elipse(double semiejeMayor, double semiejeMenor){
		super();
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;
	}
	
	public Elipse(String nombre, double semiejeMayor, double semiejeMenor){
		super(nombre);
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;
	}
	
	public double getSemiejeMayor(){
		return this.semiejeMayor;
	}
	public void setSemiejeMayor(double semiejeMayor){
		this.semiejeMayor = semiejeMayor;
	}
	
	public double getSemiejeMenor(){
		return this.semiejeMenor;
	}
	public void setSemiejeMenor(double semiejeMenor){
		this.semiejeMenor = semiejeMenor;
	}
	
	@Override
	public double area(){
		double area = PI * this.semiejeMayor * this.semiejeMenor;
		return area;
	}
	// Implementamos el método draw() de la interfaz Drawable
	public void draw(){
		System.out.println(getNombre() + ", que es un Elipse, ha sido dibujada");
	}
}
