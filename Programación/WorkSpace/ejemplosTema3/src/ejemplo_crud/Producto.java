package ejemplo_crud;

public class Producto {

	private String codigo;
	private String nombre;
	private float precioUnitario;
	private boolean activo;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(float precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public boolean isActivo() {
		return activo;
	}
	
	public void setActivo(boolean activo) {

		this.activo = activo;
	}
	
	public Producto(String codigo, String nombre, float precioUnitario, boolean activo) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.precioUnitario = precioUnitario;
		this.activo = activo;
	}
	
	
	
	
	
}
