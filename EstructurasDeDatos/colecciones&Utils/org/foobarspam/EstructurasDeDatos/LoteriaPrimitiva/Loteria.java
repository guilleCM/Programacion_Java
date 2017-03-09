package org.foobarspam.EstructurasDeDatos.LoteriaPrimitiva;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Loteria {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<Integer>();
		List<Integer> reintegro = new ArrayList<Integer>();
		
		for (int i = 1; i <= 49; i++) {
			numeros.add(i);
		}
		for (int i = 0; i <= 9; i++) {
			reintegro.add(i);
		}

		for (int i = 0; i < 5; i++) {
			Collections.shuffle(numeros);
			Collections.shuffle(reintegro);
			System.out.print("Combinacion " + (i + 1) + ": ");
			for (int j = 0; j < 5; j++) {
				System.out.print(numeros.get(j) + ",");
			}
			// Escribo el ultimo numero aparte para no ponerle la coma.
			System.out.print(numeros.get(5));
			System.out.print("    Complementario: " + numeros.get(6));
			System.out.println("\tReintegro: " + reintegro.get(0));
		}
	}
}
