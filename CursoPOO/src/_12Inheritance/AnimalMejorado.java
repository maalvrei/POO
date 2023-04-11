package _12Inheritance;

public class AnimalMejorado {
	
	protected double peso;
	
	public void identificar() {
		System.out.print("Soy un animal ");
	}

	public AnimalMejorado(double peso) {
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
}
