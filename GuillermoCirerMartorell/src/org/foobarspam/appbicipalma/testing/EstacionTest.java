package org.foobarspam.appbicipalma.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.appbicipalma.bicicleta.Bicicleta;
import org.foobarspam.appbicipalma.estacion.Estacion;
import org.junit.Test;

public class EstacionTest {
	
	@Test
	public void testVisualizarEstadoEstacion() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		/* caso TEST visualizar estado de la estacion 
		 * muestra id, direccion, anclaje
		 */
		String mensajeEsperado = "id: 1\ndireccion: Manacor\nnumeroAnclajes: 6\n";
		assertEquals(mensajeEsperado, estacion.consultarEstacion());
	}
	
	@Test
	public void testVisualizarAnclajesLibres() {
		/* caso TEST visualizar anclajes libres */	
		Estacion estacion = new Estacion(1, "Manacor", 6);
		assertEquals(6, estacion.anclajesLibres());
	}

	@Test
	public void testAnclarBicicleta() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		Bicicleta bicicleta = new Bicicleta(291);
		estacion.anclarBicicleta(bicicleta);
		assertEquals(291, estacion.getAnclajes()[0]);
		assertEquals(0, estacion.getAnclajes()[1]);
		assertEquals(0, estacion.getAnclajes()[5]);
		bicicleta = new Bicicleta(292);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(293);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(294);
		estacion.anclarBicicleta(bicicleta);

	}
	
}
