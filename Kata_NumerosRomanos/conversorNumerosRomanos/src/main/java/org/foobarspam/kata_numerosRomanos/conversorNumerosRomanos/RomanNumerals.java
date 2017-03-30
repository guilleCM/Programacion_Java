package org.foobarspam.kata_numerosRomanos.conversorNumerosRomanos;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RomanNumerals {
	//PROPIEDADES
	private String romanNumeral = null;
	private int decimalNumber = 0;
	private String regExpGrupoSustractivo = "(C[DM])|(X[LC])|(I[VX])";
	
	//CONSTRUCTOR
	public RomanNumerals(String romanNumeral) {
		this.romanNumeral = romanNumeral;
	}
	
	//SETTERS Y GETTERS
	public void setDecimalNumber(int decimalNumber) {
		this.decimalNumber = decimalNumber;
	}
	
	public int getDecimalNumber(){
		return this.decimalNumber;
	}
	
	public String getRegExpGrupoSustractivo(){
		return this.regExpGrupoSustractivo;
	}
	
	public String getRomanNumeral() {
		return this.romanNumeral;
	}
	
	//METODOS
	public void toDecimal() {
		Pattern pattern = Pattern.compile(getRegExpGrupoSustractivo());
		Matcher matcher = pattern.matcher(getRomanNumeral());
		int decimalNumber = 0;
		while (matcher.find()) {
			decimalNumber += calculateSustractiveValue(matcher.group());
		}
		String sumatoryGroup = getRomanNumeral().replaceAll(getRegExpGrupoSustractivo(), "");
	    decimalNumber+=calculateSumatoryGroup(sumatoryGroup);
	    setDecimalNumber(decimalNumber);
	}
	
	public int calculateSustractiveValue(String group) {
		char[] groupArray = group.toCharArray();
		ArrayList<Integer> values = new ArrayList<Integer>();
		for (Character c : groupArray) {
			values.add(RomanValueNumerals.valueOf(c.toString()).getValue());
		}
		return values.get(1)-values.get(0);
	}

	public int calculateSumatoryGroup(String sumatoryGroup){
		char[] groupArray = sumatoryGroup.toCharArray();
		int total = 0;
		for (Character c : groupArray) {
			total += RomanValueNumerals.valueOf(c.toString()).getValue();
		}
		return total;
	}

	//METODO PARA TESTEAR QUE EL GRUPO SUSTRACTIVO ERA CORRECTO
//	public String getSustractiveGroup(String numR) {
//		Pattern pattern = Pattern.compile(getRegExpGrupoSustractivo());
//		Matcher matcher = pattern.matcher(numR);
//		String sustGroup = "";
//		while (matcher.find()){
//			sustGroup += matcher.group();
//			numR = numR.replace(matcher.group(), "");
//			System.out.println(numR);
//		}
//		return sustGroup;
//	}
	
}
