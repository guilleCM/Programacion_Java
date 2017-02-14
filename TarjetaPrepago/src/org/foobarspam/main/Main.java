package org.foobarspam.main;

import java.util.Scanner;

import org.foobarspam.Dni.Dni;
import org.foobarspam.TarjetaPrepago.TarjetaPrepago;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Introduce el numero de teléfono: ");
		String numeroIntroducido = null;
		numeroIntroducido = escanearNumero();
		
		System.out.println("Introduce un dni: ");
		String dni = null;
		dni = scanner.next();
		
		System.out.println("Introduce la cantidad de saldo inicial: ");
		double bonoSaldo = 0.0;
		bonoSaldo = scanner.nextDouble();

		scanner.close();
		
		TarjetaPrepago tarjeta1 = null;
		Dni dniScan = null;
		
		try {
			dniScan = new Dni(dni);
			tarjeta1 = new TarjetaPrepago(numeroIntroducido, dniScan, bonoSaldo);
		}
		finally {
			System.out.println("Su tarjeta se ha creado correctamente: ");
			tarjeta1.consultarTarjeta();
		}
		
	}
	
	public static String escanearNumero() {;
		String numero = null;
		try (Scanner scan = new Scanner(System.in)) {
			String scanValue = scan.nextLine();
			for (char caracter : scanValue.toCharArray()) {
				if (!Character.isDigit(caracter)) {
					System.out.println("Ops! Parece que no has introducido un número..."
							+ "\n Por favor, vuelve a empezar");
				}
				if (scanValue.length()!=9) {
					System.out.println("Ops! el número debe contener 9 cifras");
				}
			}
			numero = scanValue;
		}
		return numero;
	}
	
}


