package clases;

public class Figura {
	
	String tipo;
	
	public Figura () {
		tipo = "Cuadrado";
	}
	
	public Figura (String tipo) {
		this.tipo = tipo;
	}
	
	public Figura (Figura g) {
		this.tipo = g.tipo;
	}
	
	public String saluda () {
		System.out.println("Hola, soy un " + tipo);
		return "Hola, soy un " + tipo;
	}
	
	public String despide () {
		System.out.println("Adiós, soy un " + tipo);
		return "Adiós, soy un " + tipo;
	}
	
	public void setTipo (String tipo) {
		tipo = tipo.toLowerCase(); 
	}
	
}
