package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.TarjetaPrepago.*;
import org.junit.Test;

public class HoraTest {
	
	@Test
	public void testHora() {
		Hora inyector = new Hora();
		inyector.setHora(2, 2, 0);
		assertEquals("02:02:00", inyector.imprimirHora());
		inyector = new Hora(1,1,1);
		assertEquals("01:01:01", inyector.imprimirHora());
		inyector = new Hora(12,15,00);
		assertEquals("12:15:00", inyector.imprimirHora());
	}

}
