package org.foobarspam.Dni;

public class Dni {
	
	private String dni = null;
	
	public Dni() {
		this.dni = "desconocido";
	}
	
	public Dni(String dni) {
		this.dni=dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	public boolean esDniValido() {
		if (esMedidaDniValida()) {
			return (sonNumerosValidos() && esLetraValida());
		}
		else {
			return false;
		}
	}
	
	public boolean esMedidaDniValida() {
		int MEDIDA = 9;
		if (getDni().length() != MEDIDA ) {
			return false;
		}
		return true;
	}
	
	public boolean sonNumerosValidos() {
		for(int i = 0; i < getDni().length()-1; i++ ){
			if ( ! Character.isDigit(getDni().charAt(i)) ){
				return false;
			}
			else;
		}
		return true;
	}
	
	public boolean esLetraValida() {
		char letraDni = getDni().charAt(8);
		if ( ! Character.isLetter(letraDni)) {
			return false;
		}
		return true;
	}
	
	public void formatearDni() {
		String dniValido = getDni();
		char letraDni = dniValido.charAt(8);
		String dniFormateado = dniValido.replace(letraDni, Character.toUpperCase(letraDni));
		this.dni = dniFormateado;
	}
	
}
