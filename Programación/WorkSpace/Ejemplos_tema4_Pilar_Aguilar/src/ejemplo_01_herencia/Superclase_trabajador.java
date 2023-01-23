package ejemplo_01_herencia;

public class Superclase_trabajador {

	private String nombre;
	private String Puesto;
	private String direcccion;
	private int telefono;
	private int nSS;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return Puesto;
	}
	public void setPuesto(String puesto) {
		Puesto = puesto;
	}
	public String getDirecccion() {
		return direcccion;
	}
	public void setDirecccion(String direcccion) {
		this.direcccion = direcccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getnSS() {
		return nSS;
	}
	public void setnSS(int nSS) {
		this.nSS = nSS;
	}
	public Superclase_trabajador(String nombre, String puesto, String direcccion, int telefono, int nSS) {
		super();
		this.nombre = nombre;
		Puesto = puesto;
		this.direcccion = direcccion;
		this.telefono = telefono;
		this.nSS = nSS;
	}
	@Override
	public String toString() {
		return "Superclase_trabajador [nombre=" + nombre + ", Puesto=" + Puesto + ", direcccion=" + direcccion
				+ ", telefono=" + telefono + ", nSS=" + nSS + "]";
	}
	
	
	
	
	
}
