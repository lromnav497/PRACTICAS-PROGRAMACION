package unidad1;

import java.util.Scanner;

public class Practica9Undiad1 {
	public static void main(String[] args) {
		int numero1;
		int numero2;
		int numero3;
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Introduze un número: ");
		numero1 = teclado.nextInt();
		System.out.println("Introduze otro número: ");
		numero2 = teclado.nextInt();
		System.out.println("Introduze un último número: ");
		numero3 = teclado.nextInt();
		
		System.out.println("La media es: " + ((numero1 + numero2 - numero3) / 3));
	}
}
