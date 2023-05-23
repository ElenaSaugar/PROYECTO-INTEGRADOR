package mvc.Vista;

import javax.swing.*;
import javax.swing.text.JTextComponent;

import mvc.Control.BotonLogin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que representa la ventana de inicio de sesión.
 */
public class InicioSesion extends JFrame {

	private JPanel panel;
	private JComboBox<String> alumProfesorCombo;
	private JPasswordField contrasena;
	private JButton loginButton;
	private JButton vistaContrasena;
	private boolean vista;
	private char echoChar;

	/**
	 * Constructor de la clase InicioSesion. Crea la ventana y configura sus
	 * elementos.
	 */
	public InicioSesion() {

		// Configuración de la ventana
		setTitle("Iniciar sesión");
		Image icon = Toolkit.getDefaultToolkit().getImage("img/muditos.png");
		setIconImage(icon);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Obtenemos las dimensiones de la pantalla
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

		// Establecemos el tamaño de la ventana como las dimensiones de la pantalla
		setSize(screenSize.width, screenSize.height);
		setExtendedState(JFrame.MAXIMIZED_BOTH);

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

		JLabel InicioSesionlabel = new JLabel("Inicio de sesión");
		InicioSesionlabel.setFont(new Font("Modern No. 20", Font.PLAIN, 50));
		InicioSesionlabel.setBounds(624, 111, 327, 46);
		panel.add(InicioSesionlabel);

		JLabel combolabel = new JLabel("Seleccione su opción: ");
		combolabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		combolabel.setBounds(511, 252, 259, 46);
		panel.add(combolabel);

		// Creación del modelo de datos para el JComboBox
		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		comboBoxModel.addElement("Alumn@");
		comboBoxModel.addElement("Profesor");

		// Creación del JComboBox y agregarlo al panel
		alumProfesorCombo = new JComboBox<>(comboBoxModel);
		alumProfesorCombo.setFont(new Font("Modern No. 20", Font.ITALIC, 25));
		alumProfesorCombo.setBounds(806, 252, 196, 46);
		panel.add(alumProfesorCombo);

		JLabel passwordLabel = new JLabel("Contraseña:");
		passwordLabel.setFont(new Font("Modern No. 20", Font.PLAIN, 30));
		passwordLabel.setBounds(618, 371, 152, 46);
		panel.add(passwordLabel);

		// Creación del botón de inicio de sesión
		loginButton = new JButton("Iniciar sesión");
		loginButton.setBackground(new Color(150, 223, 187));
		loginButton.setFont(new Font("Modern No. 20", Font.PLAIN, 45));
		loginButton.setBounds(523, 551, 564, 66);
		panel.add(loginButton);
		BotonLogin btn = new BotonLogin(this);
		loginButton.addActionListener(btn);

		// Creación del campo de contraseña
		contrasena = new JPasswordField(20);
		contrasena.setFont(new Font("Modern No. 20", Font.ITALIC, 25));
		contrasena.setBounds(806, 373, 196, 46);
		panel.add(contrasena);

		vista = false;
		echoChar = contrasena.getEchoChar();

		vistaContrasena = new JButton("");
		vistaContrasena.setIcon(new ImageIcon("img/ojo.png"));
		vistaContrasena.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!vista) {
					vista = true;
					contrasena.setEchoChar((char) 0);
				} else {
					vista = false;
					contrasena.setEchoChar(echoChar);
				}
			}
		});

		vistaContrasena.setBounds(1024, 382, 44, 26);
		panel.add(vistaContrasena);

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

	public JComboBox<String> getAlumProfesorCombo() {
		return alumProfesorCombo;
	}

	public void setAlumProfesorCombo(JComboBox<String> alumProfesorCombo) {
		this.alumProfesorCombo = alumProfesorCombo;
	}

	public JPasswordField getContrasena() {
		return contrasena;
	}

	public void setContrasena(JPasswordField contrasena) {
		this.contrasena = contrasena;
	}

	public JButton getLoginButton() {
		return loginButton;
	}

	public void setLoginButton(JButton loginButton) {
		this.loginButton = loginButton;
	}

	public JButton getVistaContrasena() {
		return vistaContrasena;
	}

	public void setVistaContrasena(JButton vistaContrasena) {
		this.vistaContrasena = vistaContrasena;
	}

	public boolean isVista() {
		return vista;
	}

	public void setVista(boolean vista) {
		this.vista = vista;
	}

	public char getEchoChar() {
		return echoChar;
	}

	public void setEchoChar(char echoChar) {
		this.echoChar = echoChar;
	}

	/**
	 * Muestra un mensaje emergente en la ventana.
	 *
	 * @param mensaje el mensaje a mostrar.
	 */
	public void mostrarMensaje(String mensaje) {
		JOptionPane.showMessageDialog(this, mensaje);

	}

}
