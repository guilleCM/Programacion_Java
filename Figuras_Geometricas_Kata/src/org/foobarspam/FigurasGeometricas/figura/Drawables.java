package org.foobarspam.FigurasGeometricas.figura;

import java.util.ArrayList;

public class Drawables {
	
	public static void dibujarFiguras(ArrayList<Drawable> figuras){
		for (Drawable figura : figuras){
			figura.draw();
		}
	}
	
	public static void aplicarTemas(ArrayList<Drawable> figuras) {
		for (Drawable figura : figuras) {
			try {
				figura.aplicarTema();
			} catch (UnsupportedOperationException exception){
				System.out.println(exception);
			}
		}
	}
}
