package ejercicio04;

public class Producto {

	private double precioUni;
	private String nombrePro;
	private int idPro;
	
	public double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
	public String getNombrePro() {
		return nombrePro;
	}
	public void setNombrePro(String nombrePro) {
		this.nombrePro = nombrePro;
	}
	public int getIdPro() {
		return idPro;
	}
	public void setIdPro(int idPro) {
		this.idPro = idPro;
	}
	@Override
	public String toString() {
		return "Producto [precioUni=" + precioUni + ", nombrePro=" + nombrePro + ", idPro=" + idPro + ", toString()="
				+ super.toString() + "]";
	}
	public Producto(double precioUni, String nombrePro, int idPro) {
		super();
		this.precioUni = precioUni;
		this.nombrePro = nombrePro;
		this.idPro = idPro;
	}
	
	
	public double calcularPrecio() {
		return precioUni;
	}
	
	
}
