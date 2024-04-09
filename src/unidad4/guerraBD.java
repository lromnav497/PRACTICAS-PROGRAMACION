package unidad4;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import unidad4.model.AvestruzDO;
import unidad4.model.CarritoGolfDO;
import unidad4.model.FrutaDO;
import unidad4.model.KoalaDO;
import unidad4.utils.ConectarBD;

public class guerraBD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Intentamos conectar con BD");
		// Ejecutamos la funcion de conexion
		Connection con = ConectarBD.conectarBD();

		try {
			// Primer paso creo un statement
			Statement stmt = con.createStatement();

			// Crear un nuevo objeto AvestruzDO
			AvestruzDO avestruz = new AvestruzDO(0, "Joselito", "Valenzuela", 55, 6, 5, 2);
			// Crear un nuevo objeto AvestruzDO para actualizar
			AvestruzDO avestruzParaActualizar = new AvestruzDO(14, "Pepe", "Sanchez", 2, 6, 8, 3);

			// Llamar a la función eliminar de AvestruzDAO
			int funcionEliminar = AvestruzDAO.eliminar(11, con);
			// Llamar a la función insertar de AvestruzDAO
			int funcionInsertar = AvestruzDAO.insertar(avestruz, con);
			// Llamar a la función actualizar de AvestruzDAO
			int funcionActualizar = AvestruzDAO.actualizar(avestruzParaActualizar, con);

			// Imprimir el resultado de las funciones
			System.out.println("Se han eliminado " + funcionEliminar + " columnas");
			System.out.println("Se han insertado " + funcionInsertar + " columnas");
			System.out.println("Se han actualizado " + funcionActualizar + " columnas");

			// Cargar un avestruz con un id específico
			if (AvestruzDAO.cargar(con, 5) != null) {
				System.out.println("Avestruz cargado: " + AvestruzDAO.cargar(con, 5).getNombre());
			} else {
				System.out.println("No se encontró el avestruz con el id: " + 5);
			}

			// Cargar los lacayos de un avestruz
			System.out.println("");
			for (KoalaDO koala : AvestruzDAO.cargarLacayos(1, con)) {
				System.out.println("| " + koala.getNombre() + " |");
				System.out.println("----------------------------");
			}

			// Obtener la cantidad de frutas de un avestruz
			int cantidadFrutas = AvestruzDAO.cantidadFrutas(2, con);
			System.out.println("");
			System.out.println("El avestruz tiene " + cantidadFrutas + " frutas");

			// Definir los parámetros para la búsqueda
			String[] parametros = { "edad", "=", "95", "entero" };

			// Llamar a la función de carga de lacayos filtrados e imprimir los resultados
			System.out.println("");
			System.out.println("Koalas que tienen 95 años: ");
			for (KoalaDO koala : AvestruzDAO.cargarLacayosFiltrado(con, 1, parametros)) {
				System.out.println("| " + koala + " |");
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			}

			// Crear un nuevo objeto KoalaDO
			KoalaDO koala = new KoalaDO(0, "Joselito", "Valenzuela", 55, "#bbed95", 6, 5, 2, 4, 8);
			// Crear un nuevo objeto KoalaDO para actualizar
			KoalaDO koalaActualizar = new KoalaDO(310, "Pepe", "Sanchez", 22, "#cc5755", 2, 6, 8, 3, 7);

			// Llamar a las funciones de KoalaDAO
			int funcionEliminarKoala = KoalaDAO.eliminar(11, con);
			int funcionInsertarKoala = KoalaDAO.insertar(koala, con);
			int funcionActualizarKoala = KoalaDAO.actualizar(koalaActualizar, con);

			// Imprimir el resultado de las funciones
			System.out.println("Se han eliminado " + funcionEliminarKoala + " columnas");
			System.out.println("Se han insertado " + funcionInsertarKoala + " columnas");
			System.out.println("Se han actualizado " + funcionActualizarKoala + " columnas");

			// Cargar un koala con un id específico
			if (KoalaDAO.cargar(con, 311) != null) {
				System.out.println("Koala cargado: " + KoalaDAO.cargar(con, 311).getNombre());
			} else {
				System.out.println("No se encontró el koala con el id: " + 311);
			}

			// Cargar las frutas de un koala
			System.out.println("");
			System.out.println("El koala tiene las siguientes frutas: ");
			for (FrutaDO fruta : KoalaDAO.cargarFrutas(194, con)) {
				System.out.println("| " + fruta.getNombre() + " |");
				System.out.println("----------------------------");
			}

			// Crear un nuevo objeto CarritoGolfDO
			CarritoGolfDO carritogolf = new CarritoGolfDO(0, 325405, "elpepe", 2, 3, 6);
			// Crear un nuevo objeto CarritoGolfDO para actualizar
			CarritoGolfDO carritogolfActualizar = new CarritoGolfDO(5, 340705, "Biden", 34, 2, 6);

			// Llamar a las funciones de CarritoDAO
			int funcionEliminarCarrito = CarritoDAO.eliminar(11, con);
			int funcionInsertarCarrito = CarritoDAO.insertar(carritogolf, con);
			int funcionActualizarCarrito = CarritoDAO.actualizar(carritogolfActualizar, con);

			// Imprimir el resultado de las funciones
			System.out.println("Se han eliminado " + funcionEliminarCarrito + " columnas");
			System.out.println("Se han insertado " + funcionInsertarCarrito + " columnas");
			System.out.println("Se han actualizado " + funcionActualizarCarrito + " columnas");

			// Cargar un carrito de golf con un id específico
			if (CarritoDAO.cargar(con, 5) != null) {
				System.out.println("CarritoGolf cargado: " + CarritoDAO.cargar(con, 5).getNumSerie());
			} else {
				System.out.println("No se encontró el carritogolf con el id: " + 5);
			}

			// Crear un nuevo objeto FrutaDO
			FrutaDO fruta = new FrutaDO(0, "ErPera", 999, 999, "Mitica");
			// Crear un nuevo objeto FrutaDO para actualizar
			FrutaDO frutaActualizar = new FrutaDO(2, "Abaricoque", 12, 23, "Exotica");

			// Llamar a la función eliminar de FrutaDAO
			int funcionEliminarFruta = FrutaDAO.eliminar(40, con);
			// Llamar a la función insertar de FrutaDAO
			int funcionInsertarFruta = FrutaDAO.insertar(fruta, con);
			// Llamar a la función actualizar de FrutaDAO
			int funcionActualizarFruta = FrutaDAO.actualizar(frutaActualizar, con);

			// Imprimir el resultado de las funciones
			System.out.println("Se han eliminado " + funcionEliminarFruta + " columnas");
			System.out.println("Se han insertado " + funcionInsertarFruta + " columnas");
			System.out.println("Se han actualizado " + funcionActualizarFruta + " columnas");

			// Cargar una fruta con un id específico
			if (FrutaDAO.cargar(con, 5) != null) {
				System.out.println("Fruta cargada: " + FrutaDAO.cargar(con, 5).getNombre());
			} else {
				System.out.println("No se encontró la fruta con el id: " + 5);
			}

			Scanner scanner = new Scanner(System.in);
			int idAvestruz = 7; // Reemplaza esto con el ID de avestruz que desees
			int numElem = 5; // Número de elementos por página
			int numPag = 1; // Página inicial

			System.out.println("");
			System.out.println("Lacayos paginados: ");

			while (true) {
				ArrayList<KoalaDO> lacayos = AvestruzDAO.cargarLacayosPaginado(con, idAvestruz, numElem, numPag);
				for (KoalaDO koalaP : lacayos) {
					System.out.println(koalaP);
				}

				System.out.println("\n¿Quieres ver la siguiente página? (s/n)");
				String respuesta = scanner.nextLine();
				if (respuesta.equalsIgnoreCase("s")) {
					numPag++;
				} else {
					break;
				}
			}

			scanner.close();
			// Cerrar la conexión
			con.close();

			// Manejar cualquier excepción SQL que pueda ocurrir
		} catch (

		SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
