package org.foobarspam.TarjetaPrepago;

public class Dni {
	
	private String dni;
	
	Dni(String dni) {
		this.dni=dni;
	}
	Dni() {
		this.dni="00000001A";
	}
	
	public void setDni(String dni) {
		this.dni=dni;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	
}
