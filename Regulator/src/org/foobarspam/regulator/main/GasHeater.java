package org.foobarspam.regulator.main;

public class GasHeater implements Heater {

	@Override
	public void engage(AmbientTemperature temperature) {
		temperature.incrementTemperature(1.0);
	}

	@Override
	public void disengage(AmbientTemperature temperature) {
		temperature.incrementTemperature(-1.0);
	}

}
