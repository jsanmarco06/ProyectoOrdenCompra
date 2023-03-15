package main;

import entidades.Cliente;
import entidades.OrdenCompra;
import entidades.Producto;

public class EjemploOrdenes {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Juan Manuel", "San Marco");
		
		//Orden 1
		OrdenCompra orden1 = new OrdenCompra("Orden 1");
		Producto prod1 = new Producto("Verduleria", "Manzana", 300.00);
		Producto prod2 = new Producto("Verduleria", "Banana", 450.00);
		Producto prod3 = new Producto("Serenisima", "Leche", 390.00);
		Producto prod4 = new Producto("Supermercado", "Huevos", 160.00);
		
		//Orden 2
		OrdenCompra orden2 = new OrdenCompra("Orden 2");
		Producto prod5 = new Producto("Ayudin", "Jabon Liquido", 600.00);
		Producto prod6 = new Producto("Rexona", "Desodorante", 250.00);
		Producto prod7 = new Producto("Dove", "Shampoo", 390.00);
		Producto prod8 = new Producto("Sedal", "Acondicionador", 260.00);
		
		//Orden 3
		OrdenCompra orden3 = new OrdenCompra("Orden 3");
		Producto prod9 = new Producto("Oreo", "Galletita", 170.00);
		Producto prod10 = new Producto("Coca-Cola", "Bebida", 270.00);
		Producto prod11 = new Producto("Vienisima", "Salchichas", 190.00);
		Producto prod12 = new Producto("Marolio", "Fideos", 320.00);
		
		//Agregando los productos a las ordenes
		orden1.addProducto(prod1);
		orden1.addProducto(prod2);
		orden1.addProducto(prod3);
		orden1.addProducto(prod4);
		orden1.setCliente(cliente1);
		
		orden2.addProducto(prod5);
		orden2.addProducto(prod6);
		orden2.addProducto(prod7);
		orden2.addProducto(prod8);
		orden2.setCliente(cliente1);
		
		orden3.addProducto(prod9);
		orden3.addProducto(prod10);
		orden3.addProducto(prod11);
		orden3.addProducto(prod12);
		orden3.setCliente(cliente1);
		
		imprimir(orden1);
		imprimir(orden2);
		imprimir(orden3);
	
	}
	public static void imprimir(OrdenCompra orden) {
		Producto[] productosAux = orden.getProductos();
		System.out.println("============================"+"\n"+ 
							orden.getDescripcion() +  "\n"); 
		for(Producto p : productosAux) {
			System.out.println(
							"El fabricante es: " + p.getFabricante() + "\n" + 
							"El nombre es: " + p.getNombre() + "\n" + 
							"El precio es: " + p.getPrecio() + "\n");
		}
		orden.sumarPrecios();
	}
}
