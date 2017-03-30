package org.foobarspam.regulator.main;

public class LightSaber implements Heater {

	@Override
	public void engage(AmbientTemperature temperature) {
		temperature.incrementTemperature(100);
	}

	@Override
	public void disengage(AmbientTemperature temperature) {
		temperature.incrementTemperature(-100);
	}

}
