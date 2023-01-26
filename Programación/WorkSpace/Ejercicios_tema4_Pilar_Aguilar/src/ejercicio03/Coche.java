package ejercicio03;

public class Coche extends Vehiculo {

	
	private int nPuertas;

	/**
	 * @return the nPuertas
	 */
	public int getnPuertas() {
		return nPuertas;
	}

	/**
	 * @param nPuertas the nPuertas to set
	 */
	public void setnPuertas(int nPuertas) {
		this.nPuertas = nPuertas;
	}

	
	public Coche(String nombreV, int cilindrada, double potencia, String categoria, int nPuertas) {
		super(nombreV, cilindrada, potencia, categoria);
		this.nPuertas = nPuertas;
	}

	@Override
	public String toString() {
		return "Coche [nPuertas=" + nPuertas + ", toString()=" + super.toString() + "]";
	}


	/*
	 * cantidad+25%potencia
	 * 
	 * cantidad+getPotencia()*suplemento/100
	 * 
	 * */
	public double calcularImpuesto(double suplemento) {
		suplemento = getPotencia()*0.25;
		//super.calcularImpuesto(suplemento);
		return super.calcularImpuesto(suplemento);
	}
	
	
	
	
	
}
