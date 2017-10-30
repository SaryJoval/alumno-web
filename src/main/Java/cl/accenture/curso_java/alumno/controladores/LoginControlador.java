/**
 * 
 */
package cl.accenture.curso_java.alumno.controladores;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Martin Cuevas
 *
 */
@ManagedBean
@SessionScoped
public class LoginControlador implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6244224177314244105L;
	private String userName, password, mensaje;
	/**
	 * 
	 */
	public LoginControlador() {
	}
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	/**
	 * @return the mensaje
	 */
	public String getMensaje() {
		return mensaje;
	}
	/**
	 * @param mensaje the mensaje to set
	 */
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String ingresar(){
		if (this.userName.equals("martinmallen") && this.password.equals("123")) {
			return "ListaAlumnos2?faces-redirect=true";
		}
		this.mensaje = "Usuario y/o Password Incorrectos";
		return "";
	}

}
