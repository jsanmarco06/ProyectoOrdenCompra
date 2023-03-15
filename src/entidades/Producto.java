package entidades;

public class Producto {
	private String fabricante;
	private String nombre;
	private Double precio;
	
	//constructor
	public Producto() {
		super();
	}
	
	public Producto(String fabricante, String nombre, Double precio) {
		this();
		this.fabricante = fabricante;
		this.nombre = nombre;
		this.precio = precio;
	}

	// Getter
	public String getNombre() {
		return nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public String getFabricante() {
		return fabricante;
	}
	
	//Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
}
