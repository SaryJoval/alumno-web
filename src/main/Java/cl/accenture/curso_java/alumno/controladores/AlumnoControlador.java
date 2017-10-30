/**
 * 
 */
package cl.accenture.curso_java.alumno.controladores;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import cl.accenture.curso_java.alumno.dao.AlumnoDAO;
import cl.accenture.curso_java.alumno.modelo.Alumno;
import cl.accenture.curso_java.alumno.modelo.SinConexionException;

/**
 * @author Martin Cuevas
 *
 */
@ManagedBean
@SessionScoped
public class AlumnoControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9062933914352677794L;
	private int id;
	private String nombre, apellidoPaterno, apellidoMaterno;
	private int edad;
	private List<Alumno> alumnos;

	/**
	 * 
	 */
	public AlumnoControlador() {
		this.id = 0;
		this.nombre = "";
		this.apellidoPaterno = "";
		this.apellidoMaterno = "";
		this.edad = 00;
		this.alumnos = new ArrayList<Alumno>();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param edad
	 */
	public AlumnoControlador(int id, String nombre, String apellidoPaterno, String apellidoMaterno, int edad,
			ArrayList<Alumno> alumnos) {
		this.id = id;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.edad = edad;
		this.alumnos = alumnos;
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
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno
	 *            the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
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
	 * @return the alumnos
	 */
	public List<Alumno> getAlumnos() {
		return alumnos;
	}

	/**
	 * @param alumnos
	 *            the alumnos to set
	 */
	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	public void guardar() {
		Alumno alumno = new Alumno(this.id, this.edad, this.nombre, this.apellidoPaterno, this.apellidoMaterno);
		AlumnoDAO dao = new AlumnoDAO();
		try {
			dao.insertarAlumno(alumno);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (SinConexionException e) {
			e.printStackTrace();
		}
	}

	public void limpiar() {
		this.id = 0;
		this.nombre = "";
		this.apellidoPaterno = "";
		this.apellidoMaterno = "";
		this.edad = 00;
	}
	
	public void obtenerAlumnos(){
		AlumnoDAO dao = new AlumnoDAO();
		try {
			this.alumnos = dao.obtenerAlumnos();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SinConexionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}