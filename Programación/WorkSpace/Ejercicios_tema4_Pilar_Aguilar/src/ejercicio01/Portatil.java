package ejercicio01;

public class Portatil extends Ordenador {

	private double precioSeguroScreen;

	/**
	 * @return the precioSeguroScreen
	 */
	public double getPrecioSeguroScreen() {
		return precioSeguroScreen;
	}

	/**
	 * @param precioSeguroScreen the precioSeguroScreen to set
	 */
	public void setPrecioSeguroScreen(double precioSeguroScreen) {
		this.precioSeguroScreen = precioSeguroScreen;
	}

	@Override
	public String toString() {
		return "Portatil [precioSeguroScreen=" + precioSeguroScreen + ", toString()=" + super.toString() + "]";
	}

	public Portatil(int capHardDisk, double hzProcesador, double precioBase, String marca, double precioSeguroScreen) {
		super(capHardDisk, hzProcesador, precioBase, marca);
		this.precioSeguroScreen = precioSeguroScreen;
	}

	public double calcularPVP(double porGanancia) {
		
		return precioSeguroScreen + super.calcularPVP(porGanancia);
	}
	
	
}
