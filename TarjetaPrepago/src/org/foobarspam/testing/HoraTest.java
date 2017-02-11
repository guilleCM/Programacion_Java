package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.Hora.Hora;
import org.junit.Test;

public class HoraTest {
	
	@Test
	public void test_imprimirHora() {
		Hora inyector = new Hora();
		inyector.setHora(2, 2, 0);
		assertEquals("02:02:00", inyector.imprimirHora());
		inyector = new Hora(1,1,1);
		assertEquals("01:01:01", inyector.imprimirHora());
		inyector = new Hora(12,15,00);
		assertEquals("12:15:00", inyector.imprimirHora());
		inyector.setHora(100, 00, 58);
		assertEquals("00:00:58", inyector.imprimirHora());
		inyector.setHora(-20, 23333, 23);
		assertEquals("00:00:23", inyector.imprimirHora());
		inyector.setMinutos(500);
		assertEquals("00:00:23", inyector.imprimirHora());
		inyector.setSegundos(17);
		assertEquals("00:00:17", inyector.imprimirHora());
	}

	@Test
	public void test_getHora() {
		Hora inyector = new Hora();
		int[] esperado = {0, 0, 0};
		assertArrayEquals(esperado, inyector.getHora());
		inyector.setHora(03, 10, 5);
		esperado = new int[]{3, 10, 5};
		assertArrayEquals(esperado, inyector.getHora());
	}
}
