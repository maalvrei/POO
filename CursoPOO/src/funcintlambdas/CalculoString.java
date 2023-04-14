package funcintlambdas;

public class CalculoString {

	public boolean iguales(String cadena) {
		if (this.equals(cadena))
			return true;
		else
			return false;
	}

	public boolean contiene(String cadena, String cadena2) {
		if (cadena.contains(cadena2))
			return true;
		else
			return false;
	}
	
	public boolean numCaracteres(String cadena) {
		if (cadena.length() < 3) 
			return true;
		 else
			return false;
	}
	
	public boolean empiezaPorA(String cadena) {
		if (cadena.charAt(0) == 'A')
			return true;
		else
			return false;
	}
	
	public boolean acabaEnPunto(String cadena) {
		if (cadena.charAt(cadena.length() - 1 )== '.')
			return true;
		else
			return false;
	}
	
	public boolean empienzaEn(String cadena, char c) {
		if (cadena.charAt(0)== c)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		
	}

}
