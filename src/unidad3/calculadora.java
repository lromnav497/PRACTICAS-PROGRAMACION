package unidad3;

public class calculadora {

	/**
	 * Funcion que recibe dos numeros y los suma
	 * 
	 * @param x
	 * @param y
	 * 
	 *          Para definir una funcion se sigue la siguiente sintaxis: public
	 *          <tipo devolver> nombre_funcion(<param1>,<param2>,...){codigo}
	 */

	public int suma(int x, int y) {

		// Hago los calculos
		int suma = x + y;

		// Con return devuelvo la suma de los dos numeros que me pasan como parametro
		return suma;
	}
}
