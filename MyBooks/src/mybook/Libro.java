package mybook;

public class Libro extends Publicacion {

	private String autor;
	private long libroID;
	private String mensajeCabecera = "\nDATOS LIBRO\n===========\n";

	public Libro(String titulo, String autor, int numPags, int pagInicial, double precio, boolean formatoDigital) {
		super(titulo, numPags, pagInicial, precio, formatoDigital);
		this.autor = autor;
		libroID = Publicacion.getNextID();
	}

	public void show() {
		System.out.println(mensajeCabecera);
		System.out.println("Titulo " + getTitulo() + "\nAutor: " + autor + "\nID:" + libroID + "\nPaginas: "
				+ getNumPags() + "\nPagina inicial: " + getPagInicial() + "\nPagina actual: " + getPagActual()
				+ "\nPrecio: " + getPrecio() + "\nFormato digital: " + isFormatoDigital() + "\nLeido: " + isLeido());
	}

	public static void showStatic(Libro l) {
		l.show();
	}

	@Override
	public void leePagina(boolean silenciosamente) {

		if (getPagActual() == getNumPags()) {
			if (silenciosamente == false)
				System.out.println("Libro titulado " + getTitulo() + " ya ha sido leido");
		} else if (getPagActual() == getNumPags() - 1) {
			if (silenciosamente == false) {
				System.out.println("Ultima pagina (" + getPagActual() + ") leida del libro titulado " + getTitulo()
						+ " del autor " + autor);
				setPagActual(getPagActual() + 1);
				setLeido(true);
			} else {
				setPagActual(getPagActual() + 1);
				setLeido(true);
			}
		} else {
			if (silenciosamente == false) {
				System.out.println("Pagina " + getPagActual() + " leida del libro titulado " + getTitulo()
						+ " del autor " + autor);
				setPagActual(getPagActual() + 1);
			} else
				setPagActual(getPagActual() + 1);
		}

	}

	public static void leePaginaStatic(Libro l) {
		l.leePagina(false);
	}

	public long getID() {
		return libroID;
	}
}
