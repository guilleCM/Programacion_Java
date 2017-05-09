package org.foobarspam.furnaceDIP.inyector;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.otherstuff.Jedi;

import com.google.inject.AbstractModule;

public class ReguladorModule extends AbstractModule {
	
	@Override 
	protected void configure() {
		bind(Heater.class).to(GasHeater.class);
		bind(Heater.class).annotatedWith(Force.class).to(Jedi.class);
		bind(Thermometer.class).to(RemoteCommandSensor.class);
	}
	 
}
