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
	public void tieneFormatoValidoTest() {
		assertFalse(dni.tieneFormatoValido());
		
		dni = new Dni("43223381X");
		assertTrue(dni.tieneFormatoValido());
	}
	
	@Test
	public void tieneFormatoValidoTestAutomatico() {
		String[] dnisValidos = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		"26861694V","21616083Q","26868974Y","40135330P","89044648X"};
		
		for (String numDni : dnisValidos) {
			Dni dni = new Dni(numDni);
			assertTrue(dni.tieneFormatoValido());
		}
		
	}
	
	@Test
	public void notieneFormatoValidoTestAutomatico() {
		String[] dnisNoValidos = {"78484464Te","2376173A","082217200Q","95882054e","a63587725",
		"A26861694V","21616083I","26868974O","40135330Ñ","89044648U", "43223381X o 42334455A"};
		
		for (String numDni : dnisNoValidos) {
			Dni dni = new Dni(numDni);
			assertFalse(dni.tieneFormatoValido());
		}
		
	}
	
	@Test
	public void tieneLetraCorrectaTrueTestAutomatico() {
		String[] dnisValidos = {"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		"26861694V","21616083Q","26868974Y","40135330P","89044648X", "43223381X"};
		
		for (String numDni : dnisValidos) {
			Dni dni = new Dni(numDni);
			assertTrue(dni.tieneLetraCorrecta());
		}
		
	}
	
	@Test
	public void tieneLetraCorrectaFalseTestAutomatico() {
		String[] dnisNoValidos = {"78484464A","72376173Z","01817200E","95882054Y","63587725L",
		"26861694X","21616083B","26868974N","40135330A","89044648G", "43223381P"};
		
		for (String numDni : dnisNoValidos) {
			Dni dni = new Dni(numDni);
			assertFalse(dni.tieneLetraCorrecta());
		}
		
	}
	

}
