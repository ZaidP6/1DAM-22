package ejercicio2;

public class Habitacion {

	private String tipo;
	private double precio;
	private String sExtras;
	private String cliente;
	private int numDias;
	private boolean ocupada;
	private boolean habLimpia;
	
	public Habitacion(String tipo, double precio, String sExtras, String cliente, int numDias, boolean ocupada,boolean habLimpia) {
		this.tipo = tipo;
		this.precio = precio;
		this.sExtras = sExtras;
		this.cliente = cliente;
		this.numDias = numDias;
		this.ocupada = ocupada;
		this.habLimpia = habLimpia;
	}

	public Habitacion() {
		super();
	}

	@Override
	public String toString() {
		return "Habitacion [tipo=" + tipo + ", precio=" + precio + ", sExtras=" + sExtras + ", cliente=" + cliente
				+ ", numDias=" + numDias + ", ocupada=" + ocupada + ", habLimpia=" + habLimpia + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getsExtras() {
		return sExtras;
	}

	public void setsExtras(String sExtras) {
		this.sExtras = sExtras;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumDias() {
		return numDias;
	}

	public void setNumDias(int numDias) {
		this.numDias = numDias;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}

	public boolean isHabLimpia() {
		return habLimpia;
	}

	public void setHabLimpia(boolean habLimpia) {
		this.habLimpia = habLimpia;
	}
	
	
	
	
	
}
