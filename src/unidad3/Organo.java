package unidad3;

import java.util.Random;

public class Organo {

	// Variables
	private String nombre;
	private String funcion;
	private int estado;
	private double peso;
	private int posicion;
	private int importancia;
	private String imagen;
	public boolean activo;

	// Constantes

	public static final int SANO = 0;
	public static final int DOLOR = 1;
	public static final int PERJUDICADO = 2;
	public static final int CANCERIGENO = 3;

	public static final int CABEZA = 0;
	public static final int TRONCO_SUPERIOR = 1;
	public static final int TRONCO_INFERIOR = 2;

	public static final int VITAL = 0;
	public static final int BASICA = 1;
	public static final int SECUNDARIA = 2;

	public Organo() {
		Random aleatorio = new Random();
		String[] nombreorganos = { "cerebro", "corazón", "riñones", "pulmones", "oído", "estómago" };

		this.nombre = nombreorganos[aleatorio.nextInt(nombreorganos.length)];
		this.estado = aleatorio.nextInt(4); // Estado aleatorio entre 0 y 3
		this.peso = 200 + (1000 - 200) * aleatorio.nextDouble(); // Peso aleatorio entre 200 y 1000
		this.posicion = aleatorio.nextInt(3); // Posición aleatoria entre 0 y 2
		this.activo = false;
	}

	public Organo(String nombre, String funcion, int estado, double peso, int posicion, int importancia, String imagen,
			boolean activo) {
		this.nombre = nombre;
		this.funcion = funcion;
		this.estado = estado;
		this.peso = peso;
		this.posicion = posicion;
		this.importancia = importancia;
		this.imagen = imagen;
		this.activo = activo;
	}

	// Métodos get y set para cada variable miembro

	public String getNombre() {
		return this.nombre;
	}

	public int getEstado() {
		return this.estado;
	}

	public double getPeso() {
		return this.peso;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	public boolean revision() {
		/*
		 * Comprueba si el órgano está en la posición adecuada y tiene su importancia
		 * adecuada
		 */
		switch (this.nombre) {
		case "cerebro":
			return this.posicion == CABEZA && this.importancia == VITAL;
		case "corazón":
			return this.posicion == TRONCO_SUPERIOR && this.importancia == VITAL;
		case "riñones":
			return this.posicion == TRONCO_INFERIOR && this.importancia == BASICA;
		case "pulmones":
			return this.posicion == TRONCO_SUPERIOR && this.importancia == VITAL;
		case "oído":
			return this.posicion == CABEZA && this.importancia == SECUNDARIA;
		case "estómago":
			return this.posicion == TRONCO_INFERIOR && this.importancia == SECUNDARIA;
		default:
			return false;
		}
	}

	public boolean analisis() {
		switch (estado) {
		case 1:
			// Comprueba si el estado es cancerígeno
			return this.estado == CANCERIGENO;
		case 2:
			// Comprueba si el órgano está perjudicado
			return this.estado == PERJUDICADO;
		case 3:
			// Comprueba si el peso está por encima de 200g y menos de 1kg
			return this.peso >= 200 && this.peso <= 1000;
		default:
			// Tipo de análisis no reconocido
			return false;
		}
	}
}
