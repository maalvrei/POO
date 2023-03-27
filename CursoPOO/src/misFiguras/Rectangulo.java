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
	
	
	
}
