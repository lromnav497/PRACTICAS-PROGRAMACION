package unidad3;

import java.util.Random;

public class Cuerpo {
	private String nombre;
	private int edad;
	private double peso;
	private String raza;
	private int estado;
	private Organo[] organos = new Organo[8];

	public static final int VIVO = 0;
	public static final int COMA = 1;
	public static final int MUERTO = 2;

	public static final int SANO = 0;
	public static final int MALARIA = 1;
	public static final int BRONQUITIS = 2;
	public static final int GRIPE = 3;
	public static final int CANCER = 4;
	public static final int PARKINSON = 5;

	// Contructor cuerpo
	public Cuerpo() {
		Random rand = new Random();
		this.edad = rand.nextInt(100); // Edad aleatoria entre 0 y 99
		this.peso = 30 + (120 - 30) * rand.nextDouble(); // Peso aleatorio entre 30 y 120
		this.estado = rand.nextInt(3); // Estado aleatorio entre 0 y 2
		for (int i = 0; i < organos.length; i++) {
			organos[i] = new Organo(); // Crear órganos con el constructor vacío de Organo
		}
	}

	// Poniendo variables en el constructor
	public Cuerpo(String nombre, int edad, double peso, String raza, int estado, Organo[] organos) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.estado = estado;
		this.organos = organos;
	}

	// Métodos get y set para cada variable miembro

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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	// Funcion de transplante
	public int trasplante(Organo O) {
		for (int i = 0; i < organos.length; i++) {
			if (organos[i].getNombre().equals(O.getNombre())) {
				if (organos[i].revision() && O.revision() && O.getEstado() == Organo.SANO
						&& (organos[i].getEstado() == Organo.PERJUDICADO
								|| organos[i].getEstado() == Organo.CANCERIGENO)) {
					organos[i] = O;
					return 0;
				} else {
					return -1;
				}
			}
		}
		return -1;
	}

	// Funcion de curacion
	public Organo cura(Organo O) {
		if (O.revision()) {
			if (O.getEstado() == Organo.CANCERIGENO && O.getPeso() >= 200 && O.getPeso() <= 1000) {
				if (Math.random() <= 0.65) {
					O.setEstado(Organo.SANO);
					return O;
				}
			} else if (O.getEstado() == Organo.PERJUDICADO && !O.getNombre().equals("cerebro")
					&& !O.getNombre().equals("corazón")) {
				if (Math.random() <= 0.90) {
					O.setEstado(Organo.SANO);
					return O;
				}
			}
		}
		return null;
	}

	// Funcion de oncologia
	public boolean oncologia() {
		for (Organo organo : organos) {
			if (organo.getEstado() == Organo.CANCERIGENO) {
				return true;
			}
		}
		return false;
	}

	// Funcion de revision general
	public int[] revisionGeneral() {
		int[] enfermedades = new int[organos.length];
		for (int i = 0; i < organos.length; i++) {
			if (organos[i].getEstado() == Organo.SANO) {
				enfermedades[i] = SANO; // Sano
			} else if (organos[i].getEstado() == Organo.CANCERIGENO) {
				enfermedades[i] = CANCER; // Cáncer
			} else if (organos[i].getNombre().equals("cerebro") && organos[i].getEstado() == Organo.DOLOR
					&& organos[i].getNombre().equals("riñones") && organos[i].getEstado() == Organo.PERJUDICADO) {
				enfermedades[i] = MALARIA; // Malaria
			} else if (organos[i].getNombre().equals("oído") && organos[i].getEstado() == Organo.PERJUDICADO
					&& organos[i].getNombre().equals("cerebro") && organos[i].getEstado() == Organo.PERJUDICADO) {
				enfermedades[i] = PARKINSON; // Parkinson
			} else if (organos[i].getNombre().equals("pulmones") && organos[i].getEstado() == Organo.PERJUDICADO
					&& organos[i].getNombre().equals("cerebro") && organos[i].getEstado() == Organo.DOLOR) {
				enfermedades[i] = BRONQUITIS; // Bronquitis
			} else if (organos[i].getNombre().equals("estomago") && organos[i].getEstado() == Organo.DOLOR
					&& organos[i].getNombre().equals("pulmones") && organos[i].getEstado() == Organo.DOLOR
					&& organos[i].getNombre().equals("cerebro") && organos[i].getEstado() == Organo.DOLOR) {
				enfermedades[i] = GRIPE; // Gripe
			}
		}
		return enfermedades;
	}
}
