package ejercicio_examen01;

public class Producto {

	private String nombre;
	private double precioBase;
	private String seccion;
	private double pvp;
	boolean rebajado;
	
	//El precio de venta al público se calcula sumando un tanto por ciento (lo que gana el vendedor) al precio base. 
	
	public Producto(String nombre, double precioBase, String seccion, boolean rebajado) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
	}

	public Producto (){
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public boolean isRebajado() {
		return rebajado;
	}

	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}	
	
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion + ", pvp=" + pvp
				+ ", rebajado=" + rebajado + "]";
	}
	
	//metodos
	
	

	public double calcularPVP(double ganancia) {
		int cien = 100;
		pvp = precioBase + precioBase*ganancia/cien;
		return pvp;
	}
	
	public double calcularPrecioReabajado( double porcentajeRebaja) {
		int cien = 100;
		if(rebajado) {
			pvp = pvp - pvp*porcentajeRebaja/cien;
		}
		return pvp;
	}
	
	public double cambiarMoneda(double precioLibra) {
		double pvpLibra = 0.0;
		int uno = 1;
		
		pvpLibra = pvp * precioLibra / uno;
		
		return pvpLibra;
	}
	
	public void imprimirGanga() {
		double tope = 3.0;
		if(pvp < tope) {
			System.out.println("Producto MEGA GANGA");
		}
	}
	
	
	
}
