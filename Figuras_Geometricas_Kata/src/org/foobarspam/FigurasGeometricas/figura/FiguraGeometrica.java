package org.foobarspam.FigurasGeometricas.figura;

// Clase abstracta de la que heredaran las figuras geometricas
public abstract class FiguraGeometrica {
	// Propiedades abstractas
	protected String nombre;
	
	public FiguraGeometrica(){
		this.nombre = "No name";
	}
	
	public FiguraGeometrica(String nombre){
		this.nombre = nombre;
	}
	
	//Tratamiento interno de la variable nombre
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	// Métodos abstractos
	public abstract double area();
}