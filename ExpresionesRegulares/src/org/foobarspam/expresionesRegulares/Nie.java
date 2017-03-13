package org.foobarspam.expresionesRegulares;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Nie extends IdCard {
	
	//PROPIEDADES
	private String regExp = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";
	private byte longitudNumId = 9;
	
	//CONSTRUCTOR
	public Nie() {
	}
	
	public Nie(String numeroId){
		super(numeroId);
	}
	
	//SETTER Y GETTER
	public String getRegExp() {
		return this.regExp;
	}
	public void setNumeroId(String numeroId){
		this.numeroId = numeroId;
		
	}
	
	//METODOS
	public boolean esValido() {
		Pattern pattern = 
		Pattern.compile(getRegExp());

        Matcher matcher = 
        pattern.matcher(getNumeroId());

        if (matcher.find() && getNumeroId().length() == this.longitudNumId) {
        	return true;
        }
        else {
        	return false;
        }
    }
	
}
