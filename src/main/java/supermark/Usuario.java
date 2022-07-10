package supermark_code;

import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;

import supermark.Credenciales;

public class Usuario {
	private String nombre;
	private String apellido1;  
	private String apellido2;
	private static String dni;
	private Date fechaNac; 
	private String nombreUsuario; 
	private String email;
	private String contrasenia; 
	private String tipoUsuario;
	private Domicilio id_domicilio; 
	
	//Constructores
	public Usuario () {
			
		}
	
	//Constructor de copia
	public Usuario(Usuario Usuarios) {
		this.nombre = Usuarios.nombre;
		this.apellido1 = Usuarios.apellido1;
	}
	
	//Constrcutor Normal
	public Usuario(String nombre,String apellido){
		this.nombre = nombre;
		this.apellido1 = apellido;
	}

	
	
	public Usuario (String nombre, String apellido1, String apellido2, String dni, Date fechaNAc, String nombreUsuario, String email, String contrasenia, String tipoUsuario, Domicilio id_domicilio) { 
		super();
		this.nombre = nombre; 
		this.apellido1 = apellido1; 
		this.apellido2 = apellido2; 
		Usuario.dni = dni;
		this.fechaNac = fechaNac; 
		this.nombreUsuario = nombreUsuario;
		this.email = email; 
		this.contrasenia = contrasenia; 
		this.tipoUsuario = tipoUsuario; 
		this.id_domicilio = id_domicilio;
		
	}
	

	public Usuario (String contrasenia, String nombreUsuario, String email) {
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		Usuario.dni = dni;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setDireccion(String string) {
		
	}

	public Domicilio getDomicilio() {
		return id_domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.id_domicilio = domicilio;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	public static void nuevoUsuario() {
		//  Registrar JDBC Driver
		// JDBC nombre del driver y URL de la BDD
	}
	
}
