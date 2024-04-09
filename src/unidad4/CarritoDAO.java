package unidad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import unidad4.model.CarritoGolfDO;

public class CarritoDAO {

	public static int eliminar(int id, Connection con) {
		try {
			String sql = "DELETE FROM CarritoGolf WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 0 : -1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static int insertar(CarritoGolfDO carrito, Connection con) {
		if (carrito == null || carrito.getMarca() == null || carrito.getVelocidadmax() == 0
				|| carrito.getArmamento() == 0 || carrito.getMunicion() == 0) {
			return 0; // El objeto carrito es nulo o no tiene datos en todos los campos
		}

		try {
			// Comprobar si ya existe un registro con el mismo numSerie en la base de datos
			String checkSql = "SELECT * FROM CarritoGolf WHERE id = ?";
			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, carrito.getId());
			ResultSet rs = checkPs.executeQuery();
			if (rs.next()) {
				return 0; // Ya existe un registro con el mismo numSerie
			}

			// Insertar el registro
			String sql = "INSERT INTO CarritoGolf (numSerie, marca, velocidadmax, armamento, municion) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, carrito.getNumSerie());
			ps.setString(2, carrito.getMarca());
			ps.setInt(3, carrito.getVelocidadmax());
			ps.setInt(4, carrito.getArmamento());
			ps.setInt(5, carrito.getMunicion());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int actualizar(CarritoGolfDO carrito, Connection con) {
		try {
			String sql = "UPDATE CarritoGolf SET marca = ?, velocidadmax = ?, armamento = ?, municion = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, carrito.getMarca());
			ps.setInt(2, carrito.getVelocidadmax());
			ps.setInt(3, carrito.getArmamento());
			ps.setInt(4, carrito.getMunicion());
			ps.setInt(5, carrito.getNumSerie());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static CarritoGolfDO cargar(Connection con, int id) {
		try {
			String sql = "SELECT * FROM CarritoGolf WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return new CarritoGolfDO(rs.getInt("id"), rs.getInt("numSerie"), rs.getString("marca"),
						rs.getInt("velocidadmax"), rs.getInt("armamento"), rs.getInt("municion"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
