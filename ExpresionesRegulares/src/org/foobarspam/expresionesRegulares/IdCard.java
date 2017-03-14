package org.foobarspam.expresionesRegulares;

abstract class IdCard {
	//PROPIEDADES
	protected String numeroId = "desconocido";
	protected byte longitudNumId = 0;
	protected char[] tablaAsignacion = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
	
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
	public char[] getTablaAsignacion() {
		return this.tablaAsignacion;
	}
	
	//METODOS
	public abstract boolean tieneFormatoValido();
	public abstract boolean tieneLetraCorrecta();
	
}
