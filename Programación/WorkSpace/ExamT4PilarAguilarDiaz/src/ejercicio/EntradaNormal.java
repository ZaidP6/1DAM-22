package ejercicio;

public class EntradaNormal implements IDesglosable{

	private int zona;
	private int nFila;
	private int nAsiento;
	private int precioBase;
	


	public EntradaNormal(int zona, int nFila, int nAsiento, int precioBase) {
		super();
		this.zona = zona;
		this.nFila = nFila;
		this.nAsiento = nAsiento;
		this.precioBase = precioBase;
	}

	@Override
	public String toString() {
		return "EntradaNormal [zona=" + zona + ", nFila=" + nFila + ", nAsiento=" + nAsiento + ", precioBase="
				+ precioBase + ", toString()=" + super.toString() + "]";
	}

	public int getZona() {
		return zona;
	}

	public void setZona(int zona) {
		this.zona = zona;
	}

	public int getnFila() {
		return nFila;
	}

	public void setnFila(int nFila) {
		this.nFila = nFila;
	}

	public int getnAsiento() {
		return nAsiento;
	}

	public void setnAsiento(int nAsiento) {
		this.nAsiento = nAsiento;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public double calcularPrecio(int zona, int descuentoGrupo, int impuesto) {
		double precioE = 0;
		if(zona == 1)
			precioE = precioBase;
		
		if(zona == 2)
			precioE = precioBase +30;
				
	return precioE;
	}

	
}
