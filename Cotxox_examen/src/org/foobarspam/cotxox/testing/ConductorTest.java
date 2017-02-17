package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.conductores.Conductor;
import org.junit.Before;
import org.junit.Test;

public class ConductorTest {
	
	Conductor fAlonso;
	@Before
	public void setUp() {
		fAlonso = new Conductor("Fernando Alonso");
	}
	
	@Test
	public void testSetValoracion() {

		ArrayList<Byte> esperado = new ArrayList<>();
		assertEquals(esperado, fAlonso.getValoraciones());
		
		esperado.add((byte) 4);
		fAlonso.setValoracion((byte)4);
		assertEquals(esperado, fAlonso.getValoraciones());
		
	}

}
