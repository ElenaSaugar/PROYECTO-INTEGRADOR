package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.Vista.*;

/**
 * Clase que implementa el ActionListener para el botón de atras
 */
public class BotonAtrasProfesor implements ActionListener {

	DarAltaProyecto dap;
	DarBajaProyecto dbp;
	ModificarProyectoProfesor mpp;
	ModificarAlumnoProfesor map;
	BuscarProyectoProf bpp;
	ConsultasProf con;

	/**
	 * Metodo que establece la vista de la ventana principal.
	 * 
	 * @param d La vista de la ventana principal a establecer.
	 */
	public void setVistaPrincipal(DarAltaProyecto d) {
		dap = d;
	}

	/**
	 * Metodo que establece la vista de la ventana principal.
	 * 
	 * @param d La vista de la ventana principal a establecer.
	 */
	public void setVistaPrincipal(DarBajaProyecto d) {
		dbp = d;
	}

	/**
	 * Metodo que establece la vista de la ventana principal.
	 * 
	 * @param d La vista de la ventana principal a establecer.
	 */
	public void setVistaPrincipal(ModificarProyectoProfesor m) {
		mpp = m;
	}

	/**
	 * Metodo que establece la vista de la ventana principal.
	 * 
	 * @param a La vista de la ventana principal a establecer.
	 */
	public void setVistaPrincipal(ModificarAlumnoProfesor a) {
		map = a;
	}

	/**
	 * Metodo que establece la vista de la ventana principal.
	 * 
	 * @param c La vista de la ventana principal a establecer.
	 */
	public void setVistaPrincipal(ConsultasProf c) {
		con = c;
	}
	
	public void setVistaPrincipal(BuscarProyectoProf b) {
		bpp = b;
	}


	/**
	 * Llamado cuando se produce una acción. Muestra una nueva ventana de inicio de
	 * sesión y cierra la ventana actual.
	 * 
	 * @param e El evento de acción.
	 */
	public void actionPerformed(ActionEvent e) {
		if (dap != null) {
			dap.dispose();
		}
		if (dbp != null) {
			dbp.dispose();
		}
		if (mpp != null) {
			mpp.dispose();
		}
		if (map != null) {
			map.dispose();
		}
		if (con != null) {
			con.dispose();
		}
		if (bpp != null) {
			bpp.dispose();
		}
		new OpcionesProfesor();
	}

}