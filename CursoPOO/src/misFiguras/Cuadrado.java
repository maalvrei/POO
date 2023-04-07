package misFiguras;

public class Cuadrado {
	   // PROPIEDADES
	    private String color;
	    private int lado;

	    
	    // GETTERS & SETTERS
	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public int getLado() {
	        return lado;
	    }
	    
	    // CONSTRUCTORES
	    
	    private Cuadrado(String color, int lado) {
	        this.color = color;
	        this.lado = lado;
	    }
	    
	    public Cuadrado() {
	        this("blanco", 1);
	    }
	    
	    public Cuadrado(int lado) {
	        this("blanco", lado);
	    }
	    
	    public Cuadrado(long area) {
	        this("blanco", (int) Math.sqrt(area));
	    }
	    
	    // METODOS
	    
	    public long perimetro() {
	        return 4 * (long)lado;
	    }
	    
	    public long area() {
	        return (long)lado * lado;
	    }

	    public boolean comparaAreas(Cuadrado c) {
	        // iguales entonces true
	        return this.area() == c.area();
	    }

	    @Override
	    public String toString(){
	        return "Soy un cuadrado de " + lado + " x " + lado;
	    }
	    
	    public static void main(String[] args) {
			Cuadrado c1 = new Cuadrado(1);
			System.out.println(c1.lado);
		}
	}