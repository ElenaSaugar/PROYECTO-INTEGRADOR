package mvc.Vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModificarDatosProfesor extends JFrame {

	private JPanel panel;
	private JTextField txtnomProy;
	private JTextField txtNombreAlum;
	private JTextField txtArea;
	private JTextField txtCodProy;
	private JTextField txtAnio;
	private JTextField txtNotaFinal;
	private JButton modDatos;
	
	public ModificarDatosProfesor() {
        // Configuración de la ventana principal
        setTitle("Modificar Datos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(757, 438);
        setLocationRelativeTo(null);

        // Creación del panel principal con un Absolute Layout
        panel = new JPanel();
        panel.setLayout(null);
        
        JLabel codProyLabel = new JLabel("Código de proyecto:");
        codProyLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        codProyLabel.setBounds(170, 189, 138, 25);
        panel.add(codProyLabel);

        // Creación del campo de dar de baja
        txtCodProy = new JTextField(20);
        txtCodProy.setBounds(404, 191, 155, 25);
        panel.add(txtCodProy);

        JLabel nombreProyLabel = new JLabel("Nombre de proyecto:");
        nombreProyLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nombreProyLabel.setBounds(170, 72, 183, 37);
        panel.add(nombreProyLabel);

        // Creación del campo de dar de baja
        txtnomProy = new JTextField(20);
        txtnomProy.setBounds(404, 80, 155, 25);
        panel.add(txtnomProy);
        
     // Creación del campo de dar de baja
        txtNombreAlum = new JTextField(20);
        txtNombreAlum.setBounds(404, 119, 155, 25);
        panel.add(txtNombreAlum);

        JLabel nomAlumLabel = new JLabel("Nombre de Alumno:");
        nomAlumLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        nomAlumLabel.setBounds(170, 119, 138, 25);
        panel.add(nomAlumLabel);

        // Creación del campo de dar de baja
        txtArea = new JTextField(20);
        txtArea.setBounds(404, 154, 155, 25);
        panel.add(txtArea);
        
        JLabel areaLabel = new JLabel("Área:");
        areaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        areaLabel.setBounds(170, 154, 138, 25);
        panel.add(areaLabel);
        
     // Creación del campo de dar de baja
        txtAnio = new JTextField(20);
        txtAnio.setBounds(404, 226, 155, 25);
        panel.add(txtAnio);
        
        JLabel anioLabel = new JLabel("Año:");
        anioLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        anioLabel.setBounds(170, 224, 138, 25);
        panel.add(anioLabel);
        
     // Creación del campo de dar de baja
        txtNotaFinal = new JTextField(20);
        txtNotaFinal.setBounds(404, 261, 155, 25);
        panel.add(txtNotaFinal);
        
        JLabel notaFinalLabel = new JLabel("Nota Final:");
        notaFinalLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
        notaFinalLabel.setBounds(170, 259, 138, 25);
        panel.add(notaFinalLabel);

        // Creación del botón de inicio de sesión
        modDatos = new JButton("Modificar Datos");
        modDatos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        modDatos.setBounds(170, 318, 389, 30);
        panel.add(modDatos);
        
     // Agregar el panel al contenedor principal
        setContentPane(panel);

        // Mostrar la ventana principal
        setVisible(true);
}
}

