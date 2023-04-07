package myPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MultiLinea {

	private static ArrayList<Punto> puntos = new ArrayList();

	public String toString() {
		if (puntos.size() == 0) {
			return "::: 0 :::";
		} else {
			if (puntos.size() == 1) {
				return "::: " + puntos.get(1) + " :::";
			} else {
				return "::: " + puntos.get(1) + " " + puntos.size() + " " + puntos.get(puntos.size() - 1) + " :::";
			}
		}
	}

	public void invierte() {
		Collections.reverse(puntos);
		System.out.println(puntos);
	}

	Linea[] splitInLines() {
		Linea lineas[] = new Linea[puntos.size() - 1];
		for (int i = 0; i <= puntos.size() - 1; i++) {
			if (i + 1 == puntos.size()) {
				break;
			}
			Punto punto1 = puntos.get(i);
			System.out.println(punto1);
			Punto punto2 = puntos.get(i + 1);
			System.out.println(punto2);
			lineas[i] = new Linea(punto1, punto2);
			System.out.println(lineas[i]);
		}

		return lineas;
	}

	int cantidadPuntos() {
		return puntos.size();
	}

	Punto[] puntos() {
		Punto arrayPuntos[] = new Punto[puntos.size()];
		for (int i = 0; i < puntos.size(); i++) {
			arrayPuntos[i] = puntos.get(i);
			System.out.println(arrayPuntos[i]);
		}
		return arrayPuntos;
	}

	double longitud() {
		return puntos.size();
	}

	void addPuntoAlFinal(Punto p) {
		puntos.add(p);
	}

	void addPuntoAlPrincipio(Punto p) {
		puntos.add(0, p);
	}

	void borraPuntoAlFinal() {
		puntos.remove(puntos.size() - 1);
	}

	void borraPuntoAlPrincipio() {
		puntos.remove(0);
	}

	static boolean traslada(Punto p) {
		Punto puntoInicial = puntos.get(0);
		int xOperaciones = p.getX() - puntoInicial.getX();
		int yOperaciones = p.getY() - puntoInicial.getY();
		System.out.println(puntos.toString());
		for (int i = 0; i <= puntos.size() - 1; i++) {
			if (i == 0) {
				puntos.set(i, p);
			} else {
				Punto estePunto = puntos.get(i);
				estePunto.setX(estePunto.getX()+xOperaciones);
				estePunto.setY(estePunto.getY()+yOperaciones);
				puntos.set(i, estePunto);
			}
		}
		System.out.println(puntos.toString());
		return true;
	}
	
	public MultiLinea(Punto [] puntos) {
		this.puntos = new ArrayList<Punto>(Arrays.asList(puntos));
	}

	public static void main(String[] args) {
		Punto p1 = new Punto(1, 4);
		Punto p2 = new Punto(4, 5);
		Punto p3 = new Punto(5, 8);
		Punto p4 = new Punto(8, 10);
		Punto p5 = new Punto(11, 14);
		puntos.add(p1);
		puntos.add(p2);
		puntos.add(p3);
		puntos.add(p4);
		puntos.add(p5);
		Punto p6 = new Punto (8,9);
		traslada(p6);
	}

}
