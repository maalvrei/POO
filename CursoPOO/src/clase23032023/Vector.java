package clase23032023;

public class Vector {
	
	int x;
	int y;
	
	public Vector(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector (int v) {
		x = v;
		y = v;
	}
	
	public Vector (Vector v) {
		x = v.x;
		y = v.y;
	}
	
	public void show() {
		System.out.println("Vector de coordenadas (" + x + "," + y + ")");
	}
	
	public Vector suma (Vector v) {
		return new Vector(x + v.x, y + v.y);
	}
	
	public Vector resta (Vector v) {
		return new Vector(x - v.x, y - v.y);
	}
	
	public Vector opera (Vector v, char operacion) {
		if (operacion == '+') {
			return new Vector(x + v.x, y + v.y);
		} else {
			return new Vector(x - v.x, y - v.y);
		}
	}
	
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
	
	public static void main(String[] args) {
		Vector v1 = new Vector(4,5);
		Vector v2 = new Vector(8,9);
		v2.opera(2);
		v2.esParalelo(v1);
	}
	
}
