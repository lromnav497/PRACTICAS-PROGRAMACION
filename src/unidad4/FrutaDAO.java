package unidad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import unidad4.model.FrutaDO;

public class FrutaDAO {

	public static int eliminar(int id, Connection con) {
		try {
			String sql = "DELETE FROM Fruta WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 0 : -1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static int insertar(FrutaDO fruta, Connection con) {
		if (fruta == null || fruta.getNombre() == null || fruta.getDanio() == 0 || fruta.getPuntosRec() == 0
				|| fruta.getTipo() == null) {
			return 0; // El objeto fruta es nulo o no tiene datos en todos los campos
		}

		try {
			// Comprobar si ya existe un registro con el mismo nombre en la base de datos
			String checkSql = "SELECT * FROM Fruta WHERE id = ?";
			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, fruta.getId());
			ResultSet rs = checkPs.executeQuery();
			if (rs.next()) {
				return 0; // Ya existe un registro con el mismo nombre
			}

			// Insertar el registro
			String sql = "INSERT INTO Fruta (nombre, danio, puntosRec, tipo) VALUES (?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, fruta.getNombre());
			ps.setInt(2, fruta.getDanio());
			ps.setInt(3, fruta.getPuntosRec());
			ps.setString(4, fruta.getTipo());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int actualizar(FrutaDO fruta, Connection con) {
		try {
			String sql = "UPDATE Fruta SET danio = ?, puntosRec = ?, tipo = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, fruta.getDanio());
			ps.setInt(2, fruta.getPuntosRec());
			ps.setString(3, fruta.getTipo());
			ps.setString(4, fruta.getNombre());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static FrutaDO cargar(Connection con, int id) {
		try {
			String sql = "SELECT * FROM Fruta WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return new FrutaDO(rs.getInt("id"), rs.getString("nombre"), rs.getInt("danio"), rs.getInt("puntosRec"),
						rs.getString("tipo"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
}
