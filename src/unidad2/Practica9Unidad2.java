package unidad2;

import java.util.Scanner;

public class Practica9Unidad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce la distancia (por ejemplo, 10m, 20h, 30k):");
		String nuevadistancia = teclado.nextLine();

		double distancia = Double.parseDouble(nuevadistancia.substring(0, nuevadistancia.length() - 1));
		char unidad = Character.toLowerCase(nuevadistancia.charAt(nuevadistancia.length() - 1));

		switch (unidad) {
		case 'm':
			System.out.println(distancia + " metros son " + distancia / 1609.34 + " millas.");
			break;
		case 'h':
			System.out.println(distancia + " hectómetros son " + distancia * 10 / 1609.34 + " millas.");
			break;
		case 'k':
			System.out.println(distancia + " kilómetros son " + distancia * 1000 / 1609.34 + " millas.");
			break;
		default:
			System.out.println("Unidad desconocida.");
		}
	}
}
