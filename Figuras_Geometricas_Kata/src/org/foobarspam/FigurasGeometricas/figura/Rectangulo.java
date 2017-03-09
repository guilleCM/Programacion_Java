package org.foobarspam.FigurasGeometricas.figura;

//Constructores de las figuras geometricas
public class Rectangulo extends FiguraGeometrica implements Drawable{
	//Inicializamos las variables para calcular el area
	private double altura = 0d;
	private double anchura = 0d;
	
	//Sobrecarga de los constructores
	public Rectangulo(){
		//Invoca al constructor de la clase abstracta FigurasGeometricas
		//dependiendo de los argumentos
		super();
	}
	
	public Rectangulo(double altura, double anchura){
		super();
		this.altura = altura;
		this.anchura = anchura;
	}
	
	public Rectangulo(String nombre, double altura, double anchura){
		super(nombre);
		this.altura = altura;
		this.anchura = anchura;
	}

	public double getAltura(){
		return this.altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getAnchura(){
		return this.anchura;
	}
	
	public void setAnchura(double anchura){
		this.anchura = anchura;
	}
	
	//Sobreescritura de los métodos
	@Override
	public double area(){
		double area = getAltura() * getAnchura();
		return area;
	}
	// Implementamos el método draw() de la interfaz Drawable
	public void draw(){
		System.out.println(getNombre() + ", que es un Rectangulo, ha sido dibujado");
	}
	
	public void aplicarTema(){
		System.out.println(getNombre() + " ha aplicado un tema reshulo");
	}
}