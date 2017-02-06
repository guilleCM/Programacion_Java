package org.foobarspam.appbicipalma.estacion;

import java.util.ArrayList;

import org.foobarspam.appbicipalma.bicicleta.Bicicleta;

public class Estacion {
	
	//propiedades de clase
	private int id = -1; 
	//-1 para saber cuando no se ha construido correctamente el objeto
	private String direccion = "";
	private int numeroAnclajes = 0;
	private int[] anclajes = new int[0];
	
	//constructores
	public Estacion() {
		//constructor defensivo ya esta inicializado en las propiedades
	}
	
	public Estacion(int id, String direccion, int anclaje) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = anclaje;
		this.anclajes = new int[anclaje];
	}
	
	//setters
	public void setAnclaje(int id, int posicion) {
		this.anclajes[posicion] = id;
	}
	//getters
	public int getId() {
		return this.id;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	
	public int getNumeroAnclajes() {
		return this.numeroAnclajes;
	}
	
	public int[] getAnclajes() {
		return this.anclajes;
	}
	
	//metodos
	public String consultarEstacion() {
		String mensaje = "id: "+ getId() +"\n"+
						 "direccion: " + getDireccion() +"\n"+
						 "numeroAnclajes: " + getNumeroAnclajes() +"\n";
		return mensaje;
	}
	
	public int anclajesLibres() {
		int LIBRE = 0;
		int anclajesLibres = 0;
		for (int anclaje : getAnclajes()) {
			if (anclaje == LIBRE) {
				anclajesLibres += 1;
			}
		}
		return anclajesLibres;
	}
	
	public String anclarBicicleta(Bicicleta bicicleta) {
		int id = bicicleta.getId();
		int LIBRE = 0;
		for (int anclaje = 0; anclaje < getAnclajes().length; anclaje++) {
			if (getAnclajes()[anclaje] == LIBRE) {
				setAnclaje(id, anclaje);
				return bicicletaAnclada(id, anclaje+1);
			}
		}
		return anclajesLlenos();
	}
	
	public String bicicletaAnclada(int id, int posicionAnclada) {
		return "bicicleta: " +id+ " anclada en el anclaje: " +posicionAnclada;
	}
	
	public String anclajesLlenos() {
		return "No quedan anclajes libres\nNo se ha podido anclar la bicicleta";
	}
}
