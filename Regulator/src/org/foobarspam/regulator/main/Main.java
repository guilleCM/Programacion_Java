package org.foobarspam.regulator.main;

public class Main {
		
	public static void main(String[] args) {
		double minTemp = 15.0;
		double maxTemp = 22.0;
		AmbientTemperature ambTemp = new AmbientTemperature(15.0);
		Thermometer remoteCommand = new RemoteCommandSensor();
		Heater gasHeater = new GasHeater();

		Regulator regulador = new Regulator();
		regulador.regulate(remoteCommand, gasHeater, minTemp, maxTemp, ambTemp);
	}

}
