package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuadrado {
	Cuadrado primerCuadrado = new Cuadrado(3.0);

	@Test
	public void test_getLado() {
		assertEquals(3.0, primerCuadrado.getLado(),0.01);
	}
		
	@Test
	public void test_setLado() {
		primerCuadrado.setLado(2.0);
		assertEquals(2.0,primerCuadrado.getLado(),0.01);
	}
	
	@Test
	public void test_area() {
		assertEquals(9.0, primerCuadrado.area(),0.01);
	}
}
