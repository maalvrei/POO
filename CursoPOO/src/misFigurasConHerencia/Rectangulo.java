package misFigurasConHerencia;

public class Rectangulo extends Figura {

	private int altura;
	private int base;
	
	private Rectangulo (int base, int altura, String color) {
		super(color);
		this.base = base;
		this.altura = altura;
	}
	
	public int getBase() {
		return base;
	}
	
	public int getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return super.toString() + " de tipo rectangulo de base " + base + " y de altura " + altura;
	}
	
	public long perimetro() {
		return 2*(long)base + 2L * altura;
	}
}
