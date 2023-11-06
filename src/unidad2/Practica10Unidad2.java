package unidad2;

import java.util.Scanner;

public class Practica10Unidad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double ayuda = 0;
		System.out.println("Introduze tu edad: ");
		int edad = teclado.nextInt();
		System.out.println("¿Estas casado? (true/false): ");
		boolean EstaCasado = teclado.nextBoolean();
		System.out.println("¿Eres hombre o mujer?: ");
		char sexo = teclado.next().charAt(0);
		System.out.println("Introduze tu Comunidad Autónoma: ");
		String CAutonoma = teclado.next();
		System.out.println("Introduze el número de hijos: ");
		int Nhijos = teclado.nextInt();
		System.out.println("Introduze tu sueldo anual: ");
		double sueldoAnual = teclado.nextDouble();

		if (CAutonoma.equals("País Vasco") || CAutonoma.equals("Valencia") || sueldoAnual > 60000 && Nhijos > 2) {
			ayuda = sueldoAnual * 12 / 100;
			System.out.println("Ayuda básica: " + ayuda + "€");
		} else if (CAutonoma.equals("Andalucia") && sexo == 'm' && sueldoAnual >= 45000 && sueldoAnual <= 55000
				|| CAutonoma.equals("Cantabria") && sexo == 'm' && sueldoAnual >= 45000 && sueldoAnual <= 55000
				|| CAutonoma.equals("Madrid") && sexo == 'm' && sueldoAnual >= 45000 && sueldoAnual <= 55000) {
			ayuda = Math.round((sueldoAnual / 13) * 100.0) / 100.0;
			System.out.println("Ayuda básica: " + ayuda + "€");
		}
		if (EstaCasado && Nhijos > 3) {
			System.out.println("Plus1: 100€");
			ayuda = ayuda + 100;
		}
		if (Nhijos > 5) {
			System.out.println("Plus2: 2000€");
			ayuda = ayuda + 2000;
		}
		System.out.println("Total de ayuda a recibir: " + Math.round(ayuda) + "€");
	}

}
