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
	public void tieneFormatoValidoTest() {
		assertFalse(nie.tieneFormatoValido());
		
		nie = new Nie("X3223381X");
		assertTrue(nie.tieneFormatoValido());
	}
	
	@Test
	public void tieneFormatoValidoTestAutomatico() {
		String[] nitieneFormatoValidos = {"X8484464T","Y2376173A","Z1817200Q","Z5882054E","Y3587725Q",
		"X6861694V","X1616083Q","Y6868974Y","Y0135330P","Z9044648X"};
		
		for (String numnie : nitieneFormatoValidos) {
			Nie nie = new Nie(numnie);
			assertTrue(nie.tieneFormatoValido());
		}
		
	}
	
	@Test
	public void notieneFormatoValidoTestAutomatico() {
		String[] niesNoValidos = {"78484464Te","2376173A","082217200Q","95882054e","a63587725",
		"A26861694V","21616083I","26868974O","40135330Ñ","89044648U", "43223381X o 42334455A"};
		
		for (String numnie : niesNoValidos) {
			Nie nie = new Nie(numnie);
			assertFalse(nie.tieneFormatoValido());
		}
		
	}
	
	@Test
	public void tieneLetraCorrectaTest(){
		nie.setNumeroId("X2323233A");
		assertTrue(nie.tieneLetraCorrecta());
	}
	
	@Test
	public void tieneLetraCorrectaTrueTestAutomatico() {
		String[] niesCorrectos = {"Z3513446V","X6017281K","Y0170159L","X8196268B","Y6530158N",
		"Z6026490N","Y5294635A","Y2713946Y","Y2283783N","Z1942911Z"};
		
		for (String numnie : niesCorrectos) {
			Nie nie = new Nie(numnie);
			assertTrue(nie.tieneLetraCorrecta());
		}
		
	}

}
