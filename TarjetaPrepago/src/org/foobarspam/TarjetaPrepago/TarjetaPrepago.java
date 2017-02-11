package org.foobarspam.TarjetaPrepago;

import org.foobarspam.Dni.Dni;
import org.foobarspam.Hora.Hora;

public class TarjetaPrepago {
	
	//propiedades
	private String numeroTelefono = null;
	private Dni nif = null;
	private double saldo = 0.0;
	private Hora consumo = new Hora();
	
	//constructores
	public TarjetaPrepago(){
	}
	
	public TarjetaPrepago(String numeroTelefono, Dni nif, double saldo){
		this.numeroTelefono = numeroTelefono;
		this.nif = nif;
		this.saldo = saldo;
	}
	
	//setters
	public void setSaldo(double cantidad) {
		this.saldo = cantidad;
	}
	
	//getters
	public String getNumeroTelefono() {
		return this.numeroTelefono;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public Hora getConsumo() {
		return this.consumo;
	}
	
	//metodos
	public void ingresarSaldo(double cantidad) {
		setSaldo(getSaldo()+cantidad);
	}
	
	private void gastarSaldo(double cantidad) {
		setSaldo(getSaldo()-cantidad);
	}
	
	
	private void aumentarConsumo(int segundos) {
		int horasAcumuladas = getConsumo().getHora()[0];
		int minutosAcumulados = getConsumo().getMinutos();
		int segundosAcumulados = getConsumo().getSegundos();
		while (segundos+segundosAcumulados > 59) {
			segundos = segundos - 60;
			minutosAcumulados++;
		}
		while (minutosAcumulados > 59) {
			minutosAcumulados = minutosAcumulados - 60;
			horasAcumuladas++;
		}
		getConsumo().setHora(horasAcumuladas, minutosAcumulados, segundos);
	}
	
	public void enviarMensaje(int numeroMensajes) {
		double COSTE = 0.09;
		gastarSaldo(COSTE*numeroMensajes);
	}
	
	public void realizarLlamada(int segundosHablados) {
		double ESTABLECIMIENTO = 0.15;
		double COSTE = 0.01;
		gastarSaldo(ESTABLECIMIENTO+(COSTE*segundosHablados));
		aumentarConsumo(segundosHablados);
	}
	
	public void consultarTarjeta() {
		System.out.println("-----DATOS DE LA TARJETA-----");
		System.out.println("Número de teléfono: "+getNumeroTelefono());
		System.out.println("DNI asociado: "+this.nif.getDni());
		System.out.println("Saldo disponible: "+getSaldo()+" €");
		System.out.println("Consumo utilizado: "+getConsumo().imprimirHora()+"\n");
	}
}
