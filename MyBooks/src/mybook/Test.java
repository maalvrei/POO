package mybook;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		Libro lb1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 735, 3, 29.99, false);
		Libro lb2 = new Libro("El señor de los anillos", "J. R. R. Tolkien", 429, 5, 29.99, false);
		Libro lb3 = new Libro("1984", "George Orwel", 122, 9, 40.99, false);
		Libro lb4 = new Libro("Un mundo feliz", "Aldous Huxley", 270, 1, 25.99, false);
		Libro lb5 = new Libro("Orgullo y prejuicio", "Jane Austen", 340, 2, 12.99, true);
		Libro lb6 = new Libro("Crimen y castigo", "Fiódor Dostoyevski", 259, 3, 60.9, false);
		Libro lb7 = new Libro("Lolita", "Vladimir Nabokov", 300, 5, 27.99, false);
		Libro lb8 = new Libro("Ulises", "James Joyce", 400, 4, 42.99, false);
		Libro lb9 = new Libro("Madame Bovary", "Gustave Flaubert", 723, 9, 9.99, true);
		Libro lb10 = new Libro("En busca del tiempo perdido", "Marcel Proust", 374, 2, 9.99, true);

		Revista r1 = new Revista("HOLA", 50, 1, true, 2.99);
		Revista r2 = new Revista("Que me dices", 55, 1, true, 3.99);
		Revista r3 = new Revista("Cartoon Network", 20, 1, false, 21.99);
		Revista r4 = new Revista("El Mundo", 36, 1, false, 4.99);
		Revista r5 = new Revista("Interviu", 100, 1, true, 30.99);

		Publicacion[] publicaciones = new Publicacion[15];
		publicaciones[0] = lb1;
		publicaciones[1] = lb2;
		publicaciones[2] = lb3;
		publicaciones[3] = lb4;
		publicaciones[4] = lb5;
		publicaciones[5] = lb6;
		publicaciones[6] = lb7;
		publicaciones[7] = lb8;
		publicaciones[8] = lb9;
		publicaciones[9] = lb10;
		publicaciones[10] = r1;
		publicaciones[11] = r2;
		publicaciones[12] = r3;
		publicaciones[13] = r4;
		publicaciones[14] = r5;

		System.out.println("TODAS LAS PUBLICACIONES DEL ARRAY\n ==========================================");
		for (Publicacion p : publicaciones) {
			if (p instanceof Libro) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID());
			} else {
				System.out.println("Revista de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID());
			}
		}

		System.out.println("\nSOLO LOS LIBROS DEL ARRAY\n =================================================");
		for (Publicacion p : publicaciones) {
			if (p instanceof Libro) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID());
			}
		}

		System.out.println("\nSOLO LAS REVISTAS DEL ARRAY\n =================================================");
		for (Publicacion p : publicaciones) {
			if (p instanceof Revista) {
				System.out.println("Revista de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID());
			}
		}

		System.out.println(
				"\nSOLO LAS PUBLICACIONES DE MAS DE 20 EUROS DEL ARRAY\n =================================================");
		for (Publicacion p : publicaciones) {
			if (p instanceof Libro && p.getPrecio() > 20) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID()
						+ " y de precio " + p.getPrecio());
			} else if (p instanceof Revista && p.getPrecio() > 20)
				System.out.println("Revista de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID()
						+ " y de precio " + p.getPrecio());
		}

		System.out.println("\nSOLO LOS LIBROS DE MAS DE 20 EUROS DEL ARRAY\n =================================================");
		for (Publicacion p : publicaciones) {
			if (p instanceof Libro && p.getPrecio() > 20) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID()
						+ " y de precio " + p.getPrecio());
			}
		}

		System.out
				.println("\nSOLO LAS REVISTAS DE MAS DE 20 EUROS DEL ARRAY\n =================================================");
		for (Publicacion p : publicaciones) {
			if (p instanceof Revista && p.getPrecio() > 20) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID()
						+ " y de precio " + p.getPrecio());
			}
		}

		ArrayList<Publicacion> ArrP = new ArrayList<Publicacion>();

		ArrP.add(lb1);
		ArrP.add(lb2);
		ArrP.add(lb3);
		ArrP.add(lb4);
		ArrP.add(lb5);
		ArrP.add(lb6);
		ArrP.add(lb7);
		ArrP.add(lb8);
		ArrP.add(lb9);
		ArrP.add(lb10);
		ArrP.add(r1);
		ArrP.add(r2);
		ArrP.add(r3);
		ArrP.add(r4);
		ArrP.add(r5);

		System.out.println("TODAS LAS PUBLICACIONES DEL ARRAYLIST\n ==========================================");
		for (Publicacion p : ArrP) {
			if (p instanceof Libro) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID());
			} else {
				System.out.println("Revista de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID());
			}
		}

		System.out.println("\nSOLO LOS LIBROS DEL ARRAYLIST\n =================================================");
		for (Publicacion p : ArrP) {
			if (p instanceof Libro) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID());
			}
		}

		System.out.println("\nSOLO LAS REVISTAS DEL ARRAYLIST\n =================================================");
		for (Publicacion p : ArrP) {
			if (p instanceof Revista) {
				System.out.println("Revista de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID());
			}
		}

		System.out.println(
				"\nSOLO LAS PUBLICACIONES DE MAS DE 20 EUROS DEL ARRAYLIST\n =================================================");
		for (Publicacion p : ArrP) {
			if (p instanceof Libro && p.getPrecio() > 20) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID()
						+ " y de precio " + p.getPrecio());
			} else if (p instanceof Revista && p.getPrecio() > 20)
				System.out.println("Revista de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID()
						+ " y de precio " + p.getPrecio());
		}

		System.out.println("\nSOLO LOS LIBROS DE MAS DE 20 EUROS DEL ARRAYLIST\n =================================================");
		for (Publicacion p : ArrP) {
			if (p instanceof Libro && p.getPrecio() > 20) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Libro) p).getID()
						+ " y de precio " + p.getPrecio());
			}
		}

		System.out
				.println("\nSOLO LAS REVISTAS DE MAS DE 20 EUROS DEL ARRAYLIST\n =================================================");
		for (Publicacion p : ArrP) {
			if (p instanceof Revista && p.getPrecio() > 20) {
				System.out.println("Libro de nombre " + p.getTitulo() + " de ID " + ((Revista) p).getID()
						+ " y de precio " + p.getPrecio());
			}
		}

		for (Publicacion p : publicaciones) {
			if (p.getTitulo() == "Ulises") {
				((Libro) p).show();
				System.out.println("\n=================================\n");
				for (int i = 0; i < 300; i++) {
					((Libro) p).leePagina(true);
				}
				System.out.println("Estamos en la pagina " + p.getPagActual());
				System.out.println("\n=================================\n");
				for (int i = 0; i < 5; i++) {
					((Libro) p).leePagina(false);
				}
				System.out.println("\n=================================\n");
				System.out.println("Estamos en la pagina " + p.getPagActual());
				System.out.println("\n=================================\n");
				for (int i = 0; i < 10; i++) {
					Libro.leePaginaStatic((Libro) p);
				}
				System.out.println("\n=================================\n");
				System.out.println("Estamos en la pagina " + p.getPagActual());
				System.out.println("\n=================================\n");
				for (int i = 0; i < 1000; i++) {
					Libro.leePaginaStatic((Libro) p);
					if (p.isLeido() == true) {
						System.out.println("\n=================================\n");
						System.out.println("Se ha leido el libro " + p.getTitulo()
								+ " y estamos en la ultima pagina, la " + p.getPagActual());
						break;
					}

				}
			}
		}
	}

}
