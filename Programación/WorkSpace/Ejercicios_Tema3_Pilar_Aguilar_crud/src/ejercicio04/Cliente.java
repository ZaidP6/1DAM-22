package ejercicio04;

public class Cliente {

	private String dni;
	private String nombre;
	private String apellido;
	private boolean activo;
	private double peso;
	private double altura;
	
	
	
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}
	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", activo=" + activo
				+ ", peso=" + peso + ", altura=" + altura + "]";
	}
	public Cliente(String dni, String nombre, String apellido, boolean activo, double peso, double altura) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.activo = activo;
		this.peso = peso;
		this.altura = altura;
	}
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double calcularIMC() {
		return peso/Math.pow(altura, 2);
	}
	
	
}
