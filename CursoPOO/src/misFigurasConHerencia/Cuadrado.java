package misFigurasConHerencia;

public class Cuadrado extends Figura {

	private int lado;
	private static String nombreES = "cuadrado";
	private Cuadrado (String color, int lado) {
		super(color);
		this.lado = lado;
	}
	
	public Cuadrado () {
		this("blanco", 1);
	}
	
	public Cuadrado (int lado) {
		this("blanco", lado);
	}
	
	@Override
	public String toString() {
		return super.toString() + " de tipo " + Cuadrado.nombreES + " de " + lado + " x " + lado ;
	}
	
	public int getLado() {
		return lado;
	}
	
	public long perimetro() {
		return 4*(long)lado;
	}
	
	public long area() {
		return (long)lado*lado;
	}
	
	public boolean comparaAreas(Cuadrado c) {
		return this.area() == c.area();
	}
	
}
