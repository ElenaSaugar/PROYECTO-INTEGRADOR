package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.JTextComponent;

import mvc.Modelo.AccesoBD;
import mvc.Vista.BuscarAlumnoProf;
import mvc.Vista.BuscarProyectoProf;
import mvc.Vista.ConsultasProf;
import mvc.Vista.DarAltaProyecto;
import mvc.Vista.DarBajaProyecto;
import mvc.Vista.OpcionesProfesor;

/**
 * La clase BotonesProfesor es un ActionListener que gestiona las acciones
 * realizadas en la interfaz de OpcionesProfesor. Cada acción está asociada a un
 * botón específico y se encarga de abrir una nueva ventana y, opcionalmente,
 * cerrar la ventana de OpcionesProfesor.
 * Las opciones que hay son:
 * <ul>
 *     <li>Dar de alta un Proyecto Integrador</li>
 *     <li>Modificar un Proyecto Integrador</li>
 *     <li>Dar de baja un Proyecto Integrador</li>
 *     <li>Modificar datos del alumno</li>
 *     <li>Consultar Proyectos Integradores</li>
 * </ul>
 */
public class BotonesProfesor implements ActionListener {

	private OpcionesProfesor opcionesProf;
	private AccesoBD accesobd;

	/**
	 * Constructor de la clase BotonesProfesor.
	 * 
	 * @param v La instancia de OpcionesProfesor asociada a este ActionListener.
	 */
	public BotonesProfesor(OpcionesProfesor v) {

		this.opcionesProf = v;
		accesobd = new AccesoBD();
		accesobd.getConexion();

	}

	/**
	 * Maneja las acciones realizadas en la interfaz de OpcionesProfesor.
	 * 
	 * @param e El evento de acción generado.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == opcionesProf.getDarAlta()) {
			new DarAltaProyecto();
			opcionesProf.dispose();
		} else if (e.getSource() == opcionesProf.getDarBaja()) {
			new DarBajaProyecto();
			opcionesProf.dispose();
		} else if (e.getSource() == opcionesProf.getModDatos()) {
			new BuscarProyectoProf();
			opcionesProf.dispose();
		} else if (e.getSource() == opcionesProf.getModDatosAlum()) {
			new BuscarAlumnoProf();
			opcionesProf.dispose();
		} else if (e.getSource() == opcionesProf.getConsultas()) {
			new BuscarProyectoProf();
			opcionesProf.dispose();
		}
		accesobd.cerrarConexion();
	}
}