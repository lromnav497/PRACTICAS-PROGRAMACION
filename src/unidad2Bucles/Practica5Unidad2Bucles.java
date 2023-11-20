package unidad2Bucles;

import java.util.Scanner;

/*
 * Escribir un programa que lea un número y muestre todos sus divisores impares. 
 * Un número es divisor de otro si a la hora de dividir el resto es 0. 
 * Por ejemplo 2 es divisor de 4, pero 3 no, 
 * así que los divisores de 75 serían 1,3,5,15,25 y 75.
 */

public class Practica5Unidad2Bucles {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce un número:");
		int num = scanner.nextInt();

		System.out.println("Los divisores impares de " + num + " son:");
		// Iniciamos el bucle
		for (int i = 1; i <= num; i += 2) {
			if (num % i == 0) {
				// Comprobamos
				System.out.println(i);
			}
		}
	}
}