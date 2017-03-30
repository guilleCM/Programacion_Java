package org.foobarspam.kata_numerosRomanos.conversorNumerosRomanos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class RomanNumeralsTest extends TestCase {
	RomanNumerals rNum;
	Pattern pattern;
	Matcher matcher;
	String rExpSustractivo;
	
	@Before
	public void setUp() {
		rNum = new RomanNumerals("MDCCCLXXXVIII");
		rExpSustractivo = rNum.getRegExpGrupoSustractivo();
	}
	
	@Test
	public void testEncontrarExpRegCCC() {
		pattern = Pattern.compile("C{3}");
		matcher = pattern.matcher(rNum.getRomanNumeral());
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegMDCCC() {
		pattern = Pattern.compile("M{0,2}D{1}C{0,3}");
		matcher = pattern.matcher(rNum.getRomanNumeral());
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegMDCCCXXXVIII() {
		pattern = Pattern.compile("M{0,2}D{0,1}C{0,3}X{0,3}V{0,1}I{0,3}");
		matcher = pattern.matcher(rNum.getRomanNumeral());
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegIICMVXX() {
		pattern = Pattern.compile("M{0,2}D{0,1}C{0,3}X{0,3}V{0,1}I{0,3}");
		matcher = pattern.matcher("IIIICMVXX");
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegIV() {
		pattern = Pattern.compile(rExpSustractivo);
		matcher = pattern.matcher("IV");
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegIX() {
		pattern = Pattern.compile(rExpSustractivo);
		matcher = pattern.matcher("IX");
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegCD() {
		pattern = Pattern.compile(rExpSustractivo);
		matcher = pattern.matcher("CD");
		assertTrue(matcher.find());
	}
	
	@Test
	public void testEncontrarExpRegCDIV() {
		pattern = Pattern.compile(rExpSustractivo);
		matcher = pattern.matcher("CDIV");
		short matches = 0;
		while (matcher.find()) {
			matches++;
		}
		assertTrue(matches==2);
	}
	
	@Test
	public void testEncontrarExpRegCDXXXIV() {
		pattern = Pattern.compile(rExpSustractivo);
		String numR = "CDXXXIV";
		matcher = pattern.matcher(numR);
		int m = 0;
		String r = "";
		while (matcher.find()){
			r += matcher.group();
		}
		System.out.println(matcher.replaceAll("s"));
		System.out.println(r);
	}
	
	
	@Test
	public void testCalculateSumatoryGroup() {
		String numR = "XXXII";
		int expected = 32;
		assertEquals(expected, rNum.calculateSumatoryGroup(numR));
		
		numR = "CCLXI";
		expected = 261;
		assertEquals(expected, rNum.calculateSumatoryGroup(numR));
		
		numR = "";
		expected = 0;
		assertEquals(expected, rNum.calculateSumatoryGroup(numR));
	}
	
//	@Test
//	public void testGetSustractiveGroup() {
//		String numR = "MCDXXXIV";
//		String expected = "CDIV";
//		assertEquals(expected, rNum.getSustractiveGroup(numR));
//	}
	
	@Test
	public void testCalculateSustractiveValue() {
		String numR = "IV";
		assertEquals(4, rNum.calculateSustractiveValue(numR));
		
		numR = "IX";
		assertEquals(9, rNum.calculateSustractiveValue(numR));
		
		numR = "CD";
		assertEquals(400, rNum.calculateSustractiveValue(numR));
		
		numR = "XC";
		assertEquals(90, rNum.calculateSustractiveValue(numR));
		
	}
	
	@Test
	public void testToDecimal() {
		rNum = new RomanNumerals("MCDXXXIX");
		rNum.toDecimal();
		assertEquals(1439, rNum.getDecimalNumber());
		
		rNum = new RomanNumerals("XIV");
		rNum.toDecimal();
		assertEquals(14, rNum.getDecimalNumber());

		
		rNum = new RomanNumerals("MDCCCXCIX");
		rNum.toDecimal();
		assertEquals(1899, rNum.getDecimalNumber());
		
		rNum = new RomanNumerals("DCCCLXXVIII");
		rNum.toDecimal();
		assertEquals(878, rNum.getDecimalNumber());
		
		rNum = new RomanNumerals("MXVII");
		rNum.toDecimal();
		assertEquals(1017, rNum.getDecimalNumber());

	}
	
}
