package unidad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import unidad4.model.FrutaDO;
import unidad4.model.KoalaDO;

public class KoalaDAO {

	public static int eliminar(int id, Connection con) {
		try {
			String sql = "DELETE FROM Koala WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 0 : -1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static int insertar(KoalaDO koala, Connection con) {
		if (koala == null || koala.getNombre() == null || koala.getNickguerra() == null || koala.getEdad() == 0
				|| koala.getColor() == null || koala.getFuerza() == 0 || koala.getInteligencia() == 0
				|| koala.getHorasSueno() == 0 || koala.getTiempoBerserk() == 0 || koala.getid_Avestruz() == 0) {
			return 0; // El objeto koala es nulo o no tiene datos en todos los campos
		}

		try {
			// Comprobar si ya existe un registro con el mismo id en la base de datos
			String checkSql = "SELECT * FROM Koala WHERE id = ?";
			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, koala.getId());
			ResultSet rs = checkPs.executeQuery();
			if (rs.next()) {
				return 0; // Ya existe un registro con el mismo id
			}

			// Insertar el registro
			String sql = "INSERT INTO Koala (nombre, nickguerra, edad, color, fuerza, inteligencia, horasSueno, tiempoBerserk, id_Avestruz) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, koala.getNombre());
			ps.setString(2, koala.getNickguerra());
			ps.setInt(3, koala.getEdad());
			ps.setString(4, koala.getColor());
			ps.setInt(5, koala.getFuerza());
			ps.setInt(6, koala.getInteligencia());
			ps.setInt(7, koala.getHorasSueno());
			ps.setInt(8, koala.getTiempoBerserk());
			ps.setInt(9, koala.getid_Avestruz());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int actualizar(KoalaDO koala, Connection con) {
		try {
			String sql = "UPDATE Koala SET nombre = ?, nickguerra = ?, edad = ?, color = ?, fuerza = ?, inteligencia = ?, horasSueno = ?, tiempoBerserk = ?, id_Avestruz = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, koala.getNombre());
			ps.setString(2, koala.getNickguerra());
			ps.setInt(3, koala.getEdad());
			ps.setString(4, koala.getColor());
			ps.setInt(5, koala.getFuerza());
			ps.setInt(6, koala.getInteligencia());
			ps.setInt(7, koala.getHorasSueno());
			ps.setInt(8, koala.getTiempoBerserk());
			ps.setInt(9, koala.getid_Avestruz());
			ps.setInt(10, koala.getId());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static KoalaDO cargar(Connection con, int id) {
		try {
			String sql = "SELECT * FROM Koala WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return new KoalaDO(rs.getInt("id"), rs.getString("nombre"), rs.getString("nickguerra"),
						rs.getInt("edad"), rs.getString("color"), rs.getInt("fuerza"), rs.getInt("inteligencia"),
						rs.getInt("horasSueno"), rs.getInt("tiempoBerserk"), rs.getInt("id_Avestruz"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ArrayList<FrutaDO> cargarFrutas(int id, Connection con) {
		ArrayList<FrutaDO> frutas = new ArrayList<>();
		try {
			String sql = "SELECT f.* FROM Fruta f INNER JOIN koala_fruta kf ON f.id = kf.fruta_id WHERE kf.koala_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				frutas.add(new FrutaDO(rs.getInt("id"), rs.getString("nombre"), rs.getInt("danio"),
						rs.getInt("puntosRec"), rs.getString("tipo")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return frutas;
	}
}
