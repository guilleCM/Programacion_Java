package org.foobarspam.Dni;
import java.io.IOException;
import java.util.Scanner;

public class MainDni {
	public static void main(String[] args) {
		try {
			String inputDni = capturarDni();
		}
		finally {
			System.out.println("Gracias");
		}
	}
	
	public static String capturarDni() {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Introduce el DNI: \n");
			String inputDni = scan.nextLine();
		}
		return "G";
	}
}
