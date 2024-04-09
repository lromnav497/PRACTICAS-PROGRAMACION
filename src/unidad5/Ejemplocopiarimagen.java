package unidad5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejemplocopiarimagen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "D:\\HTML y Capturas\\Tema2\\imagenes\\Diagrama03.png";
		String ficherodestino = "D:\\Clases\\PROGRAMACION\\PROYECTOS\\PRACTICAS PROGRAMACION\\nueva.png";

		File directorio_imagen = new File(".\\PRACTICAS PROGRAMACION");

		if (!directorio_imagen.exists()) {
			directorio_imagen.mkdir();
		}

		try {
			FileInputStream fis = new FileInputStream(filename);
			FileOutputStream fos = new FileOutputStream(ficherodestino);

			byte buffer[] = new byte[1024];

			int numDatos = fis.read(buffer);

			while (numDatos != -1) {
				fos.write(buffer);
				numDatos = fis.read(buffer);
			}

			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
