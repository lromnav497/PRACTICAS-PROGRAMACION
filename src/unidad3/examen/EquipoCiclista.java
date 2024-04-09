package unidad3.examen;

import java.util.Random;

public class EquipoCiclista {

	// Variables
	private String identificador;
	private int num_ciclistas;
	private Ciclista[] ciclistas = new Ciclista[11];

	public String nombre_equipo;

	// Constructor para generar los valores aleatorios
	public EquipoCiclista() {
		super();
		Random aleatorio = new Random();

		this.identificador = "";
		this.num_ciclistas = aleatorio.nextInt(5, 15); // Numero aleatorio
		this.nombre_equipo = "";

		for (int i = 0; i < ciclistas.length; i++) {
			ciclistas[i] = new Ciclista(); // Crear ciclistas con el constructor de ciclista
		}
	}

	// Constructor para asignar los valores dados
	public EquipoCiclista(String identificador, int num_ciclistas, Ciclista[] ciclistas, String nombre_equipo) {
		super();
		this.identificador = identificador;
		this.num_ciclistas = num_ciclistas;
		this.ciclistas = ciclistas;
		this.nombre_equipo = nombre_equipo;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public int getNum_ciclistas() {
		return num_ciclistas;
	}

	public void setNum_ciclistas(int num_ciclistas) {
		this.num_ciclistas = num_ciclistas;
	}

	public Ciclista[] getCiclistas() {
		return ciclistas;
	}

	public void setCiclistas(Ciclista[] ciclistas) {
		this.ciclistas = ciclistas;
	}

	public String getNombre_equipo() {
		return nombre_equipo;
	}

	public void setNombre_equipo(String nombre_equipo) {
		this.nombre_equipo = nombre_equipo;
	}

	public int numCiclistas() {
		return getNum_ciclistas();
	}

	// Funcion para saber el peso maximo
	public float maxPeso() {
		float max = Integer.MIN_VALUE, secMax = 0;

		for (int i = 0; i < ciclistas.length; i++) {
			if (ciclistas[i].getPeso() > max) {
				// Antes de actualizar el máximo
				// Guardo el máximo cómo el segundo mayor
				secMax = max;
				max = ciclistas[i].getPeso();

			} else {
				if (ciclistas[i].getPeso() > secMax)
					// Guardo el máximo cómo el segundo mayor
					secMax = ciclistas[i].getPeso();
			}
		}
		return max;
	}

	// Funcion para sabeer el numeros de ciclistas segun su especialidad
	public int numCiclistas(String especialidad) {
		int cantidad_especialidad = 0;

		// Bucle para comprobar el tamaño del array de ciclistas y luego asignar a la
		// variable +1 para saber cuantos hay
		for (int i = 0; i < ciclistas.length; i++) {
			if (ciclistas[i].getEspecialidad().equals(especialidad)) {
				cantidad_especialidad = cantidad_especialidad + 1;
			}
		}
		return cantidad_especialidad;
	}

	// Funcion para buscar el ciclista por su nombre
	public Ciclista buscarCiclista(String nombre) {
		for (int i = 0; i < ciclistas.length; i++) {
			if (ciclistas[i].getNombre().equals(nombre)) {
				return ciclistas[i];
			}
		}
		return null;
	}

//Funcion para añadir un ciclista, copiando el array antiguo y pegando en uno nuevo mas el ciclista nuevo
	public int anadirCiclista(Ciclista cicli) {
		// Vemos si el numero de ciclista es mayor al numero de ciclistas en el array
		if (numCiclistas() > ciclistas.length) {
			// Creamos el neuvo array
			Ciclista[] nuevos_ciclistas = new Ciclista[ciclistas.length + 1];
			for (int i = 0; i < ciclistas.length; i++) {
				nuevos_ciclistas[i] = ciclistas[i];
			}
			// Asignamos el nuevo ciclista y luego hacemos que este nuevo array sea el del
			// equipo ciclista
			nuevos_ciclistas[11] = cicli;
			setCiclistas(nuevos_ciclistas);
			return 0;
		}
		return -1;
	}
}
