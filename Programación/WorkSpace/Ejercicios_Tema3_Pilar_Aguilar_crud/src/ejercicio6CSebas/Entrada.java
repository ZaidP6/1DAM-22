package ejercicio6;

public class Entrada {

	private String codigo;
	private double precio;
	private boolean libreOcup;
	private int numFila;
	private int numBut;
	
	public Entrada(String codigo, double precio, boolean libreOcup, int numFila, int numBut) {
		
		this.codigo = codigo;
		this.precio = precio;
		this.libreOcup = libreOcup;
		this.numFila = numFila;
		this.numBut = numBut;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isLibreOcup() {
		return libreOcup;
	}

	public void setLibreOcup(boolean libreOcup) {
		this.libreOcup = libreOcup;
	}

	public int getNumFila() {
		return numFila;
	}

	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}

	public int getNumBut() {
		return numBut;
	}

	public void setNumBut(int numBut) {
		this.numBut = numBut;
	}

	@Override
	public String toString() {
		return "Entrada [codigo=" + codigo + ", precio=" + precio + ", libreOcup=" + libreOcup + ", numFila=" + numFila
				+ ", numBut=" + numBut + "]";
	}
	
	
	
}
