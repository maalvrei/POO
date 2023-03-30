package misFigurasConHerencia;

public class Circulo extends Figura {

	private static String nombreSP = "zirkulo";
	
	private int radio;
	
	private Circulo (int radio, String color) {
		super(color);
		this.radio = radio;
	}
	
	public int getRadio () {
		return radio;
	}
	
	@Override
	public String toString() {
		return super.toString() + " de tipo " + nombreSP + " de radio " + radio;
	}
	
}
