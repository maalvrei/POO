package _12Inheritance;

public class OsoMejorado extends AnimalMejorado {
	
	public void identificar() {
		System.out.print("Soy un perro ");
	}

	public OsoMejorado(double peso) {
		super(peso);
	}
	
	void rugir(byte n) {
		for (byte i = n ;  i>=0 ; i--) {
			System.out.println("Grrr");
		}
	}
	
	
}
