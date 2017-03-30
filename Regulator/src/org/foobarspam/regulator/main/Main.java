package org.foobarspam.regulator.main;

public class Main {
		
	public static void main(String[] args) {
		double minTemp = 15.0;
		double maxTemp = 22.0;
		AmbientTemperature ambTemp = new AmbientTemperature(15.0);
		Thermometer remoteCommand = new RemoteCommandSensor();
		Heater gasHeater = new GasHeater();
		Regulator regulador = new Regulator();
		
		System.out.println("#TEST HEATER INTERFACE VIEW OF GASHEATER");
		regulador.regulate(remoteCommand, gasHeater, minTemp, maxTemp, ambTemp);
		
		System.out.println("\n");
		System.out.println("#TEST GASHEATER (CLASS) VIEW OF GASHEATER");
		GasHeater gHeater = new GasHeater();
		regulador.regulate(remoteCommand, gHeater, minTemp, maxTemp, ambTemp);

		System.out.println("\n");
		System.out.println("#TEST HEATER INTERFACE VIEW OF LIGHTSABER");
		maxTemp = 4000;
		Heater lightSaber = new LightSaber();
		regulador.regulate(remoteCommand, lightSaber, minTemp, maxTemp, ambTemp);
	}

}
