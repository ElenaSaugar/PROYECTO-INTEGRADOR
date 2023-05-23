package mvc.Vista;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.JTextField;

public class BuscarAlumnoProfTest {
    private BuscarAlumnoProf ventana;

    @Before
    public void setUp() {
        ventana = new BuscarAlumnoProf();
    }

    @Test
    public void testGetNumExpediente() {
        String numExpediente = "005";

        JTextField txtNumExpediente = ventana.getNumExpediente();
        txtNumExpediente.setText(numExpediente);

        assertEquals(numExpediente, txtNumExpediente.getText());
    }
}
