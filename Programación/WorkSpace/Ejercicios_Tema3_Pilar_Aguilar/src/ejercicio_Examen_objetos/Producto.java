package ejercicio_examen_objetos;

public class Producto {
	
	private String nombre;
	private double precioBase;
	private String seccion;
	private boolean rebajado;
	private double pvp;
	
	public Producto(String nombre, double precioBase, String seccion, boolean rebajado, double pvp) {
		
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
		this.pvp = pvp;
	}
	
	

	public Producto(String nombre, double precioBase, String seccion, boolean rebajado) {
		super();
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.seccion = seccion;
		this.rebajado = rebajado;
	}
	public Producto() {
		
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

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioBase=" + precioBase + ", seccion=" + seccion + ", rebajado="
				+ rebajado + ", pvp=" + pvp + "]";
	}
	
	//metodos
	
	public double calcularPvp(double ganancia) {
		double cien=100.0;
		pvp=precioBase+precioBase*ganancia/cien;
		return pvp;
	}
	
	public double calcularPrecioRebajado(double porcRebajas) {
		double cien=100.0;
		if(rebajado) {
			pvp=pvp-pvp*porcRebajas/cien;	
		}
		return pvp;
	}
	//falta el metodo imprimir los atributos
	public double calcularLibras(double libras) {
		
		return pvp*libras;
		
	}
	
	public void imprimirGanga(double tope) {
		
		if(pvp<tope) {
			System.out.println("Producto MegaGanga");
		}else {
			System.out.println("Producto no ganga");
		}
	}
	
	//añadimos un Array al ejercicio
	//pasamos un array con 3 precios y nos devuelve el precio mas caro 
	
	public double calcularCaro(double[] precio) {
		double precioCaro=0.0;
		for (int i = 0; i < precio.length; i++) {
			if(precio[i]>precioCaro)
				precioCaro=precio[i];
			}
		
		return precioCaro;
		
	}
	
	public double [] calcularPreciosLibras (double[] precio, double libras) {
	
		for (int i = 0; i < precio.length; i++) {
			precio[i]=precio[i]+libras;
		}
		return precio;
		
	}
	
	public void imprimirPrecioLibra(double[] precio) {
		
		for (int i = 0; i < precio.length; i++) {
			System.out.printf("\t%.2f",precio[i]);
		}
		
	}
	
	
	

}

