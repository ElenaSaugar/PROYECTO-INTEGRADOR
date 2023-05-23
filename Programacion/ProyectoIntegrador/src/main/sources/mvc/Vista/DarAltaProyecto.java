package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import mvc.Control.BotonAtrasProfesor;
import mvc.Control.BotonDarAlta;
import mvc.Modelo.DatosProyectoIntegrador;

/**
 * Clase que representa la ventana de dar de alta un proyecto.
 */
public class DarAltaProyecto extends JFrame {

	private JPanel panel;
	private JTextField txtnomProy;
	private JTextField txtArea;
	private JComboBox<String> areaCombo;
	private JTextField txtAnio;
	private JTextField txtcurso;
	private JTextField txtNotaFinal;
	private JTextField txturl;
	private JButton darAltaFinal;

	/**
	 * Constructor de la clase DarAltaProyecto. Crea la ventana y configura sus
	 * elementos.
	 */
	public DarAltaProyecto() {
		// Configuración de la ventana principal
		setTitle("Dar de alta proyecto");
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

		JLabel opciones = new JLabel("Dar de alta P.I");
		opciones.setFont(new Font("Modern No. 20", Font.PLAIN, 38));
		opciones.setBounds(637, 40, 295, 70);
		panel.add(opciones);

		// logo imagen
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("img/logo.png");
		Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		imageLabel.setIcon(new ImageIcon(image));
		imageLabel.setBounds(44, 39, 160, 100);
		panel.add(imageLabel);

		// nombre del proyecto
		JLabel nombreProyLabel = new JLabel("Nombre de proyecto :");
		nombreProyLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		nombreProyLabel.setBounds(97, 160, 276, 37);
		panel.add(nombreProyLabel);

		txtnomProy = new JTextField(20);
		txtnomProy.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txtnomProy.setBounds(405, 164, 214, 37);
		panel.add(txtnomProy);

		// url
		JLabel urlLabel = new JLabel("URL :");
		urlLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		urlLabel.setBounds(270, 303, 103, 37);
		panel.add(urlLabel);

		txturl = new JTextField(20);
		txturl.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txturl.setBounds(405, 307, 214, 37);
		panel.add(txturl);

		// Año
		JLabel anioLabel = new JLabel("Año :");
		anioLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		anioLabel.setBounds(275, 465, 91, 25);
		panel.add(anioLabel);

		txtAnio = new JTextField(20);
		txtAnio.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txtAnio.setBounds(405, 463, 214, 37);
		panel.add(txtAnio);

		// Curso
		JLabel cursoLabel = new JLabel("Curso :");
		cursoLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		cursoLabel.setBounds(924, 170, 95, 25);
		panel.add(cursoLabel);

		txtcurso = new JTextField(20);
		txtcurso.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txtcurso.setBounds(1067, 164, 214, 37);
		panel.add(txtcurso);

		// nota final
		JLabel notaFinalLabel = new JLabel("Nota final :");
		notaFinalLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		notaFinalLabel.setBounds(878, 297, 141, 57);
		panel.add(notaFinalLabel);

		txtNotaFinal = new JTextField(20);
		txtNotaFinal.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txtNotaFinal.setBounds(1067, 307, 214, 37);
		panel.add(txtNotaFinal);

		// Creación del modelo de datos para el JComboBox
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		comboBoxModel.addElement("DAW");
		comboBoxModel.addElement("DAM");
		comboBoxModel.addElement("ASIR");

		// Creación del JComboBox y agregarlo al panel
		areaCombo = new JComboBox<>(comboBoxModel);
		areaCombo.setFont(new Font("Modern No. 20", Font.ITALIC, 25));
		areaCombo.setBounds(1067, 460, 214, 36);
		panel.add(areaCombo);

		// Area
		JLabel areaLabel = new JLabel("Área :");
		areaLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		areaLabel.setBounds(938, 463, 95, 37);
		panel.add(areaLabel);

		// Botón dar de alta
		darAltaFinal = new JButton("Dar de alta proyecto");
		darAltaFinal.setBackground(new Color(150, 223, 187));
		darAltaFinal.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		darAltaFinal.setBounds(490, 616, 552, 66);
		panel.add(darAltaFinal);
		BotonDarAlta btnAlta = new BotonDarAlta(this);
		darAltaFinal.addActionListener(btnAlta);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(676, 707, 177, 37);

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

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JTextField getTxtnomProy() {
		return txtnomProy;
	}

	public void setTxtnomProy(JTextField txtnomProy) {
		this.txtnomProy = txtnomProy;
	}

	public String getSelectedArea() {
		return (String) areaCombo.getSelectedItem();
	}

	public JComboBox<String> getAreaCombo() {
		return areaCombo;
	}

	public void setAreaCombo(JComboBox<String> areaCombo) {
		areaCombo = areaCombo;
	}

	public JTextField getTxtAnio() {
		return txtAnio;
	}

	public void setTxtAnio(JTextField txtAnio) {
		this.txtAnio = txtAnio;
	}

	public JTextField getTxtNotaFinal() {
		return txtNotaFinal;
	}

	public void setTxtNotaFinal(JTextField txtNotaFinal) {
		this.txtNotaFinal = txtNotaFinal;
	}

	public JButton getDarAlta() {
		return darAltaFinal;
	}

	public void setDarAlta(JButton darAlta) {
		this.darAltaFinal = darAlta;
	}

	public JTextField getTxtcurso() {
		return txtcurso;
	}

	public void setTxtcurso(JTextField txtcurso) {
		txtcurso = txtcurso;
	}

	public JTextField getTxturl() {
		return txturl;
	}

	public void setTxturl(JTextField txturl) {
		txturl = txturl;
	}

	public JButton getDarAltaFinal() {
		return darAltaFinal;
	}

	public void setDarAltaFinal(JButton darAltaFinal) {
		darAltaFinal = darAltaFinal;
	}

	/**
	 * Obtiene los datos del proyecto ingresados en la ventana.
	 *
	 * @return los datos del proyecto ingresados.
	 */
	public DatosProyectoIntegrador getDatosProyecto() {
		DatosProyectoIntegrador datos = new DatosProyectoIntegrador();
		datos.setNombreProy(getTxtnomProy().getText());
		datos.setAño(getTxtAnio().getText());
		datos.setNotaFinal(getTxtNotaFinal().getText());
		datos.setUrl(getTxturl().getText());
		datos.setCurso(getTxtcurso().getText());
		String seleccion = (String) areaCombo.getSelectedItem();
		datos.setArea(seleccion);
		return datos;
	}
}
