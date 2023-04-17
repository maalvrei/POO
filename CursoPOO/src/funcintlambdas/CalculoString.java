package funcintlambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class CalculoString {

	public boolean iguales(String cadena1, String cadena2) {
		if (cadena1.equals(cadena2))
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
	
	static String[] llenaArrayConFiltro (String[] arr, IF2cadenas2 miInterfaz) {
		
		ArrayList<String> arrL = new ArrayList<String>();
		
		for (String elemento : arr) {
			if (miInterfaz.actua(elemento))
				arrL.add(elemento);
		}
		
		String[] array = arrL.toArray(new String[0]);
		
		return array;
	}
	
	public static void imprimeArray(String [] arr) {
		for (String s : arr) {
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		IF2cadenas iguales = (cadena1, cadena2) -> cadena1.equals(cadena2);
		IF2cadenas contiene = (cadena1, cadena2) -> cadena1.contains(cadena2);
		IF2cadenas2 numCaracteres = cadena -> cadena.length() < 3;
		IF2cadenas2 empiezaPorA = cadena -> cadena.charAt(0) == 'A';
		IF2cadenas2 acabaEnPunto = cadena -> cadena.charAt(cadena.length() - 1) == '.';
		IF2cadenas3 empiezaEn = (cadena, c) -> cadena.charAt(0) == c;
		// probamos iguales
		System.out.println(iguales.actua("hola", "hola"));
		// probamos contiene
		System.out.println(contiene.actua("hola a todos", "todos"));
		// probamos numCaracteres
		System.out.println(numCaracteres.actua("ok"));
		// probamos empiezaPorA
		System.out.println(empiezaPorA.actua("A ver si os calláis"));
		// probamos acabaEnPunto
		System.out.println(acabaEnPunto.actua("mi casa."));
		// probamos empieza en
		System.out.println(empiezaEn.actua("Hola a todos", 'H'));
		
		String [] arr1 = {"Adios", "Amigos", "os amo", "Aloha"};
		
		String[] arrayLlenado = llenaArrayConFiltro(arr1, empiezaPorA);
		
		imprimeArray(arrayLlenado);
	}

}
