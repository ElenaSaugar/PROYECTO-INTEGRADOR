package mvc.Vista;

import java.awt.Font;

import javax.swing.*;

public class OpcionesProfesor extends JFrame {

	private JPanel panel;
	private JLabel opciones;
	private JButton darAlta;
	private JButton darBaja;
	private JButton consultas;
	private JButton modDatos;
	
	public OpcionesProfesor() {
		
        // Configuración de la ventana principal
        setTitle("Ventana principal Profesores");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(757, 392);
        setLocationRelativeTo(null);

        // Creación del panel principal con un Absolute Layout
        panel = new JPanel();
        panel.setLayout(null);
        
        JLabel opciones = new JLabel("¿Que desea hacer?");
        opciones.setFont(new Font("Tahoma", Font.PLAIN, 15));
        opciones.setBounds(299, 23, 183, 37);
        panel.add(opciones);
        
     // Creación del botón de inicio de sesión
        darAlta = new JButton("Dar de alta Proyecto Integrador");
        darAlta.setFont(new Font("Tahoma", Font.PLAIN, 15));
        darAlta.setBounds(209, 81, 314, 47);
        panel.add(darAlta);
        
     // Creación del botón de inicio de sesión
        darBaja = new JButton("Dar de alta Proyecto Integrador");
        darBaja.setFont(new Font("Tahoma", Font.PLAIN, 15));
        darBaja.setBounds(209, 138, 314, 47);
        panel.add(darBaja);
        
     // Creación del botón de inicio de sesión
        consultas = new JButton("Consultar proyectos");
        consultas.setFont(new Font("Tahoma", Font.PLAIN, 15));
        consultas.setBounds(209, 252, 314, 47);
        panel.add(consultas);
        
     // Creación del botón de inicio de sesión
        modDatos = new JButton("Modificar datos");
        modDatos.setFont(new Font("Tahoma", Font.PLAIN, 15));
        modDatos.setBounds(209, 195, 314, 47);
        panel.add(modDatos);
        
     // Agregar el panel al contenedor principal
        setContentPane(panel);

        // Mostrar la ventana principal
        setVisible(true);
}
}