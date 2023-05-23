package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import mvc.Control.BotonAtrasAlumno;
import mvc.Control.BotonBuscarConsultasPIPrf;
import mvc.Control.BotonModificarPI;
import mvc.Modelo.DatosProyectoIntegrador;
import java.awt.Font;

/**
 * La clase ConsultasAlum representa la ventana de consultas para los alumnos.
 * Muestra la información de un proyecto integrador específico.
 */
public class ConsultasAlum extends JFrame {

	private DatosProyectoIntegrador proyecto;
	private JButton btnModificar;
	private JPanel panel;
	private ArrayList<String> nombreAlumnos;

	/**
	 * Crea una nueva instancia de ConsultasAlum.
	 * 
	 * @param proyecto Los datos del proyecto integrador a mostrar.
	 */
	public ConsultasAlum(DatosProyectoIntegrador proyecto, ArrayList<String> a) {
		super();
		this.proyecto = proyecto;
		nombreAlumnos = a;
		inicializarComponentes();
	}

	/**
	 * Inicializa los componentes de la ventana.
	 */
	public void inicializarComponentes() {

		// Configuración de la ventana principal
		setTitle("Info proyecto");
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

		// codigo del proyecto
		int codProy = proyecto.getCodProy();

		// Convierte el valor entero a una cadena de texto
		JLabel txtCod = new JLabel("Proyecto integrador: " + codProy);
		txtCod.setFont(new Font("Mongolian Baiti", Font.PLAIN, 30));
		txtCod.setBounds(607, 41, 318, 60);
		panel.add(txtCod);

		// logo imagen
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("img/logo.png");
		Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		imageLabel.setIcon(new ImageIcon(image));
		imageLabel.setBounds(44, 39, 160, 100);
		panel.add(imageLabel);

		// Nombre del proyecto

		JLabel codProyLabel = new JLabel("Nombre del proyecto :");
		codProyLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		codProyLabel.setBounds(201, 179, 282, 46);
		panel.add(codProyLabel);

		JLabel CodigoLabel = new JLabel(proyecto.getNombreProy());
		CodigoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		CodigoLabel.setBounds(524, 174, 256, 60);
		panel.add(CodigoLabel);

		// Nota Final

		JLabel notaFinalLabel = new JLabel("Nota final :");
		notaFinalLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		notaFinalLabel.setBounds(902, 303, 282, 46);
		panel.add(notaFinalLabel);

		JLabel NotaFinalLabel = new JLabel(proyecto.getNotaFinal());
		NotaFinalLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		NotaFinalLabel.setBounds(1166, 298, 256, 60);
		panel.add(NotaFinalLabel);

		// URL

		JLabel urlLabel = new JLabel("URL :");
		urlLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		urlLabel.setBounds(201, 303, 282, 46);
		panel.add(urlLabel);

		JLabel UrlLabel = new JLabel(proyecto.getUrl());
		UrlLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		UrlLabel.setBounds(524, 297, 256, 63);
		panel.add(UrlLabel);

		// AÑO

		JLabel añoLabel = new JLabel("Año :");
		añoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		añoLabel.setBounds(201, 418, 282, 46);
		panel.add(añoLabel);

		JLabel AñoLabel = new JLabel(proyecto.getAño());
		AñoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		AñoLabel.setBounds(524, 413, 256, 61);
		panel.add(AñoLabel);

		// curso

		JLabel cursoLabel = new JLabel("Curso :");
		cursoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		cursoLabel.setBounds(902, 179, 110, 46);
		panel.add(cursoLabel);

		JLabel CursoLabel = new JLabel(proyecto.getCurso());
		CursoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		CursoLabel.setBounds(1166, 174, 256, 60);
		panel.add(CursoLabel);

		// area

		JLabel areaLabel = new JLabel("Area :");
		areaLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		areaLabel.setBounds(902, 418, 104, 46);
		panel.add(areaLabel);

		JLabel AreaLabel = new JLabel(proyecto.getArea());
		AreaLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		AreaLabel.setBounds(1166, 412, 256, 63);
		panel.add(AreaLabel);
		
		//añadimos jLabel con "Componentes: "
		//añadimos lista alumnos
		JLabel componentesLabel = new JLabel("Componentes : "+nombreAlumnos);
		componentesLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		componentesLabel.setBounds(200, 543, 1058, 46);
		panel.add(componentesLabel);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 35));
		btnAtras.setBounds(587, 663, 303, 79);

		// escuchador del boton de atrás
		BotonAtrasAlumno escuchador = new BotonAtrasAlumno();
		escuchador.setVistaPrincipal(this);
		btnAtras.addActionListener(escuchador);
		panel.add(btnAtras);

		// Agregar el panel al contenedor principal
		setContentPane(panel);

		// Mostrar la ventana principal
		hacerVisible();
	}

	// getters y setters
	public DatosProyectoIntegrador getProyecto() {
		return proyecto;
	}

	public void setProyecto(DatosProyectoIntegrador proyecto) {
		this.proyecto = proyecto;
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

	public void hacerVisible() {
		setVisible(true);
	}

}
