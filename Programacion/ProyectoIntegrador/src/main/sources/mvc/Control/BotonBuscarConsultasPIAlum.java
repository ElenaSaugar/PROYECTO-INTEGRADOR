package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

import mvc.Modelo.AccesoBD;
import mvc.Modelo.DatosProyectoIntegrador;
import mvc.Vista.BuscarProyectoAlum;
import mvc.Vista.DarAltaProyecto;
import mvc.Vista.ModificarProyectoAlum;

/**
 * Esta clase implementa la interfaz ActionListener y actúa como un
 * ActionListener para el botón de búsqueda en la ventana BuscarProyectoAlum en
 * una aplicación MVC (Modelo-Vista-Controlador). Realiza las siguientes tareas:
 * - Establece una conexión con una base de datos mediante la clase AccesoBD.
 * -Consulta un proyecto integrador basado en un código proporcionado por la
 * ventana BuscarProyectoAlum. - Imprime el nombre del proyecto integrador en la
 * consola. - Cierra la ventana BuscarProyectoAlum y muestra la ventana
 * ModificarProyectoAlum con los datos del proyecto.
 */
public class BotonBuscarConsultasPIAlum implements ActionListener {

	private AccesoBD accesobd;
	private Connection con;
	private BuscarProyectoAlum buscarProyectoAlum;

	/**
	 * Construye un objeto BotonBuscarConsultasPIAlum con la ventana
	 * BuscarProyectoAlum asociada.
	 *
	 * @param buscarProyectoAlum La ventana BuscarProyectoAlum asociada al botón.
	 */
	public BotonBuscarConsultasPIAlum(BuscarProyectoAlum buscarProyectoAlum) {
		super();
		this.buscarProyectoAlum = buscarProyectoAlum;
	}

	/**
	 * Realiza la acción cuando se dispara el evento de acción.
	 *
	 * @param btnBuscarPIAlum El evento de acción generado.
	 */
	@Override
	public void actionPerformed(ActionEvent btnBuscarPIAlum) {

		accesobd = new AccesoBD();

		accesobd.getConexion();

		String codProyecto = buscarProyectoAlum.getTxtCodproy().getText();
		DatosProyectoIntegrador proyecto = accesobd.ConsultarCodigoProy(codProyecto);

		buscarProyectoAlum.dispose();
		new ModificarProyectoAlum(proyecto);

	}

}
