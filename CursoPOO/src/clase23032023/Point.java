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
			y += 1;
			return true;
		} else {
			return false;
		}
	}

	boolean down() {
		if (y - 1 >= 0) {
			y -= 1;
			return true;
		} else {
			return false;
		}
	}

	boolean left() {
		if (x - 1 >= 0) {
			x -= 1;
			return true;
		} else {
			return false;
		}
	}

	boolean right() {
		if (x + 1 >= 0) {
			x += 1;
			return true;
		} else {
			return false;
		}
	}

	void show() {
		for (int ejeY = 7; ejeY >= 0; ejeY--) {
			for (int ejeX = 0; ejeX <12; ejeX++) {
				boolean control = true;

				if (ejeY == y && ejeX == x && ejeX == 0) {
					System.out.print(ejeY + "  ");
					System.out.print(symbol);
					control = false;
				}

				if (ejeY == y && ejeX == x && control == true) {
					System.out.print("---");
					System.out.print(symbol);
					control = false;
				}

				if (ejeX == 0 && control == true) {
					System.out.print(ejeY + "  +");
				}

				if (control == false) {
					System.out.print("---+");
				} else {
					if (control == false) {
						System.out.println("--+");
					} else {
						System.out.print("---+");
						if (ejeX == 11) {
							System.out.print("\n");
							if (ejeY != 0) {
								System.out.println("   |   |   |   |   |   |   |   |   |   |   |   |   |");
							}
						}
					}
				}
			}
		}

		System.out.print("   0   1   2   3   4   5   6   7   8   9   10  11  12");
	}

	public static void main(String[] args) {
		Point p1 = new Point((byte) 0, (byte) 0, "green", 'b');
		Point p2 = new Point("green", 'a');
		p1.show();
	}
}
