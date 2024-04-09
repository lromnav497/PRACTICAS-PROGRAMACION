package unidad4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import unidad4.model.AvestruzDO;
import unidad4.model.KoalaDO;

public class AvestruzDAO {

	public static int eliminar(int id, Connection con) {
		try {
			String sql = "DELETE FROM Avestruz WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 0 : -1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	public static int insertar(AvestruzDO avestruz, Connection con) {
		if (avestruz == null || avestruz.getNombre() == null || avestruz.getNickguerra() == null
				|| avestruz.getEdad() == 0 || avestruz.getAltura() == 0.0f || avestruz.getNivelMalaLeche() == 0
				|| avestruz.getNumHuevos() == 0) {
			return 0; // El objeto avestruz es nulo o no tiene datos en todos los campos
		}

		try {
			// Comprobar si ya existe un registro con el mismo id en la base de datos
			String checkSql = "SELECT * FROM Avestruz WHERE id = ?";
			PreparedStatement checkPs = con.prepareStatement(checkSql);
			checkPs.setInt(1, avestruz.getId());
			ResultSet rs = checkPs.executeQuery();
			if (rs.next()) {
				return 0; // Ya existe un registro con el mismo id
			}

			// Insertar el registro
			String sql = "INSERT INTO Avestruz (nombre, nickguerra, edad, altura, nivelMalaLeche, numHuevos) VALUES (?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, avestruz.getNombre());
			ps.setString(2, avestruz.getNickguerra());
			ps.setInt(3, avestruz.getEdad());
			ps.setFloat(4, avestruz.getAltura());
			ps.setInt(5, avestruz.getNivelMalaLeche());
			ps.setInt(6, avestruz.getNumHuevos());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static int actualizar(AvestruzDO avestruz, Connection con) {
		try {
			String sql = "UPDATE Avestruz SET nombre = ?, nickguerra = ?, edad = ?, altura = ?, nivelMalaLeche = ?, numHuevos = ? WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, avestruz.getNombre());
			ps.setString(2, avestruz.getNickguerra());
			ps.setInt(3, avestruz.getEdad());
			ps.setFloat(4, avestruz.getAltura());
			ps.setInt(5, avestruz.getNivelMalaLeche());
			ps.setInt(6, avestruz.getNumHuevos());
			ps.setInt(7, avestruz.getId());
			int rowsAffected = ps.executeUpdate();
			return rowsAffected > 0 ? 1 : 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;
		}
	}

	public static AvestruzDO cargar(Connection con, int id) {
		try {
			String sql = "SELECT * FROM Avestruz WHERE id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				return new AvestruzDO(rs.getInt("id"), rs.getString("nombre"), rs.getString("nickguerra"),
						rs.getInt("edad"), rs.getFloat("altura"), rs.getInt("nivelMalaLeche"), rs.getInt("numHuevos"));
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static ArrayList<KoalaDO> cargarLacayos(int idAvestruz, Connection con) {
		ArrayList<KoalaDO> lacayos = new ArrayList<>();
		try {
			String sql = "SELECT * FROM koala WHERE id_Avestruz = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idAvestruz);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				lacayos.add(new KoalaDO(rs.getInt("id"), rs.getString("nombre"), rs.getString("nickguerra"),
						rs.getInt("edad"), rs.getString("color"), rs.getInt("fuerza"), rs.getInt("inteligencia"),
						rs.getInt("horasSueno"), rs.getInt("tiempoBerserk"), rs.getInt("id_Avestruz")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lacayos;
	}

	public static int cantidadFrutas(int idAvestruz, Connection con) {
		int cantidad = 0;
		try {
			String sql = "SELECT COUNT(*) AS cantidad FROM koala_fruta WHERE koala_id IN (SELECT id FROM Koala WHERE id_Avestruz = ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idAvestruz);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				cantidad = rs.getInt("cantidad");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cantidad;
	}

	public static ArrayList<KoalaDO> cargarLacayosFiltrado(Connection con, int idAvestruz, String[] parametros) {
		ArrayList<KoalaDO> lacayos = new ArrayList<>();
		try {
			String sql = "SELECT * FROM Koala WHERE id_avestruz = ? AND " + parametros[0] + " " + parametros[1] + " ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, idAvestruz);
			if (parametros[3].equals("entero")) {
				ps.setInt(2, Integer.parseInt(parametros[2]));
			} else {
				ps.setString(2, parametros[2]);
			}
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				lacayos.add(new KoalaDO(rs.getInt("id"), rs.getString("nombre"), rs.getString("nickguerra"),
						rs.getInt("edad"), rs.getString("color"), rs.getInt("fuerza"), rs.getInt("inteligencia"),
						rs.getInt("horasSueno"), rs.getInt("tiempoBerserk"), rs.getInt("id_Avestruz")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lacayos;
	}

	public static ArrayList<KoalaDO> cargarLacayosPaginado(Connection con, int idAvestruz, int numElem, int numPag) {
		ArrayList<KoalaDO> lacayos = new ArrayList<>();
		String sql = "SELECT * FROM Koala WHERE id_avestruz = ? LIMIT ? OFFSET ?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idAvestruz);
			pstmt.setInt(2, numElem);
			pstmt.setInt(3, (numPag - 1) * numElem);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				lacayos.add(new KoalaDO(rs.getInt("id"), rs.getString("nombre"), rs.getString("nickguerra"),
						rs.getInt("edad"), rs.getString("color"), rs.getInt("fuerza"), rs.getInt("inteligencia"),
						rs.getInt("horasSueno"), rs.getInt("tiempoBerserk"), rs.getInt("id_Avestruz")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return lacayos;
	}

}
