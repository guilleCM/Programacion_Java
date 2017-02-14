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

}
