package org.foobarspam.MockitoEjemplo;

import org.foobarspam.MockitoEjemplo.Carrera;

public class Tarifa implements Tarificable{
	
	final static double costeMilla = 1.35;
	final static double costeMinuto = 0.35;
	final static double costeMinimo = 5.0;
	final static byte porcentajeComision = 20;
	
	public double getCosteDistancia(double distancia){
		return distancia * costeMilla;
	}
	
	public double getCosteTiempo(int minutos){
		return minutos * costeMinuto;
	}
	
	public double getCosteTotalEsperado(Carrera carrera){
		double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
		return costeTotal > costeMinimo? costeTotal:costeMinimo;
	}
	

}
