package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.util.ArrayList;

import mvc.Modelo.AccesoBD;
import mvc.Modelo.DatosProyectoIntegrador;
import mvc.Vista.BuscarProyectoAlum;
import mvc.Vista.BuscarProyectoProf;
import mvc.Vista.ConsultasProf;
import mvc.Vista.DarAltaProyecto;
import mvc.Vista.ModificarProyectoProfesor;

/**
 * Esta clase implementa la interfaz ActionListener y actúa como un
 * ActionListener para el botón de consultas en la ventana BuscarProyectoProf en
 * una aplicación MVC (Modelo-Vista-Controlador). Realiza las siguientes tareas:
 * - Establece una conexión con una base de datos mediante la clase AccesoBD. -
 * Consulta un proyecto integrador basado en un código proporcionado por la
 * ventana BuscarProyectoProf. - Imprime el nombre del proyecto integrador en la
 * consola. - Cierra la ventana BuscarProyectoProf y muestra la ventana
 * Consultas con los datos del proyecto.
 */
public class BotonConsultasProf implements ActionListener {

	private AccesoBD accesobd;
	private Connection con;
	private BuscarProyectoProf consultas;
	private BuscarProyectoAlum buscarProyectoAlum;

	/**
	 * Construye un objeto BotonConsultas con la ventana BuscarProyectoProf
	 * asociada.
	 *
	 * @param consultas La ventana BuscarProyectoProf asociada al botón.
	 */
	public BotonConsultasProf(BuscarProyectoProf consultas) {
		super();
		this.consultas = consultas;
	}

	/**
	 * Realiza la acción cuando se dispara el evento de acción.
	 *
	 * @param e El evento de acción generado.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		accesobd = new AccesoBD();

		accesobd.getConexion();

		String codProyecto = consultas.getTxtCodproy().getText();
		DatosProyectoIntegrador proyecto = accesobd.ConsultarCodigoProy(codProyecto);
		ArrayList<String> nombreAlumnos = accesobd.getAlumnosProy(codProyecto);

		consultas.dispose();
		new ConsultasProf(proyecto, nombreAlumnos);

	}

}
