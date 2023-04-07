package misFigurasConHerencia;

public class Test {
	
	public static void main(String[] args) {
		Figura f1 = new Figura("Verde");
		Figura.getNextID();
		f1.getNextIDNoStatic();
		f1.getNextID();
	}
	
	
	
}
