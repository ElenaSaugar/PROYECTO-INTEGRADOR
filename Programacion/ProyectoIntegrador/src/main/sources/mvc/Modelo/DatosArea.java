package mvc.Modelo;

/**
 * Clase que representa los datos de un área.
 */
public class DatosArea {

	private int codAr;
	private String nombre;
	private String descripcion;

	/**
	 * Obtiene el código del área.
	 *
	 * @return el código del área.
	 */
	public int getCodAr() {
		return codAr;
	}

	/**
	 * Establece el código del área.
	 *
	 * @param codAr el código del área.
	 */
	public void setCodAr(int codAr) {
		this.codAr = codAr;
	}

	/**
	 * Obtiene el nombre del área.
	 *
	 * @return el nombre del área.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del área.
	 *
	 * @param nombre el nombre del área.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene la descripción del área.
	 *
	 * @return la descripción del área.
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Establece la descripción del área.
	 *
	 * @param descripcion la descripción del área.
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
