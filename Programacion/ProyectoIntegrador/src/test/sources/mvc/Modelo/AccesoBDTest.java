package mvc.Modelo;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccesoBDTest {
	private AccesoBD cca;
	private Connection con;

	@Before
	public void setUp() throws Exception {
		// Configurar la conexión a la base de datos
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost/BBDD_P_I";
		String usuario = "root";
		String password = "root";

		try {
			// Establecer la conexión
			con = DriverManager.getConnection(url, usuario, password);
			cca = new AccesoBD();
			cca.getConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testComprobarContrasenaAlumno() {
		// Prueba con una contraseña existente en la base de datos
		boolean resultado1 = cca.comprobarContrasenaAlumno("002");
		assertTrue(resultado1);
	}

	//este fallo es intencionado para comprobar su buen funcionamiento
	@Test
	public void testComprobarContrasenaAlumno2() {
		// Prueba con una contraseña existente en la base de datos
		boolean resultado2 = cca.comprobarContrasenaAlumno("2");
		assertTrue(resultado2);
	}

	@Test
	public void testConsultarCodigoAlumno() {
	    // Prueba para consultar el código de un alumno existente en la base de datos
	    DatosAlumnos alumno = cca.consultarCodigoAlumno("024");
	    assertNotNull(alumno);
	    assertEquals("Celia RUBIO", alumno.getNombreApellidos().trim());  // Eliminar espacio adicional con trim()
	    assertEquals(11, alumno.getCodproyecto());
	}


	@After
	public void tearDown() throws Exception {
		// Cerrar la conexión después de cada prueba
		if (con != null && !con.isClosed()) {
			con.close();
		}
	}
}
