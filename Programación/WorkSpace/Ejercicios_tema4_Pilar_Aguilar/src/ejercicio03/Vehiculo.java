package ejercicio03;

public class Vehiculo {
	
	
	private String nombreV;
	private int cilindrada;
	private double potencia;
	private String categoria;
	private double cantFija;
	
	
	/**
	 * @return the nombreV
	 */
	public String getNombreV() {
		return nombreV;
	}
	/**
	 * @param nombreV the nombreV to set
	 */
	public void setNombreV(String nombreV) {
		this.nombreV = nombreV;
	}
	/**
	 * @return the cilindrada
	 */
	public int getCilindrada() {
		return cilindrada;
	}
	/**
	 * @param cilindrada the cilindrada to set
	 */
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	/**
	 * @return the potencia
	 */
	public double getPotencia() {
		return potencia;
	}
	/**
	 * @param potencia the potencia to set
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}

	public double getCantFija() {
		return cantFija;
	}
	/**
	 * @param cantFija the cantFija to set
	 */
	public void setCantFija(double cantFija) {
		this.cantFija = cantFija;
	}
	public Vehiculo(String nombreV, int cilindrada, double potencia, String categoria) {
		super();
		this.nombreV = nombreV;
		this.cilindrada = cilindrada;
		this.potencia = potencia;
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Vehiculo [nombreV=" + nombreV + ", cilindrada=" + cilindrada + ", potencia=" + potencia + ", categoria="
				+ categoria + ", toString()=" + super.toString() + "]";
	}

	
	public double calcularImpuesto(double suplemento) {
		
		
		return cantFija;
		
	}

	
	
	
	
}
