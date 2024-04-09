package unidad4.model;

public class CarritoGolfDO {
	private int id;
	private int numSerie;
	private String marca;
	private int velocidadmax;
	private int armamento;
	private int municion;

	// Constructor vacío
	public CarritoGolfDO() {
	}

	// Constructor con campos
	public CarritoGolfDO(int id, int numSerie, String marca, int velocidadmax, int armamento, int municion) {
		this.id = id;
		this.numSerie = numSerie;
		this.marca = marca;
		this.velocidadmax = velocidadmax;
		this.armamento = armamento;
		this.municion = municion;
	}

	// Métodos get/set para cada campo
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadmax() {
		return velocidadmax;
	}

	public void setVelocidadmax(int velocidadmax) {
		this.velocidadmax = velocidadmax;
	}

	public int getArmamento() {
		return armamento;
	}

	public void setArmamento(int armamento) {
		this.armamento = armamento;
	}

	public int getMunicion() {
		return municion;
	}

	public void setMunicion(int municion) {
		this.municion = municion;
	}
}
