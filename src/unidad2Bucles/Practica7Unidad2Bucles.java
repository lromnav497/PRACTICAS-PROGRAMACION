package unidad2Bucles;

import java.util.Scanner;

public class Practica7Unidad2Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		// Obtener la frase introducida
		System.out.println("Introduze una frase: ");
		String frase = teclado.next();

		// Convertir todos los caracteres en minusculas y obtener el tamaño de la cadena
		frase = frase.toLowerCase();
		int longitud = frase.length();
		boolean esIsograma = true;

		// Bucle para contar los caracteres de la cadena: i menor a (tamaño de cadena)
		for (int i = 0; i < longitud; i++) {
			// Obtiene el caracter de la cadena
			char c = frase.charAt(i);
			// Comprueba que no sean iguales y rompe el bucle
			if (frase.indexOf(c) != frase.lastIndexOf(c)) {
				esIsograma = false;
				break;
			}
		}

		// Sacamos por pantalla si es un isograma o no
		System.out.println(esIsograma);

		teclado.close();
	}

}
