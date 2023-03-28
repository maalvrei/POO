package misFiguras;

public class Rectangulo {
	
	private String color;
	private int base;
	private int altura;
	
	public String getColor () {
		return color;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	public int base () {
		return base;
	}
	
	public void setBase (int base) {
		this.base = base;
	}
	
	public int altura () {
		return altura;
	}
	
	public void setAltura (int altura) {
		this.altura = altura;
	}
	
	public Rectangulo (int base, int altura) {
		this.base = base;
		this.altura = altura;
		color = "green";
	}
	
	public Rectangulo () {
		base = 2;
		altura = 1;
		color = "green";
	}
	
	long perimetro () {
		return (long)(2*base + 2*altura);
	}
	
	long area () {
		return (long) (base*altura);
	}
	
	boolean compararAreas (Rectangulo r) {
		if (this.area() == r.area()) {
			System.out.println("Tienen areas iguales");
			return true;
		} else {
			System.out.println("No tienen el mismo area");
			return false;
		}
	}
	
	
	
	
	
}
