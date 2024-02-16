package unidad4;

import java.sql.Connection;
import java.sql.SQLException;

public class Ejemplotransaccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = UtilsBD.conectarBD();

		try {
			con.setAutoCommit(false);

			ClienteDO juan = new ClienteDO(-1, "juan", "perez", 23, "M", "email@email2.com", "password");

			ModelCliente.insertCliente(con, juan);

			juan.setIdCliente(102);
			juan.setApellidos("Picapiedra");

		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
