package entidades;

public class Cliente {
	private String nombre;
	private String apellido;
	
	//Constructor
	public Cliente(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Getter
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	//Setter
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
}
