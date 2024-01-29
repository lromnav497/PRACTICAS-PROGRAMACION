package unidad3;

import java.util.Arrays;
import java.util.Random;

public class Pruebadeorganos {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		// Creando objeto (Cuerpo y organos)
		Cuerpo cuerpo = new Cuerpo();
		Organo organo = new Organo();

		// Variables con los datos recividos
		String Organonombre = organo.getNombre();
		int estado = organo.getEstado();
		double peso = organo.getPeso();
		boolean revision = organo.revision();
		boolean analisis = organo.analisis(aleatorio.nextInt(1, 4));

		System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Órgano", "Estado", "Peso", "Revision", "Analisis");
		System.out.println("-----------------------------------------------------");
		System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", Organonombre, estado, Math.round(peso), revision,
				analisis);
		System.out.println("Transplante: ");
		System.out.println(cuerpo.trasplante(organo));
		System.out.println("Curación: ");
		System.out.println(cuerpo.cura(organo));
		System.out.println("Oncología: ");
		System.out.println(cuerpo.oncologia());
		System.out.println("Revision General: ");
		System.out.println(Arrays.toString(cuerpo.revisionGeneral()));
	}

}
