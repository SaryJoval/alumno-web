/**
 * 
 */
package cl.accenture.curso_java.alumno.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.accenture.curso_java.alumno.modelo.Alumno;
import cl.accenture.curso_java.alumno.modelo.Conexion;
import cl.accenture.curso_java.alumno.modelo.SinConexionException;

/**
 * @author Martin Cuevas
 *
 */
public class AlumnoDAO {
	private Conexion conexion;

	/**
	 * 
	 */
	public AlumnoDAO() {
		this.conexion = new Conexion();
	}

	/**
	 * @param conexion
	 */
	public AlumnoDAO(Conexion conexion) {
		this.conexion = conexion;
	}

	/**
	 * @return the conexion
	 */
	public Conexion getConexion() {
		return conexion;
	}

	/**
	 * @param conexion the conexion to set
	 */
	public void setConexion(Conexion conexion) {
		this.conexion = conexion;
	}
	
	public void insertarAlumno(Alumno alumno) throws SQLException, SinConexionException {
		Statement statement = conexion.obtenerConexion().createStatement();
		statement.executeUpdate("INSERT INTO alumnos(id, nombre, apellidoPaterno, apellidoMaterno, edad)"
				+ " VALUES ("+alumno.getId()+", '"+alumno.getNombre()+"', '"+alumno.getApellido()+"', '"+alumno.getApellidoMaterno()+"', "+alumno.getEdad()+");");
	}
	
	public List<Alumno> obtenerAlumnos() throws SQLException, SinConexionException{
		List<Alumno> alumnos = new ArrayList<Alumno>();
		Statement statement = conexion.obtenerConexion().createStatement();
		ResultSet rs =statement.executeQuery("SELECT * FROM alumnos");
		while (rs.next()) {
			alumnos.add(new Alumno(rs.getInt("id"), rs.getInt("edad"), rs.getString("nombre"), rs.getString("apellidoPaterno"), rs.getString("apellidoMaterno")));
		}
		return alumnos;
	}
}
