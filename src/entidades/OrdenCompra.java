package entidades;

import java.util.Date;
import entidades.Producto;

public class OrdenCompra {
	private Integer id;
	private String descripcion;
	private Date fecha = new Date();
	private Cliente cliente;
	private Producto[] productos = new Producto[4];
	
	private Double suma = 0.0;
	private int numeroProducto = 0;
	private static int ultimoId;
	
	//constructions
	public OrdenCompra() {
		super();
		this.id = ++ultimoId;
	}
	public OrdenCompra(String descripcion) {
		this();
		this.descripcion = descripcion;
	}
	
	//getters
	public Integer getId() {
		return id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public Producto[] getProductos() {
		return productos;
	}
	
	//setters
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	//method
	public void addProducto(Producto producto) {
		if(numeroProducto < 4){
			productos[numeroProducto] = producto;
			numeroProducto++;
		}
		
	}
	
	public void sumarPrecios() {
		for(Producto producto : productos) {
			suma += producto.getPrecio();
		}
		System.out.println("La suma de los precios es: " + suma);
	}
	
	public void imprimir() {
		String stringAImprimir = " ";
		System.out.println("============================"+"\n");
		for(int i = 0; i < 4; i++) {
			stringAImprimir = "El fabricante es: " + this.productos[i].getFabricante() + "\n" + 
					"El nombre es: " + this.productos[i].getNombre() + "\n" + 
					"El precio es: " + this.productos[i].getPrecio() + "\n";
			 System.out.println(stringAImprimir);
		}
		this.sumarPrecios();
		System.out.println("============================"+"\n");
		
	}
	
}
