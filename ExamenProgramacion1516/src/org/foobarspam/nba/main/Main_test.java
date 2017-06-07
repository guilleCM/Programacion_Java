package org.foobarspam.nba.main;

import java.util.ArrayList;

import org.foobarspam.nba.items.CompuestoItem;
import org.foobarspam.nba.items.Item;
import org.foobarspam.nba.items.SimpleItem;

public class Main_test {

	public static void main(String[] args) {
		
		SimpleItem simpleItem = new SimpleItem("Lakers");
		
		System.out.println("\n *** crear item simple y testear su nombre *** \n");
		
			System.out.println("Equipo: " + simpleItem.getNombre());
		
		
		CompuestoItem compuestoItem = new CompuestoItem("Pacific");
		
		System.out.println("\n *** crear item compuesto y testear su nombre *** \n");
		
			System.out.println("Division: " + compuestoItem.getNombre());
		
		
		// añadir item simple a compuesto y comprobar nombre
			
		System.out.println("\n *** añadir item simple a compuesto y comprobar nombre *** \n");
		
			// metodo anhadir(equipo);		
			compuestoItem.añadir(simpleItem);
			System.out.println("OK: Se ha añadido equipo: " + compuestoItem.getHijos().get(0).getNombre());
		
		//  recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1
		
		System.out.println("\n *** recorrer un item compuesto mostrando su nombre y el de sus hijos: 1 hijo, profundidad 1 *** \n");
			
			compuestoItem.setCompuesto(true);
			// metodo iterable();
			compuestoItem.iterable();
		
		// añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1
		
		System.out.println("\n ***añadir varios hijos desde array de strings y recorrer un item compuesto mostrando su nombre y el de sus hijos: n hijos, profundidad 1 *** \n");
		
			// crear division "Atlantic"
			CompuestoItem atlantic = new CompuestoItem("Atlantic");
			atlantic.setCompuesto(true);
			String[] equiposAtlantic = {"Celtics", "Nets", "Knicks", "76ers", "Raptors"};
			for (String nombreEquipo : equiposAtlantic) {
				SimpleItem equipo = new SimpleItem(nombreEquipo);
				atlantic.añadir(equipo);
			}
			
			atlantic.iterable();
	
		
		// recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n 
		
		System.out.println("\n *** recorrer un item compuesto por otros compuestos, mostrando su nombre y el de sus hijos: n hijos, profundidad n *** \n");
			
			CompuestoItem nba = new CompuestoItem("nba");
			CompuestoItem conferenciaEste = new CompuestoItem("Conferencia Este");
			conferenciaEste.añadir(atlantic);
			conferenciaEste.setCompuesto(true);
			nba.setCompuesto(true);
			nba.añadir(conferenciaEste);
			nba.iterable();
			// crear liga "nba" 
			// crear conferencia Este 
		
		
		// crear un elemento compuesto de simples a partir de un array de strings
		
		System.out.println("\n *** crear un elemento compuesto de simples a partir de un array de strings *** \n");
		
		String[] equiposCentral = {"Bulls", "Cavs", "Pistons", "Pacers", "Bucks"};
		
			// Crear division Central
			CompuestoItem central = new CompuestoItem("Central");
			// método composite()
			central.setCompuesto(true);
			central.composite(equiposCentral);
			central.iterable();
		
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples

		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos simples *** \n");
		
		String[] equiposSouthEast = {"Heat", "Hawks", "Hornets", "Wizzards", "Magic"};

			// crear un arraylist de equipos SouthEast
			ArrayList<Item> arraySouthEast = new ArrayList<Item>();
			for (String nombre : equiposSouthEast) {
				SimpleItem equipo = new SimpleItem(nombre);
				arraySouthEast.add(equipo);
			}
			// crear division SouthEast y añadir los equipos SouthEast
			CompuestoItem southEast = new CompuestoItem("South East");
			for (Item equipo : arraySouthEast) {
				southEast.añadir(equipo);
			}
			// añadir division SouthEast
			southEast.setCompuesto(true);
			southEast.iterable();
		
		// crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos
		
		System.out.println("\n *** crear un elemento compuesto de elementos compuestos a partir de un array de objetos compuestos *** \n");
		
			// crear un ArrayList de divisiones
			Item[] divisiones = {central, southEast};
			// añadirlas a la conferencia este
			conferenciaEste.composite(divisiones);
			conferenciaEste.iterable();
		
		// eliminar un hijo entre varios, profundidad 1
		
		System.out.println("\n *** eliminar un hijo a profundidad n *** \n");
				conferenciaEste.quitar("Atlantic");
				// quitar la division Atlantic
				// metodo quitar("Atlantic");	 se busca por el nombre de la división, no por el objeto.		
				conferenciaEste.iterable();
		
		// Crea la conferencia Oeste completa y añadela a la liga; muestra por pantalla la liga completa
				CompuestoItem conferenciaOeste = new CompuestoItem("Conferencia Oeste");
				conferenciaOeste.setCompuesto(true);
				
				String[] equiposNoroeste = {"Nuggets", "Timberwolves", "Thunder", "Blazers", "Jazz"};
				CompuestoItem noroeste = new CompuestoItem("Noroeste");
				noroeste.setCompuesto(true);
				noroeste.composite(equiposNoroeste);
				
				String[] equiposSuroeste = {"Dallas", "Houston", "Memphis", "New Orleans", "Spurs"};
				CompuestoItem suroeste = new CompuestoItem("Suroeste");
				suroeste.setCompuesto(true);
				suroeste.composite(equiposSuroeste);				
				
				
				conferenciaOeste.añadir(noroeste);
				conferenciaOeste.añadir(suroeste);
				nba.añadir(conferenciaOeste);

		System.out.println("\n *** Liga NBA completa con sus conferencias, divisiones y equipos *** \n");
				nba.iterable();
	}
}