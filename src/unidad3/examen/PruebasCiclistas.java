package unidad3.examen;

import java.util.Random;

public class PruebasCiclistas {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		// Creando objeto (Equipo y Ciclista)
		EquipoCiclista equipo = new EquipoCiclista();
		Ciclista ciclista = new Ciclista();

		// Variables con las funciones
		int num_ciclistas = equipo.numCiclistas();
		float peso_max = equipo.maxPeso();

		String nombre_especialidad = "montana";
		int num_ciclistas_esp = equipo.numCiclistas(nombre_especialidad);

		// Imprimir los resultados
		System.out.println("Hay " + num_ciclistas + " ciclistas.");
		System.out.println("El peso maximo de ciclistas de los ciclistas: " + Math.round(peso_max));
		System.out.println(
				"El numero de ciclistas de la especialidad de " + nombre_especialidad + ": " + num_ciclistas_esp);
		System.out.println(equipo.buscarCiclista(ciclista.getNombre()));

		// Comprobamos la lista actual
		Ciclista[] comproacion = equipo.getCiclistas();

		for (int i = 0; i < comproacion.length; i++) {
			System.out.println(i + " " + comproacion[i]);
		}

		// Añadimos al nuevo ciclista y volvemos a comrpobar con la lista actualizada
		System.out.println(equipo.anadirCiclista(ciclista));
		System.out.println(
				"--------------------------------------------------------------------------------------------------------------");

		comproacion = equipo.getCiclistas();

		for (int i = 0; i < comproacion.length; i++) {
			System.out.println(i + " " + comproacion[i]);
		}
	}

}
