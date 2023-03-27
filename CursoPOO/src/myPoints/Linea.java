package myPoints;

public class Linea {

	private Punto puntoInicial;
	private Punto puntoFinal;

	public String toString() {
		String cadena = "Punto inicial: (" + puntoInicial.getX() + "," + puntoInicial.getY() + ")" + "\n"
				+ "Punto final: (" + puntoFinal.getX() + "," + puntoFinal.getY() + ")";
		System.out.println(cadena);
		return cadena;
	}
	
	public Linea (Punto puntoInicial, Punto puntoFinal) {
		this.puntoInicial = puntoInicial;
		this.puntoFinal = puntoFinal;
	}
	
	public Linea (int puntoInicialX, int puntoInicialY, int puntoFinalX, int puntoFinalY) {
		puntoInicial.setX(puntoInicialX);
		puntoInicial.setY(puntoInicialY);
		puntoFinal.setX(puntoFinalX);
		puntoFinal.setY(puntoFinalY);
	}
	
	void invierte() {
		int xPuntoInicial = puntoInicial.getX();
		int yPuntoInicial = puntoInicial.getY();
		int xPuntoFinal = puntoFinal.getX();
		int yPuntoFinal = puntoFinal.getY();
		puntoInicial.setX(xPuntoFinal);
		puntoInicial.setY(yPuntoFinal);
		puntoFinal.setX(xPuntoInicial);
		puntoFinal.setY(yPuntoInicial);
	}
	
	

}
