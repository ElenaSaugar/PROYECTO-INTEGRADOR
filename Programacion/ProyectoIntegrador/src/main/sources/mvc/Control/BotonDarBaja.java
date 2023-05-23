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
import mvc.Vista.DarAltaProyecto;
import mvc.Vista.DarBajaProyecto;

/**
 * Esta clase implementa la interfaz ActionListener y actúa como un
 * ActionListener para el botón de dar de baja un proyecto en la ventana
 * DarBajaProyecto en una aplicación MVC (Modelo-Vista-Controlador). Realiza las
 * siguientes tareas: - Establece una conexión con una base de datos mediante la
 * clase AccesoBD. - Obtiene el valor ingresado en la ventana DarBajaProyecto. -
 * Realiza el proceso de dar de baja el proyecto en la base de datos. - Muestra
 * un mensaje de éxito o error según el resultado de la operación.
 */
public class BotonDarBaja implements ActionListener {

	private AccesoBD accesobd;
	private Connection con;
	private DarBajaProyecto vistaBaja;
	
	public BotonDarBaja(DarBajaProyecto vistaBaja) {
		super();
		this.vistaBaja = vistaBaja;
	}

	/**
	 * Invocado cuando se produce una acción. Realiza el proceso de dar de baja un
	 * proyecto de la base de datos.
	 * 
	 * @param e el evento de acción.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		accesobd = new AccesoBD();
		accesobd.getConexion();

		String valor = vistaBaja.getTxtDarBaja().getText();

		if (accesobd.darBajaProyecto(valor) == true) {
			JOptionPane.showMessageDialog(null, "El proyecto ha sido borrado satisfactoriamente");
		} else {
			JOptionPane.showMessageDialog(null,
					"El proyecto no ha sido borrado. No puede dejar a un alumno sin proyecto.");

		}

	}
}
