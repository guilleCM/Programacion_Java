package org.foobarspam.MockitoEjemplo;

public interface Tarificable {
	
	public double getCosteDistancia(double distancia);
	
	public double getCosteTiempo(int minutos);
	
	public double getCosteTotalEsperado(Carrera carrera);
	
}
