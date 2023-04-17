package funcintlambdas;

public class CalculoEnteroDouble {
	
	static int suma (int[] arr, OperaEnteroDevuelveBoolean filtro) {
		
		int suma = 0;
		for (int entero : arr) {
			if (filtro.actua(entero))
				suma+=entero;
		}
		return suma;
		
	}
	
	

	public static void main(String[] args) {
		
		OperaEnteroDevuelveDouble mitad = i -> i/2;
		OperaEnteroDevuelveDouble cuartaParte = i -> i/4;
		OperaEnteroDevuelveDouble decimaParte = i -> i/10;
		OperaDosEnterosDevuelveDouble enesimaParte = (i,a) -> i/a;
		
		int[] miArray = {1,2,3,4,5,6,7,8,9,10};
		int resultado = suma(miArray, i-> false);
		System.out.println(resultado);
		
	}
	
}
