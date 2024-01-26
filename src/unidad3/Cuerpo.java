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

	public Cuerpo() {
		Random rand = new Random();
		this.edad = rand.nextInt(100); // Edad aleatoria entre 0 y 99
		this.peso = 30 + (120 - 30) * rand.nextDouble(); // Peso aleatorio entre 30 y 120
		this.estado = rand.nextInt(3); // Estado aleatorio entre 0 y 2
		for (int i = 0; i < organos.length; i++) {
			organos[i] = new Organo(); // Crear órganos con el constructor vacío de Organo
		}
	}

	public Cuerpo(String nombre, int edad, double peso, String raza, int estado, Organo[] organos) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.raza = raza;
		this.estado = estado;
		this.organos = organos;
	}

	// Métodos get y set para cada variable miembro

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

	public boolean oncologia() {
		for (Organo organo : organos) {
			if (organo.getEstado() == Organo.CANCERIGENO) {
				return true;
			}
		}
		return false;
	}

	public int[] revisionGeneral() {
		int[] codigosError = new int[organos.length];
		for (int i = 0; i < organos.length; i++) {
			if (organos[i].getEstado() == Organo.SANO) {
				codigosError[i] = 6; // Sano
			} else if (organos[i].getEstado() == Organo.CANCERIGENO) {
				codigosError[i] = 5; // Cáncer
			} else if (organos[i].getNombre().equals("cabeza") && organos[i].getEstado() == Organo.DOLOR) {
				codigosError[i] = 1; // Malaria
			} else if (organos[i].getNombre().equals("oído") && organos[i].getEstado() == Organo.PERJUDICADO) {
				codigosError[i] = 2; // Parkinson
			} else if (organos[i].getNombre().equals("pulmones") && organos[i].getEstado() == Organo.PERJUDICADO) {
				codigosError[i] = 3; // Bronquitis
			} else if (organos[i].getNombre().equals("estomago") && organos[i].getEstado() == Organo.DOLOR) {
				codigosError[i] = 4; // Gripe
			}
		}
		return codigosError;
	}
}
