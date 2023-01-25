package ejercicio01;

public class Sobremesa extends Ordenador {

	private double precioMontaje;

	/**
	 * @return the precioMontaje
	 */
	public double getPrecioMontaje() {
		return precioMontaje;
	}

	/**
	 * @param precioMontaje the precioMontaje to set
	 */
	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}


	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + ", toString()=" + super.toString() + "]";
	}

	public Sobremesa(int capHardDisk, double hzProcesador, double precioBase, String marca, double precioMontaje) {
		super(capHardDisk, hzProcesador, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}

	public double calcularPVP(double porGanancia) {
		
		return precioMontaje + super.calcularPVP(porGanancia);
	}
	
}
