package myPoints;

import java.util.ArrayList;
import java.util.Collections;

public class MultiLinea {
	
	private ArrayList<Punto> puntos;
	
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
	
	
	
}
