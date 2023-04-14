package mybookJavi;

public class Libro extends Publicacion {
	
	private String autor;
	private static String mensajeCabecera = "\nDATOS LIBRO\n=============\n";
	
	public static String getMensajeCabecera() {
		return mensajeCabecera;
	}

	public String getAutor() {
		return autor;
	}
	
}
