package org.foobarspam.nba.items;

import org.foobarspam.nba.interfaces.Iterable;
import org.foobarspam.nba.interfaces.Componible;
import java.util.ArrayList;

public class Item implements Iterable, Componible {
	// PROPIEDADES DE CLASE
	private String nombre = null;
	private boolean compuesto = false;
	private ArrayList<Item> hijos = new ArrayList<Item>();
	
	// CONSTRUCTOR
	public Item(String nombre) {
		this.nombre = nombre;
	}
	// METODOS
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isCompuesto() {
		return this.compuesto;
	}
	public void setCompuesto(boolean compuesto) {
		this.compuesto = compuesto;
	}
	public ArrayList<Item> getHijos() {
		return this.hijos;
	}
	public void añadir(Item hijo) {
		this.hijos.add(hijo);
	}
	public void quitar(String nombre) {
		for (Item hijo : getHijos()) {
			if (hijo.getNombre().equals(nombre)) {
				getHijos().remove(hijo);
				break;
			}
		}
	}
	public void quitar(Item objeto) {
		
	}
	
	@Override
	public void iterable() {
		System.out.println(getNombre());
		for (Item item : getHijos()) {
			if(item.isCompuesto()) {
				item.iterable();
			}
			else {
				System.out.println("---------- "+item.getNombre());	
			}

		}
	}
	@Override
	public void composite(String[] nombres) {
		for (String nombre : nombres) {
			SimpleItem equipo = new SimpleItem(nombre);
			getHijos().add(equipo);
		}
	}
	
	@Override
	public void composite(Item[] divisiones) {
		for (Item division : divisiones) {
			getHijos().add(division);
		}
		
	}
	


}
