package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import org.foobarspam.cotxox.carrera.Carrera;
import org.junit.Before;
import org.junit.Test;

public class CarreraTest {

	Carrera estandar, corta;
	
	@Before
	public void setUp() {
		corta = new Carrera("100000000000000");
		corta.setDistancia(2.0);
		corta.setTiempoEsperado(3);
		
		estandar = new Carrera("17828565665656");
		estandar.setDistancia(7.75);
		estandar.setTiempoEsperado(10);
	}
	
	@Test
	public void testCosteEsperado() {
		double esperado = 13.9625;
		assertEquals(esperado, estandar.getCosteEsperado(), 0.1);
		
		esperado = 5.0;
		assertEquals(esperado, corta.getCosteEsperado(), 0.1);
	}

}
