package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.Dni.Dni;
import org.junit.Before;
import org.junit.Test;

public class DniTest {

	Dni primerDni;
	@Before
	public void setUp() {
		primerDni = new Dni("43223381X");
	}
	
	@Test
	public void testObtenerLetra() {
		primerDni.obtenerLetra();
	}
	
}
