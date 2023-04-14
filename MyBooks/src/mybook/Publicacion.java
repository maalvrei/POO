package mybook;

public abstract class Publicacion implements CanRead {
	
	private String titulo;
	private int numPags;
	private int pagInicial;
	private boolean formatoDigital;
	private double precio;
	private int pagActual;
	private boolean leido;
	private static long nextID;
	
	public Publicacion (String titulo, int numPags, int pagInicial, double precio, boolean formatoDigital) {
		this.titulo = titulo;
		this.numPags = numPags;
		this.pagInicial = pagInicial;
		this.pagActual = pagInicial;
		this.precio = precio;
		this.formatoDigital = formatoDigital;
		nextID += 1;
	}

	public int getPagActual() {
		return pagActual;
	}

	public void setPagActual(int pagActual) {
		this.pagActual = pagActual;
	}

	public boolean isLeido() {
		return leido;
	}

	public void setLeido(boolean leido) {
		this.leido = leido;
	}
	
	@Override
	public String toString() {
		return "Publicacion " + titulo + " con " + numPags + " paginas y precio " + precio;
	}

	public static long getNextID() {
		return nextID;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getNumPags() {
		return numPags;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean isFormatoDigital() {
		return formatoDigital;
	}

	public int getPagInicial() {
		return pagInicial;
	}
	
}