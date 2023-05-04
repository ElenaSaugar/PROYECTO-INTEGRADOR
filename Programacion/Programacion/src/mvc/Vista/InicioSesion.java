package mvc.Vista;

import javax.swing.*;
import java.awt.*;

public class InicioSesion extends JFrame {

	private JPanel panel;
	private JComboBox<String> alumProfesor;
	private JPasswordField contrasena;
	private JButton btnInicioSesion;

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
	        combolabel.setBounds(55, 38, 138, 25);
	        panel.add(combolabel);
	        
	        // Creación del modelo de datos para el JComboBox
	        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
	        comboBoxModel.addElement("Alumno");
	        comboBoxModel.addElement("Profesor");

	        // Creación del JComboBox y agregarlo al panel
	        alumProfesor = new JComboBox<>(comboBoxModel);
	        alumProfesor.setBounds(218, 38, 100, 25);
	        panel.add(alumProfesor);

	        JLabel passwordLabel = new JLabel("Contraseña:");
	        passwordLabel.setBounds(55, 73, 80, 25);
	        panel.add(passwordLabel);

	        // Creación del campo de contraseña
	        contrasena = new JPasswordField(20);
	        contrasena.setBounds(150, 73, 190, 25);
	        panel.add(contrasena);

	        // Creación del botón de inicio de sesión
	        btnInicioSesion = new JButton("Iniciar sesión");
	        btnInicioSesion.setBounds(24, 108, 335, 30);
	        panel.add(btnInicioSesion);

	        // Agregar el panel al contenedor principal
	        setContentPane(panel);

	        // Mostrar la ventana principal
	        setVisible(true);
	    }

}
