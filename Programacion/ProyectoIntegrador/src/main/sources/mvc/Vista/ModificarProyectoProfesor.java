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

import mvc.Control.BotonAtrasProfesor;
import mvc.Control.BotonBuscarConsultasPIPrf;
import mvc.Control.BotonModificarPI;
import mvc.Modelo.DatosProyectoIntegrador;
import java.awt.Font;

public class ModificarProyectoProfesor extends JFrame {

	private  DatosProyectoIntegrador proyecto;
	private  JTextField txtNombreProy;
	private  JTextField txtNotaFinal;
	private  JTextField txtUrl;
	private  JTextField txtAño;
	private  JTextField txtCurso;
	private  JTextField txtArea;
	private  JButton btnModificar;

	private  JPanel panel;

	public ModificarProyectoProfesor(DatosProyectoIntegrador proyecto) {
		super();
		this.proyecto = proyecto;
		inicializarComponentes();
	}

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
		codProyLabel.setBounds(111, 162, 282, 46);
		panel.add(codProyLabel);

		txtNombreProy = new JTextField(20);
		txtNombreProy.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtNombreProy.setText(proyecto.getNombreProy());
		txtNombreProy.setBounds(403, 157, 256, 60);
		panel.add(txtNombreProy);

		// Nota Final

		JLabel notaFinalLabel = new JLabel("Nota final :");
		notaFinalLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		notaFinalLabel.setBounds(820, 314, 160, 46);
		panel.add(notaFinalLabel);

		txtNotaFinal = new JTextField(20);
		txtNotaFinal.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtNotaFinal.setText(proyecto.getNotaFinal());
		txtNotaFinal.setBounds(990, 309, 256, 60);
		panel.add(txtNotaFinal);

		// URL

		JLabel urlLabel = new JLabel("URL :");
		urlLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		urlLabel.setBounds(292, 314, 110, 46);
		panel.add(urlLabel);

		txtUrl = new JTextField(20);
		txtUrl.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtUrl.setText(proyecto.getUrl());
		txtUrl.setBounds(403, 308, 256, 63);
		panel.add(txtUrl);

		// AÑO

		JLabel añoLabel = new JLabel("Año :");
		añoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		añoLabel.setBounds(292, 468, 89, 46);
		panel.add(añoLabel);

		txtAño = new JTextField(20);
		txtAño.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtAño.setText(proyecto.getAño());
		txtAño.setBounds(403, 463, 256, 61);
		panel.add(txtAño);

		// curso

		JLabel cursoLabel = new JLabel("Curso :");
		cursoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		cursoLabel.setBounds(869, 162, 110, 46);
		panel.add(cursoLabel);

		txtCurso = new JTextField(20);
		txtCurso.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtCurso.setText(proyecto.getCurso());
		txtCurso.setBounds(989, 157, 256, 60);
		panel.add(txtCurso);

		// area

		JLabel areaLabel = new JLabel("Area :");
		areaLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		areaLabel.setBounds(876, 468, 104, 46);
		panel.add(areaLabel);

		txtArea = new JTextField(20);
		txtArea.setFont(new Font("Modern No. 20", Font.PLAIN, 24));
		txtArea.setText(proyecto.getArea());
		txtArea.setBounds(990, 462, 256, 63);
		panel.add(txtArea);

		// Botón consultar
		btnModificar = new JButton("Modificar");
		btnModificar.setBackground(new Color(150, 223, 187));
		btnModificar.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		btnModificar.setBounds(468, 618, 552, 66);
		panel.add(btnModificar);
		BotonModificarPI btnConfirmar = new BotonModificarPI(this);
		btnModificar.addActionListener(btnConfirmar);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(650, 709, 177, 37);

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

	public JTextField getTxtNotaFinal() {
		return txtNotaFinal;
	}

	public void setTxtNotaFinal(JTextField txtNotaFinal) {
		this.txtNotaFinal = txtNotaFinal;
	}

	public JTextField getTxtUrl() {
		return txtUrl;
	}

	public void setTxtUrl(JTextField txtUrl) {
		this.txtUrl = txtUrl;
	}

	public JTextField getTxtAño() {
		return txtAño;
	}

	public void setTxtAño(JTextField txtAño) {
		this.txtAño = txtAño;
	}

	public JTextField getTxtCurso() {
		return txtCurso;
	}

	public void setTxtCurso(JTextField txtCurso) {
		this.txtCurso = txtCurso;
	}

	public JTextField getTxtArea() {
		return txtArea;
	}

	public void setTxtArea(JTextField txtArea) {
		this.txtArea = txtArea;
	}

	public  JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public void getDatosNuevos() {
		proyecto.setNombreProy(getTxtNombreProy().getText());
		proyecto.setAño(getTxtAño().getText());
		proyecto.setNotaFinal(getTxtNotaFinal().getText());
		proyecto.setArea(getTxtArea().getText());
		proyecto.setCurso(getTxtCurso().getText());
		proyecto.setUrl(getTxtUrl().getText());

	}

}
