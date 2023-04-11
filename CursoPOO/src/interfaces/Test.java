package interfaces;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		Mascota m1 = new Perro();
		Mascota m2 = new Gato();
		Mascota m3 = new Pajaro();
		Perro p1 = new Perro();
		Gato g1 = new Gato();
		Pajaro pa1 = new Pajaro();
		ArrayList<Mascota> mascotas = new ArrayList<>();
		mascotas.add(new Perro());
		mascotas.add(new Gato());
		mascotas.add(new Pajaro());
		mascotas.add(m3);
		mascotas.add(m2);
		mascotas.add(m1);
		mascotas.add(p1);
		mascotas.add(g1);
		mascotas.add(pa1);
		for (Mascota m : mascotas) {
			m.darCarinio();
		}
	}
	
}
