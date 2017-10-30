/**
 * 
 */
package cl.accenture.curso_java.alumno.modelo;

/**
 * @author Martin Cuevas
 *
 */
public class Alumno {
	private int id, edad;
	private String nombre, apellido, apellidoMaterno;

	/**
	 * 
	 */
	public Alumno() {
	}

	/**
	 * @param id
	 * @param edad
	 * @param nombre
	 * @param apellido
	 * @param apellidoMaterno
	 */
	public Alumno(int id, int edad, String nombre, String apellido, String apellidoMaterno) {
		this.id = id;
		this.edad = edad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad
	 *            the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido
	 *            the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno
	 *            the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Alumno) {
			Alumno alumno = (Alumno)obj;
			return this.getId() == alumno.getId();
		}
		return false;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(id + " " + nombre + " "	+ apellido + " " + apellidoMaterno + " " + edad);
		
		return builder.toString();
	}
}
