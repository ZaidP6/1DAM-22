package ejercicio_Examen_objetos;

public class Producto {

	private String nombre;
	private double precioBase;
	private String seccion;
	private boolean rebajado;
	private double pvp, ganancia;
	double porRebajas;
	
 int cien = 100;	public Producto(String nombre, double precioBase, String seccion, boolean rebajado, double pvp) {

		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
		this.pvp = pvp;
		

	}
	
	public Producto(String nombre, double precioBase, String seccion, boolean rebajado) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
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

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	public boolean isRebajado() {
		return rebajado;
	}

	public void setRebajado(boolean rebajado) {
		this.rebajado = rebajado;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion + ", rebajado="
				+ rebajado + ", pvp=" + pvp + "]";
	}
	
	public double calcPVP(double ganancia) {
		double cien = 100.00;
		pvp = precioBase + precioBase *ganancia / cien;
		return pvp;
	}
	
	public void mostrarDatos() {
		System.out.println("");
	}
	
	public double calcularLibras(double libras) {
		return pvp*libras;
	}
	
	
	
	public double calcularRebaja(double porRebajas) {
		if (rebajado) {
			
		}
		
	}
	
	public void imrimirGanga() {
		double tope = 3;
		
	}
	public doubler calcularCaro() {
	
		double mayor =0.0;
		for (int i = 0; i < array.length; i++) {
			i(fprecio[i]>maryor)
			mayor = precios[i];
		}
		return mayor;
	}
	
	
}
