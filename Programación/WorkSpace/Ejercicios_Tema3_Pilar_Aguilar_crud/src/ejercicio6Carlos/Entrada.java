package ejercicio6Carlos;

public class Entrada {
	
	//Atributos
	
	private String numIden;
	private double precioEntrada;
	private boolean isLibre;
	private int fila;
	private int butaca;
	
	
	//Constructor
	
	public Entrada(String index, double precioEntrada, boolean isLibre, int fila, int butaca) {
	
		this.numIden = numIden;
		this.precioEntrada = precioEntrada;
		this.isLibre = isLibre;
		this.fila = fila;
		this.butaca = butaca;
	}
	
	
	//Getters and Setters

	public String getNumIden() {
		return numIden;
	}

	public void setNumIden(String numIden) {
		this.numIden = numIden;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public boolean isLibre() {
		return isLibre;
	}

	public void setLibre(boolean isLibre) {
		this.isLibre = isLibre;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getButaca() {
		return butaca;
	}

	public void setButaca(int butaca) {
		this.butaca = butaca;
	}

//To String
	public String toString() {
		return "Entrada [numIden=" + numIden + ", precioEntrada=" + precioEntrada + ", isLibre=" + isLibre + ", fila="
				+ fila + ", butaca=" + butaca + "]";
	}
	
	
	
	
	

}
