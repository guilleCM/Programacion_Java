package org.foobarspam.enumtypes.pesoenplanetas;
import java.util.EnumSet;

public enum Planeta {
	MERCURY(3.303e+23, 2.4397e6), 
	VENUS(4.869e+24, 6.0518e6), 
	EARTH(5.976e+24, 6.37814e6), 
	MARS(6.421e+23, 3.3972e6), 
	JUPITER(1.9e+27, 7.1492e7), 
	SATURN(5.688e+26, 6.0268e7), 
	URANUS(8.686e+25, 2.5559e7), 
	NEPTUNE(1.024e+26, 2.4746e7);

	private final double masa; // in kilograms
	private final double radio; // in meters
	private final double G = 6.67300E-11;

	Planeta (double masa, double radio) {
		this.masa = masa;
		this.radio = radio;
	}

	public double getMasa() {
		return this.masa;
	}

	public double getRadio() {
		return this.radio;
	}

	public double getG() {
		return this.G;
	}

	public double getGravedadEnPlaneta() {
		return getG() * getMasa() / Math.pow(getRadio(), 2);
	}
	
	public static EnumSet<Planeta> getPlanetasTerrestres() {
		EnumSet<Planeta> planetasTerrestres = EnumSet.range(MERCURY, MARS);
		return planetasTerrestres;
	}
	
	public static EnumSet<Planeta> getGigantesGaseosos(){
		EnumSet<Planeta> planetasTerrestres = EnumSet.complementOf(getPlanetasTerrestres());
		return planetasTerrestres;
	}
	
	public double pesoSuperficie(double peso){
		double masa = peso / Planeta.EARTH.getGravedadEnPlaneta();
		return masa * getGravedadEnPlaneta();
	}
}
