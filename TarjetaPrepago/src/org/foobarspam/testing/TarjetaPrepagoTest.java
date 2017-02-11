package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.Dni.Dni;
import org.foobarspam.TarjetaPrepago.TarjetaPrepago;
import org.junit.Before;
import org.junit.Test;

public class TarjetaPrepagoTest {
	
	Dni dni;
	TarjetaPrepago tarjeta;

	@Before
	public void setUp() {
		dni = new Dni("84868309B");
		tarjeta = new TarjetaPrepago("7389422113", dni, 12.5);
	}
	
	@Test
	public void testIngresarSaldo() {
		assertEquals(12.5, tarjeta.getSaldo(), 0);
		tarjeta.ingresarSaldo(10);
		assertEquals(22.5, tarjeta.getSaldo(), 0);
	}
	
	@Test
	public void testEnviarMensaje() {
		tarjeta.enviarMensaje(1);
		assertEquals(12.41, tarjeta.getSaldo(), 0);
		tarjeta.enviarMensaje(0);
		assertEquals(12.41, tarjeta.getSaldo(), 0);
		tarjeta.enviarMensaje(100);
		assertEquals(3.41, tarjeta.getSaldo(), 0);
	}
	
	@Test
	public void testRealizarLlamada() {
		/*realizarLlamada(): recibe un entero que representa el
		 *número de segundos hablados. Se restará al saldo la 
		 *cantidad correspondiente calculada en base a 15 céntimos
		 *por establecimiento de llamada y 1 céntimo por segundo. 
		 *También se actualizará la propiedad consumo.
		 */
		tarjeta.realizarLlamada(10);
		//checkeamos que se descuenta bien el saldo
		assertEquals(12.25, tarjeta.getSaldo(), 0);
		//checkeamos que se actualiza bien el consumo
		assertEquals("00:00:10", tarjeta.getConsumo().imprimirHora());
		tarjeta.realizarLlamada(110);
		//checkeamos que se descuenta bien el saldo
		assertEquals(11, tarjeta.getSaldo(), 0);
		assertEquals("00:02:00", tarjeta.getConsumo().imprimirHora());
		tarjeta.realizarLlamada(7200);
		assertEquals("02:02:00", tarjeta.getConsumo().imprimirHora());
		tarjeta.realizarLlamada(7220);;
		assertEquals("04:02:20", tarjeta.getConsumo().imprimirHora());
	}
	
	@Test
	public void testConsultarTarjeta() {
		/*CASO TEST 1: esperado por consola ==>
		  Número de teléfono: 7389422113
		  DNI asociado: 84868309B
	      Saldo disponible: 12.5
		  Consumo utilizado: 00:00:00
		  */
		tarjeta.consultarTarjeta();
		/*CASO TEST 2: esperado por consola ==>
		  Número de teléfono: 7389422113
		  DNI asociado: 84868309B
	      Saldo disponible: 15.13
		  Consumo utilizado: 06:02:02
		  */		
		tarjeta.ingresarSaldo(220);
		tarjeta.realizarLlamada(21722);
		tarjeta.consultarTarjeta();
	}
}
