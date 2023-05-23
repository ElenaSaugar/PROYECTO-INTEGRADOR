package mvc.Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.text.JTextComponent;

import mvc.Modelo.AccesoBD;
import mvc.Vista.InicioSesion;
import mvc.Vista.OpcionesAlumnos;
import mvc.Vista.OpcionesProfesor;

/**
 * Clase que implementa el ActionListener para el botón de inicio de sesión.
 */
public class BotonLogin implements ActionListener {

	private InicioSesion ventana;
	private AccesoBD accesobd;

	/**
	 * Constructor de la clase BotonLogin.
	 * 
	 * @param v la instancia de la ventana de inicio de sesión.
	 */
	public BotonLogin(InicioSesion v) {
		ventana = v;
		accesobd = new AccesoBD();

	}

	/**
	 * Invocado cuando se produce una acción. Realiza el proceso de inicio de sesión
	 * según la opción seleccionada (Profesor o Alumno).
	 * 
	 * @param e el evento de acción.
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		String seleccion = ventana.getAlumProfesorCombo().getSelectedItem().toString();
		String contrasena_ingresada = new String(ventana.getContrasena().getPassword());
		accesobd.getConexion();

		if (seleccion.equals("Profesor")) {
			
			boolean contrasenaCorrecta = contrasena_ingresada.equals("profesor");

			if (contrasenaCorrecta) {
				new OpcionesProfesor();
				ventana.dispose();

			} else {
				ventana.mostrarMensaje("Contraseña incorrecta :(");
			}
		} else if (seleccion.equals("Alumn@")) {
			// Verificar la contraseña con la base de datos
			boolean contrasenaCorrecta = accesobd.comprobarContrasenaAlumno(contrasena_ingresada);
			
			if (contrasenaCorrecta) {
				new OpcionesAlumnos();
				ventana.dispose();
			} else {
				ventana.mostrarMensaje("Contraseña incorrecta :(");
			}
		}

		accesobd.cerrarConexion();
	}

}
