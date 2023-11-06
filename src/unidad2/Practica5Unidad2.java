package unidad2;

import java.util.Scanner;

public class Practica5Unidad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		double num1 = teclado.nextDouble();
		System.out.println("Introduce el segundo número:");
		double num2 = teclado.nextDouble();
		System.out.println("Introduce el resultado:");
		double resultado = teclado.nextDouble();

		if (num1 + num2 == resultado) {
			System.out.println("La operación realizada es una suma.");
		} else if (num1 - num2 == resultado) {
			System.out.println("La operación realizada es una resta.");
		} else if (num1 * num2 == resultado) {
			System.out.println("La operación realizada es una multiplicación.");
		} else if (num1 / num2 == resultado) {
			System.out.println("La operación realizada es una división.");
		} else if (num1 % num2 == resultado) {
			System.out.println("La operación realizada es un resto.");
		} else if (Math.pow(num1, 2) == resultado || Math.pow(num2, 2) == resultado) {
			System.out.println("La operación realizada es una potencia de 2.");
		} else if (Math.sqrt(num1) == resultado || Math.sqrt(num2) == resultado) {
			System.out.println("La operación realizada es una raíz cuadrada.");
		} else {
			System.out.println("La operación es indefinida.");
		}
	}

}
