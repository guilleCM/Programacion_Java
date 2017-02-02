package org.foobarspam.puntodesilla;

import java.util.Arrays;

public class Matriz {
	
	int[][] matriz = {{}};
	// Por defecto, si no se encuentra el punto o hay más
	// de uno, devolverá {-1,-1}
	int[] puntoDeSilla = {-1,-1};
	
	public Matriz() {
	}
	
	public Matriz(int[][] matriz) {
		this.matriz = matriz;
	}
	
	//setter
	public void setPuntoDeSilla(int posicionFila, int posicionColumna) {
		this.puntoDeSilla[0]=posicionFila;
		this.puntoDeSilla[1]=posicionColumna;
	}
	
	//getters
	public int[][] getMatriz() {
		return this.matriz;
	}
	
	public int[] getPuntoDeSilla() {
		return this.puntoDeSilla;
	}
	
	//métodos
	public int longitudMatriz() {
		int longitud = 0;
		int[][] matriz = getMatriz();
		for (int i=0; i<matriz.length; i++) {
			longitud += matriz[i].length;
		}
		return longitud;
	}
	
	public int[] sacarFila(int posicionFila) {
		int[][] matriz = getMatriz();
		return matriz[posicionFila];
	}
	
	public int[] sacarColumna(int posicionColumna) {
		int[][] matriz = getMatriz();
		int [] columna = new int[matriz.length];
		for (int i=0; i<matriz.length; i++) {
			columna[i] = matriz[i][posicionColumna];
		}
		return columna;
	}
	
	public boolean menorValorFila(int numeroCheckear, int[] fila) {
		int valor = fila[0];
		for (int i : fila) {
			if (i<valor) {
				valor = i;
			}
		}
		return (valor==numeroCheckear);
	}
	
	public boolean mayorValorColumna(int numeroCheckear, int[] columna) {
		int valor = columna[0];
		for (int i: columna) {
			if (i>valor) {
				valor = i;
			}
		}
		return (valor==numeroCheckear);
	}
	
	public String imprimirFila(int[] fila){
		return Arrays.toString(fila);
	}
	public void puntoDeSilla() {
		int puntoDeSilla=0;
		int[][] matriz = getMatriz();
		int puntosEncontrados = 0;
		int j=0;
		for (int[] fila: matriz) {
			int i=0;
			for (int numero : fila) {
				if (menorValorFila(numero, fila) && mayorValorColumna(numero,sacarColumna(i))) {
					puntoDeSilla=numero;
					setPuntoDeSilla(j, i);
					puntosEncontrados +=1;
				}
				i++;
			}
			j++;
		}
		if (puntosEncontrados > 1){
			setPuntoDeSilla(-1,-1);
		}
		
	}
	
	public String imprimirPuntoDeSilla() {
		int[] fallo = {-1,-1};
		if (Arrays.equals(getPuntoDeSilla(), fallo)) {
			return ("No se ha encontrado punto de silla");
		} else {
			return ("Se ha encontrado en el punto: " + Arrays.toString(getPuntoDeSilla()) );
		}
	}
}
