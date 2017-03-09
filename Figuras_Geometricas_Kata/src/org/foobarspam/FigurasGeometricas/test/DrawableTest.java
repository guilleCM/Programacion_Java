package org.foobarspam.FigurasGeometricas.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.foobarspam.FigurasGeometricas.figura.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class DrawableTest {
	private static ArrayList<Drawable> figuras;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		figuras = new ArrayList<Drawable>();
		Circulo circulo = new Circulo("Circulo", 2.0);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 2.0);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", 2.0, 3.0);
		Elipse elipse = new Elipse("Elipse", 3.0, 2.0);
		
		figuras.add(circulo);
		figuras.add(cuadrado);
		figuras.add(elipse);
		figuras.add(rectangulo);
	}
	
	@Test
	public void añadirFigurasTest() {
		assertEquals(4, figuras.size());
	}
	
	@Test
	public void comprobarInterfazTest(){
		assertTrue(figuras.get(0) instanceof Drawable);
		assertTrue(figuras.get(0) instanceof Circulo);
	}

	@Test
	public void dibujarFigurasTest(){
		Drawables.dibujarFiguras(figuras);
	}
	
	@Test
	public void aplicarTemasTest() {
		Drawables.aplicarTemas(figuras);
	}
}
