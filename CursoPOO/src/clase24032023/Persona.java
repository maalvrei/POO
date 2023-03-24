package clase24032023;

import java.util.Arrays;

public class Persona {

	short yearOfBirth = 2022;
	String name;
	String surname;
	boolean brokenName;
	boolean brokenSurname;

	Persona(short yearOfBirth, String name, String surname) {
		this.yearOfBirth = yearOfBirth;

		if (name.length() > 20) {
			this.name = name.substring(0, 20);
			boolean brokenName = true;
		} else {
			this.name = name;
		}

		if (surname.length() > 20) {
			this.surname = surname.substring(0, 20);
			boolean brokenSurname = true;
		} else {
			this.surname = surname;
		}
	}

	Persona(String name, String surname) {
		this((short) 2022, name, surname);
	}

	Persona(Persona p) {
		this.name = p.name;
		this.surname = p.surname;
		this.yearOfBirth = p.yearOfBirth;
		this.brokenName = p.brokenName;
		this.brokenSurname = p.brokenSurname;
	}

	void show() {
		System.out.println("Persona " + name + " " + surname + " de " + (short) (2023 - yearOfBirth) + " años de edad");
	}

	boolean isBroken() {
		if (brokenSurname == true || brokenName == true) {
			return true;
		} else {
			return false;
		}
	}

	boolean changeName(String name, String surname) {
		
		char[] alphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
		
		int ultimoCaracterName = name.length() -1;
		
		int ultimoCaracterSurname = surname.length() - 1;
		
		if(name.length() > 20 || surname.length() > 20) {
			System.out.println("El nombre o el apellido tienen más de 20 caracteres. No se puede hacer el cambio.");
			return false;
		}
		
		if (name.charAt(0) == ' ' || name.charAt(ultimoCaracterName) == ' ' || surname.charAt(0) == ' ' || surname.charAt(ultimoCaracterSurname) == ' ') {
			System.out.println("Ni el primer ni el ultimo caracter del nombre o el apellido pueden ser un espacio. Error.");
			return false;
		}
		
		if ("".equals(name.trim()) || "".equals(surname.trim())) {
			System.out.println("El nombre o el apellido están vaciós. No se puede hacer el cambio.");
			return false;
		}
		
		int espaciosName = 0;
		
		for (int n = 0 ; n < name.length() ; n++) {
			
			char c = name.charAt(n);
			boolean encontrado = false;
			
			if (name.charAt(n) == ' ') {
				espaciosName+=1;
				if (espaciosName > 1) {
					System.out.println("El nombre tiene más de un espacio. No se puede cambiar el nombre.");
					return false;
				} 
			} else {
				
				for (int a = 0; a < alphabet.length; a++) {
					if (c == alphabet[a]) {
						encontrado = true;
						break;
					}
				}
				
				if (encontrado == false) {
					System.out.println("El nombre no se ha podido cambiar porque sus caracteres no están todos en el alfabeto inglés.");
					return false;
				}
			}
			
		}
		
		int espaciosSurname = 0;
		
		for (int x = 0 ; x < surname.length() ; x++) {
			
			char c = surname.charAt(x);
			boolean encontrado = false;
			
			if (surname.charAt(x) == ' ') {
				espaciosSurname+=1;
				if (espaciosSurname > 1) {
					System.out.println("El apellido tiene más de un espacio. No se puede cambiar el apellido.");
					return false;
				}
			} else {
				
				for (int a = 0; a < alphabet.length; a++) {
					if (c == alphabet[a]) {
						encontrado = true;
						break;
					}
				}
				
				if (encontrado == false) {
					System.out.println("El apellido no se ha podido cambiar porque sus caracteres no están todos en el alfabeto inglés.");
					return false;
				}
			}
			
		}
		
		System.out.println("Se ha cambiado el nombre. Antes era " + this.name + "\nAhora es " + name);		
		System.out.println("Se ha cambiado el apellido. Antes era " + this.surname + "\nAhora es " + surname);		
		this.name = name;		
		this.surname = surname;
		return true;
	}

	public static void main(String[] args) {
		Persona p1 = new Persona((short) 1996, "Sergio", "Ramírez");
		p1.show();
		p1.changeName("", " ");
		p1.show();
	}
}
