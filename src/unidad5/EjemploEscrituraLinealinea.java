package unidad5;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class EjemploEscrituraLinealinea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub JAVI
		try {
			FileWriter fw = new FileWriter("D:\\Clases\\PROGRAMACION\\PROYECTOS\\PRACTICAS PROGRAMACION\\leer.txt",
					true);

			BufferedWriter bw = new BufferedWriter(fw);

			String lineas[] = { "primera linea", "segunda linea", "tercera linea", "cuarta linea" };

			// Bucle que recorre el array lineas con un for each y lo escribe en el fichero
			// leer.txt
			for (String linea : lineas) {
				// Escribimos una linea
				bw.write(linea);
				// Seguimos la linea
				bw.newLine();

			}

			bw.close();
			fw.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
