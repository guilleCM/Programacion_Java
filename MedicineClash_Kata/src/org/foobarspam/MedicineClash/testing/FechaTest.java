package org.foobarspam.MedicineClash.testing;

import static org.junit.Assert.*;

import org.foobarspam.MedicineClash.fecha.Fecha;
import org.junit.Test;

public class FechaTest {

	@Test
	public void testGetCurrentDate() {
		Fecha date1 = new Fecha(1, 1, 2017);
		int[] expected = {1, 1, 2017};
		assertArrayEquals(expected, date1.getCurrentDate());
	}
	
	@Test
	public void testSetCurrentDate() {
		Fecha date1 = new Fecha();
		date1.setDate(35, 40, 1900);
		int[] expected = {1, 1, 1900};
		assertArrayEquals(expected, date1.getCurrentDate());
		
		Fecha date2 = new Fecha();
		date2.setDate(2, 3, 2000);
		expected = new int[] {2, 3, 2000};
		assertArrayEquals(expected, date2.getCurrentDate());
		
		date2.setDate(1, 1, 2017);
		expected = new int[] {1, 1, 2017};
		assertArrayEquals(expected, date2.getCurrentDate());

		date2.setDate(100, 13, 2017);
		//no cumple precondicion => tomara valores por defecto
		expected = new int[] {1, 1, 2017};
		assertArrayEquals(expected, date2.getCurrentDate());
		
		//no cumple precondicion ==> tomara valores por defecto
		date2.setDate(31, 2, 2017);
		expected = new int[] {1, 1, 2017};
		assertArrayEquals(expected, date2.getCurrentDate());
		
		Fecha date3 = new Fecha();
		date3.setDate(2, 3, 1900);
		expected = new int[] {2, 3, 1900};
		assertArrayEquals(expected, date3.getCurrentDate());
		
	}
	
	@Test
	public void testIsIn() {
		Fecha date1 = new Fecha();
		int[] thirtyOneDaysMonth = {1,3,5,7,8,10,12};
		int[] thirtyDaysMonth = {4, 6, 9, 11};
		assertTrue(date1.isIn(3, thirtyOneDaysMonth));
		assertFalse(date1.isIn(3, thirtyDaysMonth));
	}
	
	@Test
	public void testIncrementarFecha() {
		Fecha date1 = new Fecha(1, 1, 2017);
		date1.incrementarFecha(10);
		int[] expected = {11, 1, 2017};
		assertArrayEquals(expected, date1.getCurrentDate());
		
		date1.incrementarFecha(30);
		expected = new int[] {10, 2, 2017};
		assertArrayEquals(expected, date1.getCurrentDate());

		date1.incrementarFecha(40);
		expected = new int[] {22, 3, 2017};
		assertArrayEquals(expected, date1.getCurrentDate());
		
		date1.incrementarFecha(150);
		expected = new int[] {19, 8, 2017};
		assertArrayEquals(expected, date1.getCurrentDate());
		
		date1.incrementarFecha(365);
		expected = new int[] {19, 8, 2018};
		assertArrayEquals(expected, date1.getCurrentDate());
	}

	@Test
	public void testImprimirFecha() {
		Fecha date1 = new Fecha(1, 1, 2017);
		date1.imprimirFecha();
		//==> Tiene que imprimir: 1-Enero-2017
		
		date1 = new Fecha(28, 2, 2000);
		date1.imprimirFecha();
		//==> Tiene que imprimir: 28-Febrero-2000
		
		date1 = new Fecha(12, 10, 2015);
		date1.imprimirFecha();
		//==> Tiene que imprimir: 12-Octubre-2015
		
		date1 = new Fecha(17, 6, 1993);
		date1.imprimirFecha();
		//==> Tiene que imprimir: 17-Junio-1993
	}
	
	@Test
	public void testGetFecha() {
		Fecha date1 = new Fecha(1, 1, 2017);
		assertEquals("1-Enero-2017", date1.getFecha());
	}
	
}
