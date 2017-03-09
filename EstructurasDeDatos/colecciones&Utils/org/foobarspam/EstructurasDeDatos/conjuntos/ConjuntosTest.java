package org.foobarspam.EstructurasDeDatos.conjuntos;

import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

public class ConjuntosTest {
	
	public static void main(String[] args) {
		
		/* EJERCICIO 1
		 *
		 *Escribe un programa en el que se generen de manera aleatoria
		 *8 valores  comprendidos entre 1 y 10 sin que haya números
		 *repetidos. Almacena  los números en un conjunto (TreeSet).
		 *
		 */
		System.out.println("-----Ejercicio 1-----");
		
		TreeSet<Integer> conjunto = new TreeSet<>();
		
		while (8!=conjunto.size()) {
			int numeroAleatorio = ThreadLocalRandom.current().nextInt(1, 11);
			conjunto.add(numeroAleatorio);
		}
		System.out.println(conjunto);
		
		
		/* EJERCICIO 2
		 * Dado  el siguiente String, escribe en pantalla los caracteres
		 * por los que está  formado, y sólo una vez los caracteres repetidos. 
		 */
		System.out.println("-----Ejercicio 2-----");
		
		String frase = "dabale arroz a la zorra el abad";
		  
		TreeSet <Character> caracteres = new TreeSet <Character>(); 
		  
		for(int i = 0; i < frase.length(); i++) {
		   caracteres.add(frase.charAt(i)); 
		}
		  
		for(Character letra:caracteres){
		   System.out.print(letra + "  ");
		}
		
	}
}
