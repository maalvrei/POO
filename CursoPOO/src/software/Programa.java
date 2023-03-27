package software;

import clases.Figura;

public class Programa {
	
	public static void main(String[] args) {
		Figura f1 = new Figura();
		Figura f2 = new Figura("Rectángulo");
		Figura f3 = new Figura(f2);
		f1.setTipo("Redondel");
	}
	
}
