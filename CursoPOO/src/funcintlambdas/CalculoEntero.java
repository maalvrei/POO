package funcintlambdas;

public class CalculoEntero {
	
	public int cuadrado (int i) {
		return i*i;
	}
	
	public int cubo (int i) {
		return i*i*i;
	}
	
	public int doble (int i) {
		return i*2;
	}
	
	public int triple (int i) {
		return i*3;
	}
	
	public int polinomio (int i) {
		return i * cubo(i) + 7 * cuadrado(i) + 9;
	}
	
	public int polinomioVariable (int x, int a, int b, int c) {
		return a * x * x * x + b* x * x + c; 
	}
	
	public static void main(String[] args) {
		
		CalculoEntero ce = new CalculoEntero();
		OperaIntDevuelveInt cuadrado = j -> j * j;
		OperaIntDevuelveInt cubo = j -> j*j*j;
		OperaIntDevuelveInt doble = j -> j*2;
		OperaIntDevuelveInt triple = j -> j*3;
		OperaIntDevuelveInt polinomio = j -> j + j*j*j + 7 * j*j* + 9;
		System.out.printf("Cuadrado: %d%n", cuadrado.actua(7));
		System.out.printf("Cubo: %d%n", cubo.actua(7));
		System.out.printf("Doble: %d%n", doble.actua(7));
		System.out.printf("Triple: %d%n", triple.actua(7));
		System.out.printf("Polinomio: %d%n", polinomio.actua(7));
		OperaIntDevuelveInt2 polinomioVariable = (i, a, e, o) -> i * a * a * a + e* a * a + o;
		
		
	}
}
