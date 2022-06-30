package supermark;

public class Factura {
	private Usuario nombre; 
	private Usuario apellido;
	private MedioDePago tipoPago; 
	private CarritoCompras cantidadProductos; 
	private Integer id; 
	private float total; 
	private char tipo; 
	//private Date fecha;
	private CarritoCompras productos; 
	//private static final int maximo;
	
	public Factura () {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	/*public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}*/

	/*public static int getMaximo() {
		return maximo;
	}*/
	
	
}
