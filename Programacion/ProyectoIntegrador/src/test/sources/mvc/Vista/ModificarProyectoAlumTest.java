package mvc.Vista;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JTextField;

import mvc.Modelo.DatosProyectoIntegrador;

public class ModificarProyectoAlumTest {
    private ModificarProyectoAlum ventana;
    private DatosProyectoIntegrador proyecto;

    @Before
    public void setUp() {
        proyecto = new DatosProyectoIntegrador();
        ventana = new ModificarProyectoAlum(proyecto);
    }

    @Test
    public void testGetDatosNuevos() {
        String nombreProy = "Muditos";
        String url = "http://www.example.com";

        JTextField txtNombreProy = ventana.getTxtNombreProy();
        JTextField txtUrl = ventana.getTxtUrl();

        txtNombreProy.setText(nombreProy);
        txtUrl.setText(url);

        ventana.getDatosNuevos();

        assertEquals(nombreProy, proyecto.getNombreProy());
        assertEquals(url, proyecto.getUrl());
    }
}
