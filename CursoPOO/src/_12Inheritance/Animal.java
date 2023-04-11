package _12Inheritance;

public class Animal {
	
	private double peso;
	
	public void identificar() {
		System.out.print("Soy un animal ");
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Animal(double peso) {
		this.peso = peso;
	}
	
	
	
}
