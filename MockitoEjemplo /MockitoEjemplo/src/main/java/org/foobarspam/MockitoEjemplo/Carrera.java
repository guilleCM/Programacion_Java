package org.foobarspam.MockitoEjemplo;

import static org.mockito.Mockito.when;

import org.foobarspam.MockitoEjemplo.Conductora;
import org.foobarspam.MockitoEjemplo.PoolConductoras;
import org.foobarspam.MockitoEjemplo.Tarifa;


public class Carrera {

	private String tarjetaCredito = null;
	
	private String origen = null;
	private String destino = null;
	private double distancia = 0d;
	private int tiempoEsperado = 0;
	private int tiempoCarrera = 0;
	private double costeTotal = 0;
	private int propina = 0;
	//mocks
	private Tarificable mockTarifa = null;
	private Conductora conductor = null;
	
	public Carrera(String tarjetaCredito){
		this.tarjetaCredito = tarjetaCredito;
	}
	

	public String getTarjetaCredito(){
		return this.tarjetaCredito;
	}
	
	public void setOrigen(String origen){
		this.origen = origen;
	}
	
	public String getOrigen(){
		return this.origen;
	}
	
	public void setDestino(String destino){
		this.destino = destino;
	}
	
	public String getDestino(){
		return this.destino;
	}
	
	public void setDistancia(double distancia){
		this.distancia = distancia;
	}
	
	public double getDistancia(){
		return this.distancia;
	}
	
	// las clases estaticas no pueden mockearse en Mockito
	public double getCosteEsperado(){
		return mockTarifa.getCosteTotalEsperado(this);
	}
	
	public void setTarifa(Tarificable tarifa) {
		this.mockTarifa = tarifa;
	}

	public int getTiempoEsperado() {
		return tiempoEsperado;
	}

	public void setTiempoEsperado(int tiempoEsperado) {
		this.tiempoEsperado = tiempoEsperado;
	}
	
	public int getTiempoCarrera() {
		return tiempoCarrera;
	}

	public void setTiempoCarrera(int tiempoCarrera) {
		this.tiempoCarrera = tiempoCarrera;
	}
	
	public void setConductor(Conductora mockConductora){
		this.conductor = mockConductora;
	}
	
	public Conductora getConductor(){
		return this.conductor;
	}
	
	public void asignarConductor(PoolConductoras conductores){
		setConductor(conductores.asignarConductor());
	}
	
	public void realizarPago(double pago){
		this.costeTotal = pago;
	}
	
	public double getCosteTotal(){
		return this.costeTotal;
	}
	
	public void recibirPropina(int propina){
		this.propina = propina;
	}
	
	public int getPropina(){
		return this.propina;
	}
	
	public void liberarConductor(){
		getConductor().setOcupado(false);
	}
	
	public String getNombreConductor() {
		return getConductor().getNombre();
	}


	public String getModeloConductor() {
		return getConductor().getModelo();
	}


	public String getMatriculaConductor() {
		return getConductor().getMatricula();
	}


	public double getValoracionConductor() {
		return getConductor().getValoracion();
	}


	public Boolean getEstadoConductor() {
		return getConductor().isOcupado();
	}
}
