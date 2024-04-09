package unidad5;

import java.io.BufferedReader;
import java.io.FileReader;

public class leer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader lector = new FileReader("D:\\Clases\\PROGRAMACION\\PROYECTOS\\PRACTICAS PROGRAMACION\\leer.txt");

			BufferedReader br = new BufferedReader(lector);

			String linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}

			lector.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
