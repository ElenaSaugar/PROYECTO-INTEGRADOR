package mvc.Vista;

import java.awt.Font;

import javax.swing.*;

public class Consultas extends JFrame {

	private JPanel panel;
	private JTextField txtnomProy;
	private JTextField txtCodAlum;
	private JTextField txtArea;
	private JTextField txtAnio;
	private JButton confirmar;
	
	public Consultas() {
        // Configuración de la ventana principal
        setTitle("Consultas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(757, 487);
        setLocationRelativeTo(null);

        // Creación del panel principal con un Absolute Layout
        panel = new JPanel();
        panel.setLayout(null);

        JLabel nombreProyLabel = new JLabel("Nombre de proyecto:");
        nombreProyLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nombreProyLabel.setBounds(22, 60, 183, 37);
        panel.add(nombreProyLabel);

        // Creación del campo de dar de baja
        txtnomProy = new JTextField(20);
        txtnomProy.setBounds(195, 68, 155, 25);
        panel.add(txtnomProy);

        // Creación del campo de dar de baja
        txtArea = new JTextField(20);
        txtArea.setBounds(543, 68, 155, 25);
        panel.add(txtArea);
        
        JLabel areaLabel = new JLabel("Área:");
        areaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        areaLabel.setBounds(431, 66, 138, 25);
        panel.add(areaLabel);
        
     // Creación del campo de dar de baja
        txtAnio = new JTextField(20);
        txtAnio.setBounds(543, 115, 155, 25);
        panel.add(txtAnio);
        
        JLabel anioLabel = new JLabel("Año:");
        anioLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        anioLabel.setBounds(431, 113, 138, 25);
        panel.add(anioLabel);
        
        JLabel codAlumLabel = new JLabel("Codigo de alumno:");
        codAlumLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        codAlumLabel.setBounds(22, 107, 183, 37);
        panel.add(codAlumLabel);

        // Creación del campo de dar de baja
        txtnomProy = new JTextField(20);
        txtnomProy.setBounds(195, 115, 155, 25);
        panel.add(txtnomProy);

        // Creación del botón de inicio de sesión
        confirmar = new JButton("Confirmar");
        confirmar.setFont(new Font("Tahoma", Font.PLAIN, 15));
        confirmar.setBounds(146, 177, 458, 37);
        panel.add(confirmar);
        
     // Agregar el panel al contenedor principal
        setContentPane(panel);

        // Mostrar la ventana principal
        setVisible(true);
}
}


