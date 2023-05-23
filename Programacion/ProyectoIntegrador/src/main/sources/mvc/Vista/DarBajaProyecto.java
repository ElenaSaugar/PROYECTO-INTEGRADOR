package mvc.Vista;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import mvc.Control.BotonAtrasProfesor;
import mvc.Control.BotonDarAlta;
import mvc.Control.BotonDarBaja;
import java.awt.event.ActionListener;

/**
 * Clase que representa la ventana de dar de baja un proyecto.
 */
public class DarBajaProyecto extends JFrame {
	private JPanel panel;
	private JTextField txtDarBaja;
	private JButton darBaja;

	/**
	 * Constructor de la clase DarBajaProyecto. Configura la ventana y crea los
	 * componentes.
	 */
	public DarBajaProyecto() {
		// Configuración de la ventana principal
		setTitle("Dar de baja proyecto");
		Image icon = Toolkit.getDefaultToolkit().getImage("img/muditos.png");
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Creación del panel
		panel = new JPanel();
		panel.setBackground(new Color(150, 217, 223));
		panel.setLayout(null); // Configuración del layout

		// Obtenemos las dimensiones de la pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// Establecemos el tamaño de la ventana como las dimensiones de la pantalla
		setSize(screenSize.width, screenSize.height);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

		// logo imagen
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("img/logo.png");
		Image image = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		imageLabel.setIcon(new ImageIcon(image));
		imageLabel.setBounds(44, 39, 160, 100);
		panel.add(imageLabel);

		JLabel opciones = new JLabel("Dar de baja P.I");
		opciones.setFont(new Font("Modern No. 20", Font.PLAIN, 38));
		opciones.setBounds(648, 81, 295, 70);
		panel.add(opciones);

		JLabel codProyLabel = new JLabel("Código de proyecto :");
		codProyLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		codProyLabel.setBounds(531, 270, 282, 46);
		panel.add(codProyLabel);

		// Creación del campo de dar de baja
		txtDarBaja = new JTextField(20);
		txtDarBaja.setFont(new Font("Modern No. 20", Font.PLAIN, 25));
		txtDarBaja.setBounds(796, 270, 225, 46);
		panel.add(txtDarBaja);

		// Creación del botón de inicio de sesión
		darBaja = new JButton("Dar de baja proyecto");
		darBaja.setBackground(new Color(150, 223, 187));
		darBaja.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		darBaja.setBounds(602, 476, 361, 61);
		panel.add(darBaja);
		BotonDarBaja btnBaja = new BotonDarBaja(this);
		darBaja.addActionListener(btnBaja);

		// boton de atrás
		JButton btnAtras = new JButton("Volver");
		btnAtras.setBackground(new Color(150, 223, 187));
		btnAtras.setFont(new Font("Modern No. 20", Font.PLAIN, 26));
		btnAtras.setBounds(693, 592, 177, 37);

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
	public JPanel getPanel() {
		return panel;
	}

	public JTextField getTxtDarBaja() {
		return txtDarBaja;
	}

	public void setTxtDarBaja(JTextField txtDarBaja) {
		this.txtDarBaja = txtDarBaja;
	}

	public JButton getDarBaja() {
		return darBaja;
	}

	public void setDarBaja(JButton darBaja) {
		darBaja = darBaja;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

}
