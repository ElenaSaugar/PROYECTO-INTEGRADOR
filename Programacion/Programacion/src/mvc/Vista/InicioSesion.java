package mvc.Vista;

import javax.swing.*;
import java.awt.*;

public class InicioSesion extends JFrame {

	private JPanel panel;
	private JComboBox<String> alumProfesorCombo;
	private JPasswordField passwordField;
	private JButton loginButton;

	    public InicioSesion() {
	        // Configuración de la ventana principal
	        setTitle("Iniciar sesión");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 200);
	        setLocationRelativeTo(null);

	        // Creación del panel principal con un Absolute Layout
	        panel = new JPanel();
	        panel.setLayout(null);

	        JLabel combolabel = new JLabel("Seleccione su opcion: ");
	        combolabel.setBounds(24, 38, 138, 25);
	        panel.add(combolabel);
	        
	        // Creación del modelo de datos para el JComboBox
	        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
	        comboBoxModel.addElement("Alumno");
	        comboBoxModel.addElement("Profesor");

	        // Creación del JComboBox y agregarlo al panel
	        alumProfesorCombo = new JComboBox<>(comboBoxModel);
	        alumProfesorCombo.setBounds(195, 38, 100, 25);
	        panel.add(alumProfesorCombo);

	        JLabel passwordLabel = new JLabel("Numero de expediente:");
	        passwordLabel.setBounds(24, 73, 138, 25);
	        panel.add(passwordLabel);

	        // Creación del campo de contraseña
	        passwordField = new JPasswordField(20);
	        passwordField.setBounds(174, 73, 155, 25);
	        panel.add(passwordField);

	        // Creación del botón de inicio de sesión
	        loginButton = new JButton("Iniciar sesión");
	        loginButton.setBounds(24, 108, 335, 30);
	        panel.add(loginButton);

	        // Agregar el panel al contenedor principal
	        setContentPane(panel);

	        // Mostrar la ventana principal
	        setVisible(true);
	    }

}
