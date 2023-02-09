package ejercicio;

public class EntradaVip extends EntradaNormal{

	private String nombreVip;


	public EntradaVip(int zona, int nFila, int nAsiento, int precioBase, String nombreVip) {
		super(zona, nFila, nAsiento, precioBase);
		this.nombreVip = nombreVip;
	}

	public String getNombreVip() {
		return nombreVip;
	}

	public void setNombreVip(String nombreVip) {
		this.nombreVip = nombreVip;
	}

	@Override
	public String toString() {
		return "EntradaVip [nombreVip=" + nombreVip + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public double calcularPrecio(int zona, int descuentoGrupo, int impuesto) {
		
		return super.getPrecioBase()+getZona()+impuesto;
	}
	
}
