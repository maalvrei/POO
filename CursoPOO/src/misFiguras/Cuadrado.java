package misFiguras;

public class Cuadrado {
	
	private String color;
	private int lado;
	
	void setColor (String color) {
		this.color = color;
	}
	
	void setLado (int lado) {
		this.lado = lado;
	}
	
	String getColor () {
		return color;
	}
	
	int getLado () {
		return lado;
	}
	
	Cuadrado () {
		lado = 1;
	}
	
	Cuadrado (double area) {
		lado = (int) Math.sqrt(area);
	}
	
	Cuadrado (int lado) {
		this.lado = lado;
	}
	
	int calcularArea () {
		return lado*lado;
	}
	
	int calcularPerimetro () {
		return lado*4;
	}
	
	int compararAreas (Cuadrado c) {
		System.out.println("La diferencia de áreas es " + (this.calcularArea() - c.calcularArea()));
		return this.calcularArea() - c.calcularArea();
	}
	
	@Override
	public String toString () {
		return "El cuadrado es de color " + color + " y sus lados son de " + lado + ". Su área es de " + calcularArea() + " y su perímetro es de " + calcularPerimetro();
	}
	
}
