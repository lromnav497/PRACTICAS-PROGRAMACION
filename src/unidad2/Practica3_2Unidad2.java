package unidad2;

import java.util.Arrays;
import java.util.Scanner;

public class Practica3_2Unidad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[4];
		int numero = 0;
		int contador = 0;

		for (int i = 0; i < 4; i++) {
			System.out.println("Ingrese el número " + (i + 1) + ": ");
			numero = teclado.nextInt();

			if (numero % 2 != 0 && contador < 4) {
				numeros[contador] = numero;
				contador++;
			}
		}

		Arrays.sort(numeros);
		System.out.println("Los dos números impares más pequeños son: " + numeros[0] + ", " + numeros[1]);
	}

}
