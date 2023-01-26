package ejercicio03;

public class Motocicleta extends Vehiculo{

	private int clindros;

	/**
	 * @return the clindros
	 */
	public int getClindros() {
		return clindros;
	}

	/**
	 * @param clindros the clindros to set
	 */
	public void setClindros(int clindros) {
		this.clindros = clindros;
	}

	@Override
	public String toString() {
		return "Motocicleta [clindros=" + clindros + ", toString()=" + super.toString() + "]";
	}

	public Motocicleta(String nombreV, int cilindrada, double potencia, String categoria, int clindros) {
		super(nombreV, cilindrada, potencia, categoria);
		this.clindros = clindros;
	}
	
	
	
	
	public double calcularImpuesto(double suplemento) {
		suplemento = getCilindrada()*0.6;
		//super.calcularImpuesto(suplemento);
		return super.calcularImpuesto(suplemento);
	}
	

	


	
	
}
