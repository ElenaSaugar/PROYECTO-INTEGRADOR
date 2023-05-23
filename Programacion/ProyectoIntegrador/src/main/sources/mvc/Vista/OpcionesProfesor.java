package mvc.Vista;

import java.awt.Dimension;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import mvc.Control.BotonesProfesor;

import java.awt.Color;

/**
 * La clase OpcionesProfesor representa una ventana que muestra las opciones
 * disponibles para un profesor. Esta clase extiende de JFrame y contiene
 * componentes gráficos como botones y etiquetas.
 */
public class OpcionesProfesor extends JFrame {

	private JPanel panel;
	private JLabel opciones;
	private JButton modDatosAlum;
	private JButton darAlta;
	private JButton darBaja;
	private JButton consultas;
	private JButton modDatos;

	/**
	 * Constructor de la clase OpcionesProfesor. Configura la ventana principal y
	 * crea los componentes gráficos.
	 */
	public OpcionesProfesor() {

		// Configuración de la ventana principal
		setTitle("Opciones del profesor");
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

		JLabel opciones = new JLabel("¿Que desea hacer?");
		opciones.setFont(new Font("Modern No. 20", Font.PLAIN, 45));
		opciones.setBounds(607, 91, 351, 68);
		panel.add(opciones);

		BotonesProfesor escuchador = new BotonesProfesor(this);

		darAlta = new JButton("Dar de alta Proyecto Integrador");
		darAlta.setBackground(new Color(150, 223, 187));
		darAlta.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		darAlta.setBounds(44, 232, 441, 90);
		darAlta.addActionListener(escuchador);
		panel.add(darAlta);

		darBaja = new JButton("Dar de baja Proyecto Integrador");
		darBaja.setBackground(new Color(150, 223, 187));
		darBaja.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		darBaja.setBounds(1036, 232, 453, 90);
		darBaja.addActionListener(escuchador);
		panel.add(darBaja);

		modDatos = new JButton("Modificar datos P.I");
		modDatos.setBackground(new Color(150, 223, 187));
		modDatos.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		modDatos.setBounds(544, 232, 453, 90);
		modDatos.addActionListener(escuchador);
		panel.add(modDatos);

		modDatosAlum = new JButton("Modificar datos alumno");
		modDatosAlum.setBackground(new Color(150, 223, 187));
		modDatosAlum.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		modDatosAlum.setBounds(294, 461, 453, 90);
		modDatosAlum.addActionListener(escuchador);
		panel.add(modDatosAlum);

		consultas = new JButton("Consultar proyectos");
		consultas.setBackground(new Color(150, 223, 187));
		consultas.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		consultas.setBounds(817, 461, 453, 90);
		consultas.addActionListener(escuchador);
		panel.add(consultas);

		// Agregar el panel al contenedor principal
		setContentPane(panel);

		// Mostrar la ventana principal
		setVisible(true);
	}

	// Getters y setters
	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getOpciones() {
		return opciones;
	}

	public void setOpciones(JLabel opciones) {
		this.opciones = opciones;
	}

	public JButton getDarAlta() {
		return darAlta;
	}

	public void setDarAlta(JButton darAlta) {
		this.darAlta = darAlta;
	}

	public JButton getDarBaja() {
		return darBaja;
	}

	public void setDarBaja(JButton darBaja) {
		this.darBaja = darBaja;
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

	public JButton getModDatosAlum() {
		return modDatosAlum;
	}

	public void setModDatosAlum(JButton modDatosAlum) {
		this.modDatosAlum = modDatosAlum;
	}

}