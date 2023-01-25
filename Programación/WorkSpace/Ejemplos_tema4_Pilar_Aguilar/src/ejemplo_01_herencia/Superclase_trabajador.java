package ejemplo_01_herencia;

public class Superclase_trabajador {

	private String nombre;
	private String Puesto;

	

	public Superclase_trabajador(String nombre, String puesto) {
		super();
		this.nombre = nombre;
		Puesto = puesto;
	}



	@Override
	public String toString() {
		return "Superclase_trabajador [nombre=" + nombre + ", Puesto=" + Puesto + ", toString()=" + super.toString()
				+ "]";
	}



	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}



	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return Puesto;
	}



	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		Puesto = puesto;
	}



	public double calcularPaga(int numHijos) {
		double cant = 100.0;
		return cant*numHijos;
	}
	
	
	
}
