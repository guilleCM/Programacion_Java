package org.foobarspam.appbicipalma.testing;

import static org.junit.Assert.*;

import org.foobarspam.appbicipalma.bicicleta.Bicicleta;
import org.junit.Test;

public class BicicletaTest {

	@Test
	public void testBicicleta() {
		Bicicleta nuevaBicicleta = new Bicicleta(291);
		assertEquals(291, nuevaBicicleta.getId());
	}

}
