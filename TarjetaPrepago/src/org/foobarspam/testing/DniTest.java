package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.Dni.Dni;
import org.junit.Test;

public class DniTest {

	Dni primerDni = new Dni();
	
	@Test
	public void test_setDni() {
		primerDni.setDni("43223381X");
		assertEquals("43223381X", primerDni.getDni());
		Dni segundoDni = new Dni();
		assertEquals("desconocido", segundoDni.getDni());
	}
	
	@Test
	public void test_esMedidaValida() {
		assertEquals(false, primerDni.esMedidaDniValida());
		primerDni.setDni("43223381X");
		assertEquals(true, primerDni.esMedidaDniValida());
		primerDni.setDni("");
		assertEquals(false, primerDni.esMedidaDniValida());
	}
	
	@Test
	public void test_sonNumerosValidos() {
		primerDni.setDni("43223381X");
		assertEquals(true, primerDni.sonNumerosValidos());
		primerDni.setDni("nosoynumero");
		assertEquals(false, primerDni.sonNumerosValidos());
	}
	
	@Test
	public void test_esLetraValida() {
		primerDni.setDni("43223381X");
		assertEquals(true, primerDni.esLetraValida());
		primerDni.setDni("nosoynumero");
		assertEquals(true, primerDni.esLetraValida());
	}
	
	@Test
	public void test_esDniValido() {
		assertEquals(false, primerDni.esDniValido());
		primerDni.setDni("43123");
		assertEquals(false, primerDni.esDniValido());
		primerDni.setDni("qwertyuio");
		assertEquals(false, primerDni.esDniValido());
		primerDni.setDni("-54*-+io1");
		assertEquals(false, primerDni.esDniValido());
		primerDni.setDni("01234567A");
		assertEquals(true, primerDni.esDniValido());
		primerDni.setDni("12345678e");
		assertEquals(true, primerDni.esDniValido());
	}
	
	@Test
	public void test_formatearDni() {
		primerDni.setDni("43223381x");
		primerDni.formatearLetraDni();
		assertEquals("43223381X", primerDni.getDni());
	}	

}
