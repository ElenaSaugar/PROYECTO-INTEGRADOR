package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import mvc.Control.BotonAtrasProfesor;
import mvc.Control.BotonBuscarConsultasPIPrf;
import mvc.Control.BotonConsultasProf;
import mvc.Control.BotonDarAlta;

/**
 * Clase que representa la ventana de búsqueda de un proyecto por un profesor.
 */
public class BuscarProyectoProf extends JFrame {

	private JPanel panel;
	private JTextField txtCodproy;
	private JButton confirmar;

	/**
	 * Constructor de la clase BuscarProyectoAlum. Configura la ventana y crea los
	 * componentes.
	 */
	public BuscarProyectoProf() {
		// Configuración de la ventana principal
		setTitle("Buscar proyecto");
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

		JLabel nombreProyLabel = new JLabel("Código del proyecto :");
		nombreProyLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		nombreProyLabel.setBounds(456, 263, 262, 59);
		panel.add(nombreProyLabel);

		// Creación del campo de dar de baja
		txtCodproy = new JTextField(20);
		txtCodproy.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txtCodproy.setBounds(771, 269, 200, 50);
		panel.add(txtCodproy);

		// Botón consultar
		confirmar = new JButton("Modificar");
		confirmar.setBackground(new Color(150, 223, 187));
		confirmar.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		confirmar.setBounds(269, 554, 365, 66);
		panel.add(confirmar);
		BotonBuscarConsultasPIPrf btnConfirmar = new BotonBuscarConsultasPIPrf(this);
		confirmar.addActionListener(btnConfirmar);

		// boton colsutas
		JButton btnConsultar = new JButton("Consultar");
		btnConsultar.setBackground(new Color(150, 223, 187));
		btnConsultar.setFont(new Font("Modern No. 20", Font.PLAIN, 40));
		btnConsultar.setBounds(878, 554, 365, 66);
		panel.add(btnConsultar);
		BotonConsultasProf btnConsultarP = new BotonConsultasProf(this);
		btnConsultar.addActionListener(btnConsultarP);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(671, 675, 177, 37);

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

	//getters y setters
	public JTextField getTxtCodproy() {
		return txtCodproy;
	}

	public void setTxtCodproy(JTextField txtCodproy) {
		this.txtCodproy = txtCodproy;
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
