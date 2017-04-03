package org.foobarspam.kata_numerosRomanos.conversorNumerosRomanos;

public class MainProgram {
	
	
	public static void main(String[] args) {
		
		RomanNumerals rNum;
		String[] romNumberGroup = {"XI", "XVII", "CLIX", "MCDXXXIX", "MMXVII", "MMCDXLIX", "MDCCXLIX",
				"MMDCXLIV"};
		
		for(int i = 0; i < romNumberGroup.length; i++){
			rNum = new RomanNumerals(romNumberGroup[i]);
			rNum.toDecimal();
			System.out.println("El numero romano " + rNum.getRomanNumeral() + " en decimal es: "
					+ rNum.getDecimalNumber());
		}
		
	}

}
