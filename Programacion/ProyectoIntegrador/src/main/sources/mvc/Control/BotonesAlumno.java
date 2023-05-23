package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.Modelo.AccesoBD;
import mvc.Vista.BuscarProyectoAlum;
import mvc.Vista.OpcionesAlumnos;

/**
 * Esta clase implementa la interfaz ActionListener y actúa como un
 * ActionListener para los botones relacionados con las opciones de los alumnos
 * en la ventana OpcionesAlumnos en una aplicación MVC
 * (Modelo-Vista-Controlador). Realiza las siguientes tareas:
 * <ul>
 * <li>Modificar datos del propio Proyecto Integrador</li>
 * <li>Consultar Proyectos Integradores</li>
 * </ul>
 */
public class BotonesAlumno implements ActionListener {

	private AccesoBD accesobd;
	private OpcionesAlumnos vistaOpciones;

	/**
	 * Constructor de la clase BotonesAlumno. Inicializa una instancia de AccesoBD y
	 * establece la conexión con la base de datos.
	 * 
	 * @param opcionesAlumnos
	 */
	public BotonesAlumno(OpcionesAlumnos oa) {

		vistaOpciones = oa;
		accesobd = new AccesoBD();
		accesobd.getConexion();

	}

	/**
	 * Realiza la acción cuando se dispara el evento de acción.
	 *
	 * @param e El evento de acción generado.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		vistaOpciones.dispose();
		new BuscarProyectoAlum();

		accesobd.cerrarConexion();
	}

}
