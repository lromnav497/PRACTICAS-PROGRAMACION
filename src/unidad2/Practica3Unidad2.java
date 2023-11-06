package unidad2;

import java.util.Scanner;

public class Practica3Unidad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero1 = 0;
		int numero2 = 0;
		int numero3 = 0;
		int numero4 = 0;
		int mayor = 0;

		System.out.println("Ingrese el primer número: ");
		numero1 = teclado.nextInt();

		System.out.println("Ingrese el segundo número: ");
		numero2 = teclado.nextInt();

		System.out.println("Ingrese el tercer número: ");
		numero3 = teclado.nextInt();

		System.out.println("Ingrese el cuarto número: ");
		numero4 = teclado.nextInt();

		mayor = numero1;

		if (numero2 > mayor) {
			mayor = numero2;
		}

		if (numero3 > mayor) {
			mayor = numero3;
		}

		if (numero4 > mayor) {
			mayor = numero4;
		}

		System.out.println("El mayor número es: " + mayor);
	}
}
