package mvc.Vista;

import javax.swing.*;

public class DarBajaProyecto extends JFrame {

	private JPanel panel;
	private JTextField txtField;
	private JButton darBaja;
	
	public DarBajaProyecto() {
        // Configuración de la ventana principal
        setTitle("Dar de baja proyecto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        // Creación del panel principal con un Absolute Layout
        panel = new JPanel();
        panel.setLayout(null);
        
        JLabel codProyLabel = new JLabel("Código de proyecto:");
        codProyLabel.setBounds(24, 47, 138, 25);
        panel.add(codProyLabel);

        // Creación del campo de dar de baja
        txtField = new JTextField(20);
        txtField.setBounds(185, 47, 174, 25);
        panel.add(txtField);

        // Creación del botón de inicio de sesión
        darBaja = new JButton("Dar de baja proyecto");
        darBaja.setBounds(24, 108, 335, 30);
        panel.add(darBaja);

        
     // Agregar el panel al contenedor principal
        setContentPane(panel);

        // Mostrar la ventana principal
        setVisible(true);
}
}
