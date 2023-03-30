package misFigurasConHerencia;

public class Figura {
	
	private String color;
	private static int nextID = 0;
	private int id;
	
	public Figura (String color) {
		this.color = color;
		this.id = nextID;
		Figura.nextID++;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public int getId() {
		return id;
	}
	
	public static int getNextID() {
		return nextID;
	}
	
	public int getNextIDNoStatic() {
		int i = nextID;
		return i;
	}
	
	public String toString() {
		return "Figura de color " + color;
	}
	
	public static void main(String[] args) {
		Figura f1 = new Figura("Rojo");
		System.out.println(f1.getNextIDNoStatic());
	}
	
}
