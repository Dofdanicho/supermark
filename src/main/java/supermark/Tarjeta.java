package supermark;

public class Tarjeta {
	private Integer nroTarjeta; 
	private Integer fechaVenc; //consultar
	private String nombreDeTarjeta;
	
	
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

	//import java.sql.Date; 
	
}
