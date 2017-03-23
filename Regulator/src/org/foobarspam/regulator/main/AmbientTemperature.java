package org.foobarspam.regulator.main;

public class AmbientTemperature {

	private double temperature = 15.0;
	
	public AmbientTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public void incrementTemperature(double temperature) {
		this.temperature += temperature;
	}
	
}
