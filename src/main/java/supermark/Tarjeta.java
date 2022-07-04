package supermark.code;

//import java.sql.Date; 

public class Tarjeta {
	private Integer nroTarjeta; 
	private Integer fechaVenc; //consultar
	private String nombreDeTarjeta;
	private Integer codSeguridad; 
	
	
	
	public Integer getNroTarjeta() {
		return nroTarjeta;
	}
	public void setNroTarjeta(Integer nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	public Integer getFechaVenc() {
		return fechaVenc;
	}
	public void setFechaVenc(Integer fechaVenc) {
		this.fechaVenc = fechaVenc;
	}
	public String getNombreDeTarjeta() {
		return nombreDeTarjeta;
	}
	public void setNombreDeTarjeta(String nombreDeTarjeta) {
		this.nombreDeTarjeta = nombreDeTarjeta;
	}
	public Integer getCodSeguridad() {
		return codSeguridad;
	}
	public void setCodSeguridad(Integer codSeguridad) {
		this.codSeguridad = codSeguridad;
	} 

	
	
	
}
