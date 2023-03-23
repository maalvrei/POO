package clase22032023;

public class Rectangulo {

	public String color;
	public double base;
	public double altura;

	public Rectangulo() {
		base = 1;
		altura = 1;
		color = "blanco";
	}

	public Rectangulo(String color, double base, double altura) {
		this.color = color;
		this.base = base;
		this.altura = altura;
	}

	public Rectangulo(double lado, String color) {
		this.color = color;
		altura = lado;
		base = lado;
	}

	public Rectangulo(double lado) {
		altura = lado;
		base = lado;
		color = "blanco";
	}

	public void datosEnCadena() {
		System.out.println("El color del rectangulo es: " + color + "\nLa base del rectangulo es: " + base
				+ "\nLa altura del rectangulo es: " + altura + "\nLa superficie de rectangulo es: " + superficie());
	}

	public double superficie() {
		return base * altura;
	}

	public static void main(String args[]) {
		Rectangulo r1 = new Rectangulo();
		r1.color = "azul";
		r1.base = 5;
		r1.altura = 8;
		Rectangulo r2 = new Rectangulo("rojo", 4, 5);
		Rectangulo r3 = new Rectangulo(4, "negro");
		Rectangulo r4 = new Rectangulo(6);
		Rectangulo r5 = new Rectangulo();
		r1.datosEnCadena();
		r2.datosEnCadena();
		r3.datosEnCadena();
		r4.datosEnCadena();
		r5.datosEnCadena();
	}

}
