package org.foobarspam.appbicipalma.testing;

import static org.junit.Assert.*;

import org.foobarspam.appbicipalma.tarjetausuario.TarjetaUsuario;
import org.junit.Test;

public class TarjetaUsuarioTest {

	@Test
	public void testGetEstado() {
		TarjetaUsuario tarjeta = new TarjetaUsuario("000456789", true);
		assertEquals(true, tarjeta.estaActivada());
	}

}
