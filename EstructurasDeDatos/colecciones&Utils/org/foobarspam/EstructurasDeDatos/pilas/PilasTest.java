package org.foobarspam.EstructurasDeDatos.pilas;

import java.util.Stack;

public class PilasTest {

	public static void main(String[] args) {
		/*		 * 
		 * Escribe un programa que dada una cadena de caracteres 
		 * la visualice al revés.  Utiliza una pila.
		 */
		String input = "hola que tal";
		
		Stack<Character> st = new Stack<>();
		
		for (Character letra : input.toCharArray()) {
			st.push(letra);
		}

		System.out.println("Input: "+input);
		
		String output = "";
		
		while (!st.isEmpty()) {
			output += st.pop();
		}
		
		System.out.println("Output: "+output);
	}

}
