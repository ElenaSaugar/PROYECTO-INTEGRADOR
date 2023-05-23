package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import mvc.Control.BotonAtrasProfesor;
import mvc.Control.BotonBuscarAlumPrf;
import mvc.Control.BotonBuscarConsultasPIPrf;
import mvc.Control.BotonDarAlta;

/**
 * Clase que representa la ventana de búsqueda de un alumno por un profesor.
 */
public class BuscarAlumnoProf extends JFrame {

	private JPanel panel;
	private JTextField txtNumExpediente;
	private JButton confirmar;

	/**
	 * Constructor de la clase BuscarAlumnoProf. Configura la ventana y crea los
	 * componentes.
	 */
	public BuscarAlumnoProf() {
		// Configuración de la ventana principal
		setTitle("Buscar alumno");
		Image icon = Toolkit.getDefaultToolkit().getImage("img/muditos.png");
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Obtenemos las dimensiones de la pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// Establecemos el tamaño de la ventana como las dimensiones de la pantalla
		setSize(screenSize.width, screenSize.height);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		// Creación del panel principal con un Absolute Layout
		panel = new JPanel();
		panel.setBackground(new Color(150, 217, 223));
		panel.setLayout(null);

		// logo imagen
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("img/logo.png");
		Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		imageLabel.setIcon(new ImageIcon(image));
		imageLabel.setBounds(44, 39, 160, 100);
		panel.add(imageLabel);

		JLabel nombreProyLabel = new JLabel("Número de expediente del alumno :");
		nombreProyLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		nombreProyLabel.setBounds(348, 254, 438, 37);
		panel.add(nombreProyLabel);

		// Creación del campo de dar de baja
		txtNumExpediente = new JTextField(20);
		txtNumExpediente.setFont(new Font("Modern No. 20", Font.PLAIN, 20));
		txtNumExpediente.setBounds(815, 256, 212, 41);
		panel.add(txtNumExpediente);

		// Botón consultar
		confirmar = new JButton("Buscar");
		confirmar.setBackground(new Color(150, 223, 187));
		confirmar.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		confirmar.setBounds(543, 536, 461, 66);
		panel.add(confirmar);
		BotonBuscarAlumPrf btnConfirmar = new BotonBuscarAlumPrf(this);
		confirmar.addActionListener(btnConfirmar);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(688, 648, 177, 37);

		// escuchador del boton de atrás
		BotonAtrasProfesor escuchador = new BotonAtrasProfesor();
		btnAtras.addActionListener(escuchador);
		panel.add(btnAtras);

		// Agregar el panel al contenedor principal
		setContentPane(panel);

		// Mostrar la ventana principal
		setVisible(true);
	}

	// getters y setters
	public JTextField getNumExpediente() {
		return txtNumExpediente;
	}

	public void setNumExpediente(JTextField txtCodproy) {
		this.txtNumExpediente = txtCodproy;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JButton getConfirmar() {
		return confirmar;
	}

	public void setConfirmar(JButton confirmar) {
		this.confirmar = confirmar;
	}

}
