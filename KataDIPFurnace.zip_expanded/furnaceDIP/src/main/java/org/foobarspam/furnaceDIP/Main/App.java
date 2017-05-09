package org.foobarspam.furnaceDIP.Main;

import org.foobarspam.furnaceDIP.hardware.GasHeater;
import org.foobarspam.furnaceDIP.hardware.Regulator;
import org.foobarspam.furnaceDIP.hardware.RemoteCommandSensor;
import org.foobarspam.furnaceDIP.interfaces.Heater;
import org.foobarspam.furnaceDIP.interfaces.Thermometer;
import org.foobarspam.furnaceDIP.inyector.ReguladorModule;
import org.foobarspam.furnaceDIP.otherstuff.Jedi;
import org.foobarspam.furnaceDIP.types.RoomTemperature;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	final double minTemp = 15.0;
        final double maxTemp = 21.0;
        
        RoomTemperature temperature = new RoomTemperature(15);
        
        Injector injector = Guice.createInjector(new ReguladorModule());  
        Regulator regulador = injector.getInstance(Regulator.class);
        regulador.setMinTemp(minTemp);
        regulador.setMaxTemp(maxTemp);
        regulador.setTemperature(temperature);
        
        System.out.println( "Arrancando..." );
        regulador.regulate();
        
        Jedi yoda = new Jedi();
        System.out.println( "\nArrancando a Yoda: " );
        regulador.regulate();
        yoda.speak();
    }
}
