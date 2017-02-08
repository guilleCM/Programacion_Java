package org.foobarspam.ejercicioSupermercados.supermercado;

public class Supermercado {

	//propiedades
	private String nombre = null;
	private double recaudacionAnual = 0;
	
	//constructores
	public Supermercado() {
	}
	
	public Supermercado(String nombre, double recaudacionAnual) {
		this.nombre = nombre;
		this.recaudacionAnual = recaudacionAnual;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public double getRecaudacionAnual() {
		return this.recaudacionAnual;
	}
}
