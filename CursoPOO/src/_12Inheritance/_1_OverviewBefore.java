package _12Inheritance;

public class _1_OverviewBefore {
	
	public static void main(String[] args) {
		
		Animal a = new Animal(250);
		Gato g = new Gato(6);
		Perro p = new Perro(40.5);
		a.identificar();
		System.out.print("y peso " + a.getPeso() + "kg\n");
		p.identificar();
		System.out.print("y peso " + p.getPeso() + "kg\n");
		g.identificar();
		System.out.print("y peso " + g.getPeso() + "kg\n");
		
		
	}
	
}
