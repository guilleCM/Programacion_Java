package org.foobarspam.appbicipalma.estacion;


import java.util.concurrent.ThreadLocalRandom;

import org.foobarspam.appbicipalma.bicicleta.Bicicleta;
import org.foobarspam.appbicipalma.tarjetausuario.TarjetaUsuario;

public class Estacion {
	
	//propiedades de clase
	private int id = -1; 
	//-1 para saber cuando no se ha construido correctamente el objeto
	private String direccion = "";
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes = new Bicicleta[0];
	
	//constructores
	public Estacion() {
		//constructor defensivo ya esta inicializado en las propiedades
	}
	
	public Estacion(int id, String direccion, int anclaje) {
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = anclaje;
		this.anclajes = new Bicicleta[anclaje];
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
	
	public Bicicleta[] getAnclajes() {
		return this.anclajes;
	}
	
	//metodos
	public void consultarEstacion() {
		String mensaje = "id: "+ getId() +"\n"+
						 "direccion: " + getDireccion() +"\n"+
						 "numeroAnclajes: " + getNumeroAnclajes() +"\n";
		imprimirPorPantalla(mensaje);
	}
	
	public int anclajesLibres() {
		int anclajesLibres = 0;
		for (Bicicleta anclaje : getAnclajes()) {
			if (anclaje == null) {
				anclajesLibres += 1;
			}
		}
		return anclajesLibres;
	}
	
	public void anclarBicicleta(Bicicleta bicicleta) {
		for (int anclaje = 0; anclaje < getAnclajes().length; anclaje++) {
			if (getAnclajes()[anclaje] == null) {
				setAnclaje(bicicleta, anclaje);
				imprimirPorPantalla(mostrarAnclaje(bicicleta.getId(), anclaje+1));
				return;
			}
		}
		imprimirPorPantalla(mostrarAnclaje(bicicleta.getId(), -1));
	}
	
	private String mostrarAnclaje(int id, int numeroAnclaje) {
		if (numeroAnclaje==-1) {
			return "No quedan anclajes libres\n"
					+ "No se ha podido anclar la bicicleta" +id;
		}
		return "bicicleta: " +id+ " anclada en el anclaje: " +numeroAnclaje;
	}
	
	public void consultarAnclajes() {
		String mensaje = "";
		int anclaje = 1;
		for (Bicicleta bicicleta : getAnclajes()) {
			mensaje+=formatearMensajeAnclajes(anclaje, bicicleta);
			anclaje += 1;
		}
		imprimirPorPantalla(mensaje);
	}
	
	private String formatearMensajeAnclajes(int anclaje, Bicicleta bicicleta) {
		String mensaje = "Anclaje " + anclaje + " ";
		if (bicicleta == null) {
			return mensaje +=" libre\n";
		} else {
		return mensaje += bicicleta.getId()+"\n";
		}
	}
	
	public String leerTarjetaUsuario(TarjetaUsuario tarjeta) {
		String estado = "false";
		if (tarjeta.estaActivada()) {
			estado = "true";
		}
		return estado;
	}
	
	public void retirarBicicleta(TarjetaUsuario tarjeta) {
		if (!tarjeta.estaActivada()) {
			imprimirPorPantalla("Su tarjeta esta desactivada"
							 + "\nPor favor, actívela");
			return;
		}
		int anclajeGenerado = generarAnclaje();
		if (anclajeGenerado == -1) {
			imprimirPorPantalla("No quedan bicicletas disponibles");
			return;
		}
		mostrarBicicleta(getAnclajes()[anclajeGenerado], anclajeGenerado);
		setAnclaje(null, anclajeGenerado);
	}
	
	private void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje) {
		imprimirPorPantalla("bicicleta retirada: "+bicicleta.getId()+ " del anclaje: "+(numeroAnclaje+1));
	}
	
	private int generarAnclaje() {
		int anclaje = -1;
		if (hayBicicletas()) {
			anclaje = ThreadLocalRandom.current().nextInt(getAnclajes().length);
			while(getAnclajes()[anclaje] == null){
				anclaje = ThreadLocalRandom.current().nextInt(getAnclajes().length);
			}
			return anclaje;
		}
		return anclaje;
	}
	
	//metodos auxiliares
	private void setAnclaje(Bicicleta bicicleta, int posicion) {
		getAnclajes()[posicion] = bicicleta;
	}
	
	private boolean hayBicicletas() {
		for (Bicicleta bicicleta : getAnclajes()) {
			if (bicicleta != null) {
				return true;
			}
		}
		return false;
	}
	
	public void imprimirPorPantalla(String mensaje) {
		System.out.println(mensaje);
	}
}
