package org.foobarspam.main;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i<10; i++) {
			System.out.println("Introduce un numero");
			lista.add(scanner.nextInt());

			}

		
		scanner.close();
	for (int elemento : lista) {
		System.out.println(elemento);
	}
		
	}
}


