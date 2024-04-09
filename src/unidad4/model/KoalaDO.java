package unidad4.model;

public class KoalaDO {
	private int id;
	private String nombre;
	private String nickguerra;
	private int edad;
	private String color;
	private int fuerza;
	private int inteligencia;
	private int horasSueno;
	private int tiempoBerserk;
	private int id_Avestruz;

	// Constructor vacío
	public KoalaDO() {
	}

	// Constructor con campos
	public KoalaDO(int id, String nombre, String nickguerra, int edad, String color, int fuerza, int inteligencia,
			int horasSueno, int tiempoBerserk, int id_Avestruz) {
		this.id = id;
		this.nombre = nombre;
		this.nickguerra = nickguerra;
		this.edad = edad;
		this.color = color;
		this.fuerza = fuerza;
		this.inteligencia = inteligencia;
		this.horasSueno = horasSueno;
		this.tiempoBerserk = tiempoBerserk;
		this.id_Avestruz = id_Avestruz;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	public int getHorasSueno() {
		return horasSueno;
	}

	public void setHorasSueno(int horasSueno) {
		this.horasSueno = horasSueno;
	}

	public int getTiempoBerserk() {
		return tiempoBerserk;
	}

	public void setTiempoBerserk(int tiempoBerserk) {
		this.tiempoBerserk = tiempoBerserk;
	}

	public int getid_Avestruz() {
		return id_Avestruz;
	}

	public void setid_Avestruz(int id_Avestruz) {
		this.id_Avestruz = id_Avestruz;
	}

	@Override
	public String toString() {
		return "[Identificador:" + id + ", Nombre:" + nombre + ", Nickguerra:" + nickguerra + ", Edad:" + edad
				+ ", Color:" + color + ", Fuerza:" + fuerza + ", Inteligencia:" + inteligencia + ", Hora sueño:"
				+ horasSueno + ", Tiempo Berserk:" + tiempoBerserk + ", Identificador-Avestruz:" + id_Avestruz + "]";
	}
}
