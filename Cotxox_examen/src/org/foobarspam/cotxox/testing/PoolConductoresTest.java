package org.foobarspam.cotxox.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;
import org.junit.Before;
import org.junit.Test;

public class PoolConductoresTest {

	Conductor imprudente;
	Conductor prudente;
	Conductor salvaje;
	ArrayList<Conductor> pilotos = new ArrayList<>();
	PoolConductores plantilla;

	@Before
	public void setUp() {
		imprudente = new Conductor("Anakin");
		prudente = new Conductor("Obiwan");
		salvaje = new Conductor("YarYar");
		pilotos.add(imprudente);
		pilotos.add(prudente);
		pilotos.add(salvaje);
		
		plantilla = new PoolConductores(pilotos);
	}
	
	@Test
	public void testAsignarConductor() {
		System.out.println("-----TEST ELEGIDO UN CONDUCTOR ALEATORIO-----");
		Conductor obtenido = plantilla.asignarConductor();
		//Deberia aparecer un nombre distinto en cada ejecucion de manera aleatoria
		System.out.println(obtenido.getNombre());
		assertTrue(obtenido.isOcupado());
	}
	
	@Test
	public void testAsignarConductorNoDisponible() {
		System.out.println("-----TEST NO QUEDAN CONDUCTORES-----");
		Conductor ocupado = new Conductor("Nanai");
		ocupado.setOcupado(true);
		ArrayList<Conductor> vagosYocupados = new ArrayList<>();
		vagosYocupados.add(ocupado);
		
		PoolConductores vagos = new PoolConductores(vagosYocupados);
		vagos.asignarConductor();
	}

}
