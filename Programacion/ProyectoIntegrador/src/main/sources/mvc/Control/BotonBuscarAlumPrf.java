package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.Modelo.AccesoBD;
import mvc.Modelo.DatosAlumnos;
import mvc.Modelo.DatosProyectoIntegrador;
import mvc.Vista.BuscarAlumnoProf;
import mvc.Vista.ModificarAlumnoProfesor;

/**
 * Clase que hace lo siguiente - Recupera datos de un estudiante basado en un
 * código y los muestra en una nueva ventana. - Establece una conexión con una
 * base de datos mediante la clase AccesoBD. - Cierra la ventana actual después
 * de realizar la búsqueda y muestra una nueva ventana para modificar los datos
 * del estudiante.
 */
public class BotonBuscarAlumPrf implements ActionListener {

	private AccesoBD accesobd;
	private BuscarAlumnoProf consultas;

	/**
	 * Constructor BotonBuscarAlumPrf con la ventana BuscarAlumnoProf asociada.
	 *
	 * @param consultas La ventana BuscarAlumnoProf asociada al botón.
	 */
	public BotonBuscarAlumPrf(BuscarAlumnoProf consultas) {
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

		String codAlumno = consultas.getNumExpediente().getText();
		DatosAlumnos proyecto = accesobd.consultarCodigoAlumno(codAlumno);

		consultas.dispose();
		ModificarAlumnoProfesor mostrar = new ModificarAlumnoProfesor(proyecto);

	}

}
