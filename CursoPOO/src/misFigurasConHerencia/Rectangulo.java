package misFigurasConHerencia;

public class Rectangulo extends Figura {

	private int altura;
	private int base;
	
	private Rectangulo (int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
}
