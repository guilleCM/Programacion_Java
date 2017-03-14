package org.foobarspam.cotxox.tarifa;

import org.foobarspam.cotxox.carrera.Carrera;

public class Tarifa {
	
	//Propiedades
	
//	id = identificador de la bicicleta: un número de tres dígitos.
//	costeMilla Cotxox fija en 1.35€ el coste de la milla.
//	costeMinuto Cotxox fija en 0.35€ el coste del minuto.
//	costeMinimo El coste mínimo que cobra Cotxox por un viaje es de 5€.
//	porcentajeComision la comisión que cobra cotxox sobre el coste del viaje es del 20%.
	private short id = 0;
	private static double costeMilla = 1.35;
	private static double costeMinuto = 0.35;
	private static double costeMinimo = 5.0;
	private static double porcentajeComision = 0.20;
	private Carrera carrera = null;
	
	//constructor
	public Tarifa() {
	}

	
	//metodos
	public static double getCosteDistancia(double distancia) {
		return costeMilla*distancia;
	}

	public static double getCosteTiempo(int minutos) {
		return costeMinuto*minutos;
	}
	
	public static double getCosteTotalEsperado(double distancia, int minutos) {
		double costeTotal = getCosteDistancia(distancia)+getCosteTiempo(minutos);
		if (costeTotal < costeMinimo) {
			return costeMinimo;
		}
		return costeTotal;
	}


}
