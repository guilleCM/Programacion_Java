package figuras;

import static org.junit.Assert.*;
import org.junit.Test;


public class TestRectangulo {
	
		Rectangulo primerRectangulo = new Rectangulo(3.0,4.0);
		Rectangulo segundoRectangulo = new Rectangulo();		
		Rectangulo tercerRectangulo = new Rectangulo("pepito",3.0,4.0);
		@Test
		public void test_getLados() {
			assertEquals(3.0, primerRectangulo.getLadoA(),0.01);
			assertEquals(4.0,primerRectangulo.getLadoB(),0.01);			
			//Rectangulo sin parametros (constructor defensivo)
			assertEquals(0.0,segundoRectangulo.getLadoA(),0.01);
			assertEquals("desconocido",segundoRectangulo.getNombre());
			//Rectangulo con nombre
			assertEquals("pepito",tercerRectangulo.getNombre());
		}
			
		@Test
		public void test_setLados() {
			primerRectangulo.setLadoA(1.0);
			assertEquals(1.0,primerRectangulo.getLadoA(),0.01);
		}
		
		@Test
		public void test_area() {
			assertEquals(12.0, primerRectangulo.area(),0.01);
		}
}
