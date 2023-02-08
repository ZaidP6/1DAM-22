package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double mantenimientoFijo;
	private int puntosCajero;
	
	
	public CuentaCorriente(String nombreCliente, int numCuenta, double saldo, double mantenimientoFijo,
			int puntosCajero) {
		super(nombreCliente, numCuenta, saldo);
		this.mantenimientoFijo = mantenimientoFijo;
		this.puntosCajero = puntosCajero;
	}


	public double getMantenimientoFijo() {
		return mantenimientoFijo;
	}

	public void setMantenimientoFijo(double mantenimientoFijo) {
		this.mantenimientoFijo = mantenimientoFijo;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [mantenimientoFijo=" + mantenimientoFijo + ", puntosCajero=" + puntosCajero
				+ ", toString()=" + super.toString() + "]";
	}

	public int getPuntosCajero() {
		return puntosCajero;
	}

	public void setPuntosCajero(int puntosCajero) {
		this.puntosCajero = puntosCajero;
	}


	@Override
	public void ingresarDinero(double cantIngresada) {
		super.setSaldo(super.getSaldo()+cantIngresada);
		puntosCajero++;
		
	}


	@Override
	public void retirarDinero(double cantRetirada) {
		super.setSaldo(super.getSaldo()-cantRetirada);
		puntosCajero++;
	}


	

	
}
