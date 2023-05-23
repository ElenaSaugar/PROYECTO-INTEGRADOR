package mvc.Main;

import mvc.Vista.*;

public class ProyectoMain {

	public static void main(String[] args) {

		java.awt.EventQueue.invokeLater(new Runnable() {

			// Ejecucion de la ventana principal
			public void run() {

				new InicioSesion();
			}

		});
	}

}
