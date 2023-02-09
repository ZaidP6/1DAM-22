package ejercicio;

public class EntradaGrupos extends EntradaNormal{

	private int nPersonas;

	@Override
	public String toString() {
		return "EntradaGrupos [nPersonas=" + nPersonas + ", toString()=" + super.toString() + "]";
	}

	public int getnPersonas() {
		return nPersonas;
	}

	public void setnPersonas(int nPersonas) {
		this.nPersonas = nPersonas;
	}

	public EntradaGrupos(int zona, int nFila, int nAsiento, int precioBase, int nPersonas) {
		super(zona, nFila, nAsiento, precioBase);
		this.nPersonas = nPersonas;
	}

	
	@Override
	public double calcularPrecio(int zona, int descuentoGrupo, int impuesto) {	
		return super.getPrecioBase() + (super.getPrecioBase()*descuentoGrupo/100) *nPersonas;
	}

	
}
