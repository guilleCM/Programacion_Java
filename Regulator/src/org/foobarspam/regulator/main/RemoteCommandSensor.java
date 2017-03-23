package org.foobarspam.regulator.main;

public class RemoteCommandSensor implements Thermometer {

	@Override
	public double read(AmbientTemperature temperature) {
		return temperature.getTemperature();
	}

}
