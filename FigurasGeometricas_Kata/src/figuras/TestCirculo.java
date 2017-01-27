package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCirculo {

	Circulo primerCirculo = new Circulo(3.0);
	
	@Test
	public void test_getRadio() {
		assertEquals(3.0, primerCirculo.getRadio(),0.01);
	}
	
	@Test
	public void test_setRadio() {
		primerCirculo.setRadio(5.0);
		assertEquals(5.0, primerCirculo.getRadio(),0.01);
	}

	@Test
	public void test_area() {
		assertEquals(28.27, primerCirculo.area(),0.01);
	}
}
