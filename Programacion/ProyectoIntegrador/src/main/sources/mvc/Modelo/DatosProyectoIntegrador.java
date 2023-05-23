package mvc.Modelo;

/**
 * La clase DatosProyectoIntegrador representa los datos de un proyecto
 * integrador. Contiene atributos y métodos para acceder y modificar los datos
 * del proyecto.
 */
public class DatosProyectoIntegrador {

	private String nombreProy;
	private String area;
	private int codProy;
	private String notaFinal;
	private String url;
	private String año;
	private String curso;

	/**
	 * Obtiene el nombre del proyecto.
	 * 
	 * @return El nombre del proyecto.
	 */
	public String getNombreProy() {
		return nombreProy;
	}

	/**
	 * Establece el nombre del proyecto.
	 * 
	 * @param nombreProy El nombre del proyecto a establecer.
	 */
	public void setNombreProy(String nombreProy) {
		this.nombreProy = nombreProy;
	}

	/**
	 * Obtiene el área del proyecto.
	 * 
	 * @return El área del proyecto.
	 */
	public String getArea() {
		return area;
	}

	/**
	 * Establece el área del proyecto.
	 * 
	 * @param area El área del proyecto a establecer.
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * Obtiene el código del proyecto.
	 * 
	 * @return El código del proyecto.
	 */
	public int getCodProy() {
		return codProy;
	}

	/**
	 * Establece el código del proyecto.
	 * 
	 * @param codProy El código del proyecto a establecer.
	 */
	public void setCodProy(int codProy) {
		this.codProy = codProy;
	}

	/**
	 * Obtiene la nota final del proyecto.
	 * 
	 * @return La nota final del proyecto.
	 */
	public String getNotaFinal() {
		return notaFinal;
	}

	/**
	 * Establece la nota final del proyecto.
	 * 
	 * @param notaFinal La nota final del proyecto a establecer.
	 */
	public void setNotaFinal(String notaFinal) {
		this.notaFinal = notaFinal;
	}

	/**
	 * Obtiene la URL del proyecto.
	 * 
	 * @return La URL del proyecto.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * Establece la URL del proyecto.
	 * 
	 * @param url La URL del proyecto a establecer.
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * Obtiene el año del proyecto.
	 * 
	 * @return El año del proyecto.
	 */
	public String getAño() {
		return año;
	}

	/**
	 * Establece el año del proyecto.
	 * 
	 * @param año El año del proyecto a establecer.
	 */
	public void setAño(String año) {
		this.año = año;
	}

	/**
	 * Obtiene el curso del proyecto.
	 * 
	 * @return El curso del proyecto.
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Establece el curso del proyecto.
	 * 
	 * @param curso El curso del proyecto a establecer.
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}
}