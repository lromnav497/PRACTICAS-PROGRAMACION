package unidad5;

import java.io.File;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fichero = new File("leeme.txt");
		File fichero2 = new File("leeme2.txt");

		if (fichero.exists()) {
			System.out.println("Fichero existente");
			fichero.renameTo(fichero2);
		} else
			System.out.println("Fichero no existe");

		File directorio = new File(".");

		System.out.println(Arrays.toString(directorio.list()));
	}

}
