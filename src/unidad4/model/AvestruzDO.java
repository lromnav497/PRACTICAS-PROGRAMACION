package unidad4.model;

public class AvestruzDO {
	private int id;
	private String nombre;
	private String nickguerra;
	private int edad;
	private float altura;
	private int nivelMalaLeche;
	private int numHuevos;

	// Constructor vacío
	public AvestruzDO() {
	}

	// Constructor con campos
	public AvestruzDO(int id, String nombre, String nickguerra, int edad, float altura, int nivelMalaLeche,
			int numHuevos) {
		this.id = id;
		this.nombre = nombre;
		this.nickguerra = nickguerra;
		this.edad = edad;
		this.altura = altura;
		this.nivelMalaLeche = nivelMalaLeche;
		this.numHuevos = numHuevos;
	}

	// Métodos get/set para cada campo
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNickguerra() {
		return nickguerra;
	}

	public void setNickguerra(String nickguerra) {
		this.nickguerra = nickguerra;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public int getNivelMalaLeche() {
		return nivelMalaLeche;
	}

	public void setNivelMalaLeche(int nivelMalaLeche) {
		this.nivelMalaLeche = nivelMalaLeche;
	}

	public int getNumHuevos() {
		return numHuevos;
	}

	public void setNumHuevos(int numHuevos) {
		this.numHuevos = numHuevos;
	}
}
