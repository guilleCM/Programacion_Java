package org.foobarspam.appbicipalma.testing;

import static org.junit.Assert.*;

import org.foobarspam.appbicipalma.bicicleta.Bicicleta;
import org.foobarspam.appbicipalma.estacion.Estacion;
import org.foobarspam.appbicipalma.tarjetausuario.TarjetaUsuario;
import org.junit.Before;
import org.junit.Test;

public class EstacionTest {
	
	Estacion estacion;
	Bicicleta bicicleta, bicicleta2, bicicleta3, bicicleta4;
	TarjetaUsuario tarjetaEstandar, tarjetaPepito, tarjetaNoValida;
		
	@Before
	public void setUp() {
		estacion = new Estacion(1, "Manacor", 6);
		bicicleta = new Bicicleta(291);
		bicicleta2 = new Bicicleta(292);
		bicicleta3 = new Bicicleta(293);
		bicicleta4 = new Bicicleta(294);
		tarjetaEstandar = new TarjetaUsuario("000456789", true);
		tarjetaPepito = new TarjetaUsuario("pepito", true);
		tarjetaNoValida = new TarjetaUsuario("intruso", false);
	}
	
	@Test
	public void testVisualizarEstadoEstacion() {
		System.out.println("----TEST VISUALIZAR ESTACION----");
		/* caso TEST visualizar estado de la estacion 
		 * muestra id, direccion, anclaje
		 */
		//SE ESPERA: 	id: 1 
		//				direccion: Manacor
		//				numeroAnclajes: 6";
		estacion.consultarEstacion();
	}
	
	@Test
	public void testVisualizarAnclajesLibres() {
		/* caso TEST visualizar anclajes libres */	
		assertEquals(6, estacion.anclajesLibres());
	}

	@Test
	public void testAnclarBicicleta() {
		System.out.println("----TEST ANCLAR BICICLETA----");
		estacion.anclarBicicleta(bicicleta);
		assertEquals(291, estacion.getAnclajes()[0].getId());
		assertEquals(null, estacion.getAnclajes()[1]);
		assertEquals(null, estacion.getAnclajes()[5]);
		estacion.anclarBicicleta(bicicleta2);
		estacion.anclarBicicleta(bicicleta3);
		estacion.anclarBicicleta(bicicleta4);
		assertEquals(2, estacion.anclajesLibres());
	}
	
	@Test
	public void testConsultarAnclajes() {
		System.out.println("----TEST CONSULTAR ANCLAJES----");
		estacion.anclarBicicleta(bicicleta);
		estacion.anclarBicicleta(bicicleta2);
		estacion.anclarBicicleta(bicicleta3);
		estacion.anclarBicicleta(bicicleta4);
//		SE ESPERA   Anclaje 1 291
//					Anclaje 2 292
//					Anclaje 3 293
//					Anclaje 4 294
//					Anclaje 5  libre
//					Anclaje 6  libre
		estacion.consultarAnclajes();
	}
	
	@Test
	public void testLeerTarjetaUsuario() {
		assertEquals("true", estacion.leerTarjetaUsuario(tarjetaEstandar));
		assertEquals("false", estacion.leerTarjetaUsuario(tarjetaNoValida));
	}
	
	@Test
	public void testMostrarBicicleta() {
		System.out.println("----TEST MOSTRAR BICICLETA----");
		estacion.anclarBicicleta(bicicleta);
		//MENSAJE ESPERADO: "bicicleta retirada: 291 del anclaje: 1";
		estacion.retirarBicicleta(tarjetaPepito);
	}
	
	@Test
	public void testRetirarBicicleta() {
		System.out.println("----TEST RETIRAR BICICLETA----");
		estacion.retirarBicicleta(tarjetaPepito);
		//==> "No quedan bicicletas disponibles"
		estacion.anclarBicicleta(bicicleta);
		//==> "bicicleta: 291 anclada en el anclaje: 1"
		bicicleta = new Bicicleta(292);
		estacion.anclarBicicleta(bicicleta2);
		//==> "bicicleta: 292 anclada en el anclaje: 2"
		estacion.retirarBicicleta(tarjetaPepito);
		//==> "bicicleta retirada: RANDOM(291 o 292) del anclaje: (1 o 2)"
	}
}
