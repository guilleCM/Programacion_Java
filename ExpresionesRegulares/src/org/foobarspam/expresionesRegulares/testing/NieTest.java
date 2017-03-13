package org.foobarspam.expresionesRegulares.testing;

import static org.junit.Assert.*;

import org.foobarspam.expresionesRegulares.Nie;
import org.junit.Before;
import org.junit.Test;

public class NieTest {

	Nie nie;
	
	@Before
	public void setUp() {
		nie = new Nie();
	}

	@Test
	public void propiedadesnieTest() {
		assertEquals("desconocido", nie.getNumeroId());
		
		nie = new Nie("X3223381X");
		assertEquals("X3223381X", nie.getNumeroId());
		assertEquals(9, nie.getNumeroId().length());
	}
	
	@Test
	public void esValidoTest() {
		System.out.println("\n------ CASOS TEST VALIDO ------\n");
		assertFalse(nie.esValido());
		
		nie = new Nie("X3223381X");
		assertTrue(nie.esValido());
	}
	
	@Test
	public void esValidoTestAutomatico() {
		System.out.println("\n------ CASOS TEST VALIDOS AUTOMATICOS ------\n");
		String[] niesValidos = {"X8484464T","Y2376173A","Z1817200Q","Z5882054E","Y3587725Q",
		"X6861694V","X1616083Q","Y6868974Y","Y0135330P","Z9044648X"};
		
		for (String numnie : niesValidos) {
			Nie nie = new Nie(numnie);
			assertTrue(nie.esValido());
		}
		
	}
	
	@Test
	public void noEsValidoTestAutomatico() {
		System.out.println("\n------ CASOS TEST NO VALIDOS AUTOMATICOS ------\n");
		String[] niesNoValidos = {"78484464Te","2376173A","082217200Q","95882054e","a63587725",
		"A26861694V","21616083I","26868974O","40135330Ñ","89044648U", "43223381X o 42334455A"};
		
		for (String numnie : niesNoValidos) {
			Nie nie = new Nie(numnie);
			assertFalse(nie.esValido());
		}
		
	}

}
