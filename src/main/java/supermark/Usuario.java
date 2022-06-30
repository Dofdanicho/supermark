package supermark;

public class Usuario {
	private String nombre; 
	private String apellido; 
	private long dni; 
	private Domicilio domicilio;
	private String nombreUsuario; 
	private long email;
	private String contrasenia; 
	private String tipoUsuario; 
	
	
	public Usuario(String nom,String ape) {
		nombre=nom;
		apellido=  ape;
	}
	
	public double getGastoAcumulado() {
		return gastoAcumulado;
	}

	public void setGastoAcumulado(double gastoAcumulado) {
		this.gastoAcumulado = gastoAcumulado;
	}
	private double gastoAcumulado; 
	
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

	public Usuario () {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
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
	
	

}
