package org.foobarspam.ejercicioSupermercados.ventas;

import org.foobarspam.ejercicioSupermercados.supermercado.Supermercado;

public class Ventas {	
	public static void main(String[] args) {
		//inicializar array de ventas y de objetos supermercado
		double[] ventas = new double[5];
		Supermercado[] supermercados = new Supermercado[5];
		
		//valores que implementaremos a los objetos supermercado
		String[] nombres = {"Mercadona", "Lidl", "Dia", "Eroski", "Aldi"};
		double[] recaudaciones = {50000000, 40000000, 30000000, 20000000, 10000000};
//		double[]
		//crear objetos supermercado y meteros en el array de arriba
		for (int i = 0; i<supermercados.length; i++) {
			supermercados[i] = new Supermercado(nombres[i], recaudaciones[i]);
		}
		
		for (int i = 0; i<supermercados.length; i++) {
			ventas[i] = supermercados[i].getRecaudacionAnual();
		}
		
		//imprimir por pantalla los resultados
		
		//TEST mayor recaudacion
		System.out.println("Supermercado con mayor recaudacion: "
				+supermercados[mayorRecaudacion(ventas)].getNombre()
				+" con " +ventas[mayorRecaudacion(ventas)]+" € recaudados");
		//TEST menor recaudacion
		System.out.println("Supermercado con menor recaudacion: "
				+supermercados[menorRecaudacion(ventas)].getNombre()
				+" con " +ventas[menorRecaudacion(ventas)]+" € recaudados");
		//TEST total recaudado
		System.out.println("En total los supermercados han recaudado: "
						   +recaudacionTotal(ventas)+" €");
	}
	
	public static int mayorRecaudacion(double[] ventas) {
		int posicion = 0;
		double mayorValor = ventas[0];
		for (int i = 0; i<ventas.length; i++) {
			if (ventas[i] > mayorValor) {
				mayorValor = ventas[i];
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static int menorRecaudacion(double[] ventas) {
		int posicion = 0;
		double mayorValor = ventas[0];
		for (int i = 0; i<ventas.length; i++) {
			if (ventas[i] < mayorValor) {
				mayorValor = ventas[i];
				posicion = i;
			}
		}
		return posicion;
	}
	
	public static double recaudacionTotal(double[] ventas) {
		double recaudacionTotal = 0;
		for (double recaudado : ventas) {
			recaudacionTotal += recaudado;
		}
		return recaudacionTotal;	
	}
	
}
