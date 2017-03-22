package org.foobarspam.enumtypes.pesoenplanetas;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Introduce tu peso en KG: ");
		Scanner input = new Scanner(System.in);
		Integer peso = Integer.parseInt(input.nextLine());
		Planeta tierra = Planeta.EARTH;

		double masa = peso/tierra.getGravedadEnPlaneta();

		for (Planeta planeta : Planeta.values()) {
			double pesoEnPlaneta = masa * planeta.getGravedadEnPlaneta();
			System.out.println("Tu peso en "+ planeta.name() + " es:\t" + pesoEnPlaneta);
		}

	}

}
