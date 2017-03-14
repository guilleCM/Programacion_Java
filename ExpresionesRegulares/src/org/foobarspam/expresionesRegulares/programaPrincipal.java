package org.foobarspam.expresionesRegulares;

import java.util.Scanner;

public class programaPrincipal {

	public static void main(String[] args) {
		System.out.println("Introduce un DNI: ");
		Scanner input = new Scanner(System.in);
		String numeroID = input.nextLine();
		Dni dni = new Dni(numeroID);
		
		while(!dni.tieneFormatoValido()){
			System.out.println("El DNI introducido NO es correcto, introducelo de nuevo: ");
			input = new Scanner(System.in);
		    numeroID = input.nextLine();
			dni.setNumeroId(numeroID);
		}
		
		System.out.println("El DNI: " + dni.getNumeroId() + " es corecto!");
		System.out.println("\nAhora introduce un NIE: ");
		input = new Scanner(System.in);
		numeroID = input.nextLine();
		Nie nie = new Nie(numeroID);
		while(!nie.tieneFormatoValido()){
			System.out.println("El NIE introducido NO es correcto, introducelo de nuevo: ");
			input = new Scanner(System.in);
		    numeroID = input.nextLine();
			nie.setNumeroId(numeroID);
		}
		System.out.println("El NIE: " + nie.getNumeroId() + " es corecto!");
		System.exit(0);
		
	
	}

}
