package unidad2Bucles;

import java.util.Scanner;

public class Practica8Unidad2Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// Mostramos por pantalla para que introduzca la variable
		System.out.println("Introduce la cantidad de números que quieras:");
		int x = scanner.nextInt();
		int count = 0;
		// Iniciamos el bucle con los numeros dados
		for (int i = 0; i < x; i++) {
			System.out.println("Introduce el número " + (i + 1) + ":");
			int numero = scanner.nextInt();
			boolean esPrimo = true;

			if (numero <= 1) {
				// Si el numero es menor o igual a 1, no sera primo
				esPrimo = false;
			} else {
				/**
				 * Iniciamos el segundo bucle para saber cuales numeros de los dados
				 * anteriormente son primos
				 */
				for (int j = 2; j < numero; j++) {
					if (numero % j == 0) {
						// Si da 0 no es primo
						esPrimo = false;
						break;
					}
				}
			}

			if (esPrimo) {
				// Suma 1 a count
				count++;
			}
		}
		// Mostramos todos los numeros primos
		System.out.println("Hay " + count + " números primos.");
	}

}
