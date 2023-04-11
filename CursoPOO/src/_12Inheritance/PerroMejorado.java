package _12Inheritance;

public class PerroMejorado extends AnimalMejorado {

	public void identificar() {
		System.out.print("Soy un perro ");
	}

	public PerroMejorado(double peso) {
		super(peso);
	}
}
