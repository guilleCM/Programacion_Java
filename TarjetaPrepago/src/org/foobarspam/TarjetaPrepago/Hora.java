package org.foobarspam.TarjetaPrepago;

import java.util.Arrays;

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
	
	
	public void setHora(int hora, int minutos, int segundos) {
		int[] constructorHora = Hora.constructorDefensivo(hora, minutos, segundos);
		this.hora = constructorHora[0];
		this.minutos = constructorHora[1];
		this.segundos = constructorHora[2];
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
		String.join(":", resultado);	
		return Arrays.toString(resultado);
	}
	
	public static int[] constructorDefensivo(int hora, int minutos, int segundos) {
		int[] horaPorDefecto = {0, 0, 0};
		if (0 <= hora && hora <= 23) {
			horaPorDefecto[0] = hora;
		}
		if (0 <= minutos && minutos <= 59) {
			horaPorDefecto[1] = minutos;
		}
		if (0 <= segundos && segundos <= 59) {
			horaPorDefecto[2] = segundos;
		}
		return horaPorDefecto;
	}
}
