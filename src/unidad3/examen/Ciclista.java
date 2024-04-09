package unidad3.examen;

import java.util.Random;

public class Ciclista {

	// Variables
	private String identificador;
	private String nombre;
	private int edad;
	private String modelo_Bici;
	private float peso;
	private int posicion;
	private String especialidad;

	// Constructor para generar los datos aleatoriamente
	public Ciclista() {
		super();
		// TODO Auto-generated constructor stub
		Random aleatorio = new Random();

		this.identificador = "";

		String[] nombres = { "Pepe", "Manolo", "Juan", "Maria", "Paula", "Nayara", "Lolo", "Lidia", "Natalia" };
		this.nombre = nombres[aleatorio.nextInt(nombres.length)];

		this.edad = aleatorio.nextInt(1, 62); // Edad aleatorio entre 1 y 61 años
		this.modelo_Bici = "";
		this.peso = 200 + (1000 - 200) * aleatorio.nextFloat(); // Peso aleatorio entre 200 y 1000
		this.posicion = aleatorio.nextInt(1, 6); // Posición aleatoria entre 1 y 5

		String[] especialidades = { "montana", "contrareloj", "todoterreno" };
		this.especialidad = especialidades[aleatorio.nextInt(especialidades.length)];
	}

	// Constructor para asignar los valores dados
	public Ciclista(String identificador, String nombre, int edad, String modelo_Bici, int peso, int posicion,
			String especialidad) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.edad = edad;
		this.modelo_Bici = modelo_Bici;
		this.peso = peso;
		this.posicion = posicion;
		this.especialidad = especialidad;
	}

	// Metodos getters y setters
	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getModelo_Bici() {
		return modelo_Bici;
	}

	public void setModelo_Bici(String modelo_Bici) {
		this.modelo_Bici = modelo_Bici;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	// Funcion toString para cuando se pida imprimir por pantalla salga los datos de
	// la siguiente manera
	@Override
	public String toString() {
		return "Ciclista [Nombre:" + nombre + ", Identificador:" + identificador + ", Edad:" + edad + ", Modelo:"
				+ modelo_Bici + ", Peso:" + Math.round(peso) + ", Posicion:" + posicion + ", Especialidad:"
				+ especialidad + "]";
	}

}
