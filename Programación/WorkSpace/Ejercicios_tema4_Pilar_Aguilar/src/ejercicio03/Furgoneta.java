package ejercicio03;

public class Furgoneta extends Vehiculo{

	
	private double pesoMer;

	/**
	 * @return the pesoMer
	 */
	public double getPesoMer() {
		return pesoMer;
	}

	/**
	 * @param pesoMer the pesoMer to set
	 */
	public void setPesoMer(double pesoMer) {
		this.pesoMer = pesoMer;
	}

	
	public Furgoneta(String nombreV, int cilindrada, double potencia, String categoria, 
						double pesoMer) {
		super(nombreV, cilindrada, potencia, categoria);
		this.pesoMer = pesoMer;
	}

	@Override
	public String toString() {
		return "Furgoneta [pesoMer=" + pesoMer + ", toString()=" + super.toString() + "]";
	}


	public double calcularImpuesto(double suplemento) {
		suplemento = 76.8;
		return super.calcularImpuesto(suplemento);
		
	}
	
	
}
