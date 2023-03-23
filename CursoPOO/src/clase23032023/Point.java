package clase23032023;

public class Point {

	String colores[] = { "black", "yellow", "green", "red", "blue", "purple" };
	byte x;
	byte y;
	String colour;
	char symbol;

	Point() {
		x = 0;
		y = 0;
		colour = "black";
	}

	Point(byte x, byte y, String colour, char symbol) {
		if (x >= 0 && x <= 12) {
			this.x = x;
		} else {
			this.x = 0;
		}

		if (y >= 0 && y <= 7) {
			this.y = y;
		} else {
			this.y = 0;
		}
		for (int i = 0; i < colores.length; i++) {
			if (colores[i] == colour) {
				this.colour = colour;
			} else {
				this.colour = "black";
			}
		}
		this.symbol = symbol;

	}

	Point(byte x, byte y) {
		this(x, y, "black", ' ');
	}

	Point(String colour, char symbol) {
		this((byte) 0, (byte) 0, colour, symbol);
	}

	Point(Point p) {
		x = p.x;
		y = p.y;
		colour = p.colour;
		symbol = p.symbol;
	}

	void showSimple() {
		System.out.println("Point " + symbol + " de color " + colour + " (" + x + "," + y + ").");
	}

	boolean up() {
		if (y + 1 <= 7) {
			y +=1;
			return true;
		} else {
			return false;
		}
	}
	
	boolean down() {
		if (y - 1 >=0) {
			y -=1;
			return true;
		} else {
			return false;
		}
	}
	
	boolean left() {
		if (x - 1 >=0) {
			x -=1;
			return true;
		} else {
			return false;
		}
	}
	
	boolean right() {
		if (x + 1 >=0) {
			x +=1;
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Point p1 = new Point();
		Point p2 = new Point("green", 'a');
		p2.showSimple();
	}
}
