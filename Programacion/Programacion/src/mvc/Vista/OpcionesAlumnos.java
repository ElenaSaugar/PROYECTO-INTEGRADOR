package mvc.Vista;

import java.awt.Font;

import javax.swing.*;

public class OpcionesAlumnos extends JFrame {

	private JPanel panel;
	private JTextField opciones;
	private JButton consultas;
	private JButton modDatos;
	
	public OpcionesAlumnos() {
        // Configuración de la ventana principal
        setTitle("Ventana principal Alumnos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(757, 288);
        setLocationRelativeTo(null);

        // Creación del panel principal con un Absolute Layout
        panel = new JPanel();
        panel.setLayout(null);
        
        JLabel consultaslbl = new JLabel("¿Que desea hacer?");
        consultaslbl.setFont(new Font("Tahoma", Font.PLAIN, 15));
        consultaslbl.setBounds(294, 10, 183, 37);
        panel.add(consultaslbl);
        
     // Creación del botón de inicio de sesión
        consultas = new JButton("Consultar proyectos");
        consultas.setFont(new Font("Tahoma", Font.PLAIN, 15));
        consultas.setBounds(203, 146, 322, 49);
        panel.add(consultas);
        
     // Creación del botón de inicio de sesión
        modDatos = new JButton("Modificar datos");
        modDatos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        modDatos.setBounds(203, 70, 322, 49);
        panel.add(modDatos);
        
     // Agregar el panel al contenedor principal
        setContentPane(panel);

        // Mostrar la ventana principal
        setVisible(true);
}
}
