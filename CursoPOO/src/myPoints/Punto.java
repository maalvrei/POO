package myPoints;

public class Punto {
	
	private int x;
	private int y;
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// distancia = la suma de los cuadrados de las distancias de las coordenadas
	
	
	boolean lejos (Punto p) {
		if ((p.x - 0) + (p.y -0) > 10_000) {
			return true;
		} else {
			return false;
		}
	}
	
	static boolean lejos (Punto p1, Punto p2) {
		return true;
	}
	
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}
