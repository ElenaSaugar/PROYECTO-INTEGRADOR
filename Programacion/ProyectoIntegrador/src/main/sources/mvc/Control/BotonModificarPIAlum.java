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
import mvc.Modelo.DatosProyectoIntegrador;
import mvc.Vista.BuscarProyectoAlum;
import mvc.Vista.DarAltaProyecto;
import mvc.Vista.ModificarProyectoAlum;
import mvc.Vista.ModificarProyectoProfesor;
import mvc.Vista.OpcionesAlumnos;

/**
 * Clase que implementa el ActionListener para el botón de dar de alta un
 * proyecto.
 */
public class BotonModificarPIAlum implements ActionListener {

	private AccesoBD accesobd;
	private Connection con;
	private ModificarProyectoAlum modProyecto;

	public BotonModificarPIAlum(ModificarProyectoAlum modificarProyectoAlum) {
		super();
		this.modProyecto = modificarProyectoAlum;
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

		DatosProyectoIntegrador proyecto = modProyecto.getProyecto();

		con = accesobd.getConexion();

		boolean codigoAsignado = accesobd.modificarDatos(proyecto);

		if (codigoAsignado == true) {

			// lanzamos un mensaje con el codigo que se ha asignado al nuevo proyecto
			JOptionPane.showMessageDialog(null, "Se ha asignado correctamente el proyecto");
		} else {
			JOptionPane.showMessageDialog(null, "Se ha producido un error al asignar el proyecto.");
		}
	}

}
