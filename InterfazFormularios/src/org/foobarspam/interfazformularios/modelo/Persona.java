package org.foobarspam.interfazformularios.modelo;

public class Persona {
	//PROPIEDADES
	private String nombre = null;
	private String edad = null;
	private String sexo = null;
	
	public Persona() {
	}
	
	public Persona(String nombre, String edad, String sexo) {
		this.edad = edad;
		this.nombre = nombre;
		this.sexo = sexo;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEdad() {
		return this.edad;
	}
	
	public String getSexo() {
		return this.sexo;
	}
}
