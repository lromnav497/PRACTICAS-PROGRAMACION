package unidad2Bucles;

import java.util.Scanner;

public class EXAMENUD2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Iniciar teclado
		Scanner teclado = new Scanner(System.in);

		// Variables
		int numVideojuegos = 0;

		String nombre = "";
		double precio = 0.0;
		String categoria = "";
		int stock = 0;
		String plataforma = "";
		int puntuacion = 0;

		// Variables especiales
		String nombreMaxPrecio = "";
		String nombreMinPrecio = "";
		double maxPrecio = Double.MIN_VALUE;
		double minPrecio = Double.MAX_VALUE;
		double totalPrecios = 0;

		// Stock de juegos de terror
		int stockTerror = 0;

		// Lista de nombre de juegos concluyentes
		String nombresJuegosCondiciones = "";

		// Leer por teclado el numero de videojuegos
		System.out.println("Introduze el numero de videojuegos");
		numVideojuegos = teclado.nextInt();

		// Lista de juegos sin stock
		String juegosSinStock[] = new String[numVideojuegos];

		for (int i = 0; i < numVideojuegos; i++) {

			/*
			 * 
			 * 
			 * Inicio de pedir datos del juego
			 * 
			 * 
			 */

			// Nombre del juego
			System.out.println("Introduze el nombre del juego " + (i + 1));
			nombre = teclado.next();

			// Precio del juego
			System.out.println("Introduze el precio del juego " + (i + 1));
			precio = teclado.nextDouble();

			// Categoria del juego
			do {
				System.out.println(
						"Introduze la categoria del juego (aventura, plataformas, terror, shooter) " + (i + 1));
				categoria = teclado.next();
			} while (!categoria.equals("aventura") && !categoria.equals("plataformas") && !categoria.equals("terror")
					&& !categoria.equals("shooter"));

			// Stock del juego
			System.out.println("Introduze el stock del juego " + (i + 1));
			stock = teclado.nextInt();

			// Plataforma del juego
			do {
				System.out.println("Introduze la plataforma del juego (switch, xbox,playstation ,pc) " + (i + 1));
				plataforma = teclado.next();
			} while (!plataforma.equals("switch") && !plataforma.equals("xbox") && !plataforma.equals("playstation")
					&& !plataforma.equals("pc"));

			// Puntuacion del juego
			System.out.println("Introduze la puntuacion del juego " + (i + 1));
			puntuacion = teclado.nextInt();

			/*
			 * 
			 * 
			 * Inicio de calculos
			 * 
			 * 
			 */

			totalPrecios = totalPrecios + precio;

			// Comprobar el precio por el precio mayor
			if (precio > maxPrecio) {
				maxPrecio = precio;
				nombreMaxPrecio = nombre;
			}

			// Comprobar el precio por el precio menor
			if (precio < minPrecio) {
				minPrecio = precio;
				nombreMinPrecio = nombre;
			}

			/*
			 * 
			 * 
			 * Inicio de comprobaciones
			 * 
			 * 
			 * 
			 */

			// Si es categoria de terror,guardarlo en stock de terror
			if (categoria.equals("terror")) {
				stockTerror = stockTerror + stock;
			}

			// Si cumplen las condiciones mostramos el nombre
			if (categoria.equals("plataformas") && puntuacion > 9 || precio < 19) {
				nombresJuegosCondiciones = nombresJuegosCondiciones + " " + nombre;
			}

			// Comprobar si no tiene stock y su puntuacion es superior a 6
			if (stock == 0 && puntuacion > 6)
				juegosSinStock[i] = nombre;
			else
				juegosSinStock[i] = "";
		}

		// Mostrar por pantalla todos los resultados
		System.out.println("La media es: " + ((maxPrecio + minPrecio) / 2));
		System.out.println("El juego mas caro es : " + nombreMaxPrecio);
		System.out.println("El juego mas barato es : " + nombreMinPrecio);
		System.out.println("Juegos de plataformas con una valoracion superior a 6 o que cuesten menos de 19€: "
				+ nombresJuegosCondiciones);
		System.out.println("Stock de juegos de terror: " + stockTerror);

		System.out.println("Lista juegos sin stock a pedir de nuevo: ");
		for (int i = 0; i < numVideojuegos; i++) {
			// Comprobar si no es igual a espacio en blanco
			if (!juegosSinStock[i].equals(""))
				System.out.println(juegosSinStock[i]);
		}

		// Cerrar teclado SIEMPRE :D
		teclado.close();

	}

}
