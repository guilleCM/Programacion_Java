package org.foobarspam.interfaces.checkbox;

public class Solicitante {
	//PROPIEDADES
	private String dni = null;
	private String estado = null;
	private String sexo = null;
	
	public Solicitante() {
	}
	
	public Solicitante(String dni, String estado, String sexo) {
		this.dni = dni;
		this.estado = estado;
		this.sexo = sexo;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public String getEstado() {
		return this.estado;
	}
	
	public String getSexo() {
		return this.sexo;
	}
}
