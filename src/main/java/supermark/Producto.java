package supermark.code;

public class Producto {
	private String nombre; 
	private String tipo; 
	private Integer stock; 
	private Integer id; 
	private String marca; 
	private Double precio;
	
	public Producto () {
		
	}
	
	public Producto (String nombre, String tipo, Integer stock, Integer id, String marca, Double precio) {
		this.nombre = nombre; 
		this.tipo = tipo; 
		this.stock = stock; 
		this.id = id; 
		this.marca = marca; 
		this.precio = precio; 
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	} 
}
 
