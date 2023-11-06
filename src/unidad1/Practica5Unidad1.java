package unidad1;

import java.util.Scanner;

public class Practica5Unidad1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("Es par!");
		}
	}

}
