package org.foobarspam.enumtypes.pesoenplanetas;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Introduce tu peso en KG: ");
		Scanner input = new Scanner(System.in);
		Integer peso = Integer.parseInt(input.nextLine());
		Planet tierra = Planet.EARTH;

		double masa = peso/tierra.getGravityInPlanet();

		for (Planet planeta : Planet.values()) {
			double pesoEnPlaneta = masa * planeta.getGravityInPlanet();
			System.out.println("Tu peso en "+ planeta.name() + " es:\t" + pesoEnPlaneta);
		}

	}

}
