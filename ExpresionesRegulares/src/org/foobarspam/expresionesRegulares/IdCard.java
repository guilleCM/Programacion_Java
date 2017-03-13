package org.foobarspam.expresionesRegulares;

abstract class IdCard {
	//PROPIEDADES
	protected String numeroId = "desconocido";
	protected byte longitudNumId = 0;
	
	//CONSTRUCTORES
	public IdCard () {
	}
	
	public IdCard (String numeroId) {
		this.numeroId = numeroId;
	}
	
	//GETTERS
	public String getNumeroId() {
		return this.numeroId;
	}
	
	//METODOS
	public abstract boolean esValido();
	
}
