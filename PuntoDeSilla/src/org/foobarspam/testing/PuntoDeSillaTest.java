package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.puntodesilla.*;
import org.junit.Test;

public class PuntoDeSillaTest {

	@Test
	public void testLongitudMatriz() {
		int [][] matrizSimple = {{1,1,1},
								 {1,1,1},
								 {1,1,1},
							   	};
		
		Matriz prueba= new Matriz(matrizSimple);
		assertEquals(9, prueba.longitudMatriz());
	}
	
	@Test
	public void testSacarfila() {
		int [][] matrizSimple = {{1,1,1},
 								 {2,1,1},
 								 {3,1,1},
								};
		
		Matriz prueba= new Matriz(matrizSimple);
		
		int[] filaEsperada = {2,1,1};
		assertArrayEquals(filaEsperada, prueba.sacarFila(1));
		filaEsperada = new int[]{1,1,1};
		assertArrayEquals(filaEsperada, prueba.sacarFila(0));
		filaEsperada = new int[]{3,1,1};
		assertArrayEquals(filaEsperada, prueba.sacarFila(2));
	}
	
	@Test
	public void testSacarColumna() {
		int[][] matrizSimple = { {1,1,1},
								 {2,3,1},
								 {3,1,1},
								};
		
		Matriz prueba = new Matriz(matrizSimple);
		
		int[] columnaEsperada = {1,2,3};
		assertArrayEquals(columnaEsperada, prueba.sacarColumna(0));
		columnaEsperada = new int[]{1,3,1};
		assertArrayEquals(columnaEsperada, prueba.sacarColumna(1));
	}
	
	@Test
	public void testMenorValorFila() {
		int[][] matrizSimple = { {1,1,1},
								 {2,3,1},
								 {3,1,1},
								};
		Matriz prueba = new Matriz(matrizSimple);
		
		int[] fila = prueba.sacarFila(1);
		
		assertEquals(true, prueba.menorValorFila(1, fila));
		assertEquals(false, prueba.menorValorFila(3, fila));
		//todos los valores de la fila iguales (1,1,1)
		fila = prueba.sacarFila(0);
		assertEquals(true, prueba.menorValorFila(1, fila));
	}
	
	@Test
	public void testMayorValorColumna() {
		int[][] matrizSimple = { {1,1,1},
								 {2,3,1},
								 {3,1,1},
								};
		Matriz prueba = new Matriz(matrizSimple);
		
		int[] columna = prueba.sacarColumna(0);
		assertEquals(true, prueba.mayorValorColumna(3, columna));
		assertEquals(false, prueba.mayorValorColumna(2, columna));
		//sacamos la columna 2 ==> {1,1,1} donde todos los valores son iguales
		columna = prueba.sacarColumna(2);
		assertEquals(true, prueba.mayorValorColumna(1, columna));
	}
	
	@Test
	public void testPuntoDeSilla() {
		int[][] matrizSimple = { {1,3,4},
								 {2,3,1},
								 {3,4,5},
								};
		
		Matriz prueba = new Matriz(matrizSimple);
		int[] posicionEsperada = {2,0};
		prueba.puntoDeSilla();
		assertArrayEquals(posicionEsperada, prueba.getPuntoDeSilla());
		String mensajeEsperado = "Se ha encontrado en el punto: [2, 0] con valor de: 3";
		assertEquals(mensajeEsperado, prueba.imprimirPuntoDeSilla());
	}
	
	@Test
	public void testPuntoDeSillaTodosNumIguales() {
		int[][] matrizSimple = { {8,8,8},
								 {8,8,8},
								 {8,8,8},
								};
		int[] posicion = {-1,-1};
		Matriz prueba = new Matriz(matrizSimple);
		assertArrayEquals(posicion, prueba.getPuntoDeSilla());
		String esperado = "No se ha encontrado punto de silla";
		assertEquals(esperado, prueba.imprimirPuntoDeSilla());
	}
	
}
