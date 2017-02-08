package org.foobarspam.ejercicioSupermercados.testing;

import static org.junit.Assert.*;

import org.foobarspam.ejercicioSupermercados.supermercado.Supermercado;
import org.junit.Test;

public class SupermercadoTest {

	@Test
	public void testConstructor() {
		Supermercado supermercado = new Supermercado("Mercadona", 500);
		assertEquals("Mercadona", supermercado.getNombre());
		assertEquals(500, supermercado.getRecaudacionAnual(), 0);
	}

}
