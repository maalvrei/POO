package _12Inheritance;

public class GatoMejorado extends AnimalMejorado {
	
	public void identificar() {
		System.out.print("Soy un gato ");
	}

	public GatoMejorado(double peso) {
		super(peso);
	}
}
