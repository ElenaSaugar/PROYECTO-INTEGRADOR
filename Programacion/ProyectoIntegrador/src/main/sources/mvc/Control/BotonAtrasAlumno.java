package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.Vista.*;

/**
 * Clase que implementa el ActionListener para el botón de atras
 */
public class BotonAtrasAlumno implements ActionListener {

	private BuscarProyectoAlum bpa;
	private ModificarProyectoAlum mpa;
	private ConsultasAlum ca;

	/**
	 * Metodo que establece la vista de la ventana principal.
	 * 
	 * @param d La vista de la ventana principal a establecer.
	 */
	public void setVistaPrincipal(BuscarProyectoAlum d) {
		bpa = d;
	}
	
	public void setVistaPrincipal(ModificarProyectoAlum d) {
		mpa = d;
	}
	public void setVistaPrincipal(ConsultasAlum d) {
		ca = d;
		
	}

	/**
	 * Llamado cuando se produce una acción. Muestra una nueva ventana de inicio de
	 * sesión y cierra la ventana actual.
	 * 
	 * @param e El evento de acción.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		if (bpa != null) {
			bpa.dispose();
		}
		if (mpa != null) {
			mpa.dispose();
		}
		if (ca != null) {
			ca.dispose();
		}
		new OpcionesAlumnos();
	}

	
}