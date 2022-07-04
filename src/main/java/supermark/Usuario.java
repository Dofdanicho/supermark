package supermark.code;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
	private String nombre; 
	private String apellido1;  
	private String apellido2;
	private long dni;
	private Date fechaNac; 
	private String nombreUsuario; 
	private long email;
	private String contrasenia; 
	private String tipoUsuario;
	private Domicilio domicilio; 

	public Usuario () {
		
	}
	
	public Usuario(Usuario usuario) {
		
	}
	
	
	
	public Usuario (String nombre, String apellido1, String apellido2, long dni, String calle, Integer altura) { 
		this.nombre = nombre; 
		this.apellido1 = apellido1; 
		this.apellido2 = apellido2; 
		this.dni = dni;
	}
	

	public Usuario (String contrasenia, String nombreUsuario, long email) {
		this.nombreUsuario = nombreUsuario;
		this.contrasenia = contrasenia; 
		this.email = email; 
	}
	
	public void DomicilioUsuario (String calle, Integer altura) {
		
	}
	
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public long getEmail() {
		return email;
	}
	public void setEmail(long email) {
		this.email = email;
	}
	
	public void setDireccion(String string) {
		
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	 
}
