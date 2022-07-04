package supermark.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Domicilio {
	private String calle; 
	private Integer altura; 
	private String barrio; 
	private String localidad; 
	private String tipoCasa;
	
	
	public Domicilio (Domicilio domicilio) {
		this.calle = domicilio.calle; 
		this.altura = domicilio.altura; 
		this.barrio = domicilio.barrio; 
		this.localidad = domicilio.localidad;
		this.tipoCasa = domicilio.tipoCasa; 
			
	}
	
	public Domicilio (String localidad, String barrio, String calle, Integer altura, String tipoCasa) {
		this.localidad = localidad; 
		this.barrio = barrio;
		this.calle = calle; 
		this.altura = altura; 
		this.tipoCasa = tipoCasa; 
	}
	
	public void Domicilio (String calle, Integer altura) {
		get(calle, altura); 
	}
	
	private void get(String calle2, Integer altura2) {
	}

	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getTipoCasa() {
		return tipoCasa;
	}
	public void setTipoCasa(String tipoCasa) {
		this.tipoCasa = tipoCasa;
	} 
	
}
