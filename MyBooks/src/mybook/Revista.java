package mybook;

public class Revista extends Publicacion {

	private long revistaID;
	private static String mensajeCabecera = "\nDATOS REVISTA\n=============\n";

	public Revista(String titulo, int numPags, int pagInicial, boolean formatoDigital, double precio) {
		super(titulo, numPags, pagInicial, precio, formatoDigital);
		revistaID = Publicacion.getNextID();
	}

	public void show() {
		System.out.println(mensajeCabecera);
		System.out.println("Titulo " + getTitulo() + "\nID:" + revistaID + "\nPaginas: " + getNumPags()
				+ "\nPagina actual: " + getPagActual() + "\nPrecio: " + getPrecio() + "\nFormato digital: "
				+ isFormatoDigital() + "\nLeido: " + isLeido());
	}
	
	public static void showStatic(Revista r) {
		r.show();
	}
	
	@Override
	public void leePagina(boolean silenciosamente) {
		if (getPagActual() == getNumPags()) {
			System.out.println("Revista titulada " + getTitulo() + " ya ha sido leída");
		} else if (getPagActual() == getNumPags() - 1) {
			System.out.println("Ultima pagina (" + getPagActual() + ") leida de la revista titulada " + getTitulo());
			setPagActual(getPagActual() + 1);
			setLeido(true);
		} else {
			System.out.println("Pagina " + getPagActual() + " leida de la revista titulada " + getTitulo());
			setPagActual(getPagActual() + 1);
		}

	}
	
	public static void leePaginaStatic(Revista r) {
		r.leePagina(false);
	}
	
	
	public long getID() {
		return revistaID;
	}
}
