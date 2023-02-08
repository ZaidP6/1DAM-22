package ejercicio04;

public class Electronica extends Producto{

	
	private double impuestoLuj;

	public Electronica(double precioUni, String nombrePro, int idPro, double impuestoLuj) {
		super(precioUni, nombrePro, idPro);
		this.impuestoLuj = impuestoLuj;
	}
	
	
	@Override
	public String toString() {
		return "Electronica [impuestoLuj=" + impuestoLuj + ", toString()=" + super.toString() + "]";
	}

	public double getImpuestoLuj() {
		return impuestoLuj;
	}

	public void setImpuestoLuj(double impuestoLuj) {
		this.impuestoLuj = impuestoLuj;
	}

	
	public double calcularPrecio() {
		
		return super.getPrecioUni()+ getPrecioUni()*impuestoLuj/100;
	}
	
}
