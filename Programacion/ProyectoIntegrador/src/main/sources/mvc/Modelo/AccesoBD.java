package mvc.Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import mvc.Vista.DarAltaProyecto;
import mvc.Vista.DarBajaProyecto;
import mvc.Vista.InicioSesion;

/**
 * Clase que maneja el acceso a la base de datos.
 */
public class AccesoBD {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/BBDD_P_I";
	private String usuario = "root";
	private String password = "root";
	Connection con = null;

	/**
	 * Establece la conexión con la base de datos.
	 * 
	 * @return la conexión establecida.
	 */
	public Connection getConexion() {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	/**
	 * Cierra la conexión con la base de datos.
	 */
	public void cerrarConexion() {

		try {
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/**
	 * Comprueba la contraseña de un alumno en la base de datos.
	 * 
	 * @param comprobacionPassword la contraseña a comprobar.
	 * @return true si la contraseña es correcta, false de lo contrario.
	 */
	public boolean comprobarContrasenaAlumno(String comprobacionPassword) {
		boolean comprobarP = false;
		Statement stmt;
		try {
			stmt = con.createStatement();

			String query = "SELECT * FROM ALUMNOS WHERE numExpediente= '" + comprobacionPassword + "';";
			ResultSet resultados = stmt.executeQuery(query);

			if (resultados.next()) {
				comprobarP = true;
			} else {
				comprobarP = false;
			}

			resultados.close();
			stmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return comprobarP;
	}

	public String darAltaProyecto(DatosProyectoIntegrador proyecto) {
		String codigoAsignado = "";
		String query = "INSERT INTO Proyecto_Integrador(nombreProy, Area_CodAr, año, notaFinal,URL,curso) VALUES (?,?,?,?,?,?)";

		try {

			// coge los valores que se hayan introducido por teclado
			PreparedStatement statement = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, proyecto.getNombreProy());
			String seleccion = proyecto.getArea();
			statement.setString(2, seleccion);
			statement.setString(3, proyecto.getAño());
			statement.setString(4, proyecto.getNotaFinal());
			statement.setString(5, proyecto.getUrl());
			statement.setString(6, proyecto.getCurso());

			int rowsAffected = statement.executeUpdate();

			// comprueba que se haya actualizado la base de datos
			if (rowsAffected > 0) {

				ResultSet generatedKeys = statement.getGeneratedKeys();

				if (generatedKeys.next()) {
					codigoAsignado = generatedKeys.getString(1);
				}
				generatedKeys.close();
			}
			statement.close();
			con.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return codigoAsignado;
	}

	public boolean darBajaProyecto(String idProy) {
		boolean resultado = false;
		try {

			// Obtener el valor del campo de texto para dar de baja el proyecto
			// String valor = DarBajaProyecto.getTxtDarBaja().getText();

			// Crear la consulta SQL para eliminar el proyecto
			String query = "delete from Proyecto_Integrador where CodProy=" + idProy + ";";

			Statement statement = con.createStatement();

			// Ejecutar la consulta y obtener el número de filas afectadas
			int rowsAffected = statement.executeUpdate(query);

			if (rowsAffected > 0) {
				resultado = true;
			}
			statement.close();
			con.close();

		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return resultado;

	}

	public DatosProyectoIntegrador ConsultarCodigoProy(String textoCodigo) {
		DatosProyectoIntegrador proyecto = new DatosProyectoIntegrador();
		proyecto.setCodProy(Integer.parseInt(textoCodigo));
		boolean consultaCodigo = false;
		Statement stmt;
		try {
			stmt = con.createStatement();

			String query = "SELECT * FROM Proyecto_Integrador WHERE CodProy= " + textoCodigo + ";";
			ResultSet resultadosConsulta = stmt.executeQuery(query);

			if (resultadosConsulta.next()) {
				proyecto.setNombreProy(resultadosConsulta.getString("nombreProy"));
				proyecto.setUrl(resultadosConsulta.getString("URL"));
				proyecto.setAño(resultadosConsulta.getString("año"));
				proyecto.setCurso(resultadosConsulta.getString("curso"));
				proyecto.setNotaFinal(resultadosConsulta.getString("notaFinal"));
				proyecto.setArea(resultadosConsulta.getString("Area_CodAr"));

				consultaCodigo = true;
			} else {
				consultaCodigo = false;
			}

			resultadosConsulta.close();
			stmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return proyecto;
	}

	public boolean modificarDatos(DatosProyectoIntegrador proyecto) {
		boolean resultado = false;
		String query = "UPDATE Proyecto_Integrador SET " + "nombreProy = '" + proyecto.getNombreProy() + "', "
				+ "URL = '" + proyecto.getUrl() + "', " + "año = '" + proyecto.getAño() + "', " + "curso = '"
				+ proyecto.getCurso() + "', " + "notaFinal = '" + proyecto.getNotaFinal() + "', " + "Area_CodAr = '"
				+ proyecto.getArea() + "' " + "WHERE CodProy = " + proyecto.getCodProy() + ";";

		try {
			Statement stmt = con.createStatement();
			int filasAfectadas = stmt.executeUpdate(query);
			stmt.close();

			if (filasAfectadas > 0) {
				// La actualización se realizó correctamente
				resultado = true;

			} else {
				resultado = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public DatosAlumnos consultarCodigoAlumno(String textoCodigoAlum) {
		DatosAlumnos alumno = new DatosAlumnos();
		alumno.setNumExp(Integer.parseInt(textoCodigoAlum));
		boolean consultaCodigo = false;
		Statement stmt;
		try {
			stmt = con.createStatement();

			String query = "SELECT * FROM alumnos WHERE numExpediente= " + textoCodigoAlum + ";";
			ResultSet resultadosConsulta = stmt.executeQuery(query);

			if (resultadosConsulta.next()) {
				alumno.setNombreApellidos(resultadosConsulta.getString("nombreApellidos"));
				alumno.setCodproyecto(resultadosConsulta.getInt("Proyecto_Integrador_CodProy"));
				consultaCodigo = true;
			} else {
				consultaCodigo = false;
			}

			resultadosConsulta.close();
			stmt.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return alumno;
	}

	public boolean modificarDatosAlumno(DatosAlumnos alumno) {
		boolean resultado = false;
		String query = "UPDATE Alumnos SET " + "Proyecto_Integrador_CodProy = " + alumno.getCodproyecto()
				+ " WHERE numExpediente = " + alumno.getNumExp() + ";";

		try {

			Statement stmt = con.createStatement();
			int filasAfectadas = stmt.executeUpdate(query);
			stmt.close();

			if (filasAfectadas > 0) {
				// La actualización se realizó correctamente
				resultado = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}

	public ArrayList<String> getAlumnosProy(String idproyecto) {
		ArrayList<String> nombres = new ArrayList<String>();
		Statement stmt;

		try {
			stmt = con.createStatement();

			// Establecer el valor de idproyecto en la posición correspondiente de la lista
			// 'nombres'

			String query = "SELECT nombreApellidos FROM alumnos WHERE Proyecto_Integrador_CodProy = " + idproyecto
					+ ";";
			ResultSet resultadosConsulta = stmt.executeQuery(query);

			while (resultadosConsulta.next()) {
				String nombreAlumno = resultadosConsulta.getString("nombreApellidos");
				nombres.add(nombreAlumno);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return nombres;
	}

}
