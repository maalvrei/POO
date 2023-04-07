package myPoints;

public class Vector {
	
	int x;
	int y;
	
	// constructor con dos parametros
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// constructor con el mismo valor para x e y
	
	public Vector (int v) {
		x = v;
		y = v;
	}
	
	// constructor copia
	
	public Vector (Vector v) {
		x = v.x;
		y = v.y;
	}
	
	// método show
	
	public void show() {
		System.out.println("Vector de coordenadas (" + x + "," + y + ")");
	}
	
	// metodo que suma dos vectores y devuelve un nuevo vector, cuyos atributos x e y son el resultado de sumar la x y la y de cada vector
	
	public Vector suma (Vector v) {
		return new Vector(x + v.x, y + v.y);
	}
	
	// metodo que resta dos vectores y devuelve un nuevo vector, cuyos atributos x e y son el resultado de restar la x y la y de cada vector 
	
	public Vector resta (Vector v) {
		return new Vector(x - v.x, y - v.y);
	}
	
	// metodo que recibe un parametro de tipo char, dependiendo del cual se hara la suma o la resta de dos vectores
	
	public Vector opera (Vector v, char operacion) {
		if (operacion == '+') {
			return new Vector(x + v.x, y + v.y);
		} else {
			return new Vector(x - v.x, y - v.y);
		}
	}
	
	// metodo que multiplica la x y la y de un vector por el entero que se le pasa como parametro
	
	public Vector prod(int i) {
		return new Vector(x * i, y * i);
	}
	
	
	
	public Vector opera(int n) {
		Vector v = prod(n);
		System.out.println(n + " * " + "(" + x + "," + y + ") = (" + v.x + "," + v.y +")");
		return v;
	}
	
	public int prodE(Vector v) {
		int resultado = x * v.x + y * v.y;
		return resultado;
	}
	
	public int prodV(Vector v) {
		int resultado = x * v.y - y * v.x;
		return resultado;
	}
	
	boolean esPerpendicular(Vector v) {
		if (x == 0 && y == 0 || v.x == 0 && v.y == 0) {
			System.out.println("Los vectores no son perpendiculares porque uno de ellos es igual a (0,0)");
			return false;
		}
		if (prodE(v) == 0) {
			System.out.println("Los vectores son perpendiculares. El producto escalar es " + prodE(v) + ".");
			return true;
		} else {
			System.out.println("Los vectores no son perpendiculares. El producto escalar es " + prodE(v) + ".");
		} return false;
	}
	
	boolean esParalelo(Vector v) {
		if (x == 0 && y == 0 || v.x == 0 && v.y == 0) {
			System.out.println("Los vectores no son paralelos porque uno de ellos es igual a (0,0)");
			return false;
		}
		
		if (prodV(v) == 0) {
			System.out.println("Los vectores son paralelos. El producto escalar es " + prodV(v) + ".");
			return true;
		} else {
			System.out.println("Los vectores no son paralelos. El producto escalar es " + prodV(v) + ".");
			return false;
		}
	}
	
}