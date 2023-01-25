package ejercicio01;

public class Ordenador {

	
	private int capHardDisk;
	private double hzProcesador;
	private double precioBase;
	private String marca;
	/**
	 * @return the capHardDisk
	 */
	public int getCapHardDisk() {
		return capHardDisk;
	}
	/**
	 * @param capHardDisk the capHardDisk to set
	 */
	public void setCapHardDisk(int capHardDisk) {
		this.capHardDisk = capHardDisk;
	}
	/**
	 * @return the hzProcesador
	 */
	public double getHzProcesador() {
		return hzProcesador;
	}
	/**
	 * @param hzProcesador the hzProcesador to set
	 */
	public void setHzProcesador(double hzProcesador) {
		this.hzProcesador = hzProcesador;
	}
	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}
	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Ordenador [capHardDisk=" + capHardDisk + ", hzProcesador=" + hzProcesador + ", precioBase=" + precioBase
				+ ", marca=" + marca + "]";
	}
	public Ordenador(int capHardDisk, double hzProcesador, double precioBase, String marca) {
		super();
		this.capHardDisk = capHardDisk;
		this.hzProcesador = hzProcesador;
		this.precioBase = precioBase;
		this.marca = marca;
	}
	
	
	public double calcularPVP(double porGanancia) {
		
		return precioBase + precioBase*porGanancia/100;
	}
	
}
