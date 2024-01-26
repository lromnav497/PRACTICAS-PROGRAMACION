package unidad3;

public class Objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para crear un objeto de tipo persona utilizamos new Persona()
		Persona mario = new Persona();

		/*
		 * Para acceder a las propiedades del objeto se utiliza el operador "."
		 * 
		 */
		mario.nombre = "Mario";
		mario.edad = 18;
		mario.peso = 78;
		mario.vivo = true;

		calculadora oper = new calculadora();

		System.out.println(oper.suma(2, 2));

	}

}
