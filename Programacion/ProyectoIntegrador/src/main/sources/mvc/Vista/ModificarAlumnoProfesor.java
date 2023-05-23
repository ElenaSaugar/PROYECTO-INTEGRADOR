package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.Control.BotonAtrasProfesor;
import mvc.Control.BotonBuscarAlumPrf;
import mvc.Control.BotonBuscarConsultasPIPrf;
import mvc.Control.BotonModificarAlumnoPrf;
import mvc.Control.BotonModificarPI;
import mvc.Modelo.DatosAlumnos;
import mvc.Modelo.DatosProyectoIntegrador;
import java.awt.Font;

/**
 * Representa una ventana de interfaz gráfica de usuario para modificar la
 * información de un alumno en un sistema de gestión de proyectos.
 */
public class ModificarAlumnoProfesor extends JFrame {

	private DatosAlumnos alumno;
	private JTextField txtCod;
	private JButton btnModificar;
	private JPanel panel;
	private JTextField txtNom;

	/**
	 * Constructor de la clase ModificarAlumnoProfesor. Configura la ventana y crea los
	 * componentes.
	 */
	public ModificarAlumnoProfesor(DatosAlumnos alumno) {
		super();
		this.alumno = alumno;
		inicializarComponentes();
	}

	/**
	 * meytodo que inicializa los componentes
	 */
	public void inicializarComponentes() {

		// Configuración de la ventana principal
		setTitle("Modificar alumno");
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

		// numnero de expediente
		int numExp = alumno.getNumExp();
		JLabel txtNumExp = new JLabel("Número de expediente del alumno: " + numExp);
		txtNumExp.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		txtNumExp.setBounds(501, 42, 505, 60);
		panel.add(txtNumExp);

		// Nombre y apellidos

		JLabel nombreLabel = new JLabel("Nombre y apellidos :");
		nombreLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		nombreLabel.setBounds(388, 181, 282, 46);
		panel.add(nombreLabel);

		JLabel txtNom = new JLabel(alumno.getNombreApellidos());
		txtNom.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtNom.setBounds(793, 176, 573, 60);
		panel.add(txtNom);

		// codigo proyecto

		JLabel codigoLabel = new JLabel("Código del proyecto :");
		codigoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		codigoLabel.setBounds(388, 311, 282, 46);
		panel.add(codigoLabel);

		txtCod = new JTextField(20);
		txtCod.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtCod.setText(String.valueOf(alumno.getCodproyecto()));
		txtCod.setBounds(793, 309, 256, 54);
		panel.add(txtCod);

		// Botón consultar
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(150, 223, 187));
		btnModificar.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		btnModificar.setBounds(480, 539, 552, 66);
		panel.add(btnModificar);
		BotonModificarAlumnoPrf btnModificarListener = new BotonModificarAlumnoPrf(this);
		btnModificar.addActionListener(btnModificarListener);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(666, 646, 177, 37);

		// escuchador del boton de atrás
		BotonAtrasProfesor escuchador = new BotonAtrasProfesor();
		escuchador.setVistaPrincipal(this);
		btnAtras.addActionListener(escuchador);
		panel.add(btnAtras);

		// Agregar el panel al contenedor principal
		setContentPane(panel);

		// Mostrar la ventana principal
		setVisible(true);
	}

	// getters y setters
	public DatosAlumnos getAlumno() {
		getDatosNuevos();
		return alumno;
	}

	public void setAlumno(DatosAlumnos alumno) {
		this.alumno = alumno;
	}

	public JTextField getTxtCod() {
		return txtCod;
	}

	public void setTxtCod(JTextField txtCod) {
		this.txtCod = txtCod;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getTxtNom() {
		return txtNom;
	}

	public void setTxtNom(JTextField txtNom) {
		this.txtNom = txtNom;
	}

	public void getDatosNuevos() {
		alumno.setCodproyecto(Integer.parseInt(getTxtCod().getText()));
	}

}
