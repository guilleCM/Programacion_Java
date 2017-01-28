package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.TarjetaPrepago.*;
import org.junit.Test;

public class HoraTest {
	
	@Test
	public void testHora() {
		Hora inyector = new Hora();
		inyector.setHora(2, 2, -1);
		assertEquals("02:02:00", inyector.imprimirHora());
		inyector = new Hora(100);
		assertEquals("00:00:00", inyector.imprimirHora());
	}

}
