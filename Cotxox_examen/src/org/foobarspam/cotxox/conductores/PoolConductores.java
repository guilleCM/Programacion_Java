package org.foobarspam.cotxox.conductores;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class PoolConductores {

	//propiedades
	private ArrayList<Conductor> poolConductores = new ArrayList<>();
	
	//constructor
	public PoolConductores(ArrayList<Conductor> conductores) {
		for (Conductor conductor : conductores) {
			this.poolConductores.add(conductor);
		}
	}
	
	//metodos
	public Conductor asignarConductor() {
		Conductor conductorAsignado = null;
		boolean asignado = false;
		int posicionConsulta = ThreadLocalRandom.current().nextInt(poolConductores.size());
		if (hayConductoresLibres() == false) {
			System.out.println("En este momento no queda ningún conductor"
							 + "disponible. Pruebe en un rato. Disculpe las molestias ");
			return conductorAsignado;
		}
		while (asignado == false) {
			if (conductorEstaOcupado(posicionConsulta) == false) {
				conductorAsignado = poolConductores.get(posicionConsulta);
				asignado = true;
				conductorAsignado.setOcupado(true);
			}
			posicionConsulta = ThreadLocalRandom.current().nextInt(poolConductores.size());
		}
		return conductorAsignado;
	}
	
	private boolean hayConductoresLibres() {
		boolean libres = false;
		for (Conductor conductor : poolConductores) {
			if (conductor.isOcupado() == false) {
				return true;
			}
		}
		return libres;
	}
	
	private boolean conductorEstaOcupado(int conductor) {
		return poolConductores.get(conductor).isOcupado();
	}
}
