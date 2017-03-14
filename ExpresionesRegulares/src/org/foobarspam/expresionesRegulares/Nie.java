package org.foobarspam.expresionesRegulares;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Nie extends IdCard {
	
	//PROPIEDADES
	private String regExp = "\\b[XYZ]\\d{7}[A-Z&&[^IÑOU]]\\b";
	private byte longitudNumId = 9;
	private char[] valoresLetraInicial = {'X', 'Y', 'Z'};
	
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
	public char[] getValoresLetraInicial() {
		return this.valoresLetraInicial;
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
		if(tieneFormatoValido()) {
			String cadenaParteNumerica = "";
			char letraControl = getNumeroId().charAt(8);
			char letraInicial = getNumeroId().charAt(0);
			for (int i = 0; i < getValoresLetraInicial().length; i++) {
				if (letraInicial == getValoresLetraInicial()[i]) {
					cadenaParteNumerica = getNumeroId().replace(letraInicial, Integer.toString(i).charAt(0));
					break;
				}
			}
			int parteNumerica = Integer.parseInt(cadenaParteNumerica.substring(0, 8));
			int indice = parteNumerica%23;
			char letraCorrespondiente = getTablaAsignacion()[indice];
			if (letraControl == letraCorrespondiente) {
				return true;
			}
		}
		return false;
	}
	
}
