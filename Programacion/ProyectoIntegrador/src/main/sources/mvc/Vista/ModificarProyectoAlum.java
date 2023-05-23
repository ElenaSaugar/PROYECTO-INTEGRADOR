package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.Control.BotonAtrasAlumno;
import mvc.Control.BotonBuscarConsultasPIPrf;
import mvc.Control.BotonModificarPIAlum;
import mvc.Modelo.DatosProyectoIntegrador;
import java.awt.Font;

/**
 * Representa una ventana de interfaz gráfica de usuario para modificar la
 * información de un proyecto en un sistema de gestión de proyectos.
 */
public class ModificarProyectoAlum extends JFrame {

	private DatosProyectoIntegrador proyecto;
	private JTextField txtNombreProy;
	private JTextField txtUrl;
	private JButton btnModificar;

	private static JPanel panel;

	/**
	 * Constructor de la clase ModificarProyectoAlum. Configura la ventana y crea
	 * los componentes.
	 */
	public ModificarProyectoAlum(DatosProyectoIntegrador proyecto) {
		super();
		this.proyecto = proyecto;
		inicializarComponentes();
	}

	/**
	 * metodo que inicializa los componentes de la ventana
	 */
	public void inicializarComponentes() {

		// Configuración de la ventana principal
		setTitle("Modificar proyecto");
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

		// codigo del proyecto
		int codProy = proyecto.getCodProy();

		// Convierte el valor entero a una cadena de texto
		JLabel txtCod = new JLabel("Proyecto integrador: " + codProy);
		txtCod.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		txtCod.setBounds(607, 41, 318, 60);
		panel.add(txtCod);

		// Nombre del proyecto

		JLabel codProyLabel = new JLabel("Nombre del proyecto :");
		codProyLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		codProyLabel.setBounds(111, 303, 282, 46);
		panel.add(codProyLabel);

		txtNombreProy = new JTextField(20);
		txtNombreProy.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtNombreProy.setText(proyecto.getNombreProy());
		txtNombreProy.setBounds(423, 298, 256, 60);
		panel.add(txtNombreProy);

		// URL

		JLabel urlLabel = new JLabel("URL :");
		urlLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		urlLabel.setBounds(877, 303, 110, 46);
		panel.add(urlLabel);

		txtUrl = new JTextField(20);
		txtUrl.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtUrl.setText(proyecto.getUrl());
		txtUrl.setBounds(1018, 297, 256, 63);
		panel.add(txtUrl);

		// Botón consultar
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(150, 223, 187));
		btnModificar.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		btnModificar.setBounds(468, 618, 552, 66);
		panel.add(btnModificar);
		BotonModificarPIAlum btnConfirmar = new BotonModificarPIAlum(this);
		btnModificar.addActionListener(btnConfirmar);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(650, 709, 177, 37);

		// escuchador del boton de atrás
		BotonAtrasAlumno escuchador = new BotonAtrasAlumno();
		escuchador.setVistaPrincipal(this);
		btnAtras.addActionListener(escuchador);
		panel.add(btnAtras);

		// Agregar el panel al contenedor principal
		setContentPane(panel);

		// Mostrar la ventana principal
		setVisible(true);
	}

	public DatosProyectoIntegrador getProyecto() {
		getDatosNuevos();
		return proyecto;
	}

	public void setProyecto(DatosProyectoIntegrador proyecto) {
		this.proyecto = proyecto;
	}

	public JTextField getTxtNombreProy() {
		return txtNombreProy;
	}

	public void setTxtNombreProy(JTextField txtNombreProy) {
		this.txtNombreProy = txtNombreProy;
	}

	public JTextField getTxtUrl() {
		return txtUrl;
	}

	public void setTxtUrl(JTextField txtUrl) {
		this.txtUrl = txtUrl;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public static JPanel getPanel() {
		return panel;
	}

	public static void setPanel(JPanel panel) {
		ModificarProyectoAlum.panel = panel;
	}

	public void getDatosNuevos() {
		proyecto.setNombreProy(getTxtNombreProy().getText());
		proyecto.setUrl(getTxtUrl().getText());

	}

}
