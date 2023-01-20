package ejercicio;

public class Gasto {

	private String concepto;
	private int idArticulo;
	private double cantGastada;
	
	
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public int getIdArticulo() {
		return idArticulo;
	}
	public void setIdArticulo(int idArticulo) {
		this.idArticulo = idArticulo;
	}
	public double getCantGastada() {
		return cantGastada;
	}
	public void setCantGastada(double cantGastada) {
		this.cantGastada = cantGastada;
	}
	@Override
	public String toString() {
		return "Gasto [concepto=" + concepto + ", idArticulo=" + idArticulo + ", cantGastada=" + cantGastada + "]";
	}
	public Gasto(String concepto, int idArticulo, double cantGastada) {
		super();
		this.concepto = concepto;
		this.idArticulo = idArticulo;
		this.cantGastada = cantGastada;
	}
	public Gasto() {
		super();
	}
	
	
	
	
	
}
