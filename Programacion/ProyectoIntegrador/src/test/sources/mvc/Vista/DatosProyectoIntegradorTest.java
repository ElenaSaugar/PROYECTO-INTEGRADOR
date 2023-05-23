package mvc.Vista;

import org.junit.Before;
import org.junit.Test;

import mvc.Modelo.DatosProyectoIntegrador;

import static org.junit.Assert.*;

public class DatosProyectoIntegradorTest {
    private DatosProyectoIntegrador proyecto;

    @Before
    public void setUp() {
        proyecto = new DatosProyectoIntegrador();
    }

    @Test
    public void testGetDatosNuevos() {
        String nombreProy = "nuevo";
        String area = "daw";
        int codProy = 1;
        String notaFinal = "8,5";
        String url = "http://www.example.com";
        String año = "2023";
        String curso = "1";

        proyecto.setNombreProy(nombreProy);
        proyecto.setArea(area);
        proyecto.setCodProy(codProy);
        proyecto.setNotaFinal(notaFinal);
        proyecto.setUrl(url);
        proyecto.setAño(año);
        proyecto.setCurso(curso);

        assertEquals(nombreProy, proyecto.getNombreProy());
        assertEquals(area, proyecto.getArea());
        assertEquals(codProy, proyecto.getCodProy());
        assertEquals(notaFinal, proyecto.getNotaFinal());
        assertEquals(url, proyecto.getUrl());
        assertEquals(año, proyecto.getAño());
        assertEquals(curso, proyecto.getCurso());
    }
}
