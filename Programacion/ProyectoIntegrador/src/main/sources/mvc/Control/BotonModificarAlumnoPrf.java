package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import mvc.Modelo.AccesoBD;
import mvc.Modelo.DatosAlumnos;
import mvc.Modelo.DatosProyectoIntegrador;
import mvc.Vista.DarAltaProyecto;
import mvc.Vista.ModificarAlumnoProfesor;

/**
 * Clase que implementa el ActionListener para el botón de dar de alta un
 * proyecto.
 */
public class BotonModificarAlumnoPrf implements ActionListener {

	private AccesoBD accesobd;
	private Connection con;
	private ModificarAlumnoProfesor modAlumno;

	public BotonModificarAlumnoPrf(ModificarAlumnoProfesor vistaAlta) {
		super();
		this.modAlumno = vistaAlta;
	}

	@Override
	/**
	 * Llamado cuando se produce una acción. Realiza el proceso de dar de alta un
	 * proyecto en la base de datos.
	 * 
	 * @param e el evento de acción.
	 */
	public void actionPerformed(ActionEvent e) {
		accesobd = new AccesoBD();
		DatosAlumnos alumno = modAlumno.getAlumno();

		con = accesobd.getConexion();

		boolean codigoAsignado = accesobd.modificarDatosAlumno(alumno);

		if (codigoAsignado==true) {

			// lanzamos un mensaje con el codigo que se ha asignado al nuevo proyecto
			JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente la base de datos");
		} else {
			JOptionPane.showMessageDialog(null,
					"Se ha producido un error, hable con el administrador de la base de datos.");
		}
	}

}
