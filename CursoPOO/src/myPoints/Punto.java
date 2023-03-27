package myPoints;

public class Punto {
	
	private int x;
	private int y;
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	// distancia = la suma de los cuadrados de las distancias de las coordenadas
	
	
	boolean lejos (Punto p) {
		
		double raiz = Math.sqrt((0 - p.x)*(0 - p.x) + (0 - p.y)*(0 - p.y));
		if (raiz > 10_000) {
			System.out.println("El punto está lejos del punto (0,0).");
			return true;
		} else {
			System.out.println("El punto no está lejos del punto (0,0).");
			return false;
		}
	}
	
	boolean lejos (Punto p1, Punto p2) {
		double raiz = Math.sqrt((p1.x - p2.x)*(p1.x - p2.x) + (p1.y - p2.y)*(p1.y - p2.y));
		if (raiz > 10_000) {
			System.out.println("Los puntos están lejos.");
			return true;
		} else {
			System.out.println("Los puntos no están lejos.");
			return false;
		}
	}
	
	public Punto (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX () {
		return x;
	}
	
	public int getY () {
		return y;
	}
	
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y = y;
	}
	
}
