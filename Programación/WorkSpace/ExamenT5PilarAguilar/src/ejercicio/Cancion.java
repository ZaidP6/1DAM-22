package ejercicio;

import java.util.Objects;

public class Cancion extends MiMusica{

	private int id;
	private String titulo;
	private String interprete;
	private int repeticiones;
	private boolean pago;
	private double duracionMin;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getInterprete() {
		return interprete;
	}
	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}
	public int getRepeticiones() {
		return repeticiones;
	}
	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}
	public boolean isPago() {
		return pago;
	}
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	public double getDuracionMin() {
		return duracionMin;
	}
	public void setDuracionMin(double duracionMin) {
		this.duracionMin = duracionMin;
	}
	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", interprete=" + interprete + ", repeticiones="
				+ repeticiones + ", pago=" + pago + ", duracionMin=" + duracionMin + ", toString()=" + super.toString()
				+ "]";
	}
	public Cancion(int id, String titulo, String interprete, int repeticiones, boolean pago, double duracionMin) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.interprete = interprete;
		this.repeticiones = repeticiones;
		this.pago = pago;
		this.duracionMin = duracionMin;
	}
	@Override
	public int hashCode() {
		return Objects.hash(duracionMin, id, interprete, pago, repeticiones, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cancion other = (Cancion) obj;
		return Double.doubleToLongBits(duracionMin) == Double.doubleToLongBits(other.duracionMin) && id == other.id
				&& Objects.equals(interprete, other.interprete) && pago == other.pago
				&& repeticiones == other.repeticiones && Objects.equals(titulo, other.titulo);
	}
	public static boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
		
	}
	
	
	
	
}
