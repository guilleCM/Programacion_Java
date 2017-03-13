package org.foobarspam.expresionesRegulares.testing;

import static org.junit.Assert.*;

import org.foobarspam.expresionesRegulares.Dni;
import org.junit.Before;
import org.junit.Test;

public class DniTest {
	
	Dni dni;
	
	@Before
	public void setUp() {
		dni = new Dni();
	}

	@Test
	public void propiedadesDniTest() {
		assertEquals("desconocido", dni.getNumeroId());
		
		dni = new Dni("43223381X");
		assertEquals("43223381X", dni.getNumeroId());
		assertEquals(9, dni.getNumeroId().length());
	}
	
	@Test
	public void esValidoTest() {
		System.out.println("\n------ CASOS TEST VALIDO ------\n");
		assertFalse(dni.esValido());
		
		dni = new Dni("43223381X");
		assertTrue(dni.esValido());
	}
	
	@Test
	public void esValidoTestAutomatico() {
		System.out.println("\n------ CASOS TEST VALIDOS AUTOMATICOS ------\n");
		String[] dnisValidos = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		for (String numDni : dnisValidos) {
			Dni dni = new Dni(numDni);
			assertTrue(dni.esValido());
		}
		
	}
	
	@Test
	public void noEsValidoTestAutomatico() {
		System.out.println("\n------ CASOS TEST NO VALIDOS AUTOMATICOS ------\n");
		String[] dnisNoValidos = {"78484464Te","2376173A","082217200Q","95882054e","a63587725",
		"A26861694V","21616083I","26868974O","40135330Ñ","89044648U", "43223381X o 42334455A"};
		
		for (String numDni : dnisNoValidos) {
			Dni dni = new Dni(numDni);
			assertFalse(dni.esValido());
		}
		
	}
	

}
