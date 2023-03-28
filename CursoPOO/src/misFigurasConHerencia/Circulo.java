package misFigurasConHerencia;

public class Circulo extends Figura {

	private int radio;
	
	private Circulo (int radio, String color) {
		super(color);
		this.radio = radio;
	}
	
}
