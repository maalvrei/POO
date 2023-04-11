package interfaces;

public class Perro extends Animal implements Mascota {

	@Override
	public void darCarinio() {
		System.out.println("Guau, guau");
	}

}
