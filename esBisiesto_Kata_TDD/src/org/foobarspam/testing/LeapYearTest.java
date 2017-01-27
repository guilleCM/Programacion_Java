package org.foobarspam.testing;

import static org.junit.Assert.*;

import org.foobarspam.LeapYear.LeapYear;
import org.junit.Test;

public class LeapYearTest {
	
	LeapYear inyector = new LeapYear();
	
	@Test
	public void test_isLeapYear_defensiveConstructor() {
		assertEquals("Estamos en 2017?", 2017, inyector.getYear());
		assertEquals("2017 no es bisiesto",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_one() {
		inyector.setYear(1551);
		assertEquals("Numero acabado en 1",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_two() {
		inyector.setYear(1322);
		assertEquals("Numero acabado en 2",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_three() {
		inyector.setYear(4253);
		assertEquals("Numero acabado en 3",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_four() {
		inyector.setYear(1384);
		assertEquals("Numero acabado en 4",true, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_five() {
		inyector.setYear(1785);
		assertEquals("Numero acabado en 5",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_six() {
		inyector.setYear(9766);
		assertEquals("Numero acabado en 6",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_seven() {
		inyector.setYear(5557);
		assertEquals("Numero acabado en 7",false, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_eight() {
		inyector.setYear(3548);
		assertEquals("Numero acabado en 8",true, inyector.isLeapYear());
	}
	
	@Test
	public void test_isLeapYear_nine() {
		inyector.setYear(1999);
		assertEquals("Numero acabado en 9",false, inyector.isLeapYear());
	}

}
