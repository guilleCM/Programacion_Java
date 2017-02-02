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
	public void testImprimirFila() {
		int [][] matrizSimple = {{1,1,1},
				 				{2,1,1},
				 				{3,1,1},
			   					};
		Matriz prueba= new Matriz(matrizSimple);
		assertEquals("[2, 1, 1]", prueba.imprimirFila(matrizSimple[1]));
	}
	
	@Test
	public void testSacarfila() {
		int [][] matrizSimple = {{1,1,1},
 								 {2,1,1},
 								 {3,1,1},
					};
		Matriz prueba= new Matriz(matrizSimple);
		int[] filaSacada = prueba.sacarFila(1);
		assertEquals("[2, 1, 1]", prueba.imprimirFila(filaSacada));
		filaSacada = prueba.sacarFila(0);
		assertEquals("[1, 1, 1]", prueba.imprimirFila(filaSacada));
		filaSacada = prueba.sacarFila(2);
		assertEquals("[3, 1, 1]", prueba.imprimirFila(filaSacada));
	}
	
	@Test
	public void testSacarColumna() {
		int[][] matrizSimple = { {1,1,1},
								 {2,3,1},
								 {3,1,1},
								};
		Matriz prueba = new Matriz(matrizSimple);
		int[] columnaSacada = prueba.sacarColumna(0);
		assertEquals("[1, 2, 3]", prueba.imprimirFila(columnaSacada));
		columnaSacada = prueba.sacarColumna(1);
		assertEquals("[1, 3, 1]", prueba.imprimirFila(columnaSacada));
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
	}
	
	@Test
	public void testMayorValorColumna() {
		int[][] matrizSimple = { {1,1,1},
								 {2,3,1},
								 {3,1,1},
								};
		Matriz prueba = new Matriz(matrizSimple);
		int[] columna = prueba.sacarColumna(0);
		int num = 3;
		assertEquals(true, prueba.mayorValorColumna(num, columna));
		assertEquals(false, prueba.mayorValorColumna(2, columna));
	}
	
//	@Test
//	public void testPuntoDeSilla() {
//		int[][] matrizSimple = { {1,3,4},
//								 {2,3,1},
//								 {3,4,5},
//								};
//		int[] posicion = {2,0};
//		Matriz prueba = new Matriz(matrizSimple);
//		assertEquals(3, prueba.puntoDeSilla());
//		assertArrayEquals(posicion, prueba.getPuntoDeSilla());
//	}
	
	@Test
	public void testPuntoDeSillaTodosNumIguales() {
		int[][] matrizSimple = { {8,8,8},
								 {8,8,8},
								 {8,8,8},
								};
		int[] posicion = {-1,-1};
		Matriz prueba = new Matriz(matrizSimple);
//		assertEquals(8, prueba.puntoDeSilla());
		assertArrayEquals(posicion, prueba.getPuntoDeSilla());
		String esperado = "No se ha encontrado punto de silla";
		assertEquals(esperado, prueba.imprimirPuntoDeSilla());
	}
	
}
