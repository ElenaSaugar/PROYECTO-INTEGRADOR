package mvc.Modelo;

/**
 * Clase que representa los datos de un alumno.
 */
public class DatosAlumnos {

	private int numExp;
	private String nombreApellidos;
	private int Codproyecto;

	public int getCodproyecto() {
		return Codproyecto;
	}

	public void setCodproyecto(int codproyecto) {
		Codproyecto = codproyecto;
	}

	/**
	 * Obtiene el número de expediente del alumno.
	 *
	 * @return el número de expediente del alumno.
	 */
	public int getNumExp() {
		return numExp;
	}

	/**
	 * Establece el número de expediente del alumno.
	 *
	 * @param numExp el número de expediente del alumno.
	 */
	public void setNumExp(int numExp) {
		this.numExp = numExp;
	}

	/**
	 * Obtiene el nombre y apellidos del alumno.
	 *
	 * @return el nombre y apellidos del alumno.
	 */
	public String getNombreApellidos() {
		return nombreApellidos;
	}

	/**
	 * Establece el nombre y apellidos del alumno.
	 *
	 * @param nombreApellidos el nombre y apellidos del alumno.
	 */
	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

}
