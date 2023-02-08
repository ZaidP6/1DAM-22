package ejercicio06;

public class CuentaEmpresa extends Cuenta{

	private double penalizacion;

	public CuentaEmpresa(String nombreCliente, int numCuenta, double saldo, double penalizacion) {
		super(nombreCliente, numCuenta, saldo);
		this.penalizacion = penalizacion;
	}

	public double getPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(double penalizacion) {
		this.penalizacion = penalizacion;
	}

	@Override
	public String toString() {
		return "CuentaEmpresa [penalizacion=" + penalizacion + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void ingresarDinero(double cantIngresada) {
		setSaldo(super.getSaldo()+cantIngresada);
		
	}

	@Override
	public void retirarDinero(double cantRetirada) {
		setSaldo(super.getSaldo()-cantRetirada-penalizacion);
	}
	
	
	
	
}
