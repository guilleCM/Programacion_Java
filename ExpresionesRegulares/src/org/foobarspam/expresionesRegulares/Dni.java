package org.foobarspam.expresionesRegulares;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Dni extends IdCard{
	//PROPIEDADES
	private String regExp = "\\b\\d{8}[A-Z&&[^IÑOU]]\\b";
	private byte longitudNumId = 9;
	
	//CONSTRUCTOR
	public Dni() {
	}
	
	public Dni(String numeroId){
		super(numeroId);
	}
	//prueba
	
	//SETTER Y GETTER
	public String getRegExp() {
		return this.regExp;
	}
	public void setNumeroId(String numeroId){
		this.numeroId = numeroId;
	}
	//METODOS
	public boolean tieneFormatoValido() {
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
	
	public boolean tieneLetraCorrecta() {
		if(tieneFormatoValido()){
			int parteNumerica = Integer.parseInt(getNumeroId().substring(0, 8));
			char letraControl = getNumeroId().charAt(8);
			int indice = parteNumerica%23;
			char letraCorrespondiente = getTablaAsignacion()[indice];
			if (letraControl == letraCorrespondiente) {
				return true;
			}
		}
		return false;
	}
	
}
