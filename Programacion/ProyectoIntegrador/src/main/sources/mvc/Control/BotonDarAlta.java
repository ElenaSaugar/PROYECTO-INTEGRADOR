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
import mvc.Vista.DarAltaProyecto;

/**
 * Esta clase implementa la interfaz ActionListener y actúa como un ActionListener
 * para el botón de dar de alta un proyecto en la ventana DarAltaProyecto en una aplicación MVC (Modelo-Vista-Controlador).
 * Realiza las siguientes tareas:
 * - Establece una conexión con una base de datos mediante la clase AccesoBD.
 * - Obtiene los datos del proyecto de la ventana DarAltaProyecto.
 * - Realiza el proceso de dar de alta el proyecto en la base de datos.
 * - Muestra un mensaje con el código asignado al nuevo proyecto en caso de éxito.
 * - Muestra un mensaje de error en caso de fallo.
 */
public class BotonDarAlta implements ActionListener {

	private AccesoBD accesobd;
	private Connection con;
	private DarAltaProyecto vistaAlta;

	public BotonDarAlta(DarAltaProyecto vistaAlta) {
		super();
		this.vistaAlta = vistaAlta;
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

		DatosProyectoIntegrador proyecto = vistaAlta.getDatosProyecto();

		con = accesobd.getConexion();

		String codigoAsignado = accesobd.darAltaProyecto(proyecto);

		if (!codigoAsignado.equals("")) {

			// lanzamos un mensaje con el codigo que se ha asignado al nuevo proyecto
			JOptionPane.showMessageDialog(null, "Se han insertado los datos correctamente. Código asignado: "
					+ codigoAsignado + "\n             *Recuerde el código para futuras acciones.*");
		} else {
			JOptionPane.showMessageDialog(null,
					"Se ha producido un error, revise que se hayan introducido bien los datos.");
		}
	}

}
