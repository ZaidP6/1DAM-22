package ejemplo_relaciones;

public class Cliente {

	private String nombre;
	private int edad;
	
	
	
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + "]";
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
