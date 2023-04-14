package mybookJavi;

public class Publicacion {
	
	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int pagActual;
	private boolean leido;
	private static long nextID;
	
	public void show() {
		if (this instanceof Libro) {
			System.out.printf(Libro.getMensajeCabecera());
			System.out.printf("Titulo: %s", titulo);
			System.out.printf("Autor: %s", ((Libro)this).getAutor());
		}
		else {
			System.out.println(Revista.getMensajeCabecera());
			System.out.printf("Titulo: %s", titulo);
		}
	}
	
	public void leePagina(boolean silenciosamente) {
		if (pagActual == numPags) {
			System.out.printf("Libro titulado %s del autor %s ya ha salido leido", titulo, ((Libro)this).getAutor());
		}
	}
}
