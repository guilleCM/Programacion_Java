package org.foobarspam.TarjetaPrepago;


public class Hora {
	
	private int hora = 0;
	private int minutos = 0;
	private int segundos = 0;
	
	public Hora() {
		this.hora = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Hora(int hora) {
		this.hora = hora;
	}
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public Hora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public void setHora(int hora, int minutos, int segundos) {
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	public String imprimirHora() {
		String hora = String.valueOf(this.hora);
		String minutos = String.valueOf(this.minutos);
		String segundos = String.valueOf(this.segundos);
		String[] resultado = {hora, minutos, segundos};
		for (int i = 0; i < resultado.length; i++) {
			if (resultado[i].length() < 2) {
				resultado[i] = "0" + resultado[i];
			}
		}
		return resultado[0]+":"+resultado[1]+":"+resultado[2];
	}
	
}
