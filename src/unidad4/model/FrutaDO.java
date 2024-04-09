package unidad4.model;

public class FrutaDO {
	private int id;
	private String nombre;
	private int danio;
	private int puntosRec;
	private String tipo;

	// Constructor vacío
	public FrutaDO() {
	}

	// Constructor con campos
	public FrutaDO(int id, String nombre, int danio, int puntosRec, String tipo) {
		this.id = id;
		this.nombre = nombre;
		this.danio = danio;
		this.puntosRec = puntosRec;
		this.tipo = tipo;
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

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		this.danio = danio;
	}

	public int getPuntosRec() {
		return puntosRec;
	}

	public void setPuntosRec(int puntosRec) {
		this.puntosRec = puntosRec;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
