package unidad2;

import java.util.Random;

public class Practica8Unidad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();

		int dado1 = random.nextInt(6) + 1;
		int dado2 = random.nextInt(6) + 1;
		int dado3 = random.nextInt(6) + 1;

		int dado4 = random.nextInt(6) + 1;
		int dado5 = random.nextInt(6) + 1;
		int dado6 = random.nextInt(6) + 1;

		int resultado1 = dado1 + dado2 + dado3;
		int resultado2 = dado4 + dado5 + dado6;

		if (resultado1 > resultado2) {
			if (dado1 == dado2 && dado1 == dado3 && dado2 == dado1 && dado2 == dado3 && dado3 == dado1
					&& dado3 == dado2) {
				System.out.println("El jugador1 " + " ha ganado con un trio!");
			} else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado1 || dado2 == dado3 || dado3 == dado1
					|| dado3 == dado2)
				System.out.println("El jugador1 " + " ha ganado con una pareja!");
			else
				System.out.println("El jugador1 " + " ha ganado con una suma mayor!");
		} else {
			if (dado1 == dado2 && dado1 == dado3 && dado2 == dado1 && dado2 == dado3 && dado3 == dado1
					&& dado3 == dado2) {
				System.out.println("El jugador2 " + " ha ganado con un trio!");
			} else if (dado1 == dado2 || dado1 == dado3 || dado2 == dado1 || dado2 == dado3 || dado3 == dado1
					|| dado3 == dado2)
				System.out.println("El jugador2 " + " ha ganado con una pareja!");
			else
				System.out.println("El jugador2 " + " ha ganado con una suma mayor!");
		}

	}
}