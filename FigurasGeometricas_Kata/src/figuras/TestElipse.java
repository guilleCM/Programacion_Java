package figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestElipse {

	Elipse primeraElipse = new Elipse(3.0, 3.0);
	
	@Test
	public void test_getSemiEjeMenor() {
		assertEquals(3.0, primeraElipse.getSemiEjeMenor(),0.01);
	}
	
	@Test
	public void test_setSemiEjeMayor() {
		primeraElipse.setSemiEjeMayor(5.0);
		assertEquals(5.0, primeraElipse.getSemiEjeMayor(),0.01);
	}

	@Test
	public void test_area() {
		assertEquals(28.27, primeraElipse.area(),0.01);
	}
}
