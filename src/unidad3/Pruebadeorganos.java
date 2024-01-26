package unidad3;

public class Pruebadeorganos {

	public static void main(String[] args) {
		// Creando objeto (Cuerpo y organos)
		Cuerpo cuerpo = new Cuerpo();
		Organo organo = new Organo();

		// Variables con los datos recividos
		String Organonombre = organo.getNombre();
		int estado = organo.getEstado();
		double peso = organo.getPeso();

		System.out.printf("%-5s %s %s\n", "Órgano", "Estado", "Peso");
		System.out.println("---------------------");
		System.out.printf("%-5s %s %s\n", Organonombre, estado, peso);

	}

}
