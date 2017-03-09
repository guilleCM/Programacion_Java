package org.foobarspam.FigurasGeometricas.figura;

import java.util.ArrayList;

public class Figuritas {
	
	
	public static void main (String[] args){
		// Main del programa
		
		//Utilizamos una colección de ArrayList para guardar las figuras
		ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
		
		//Declaramos las figuras
		Rectangulo rectangulo1 = new Rectangulo(3, 4);
		Rectangulo rectangulo2 = new Rectangulo("Rectangulo", 3, 4);
		Circulo circulo1 = new Circulo(5);
		Circulo circulo2 = new Circulo("Circulo", 3);
		Cuadrado cuadrado1 = new Cuadrado(4);
		Cuadrado cuadrado2 = new Cuadrado("Cuadrado", 6);
		Elipse elipse1 = new Elipse(3, 5);
		Elipse elispe2 = new Elipse("Elipse", 5, 7);
		
		//Añadimos las figuras en el ArrayList
		figuras.add(rectangulo1);
		figuras.add(rectangulo2);
		figuras.add(cuadrado1);
		figuras.add(cuadrado2);
		figuras.add(circulo1);
		figuras.add(circulo2);
		figuras.add(elipse1);
		figuras.add(elispe2);
		
		//Recorremos el ArrayList para imprimir el contenido
		for(FiguraGeometrica figura : figuras){
			System.out.println("La figura " + figura.getNombre() +
					" tiene un área de: " + figura.area());
		}
		
		if(rectangulo1.area() == 12) {
			System.out.println("rectangulo1: OK");
		} else {
			System.out.println("rectangulo1: NO OK");
		}
		
		if(cuadrado1.area() == 16) {
			System.out.println("cuadrado1: OK");
		} else {
			System.out.println("cuadrado1: NO OK");
		}
		
		if(circulo1.area() == 78.5398){
			System.out.println("circulo1: OK");
		} else {
			System.out.println("circulo1: NO OK");
		}
		
		if(elipse1.area() == 47.12388000000001){
			System.out.println("elipse1: OK");
		} else {
			System.out.println("elipse1: NO OK");
		}
		
	}
}
