package mvc.Vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModificarDatosAlumnos extends JFrame {

	private JPanel panel;
	private JTextField txtnomProy;
	private JTextField txtUrl;
	private JButton modDatos;
	
	public ModificarDatosAlumnos() {
        // Configuración de la ventana principal
        setTitle("Modificar Datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(757, 288);
        setLocationRelativeTo(null);

        // Creación del panel principal con un Absolute Layout
        panel = new JPanel();
        panel.setLayout(null);
        
     // Creación del campo de dar de baja
        txtnomProy = new JTextField(20);
        txtnomProy.setBounds(539, 73, 155, 25);
        panel.add(txtnomProy);
        
        JLabel nombreProyLabel = new JLabel("Nombre de proyecto:");
        nombreProyLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nombreProyLabel.setBounds(24, 65, 183, 37);
        panel.add(nombreProyLabel);

     // Creación del campo de dar de baja
        txtUrl = new JTextField(20);
        txtUrl.setBounds(189, 73, 155, 25);
        panel.add(txtUrl);
        
        JLabel urlLabel = new JLabel("URL:");
        urlLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        urlLabel.setBounds(469, 73, 138, 25);
        panel.add(urlLabel);
        
     // Creación del botón de inicio de sesión
        modDatos = new JButton("Confirmar");
        modDatos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        modDatos.setBounds(238, 167, 251, 30);
        panel.add(modDatos);
        
     // Agregar el panel al contenedor principal
        setContentPane(panel);

        // Mostrar la ventana principal
        setVisible(true);
}
}