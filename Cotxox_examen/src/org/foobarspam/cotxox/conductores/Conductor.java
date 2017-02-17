package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
	
	//propiedades
	private String nombre = null;
	private String matricula = null;
	private String modelo = null;
	private ArrayList<Byte> valoraciones = new ArrayList<>();
	private boolean ocupado = false;
	private double valoracionMedia = 4.0;
	
	//constructores
	public Conductor(String nombre) {
		this.nombre = nombre;
	}
	
	//setters
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setOcupado(boolean estado) {
		this.ocupado = estado;
	}
	
	public void setValoracionMedia(double valoracion) {
		this.valoracionMedia = valoracion;
	}

	
	//getters
	public ArrayList<Byte> getValoraciones() {
		return this.valoraciones;
	}
	
	public boolean isOcupado() {
		return this.ocupado;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public double getValoracion() {
		return this.valoracionMedia;
	}
	
	//metodos
	public void setValoracion(byte estrellas) {
		valoraciones.add(estrellas);
		actualizarValoracionMedia();
	}
	
	private void actualizarValoracionMedia() {
		setValoracionMedia(sumaValoraciones()/getValoraciones().size());
	}
	
	private double sumaValoraciones() {
		double suma = 0;
		for (byte valoracion : getValoraciones()) {
			suma += valoracion;
		}
		return suma;
	}
	
}
