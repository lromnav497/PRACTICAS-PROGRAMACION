package unidad2Bucles;

public class Practica9Unidad2Bucles {
	// Definir las constantes para los tipos de elementos
    public static final char CIUDAD = 'T';
    public static final char CAMINO = 'R';
    public static final char MONSTRUO = 'M';
    public static final char TIERRA_MALDITA = 'D';

    public static void main(String[] args) {
    	// Representación del mapa
        char[][] mapa = {
            {CIUDAD, CAMINO, CAMINO, CIUDAD, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, MONSTRUO},
            {TIERRA_MALDITA, TIERRA_MALDITA, CAMINO, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, MONSTRUO, TIERRA_MALDITA},
            {TIERRA_MALDITA, TIERRA_MALDITA, CAMINO, TIERRA_MALDITA, MONSTRUO, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA},
            {MONSTRUO, TIERRA_MALDITA, CAMINO, CAMINO, CAMINO, CAMINO, TIERRA_MALDITA, TIERRA_MALDITA},
            {TIERRA_MALDITA, MONSTRUO, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, CAMINO, TIERRA_MALDITA, TIERRA_MALDITA},
            {TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, MONSTRUO, TIERRA_MALDITA, CAMINO, TIERRA_MALDITA, MONSTRUO},
            {TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, CAMINO, CAMINO, CIUDAD},
            {MONSTRUO, MONSTRUO, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA, TIERRA_MALDITA}
        };

        // Contadores para las ciudades, monstruos y caminos
        int ciudades = 0;
        int monstruos = 0;
        int caminos = 0;

        // Contar las ciudades, monstruos y caminos
        for (int i = 0; i < mapa.length; i++) {
            for (int j = 0; j < mapa[i].length; j++) {
                switch (mapa[i][j]) {
                    case CIUDAD:
                        ciudades++;
                        break;
                    case MONSTRUO:
                        monstruos++;
                        break;
                    case CAMINO:
                        caminos++;
                        break;
                }
            }
        }

        // Comprobar si las ciudades están conectadas por caminos
        if (caminos >= ciudades - 1) {
            System.out.println("Las ciudades están conectadas por caminos.");
        } else {
            System.out.println("Las ciudades no están conectadas por caminos.");
        }

        // Comprobar si hay más monstruos que ciudades
        if (monstruos > ciudades) {
            System.out.println("No hay esperanza, hay más monstruos que ciudades.");
        } else {
            System.out.println("Hay esperanza, hay más ciudades que monstruos.");
        }
    }
}
