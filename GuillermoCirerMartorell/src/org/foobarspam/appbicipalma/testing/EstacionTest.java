package org.foobarspam.appbicipalma.testing;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.foobarspam.appbicipalma.bicicleta.Bicicleta;
import org.foobarspam.appbicipalma.estacion.Estacion;
import org.foobarspam.appbicipalma.tarjetausuario.TarjetaUsuario;
import org.junit.Test;

public class EstacionTest {
	
	@Test
	public void testVisualizarEstadoEstacion() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		/* caso TEST visualizar estado de la estacion 
		 * muestra id, direccion, anclaje
		 */
		String mensajeEsperado = "id: 1\ndireccion: Manacor\nnumeroAnclajes: 6\n";
		//assertEquals(System.out.println(mensajeEsperado), System.out.println(estacion.consultarAnclajes()));
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
		assertEquals(291, estacion.getAnclajes()[0].getId());
		assertEquals(null, estacion.getAnclajes()[1]);
		assertEquals(null, estacion.getAnclajes()[5]);
		bicicleta = new Bicicleta(292);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(293);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(294);
		estacion.anclarBicicleta(bicicleta);
		assertEquals(2, estacion.anclajesLibres());
	}
	
	@Test
	public void testConsultarAnclajes() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		Bicicleta bicicleta = new Bicicleta(291);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(292);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(293);
		estacion.anclarBicicleta(bicicleta);
		bicicleta = new Bicicleta(294);
		estacion.anclarBicicleta(bicicleta);
		String esperado = "Anclaje 1 291\n"
						+ "Anclaje 2 292\n"
						+ "Anclaje 3 293\n"
						+ "Anclaje 4 294\n"
						+ "Anclaje 5  libre\n"
						+ "Anclaje 6  libre\n";
//		assertEquals(esperado, estacion.consultarAnclajes());
	}
	
	@Test
	public void testLeerTarjetaUsuario() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		TarjetaUsuario tarjeta = new TarjetaUsuario("000456789", true);
		assertEquals("true", estacion.leerTarjetaUsuario(tarjeta));
		tarjeta = new TarjetaUsuario();
		assertEquals("false", estacion.leerTarjetaUsuario(tarjeta));
	}
	
	@Test
	public void testMostrarBicicleta() {
		Estacion estacion = new Estacion(1, "Manacor", 6);
		Bicicleta bicicleta = new Bicicleta(291);
		estacion.anclarBicicleta(bicicleta);
		String esperado = "bicicleta retirada: 291 del anclaje: 1";
		assertEquals(esperado, estacion.mostrarBicicleta(bicicleta, 0));
	}
}
