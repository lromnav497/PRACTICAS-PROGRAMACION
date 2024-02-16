package unidad3;

import java.util.Random;

public class Raza {
	private String nombre;
	private String descripcion;
	private double altura;
	private String pelo;
	private String piel;
	private String zona;

	// Creando el constructor de raza
	public Raza() {
		Random aleatorio = new Random();
		String[] nombres = { "Pepe", "Juan", "Luisa", "María", "Carla", "Carlos" };
		String[] descripcion = { "Contento", "Amable", "Empatico", "Malvado" };
		String[] pelo = { "rubio", "moreno", "pelirojo", "castaño" };
		String[] piel = { "blanco", "negro", "moreno", "mulato", "amarillo" };
		String[] zona = { "America", "Europa", "Asia", "Africa", "Oceanía", "Antartida" };

		this.nombre = nombres[aleatorio.nextInt(nombres.length)];
		this.descripcion = descripcion[aleatorio.nextInt(descripcion.length)];
		this.pelo = pelo[aleatorio.nextInt(pelo.length)];
		this.piel = piel[aleatorio.nextInt(piel.length)];
		this.zona = zona[aleatorio.nextInt(zona.length)];
	}

	// Poner los valores de raza
	public Raza(String nombre, String descripcion, double altura, String pelo, String piel, String zona) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.altura = altura;
		this.pelo = pelo;
		this.piel = piel;
		this.zona = zona;
	}

	// Métodos get y set para cada variable miembro

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getPelo() {
		return pelo;
	}

	public void setPelo(String pelo) {
		this.pelo = pelo;
	}

	public String getPiel() {
		return piel;
	}

	public void setPiel(String piel) {
		this.piel = piel;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}
}
