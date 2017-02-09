package org.foobarspam.manipulacionArrays;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class ManipulacionArrays {
	public static void main(String[] args) {
		/*
		 * Declara un Array de nombre lista que estará formado 
		 * por 25 datos de tipo entero generados al azar 
		 * comprendidos entre 25 y 50.
		 */
		System.out.println("----CASO TEST declarar array INT ALEATORIOS----");
		int[] lista = new int[25];
		for (int i = 0; i<lista.length; i++) {
			lista[i] = ThreadLocalRandom.current().nextInt(25, 51);
		}
		System.out.println("numero aleatorio en la primera posicion: "+lista[0]);
		System.out.println("numero aleatorio en la ultima posicion: "+lista[24]);
		/*
		 * Declara otro vector de nombre auxiliar formado por 
		 * 4 datos de tipo real. Almacenar en este Array lo siguiente: 
		 * Posición 0: número de números pares en lista. 
		 * Posición 1: número de números impares de lista. 
		 * Posición 2: media de los números impares de lista. 
		 * Posición 3: suma de los números enteros comprendidos 
		 * 			entre 1 y el valor par más pequeño de lista. 
		 * Escribe a continuación el contenido de lista, así 
		 * como los resultados obtenidos y almacenados en auxiliar.
		 */
		System.out.println("\n----CASO TEST array de reales BAJO CONTROL----");
		double[] auxiliar = new double[4];
		int[] listaControl = {8,4,2,3,5,7,6};
		auxiliar[0] = numerosParesEnLista(listaControl);
		auxiliar[1] = numerosImparesEnLista(listaControl);
		System.out.println("Numeros pares esperados 4, devueltos: "+auxiliar[0]);
		System.out.println("Numeros impares esperados 3, devueltos: "+auxiliar[1]);
		auxiliar[2] = mediaNumerosImpares(listaControl);
		System.out.println("Media de los numeros impares esperada 5, devuelta: "+auxiliar[2]);
		auxiliar[3] = sumaNumerosBajos(listaControl);
		System.out.println("Suma numeros pares entre 1 y numero par mas bajo "
				+ ",esperado 3, devuelto: "+auxiliar[3]);
		int[] listaControl2 = {10,3,7,4};
		auxiliar[3] = sumaNumerosBajos(listaControl2);
		System.out.println("Suma numeros pares entre 1 y numero par mas bajo "
				+ ",esperado 10, devuelto: "+auxiliar[3]);
		
		
		System.out.println("\n----CASO TEST de la lista ALEATORIA-----\nNúmeros: ");
		for (int numero : lista){
			System.out.print(numero + " ");
		}
		System.out.println("");
		auxiliar[0] = numerosParesEnLista(lista);
		auxiliar[1] = numerosImparesEnLista(lista);
		auxiliar[2] = mediaNumerosImpares(lista);
		auxiliar[3] = sumaNumerosBajos(lista);
		System.out.println("\n-----CASO TEST de auxiliar sobre la lista ALEATORIA----");
		System.out.println("Número de Pares: " +auxiliar[0]);
		System.out.println("Número de Impares: " +auxiliar[1]);
		System.out.println("Media de Impares: " + auxiliar[2]);
		System.out.println("Suma desde 1 a Par más Bajo: " + auxiliar[3]);
	}
	
	private static double numerosParesEnLista(int[] lista) {
		double total = 0;
		for (int numero : lista) {
			if (numero%2==0) {
				total++;
			}
		}
		return total;
	}
	
	private static double numerosImparesEnLista(int[] lista) {
		double total = 0;
		for (int numero : lista) {
			if (numero%2!=0) {
				total++;
			}
		}
		return total;
	}
	
	private static double mediaNumerosImpares(int[] lista) {
		double sumaImpares = 0;
		int numeroImpares = 0;
		for (int numero : lista) {
			if (numero%2 != 0) {
				sumaImpares += numero;
				numeroImpares ++;
			}
		}
		return sumaImpares/numeroImpares;
	}
	
	private static double sumaNumerosBajos(int[] lista) {
		double total = 0;
		double UNO = 1;
		double numParMasBajo = encontrarNumeroParMasBajo(lista);
		while (UNO<=numParMasBajo) {
			total += numParMasBajo;
			numParMasBajo--;
		}
		return total;
	}
	
	private static double encontrarNumeroParMasBajo(int[] lista) {
		Arrays.sort(lista);
		for (int numero : lista) {
			if (numero%2 == 0) {
				return numero;
			}
		}
		return 0;
	}
}
