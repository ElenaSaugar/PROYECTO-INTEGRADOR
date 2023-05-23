package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionListener;

import javax.swing.*;

import mvc.Control.BotonBuscarConsultasPIAlum;
import mvc.Control.BotonesAlumno;

/**
 * Representa una ventana de interfaz gráfica de usuario que muestra las
 * opciones disponibles para un alumno en un sistema de gestión de proyectos.
 */
public class OpcionesAlumnos extends JFrame {

	private JPanel panel;
	private JTextField opciones;
	private JButton consultas;
	private JButton modDatos;
	private ActionListener escuchador;

	/**
	 * Metodo que crea los componentes de las vistas
	 */
	public OpcionesAlumnos() {

		// Configuración de la ventana principal
		setTitle("Opciones del alumno");
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

		JLabel consultaslbl = new JLabel("¿Que desea hacer?");
		consultaslbl.setFont(new Font("Modern No. 20", Font.PLAIN, 35));
		consultaslbl.setBounds(601, 112, 313, 37);
		panel.add(consultaslbl);

		BotonesAlumno escuchador = new BotonesAlumno(this);

		modDatos = new JButton("Modificar mi P.I. ");
		modDatos.setBackground(new Color(150, 223, 187));
		modDatos.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		modDatos.setBounds(556, 294, 380, 70);
		panel.add(modDatos);
		modDatos.addActionListener(escuchador);
		panel.add(modDatos);

		consultas = new JButton("Consultar proyectos");
		consultas.setBackground(new Color(150, 223, 187));
		consultas.setBackground(new Color(150, 223, 187));
		consultas.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		consultas.setBounds(556, 418, 380, 70);
		panel.add(consultas);
		consultas.addActionListener(escuchador);
		panel.add(consultas);

		// Agregar el panel al contenedor principal
		setContentPane(panel);

		// Mostrar la ventana principal
		setVisible(true);
	}

	//getters y setters
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getOpciones() {
		return opciones;
	}

	public void setOpciones(JTextField opciones) {
		this.opciones = opciones;
	}

	public JButton getConsultas() {
		return consultas;
	}

	public void setConsultas(JButton consultas) {
		this.consultas = consultas;
	}

	public JButton getModDatos() {
		return modDatos;
	}

	public void setModDatos(JButton modDatos) {
		this.modDatos = modDatos;
	}

	public ActionListener getEscuchador() {
		return escuchador;
	}

	public void setEscuchador(ActionListener escuchador) {
		this.escuchador = escuchador;
	}

}
