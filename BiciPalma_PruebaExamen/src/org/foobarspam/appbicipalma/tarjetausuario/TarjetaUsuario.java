package org.foobarspam.appbicipalma.tarjetausuario;

public class TarjetaUsuario {
	
	//propiedades
	private String id = "desconocido";
	private boolean activada = false;
	
	//constructores
	public TarjetaUsuario() {
	}
	public TarjetaUsuario(String id, boolean estado) {
		this.id = id;
		this.activada = estado;
	}
	
	//metodos
	public boolean estaActivada() {
		return this.activada;
	}
}
