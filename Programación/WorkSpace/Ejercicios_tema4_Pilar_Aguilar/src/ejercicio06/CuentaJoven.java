package ejercicio06;

public class CuentaJoven extends Cuenta {

	private double regalo;

	public CuentaJoven(String nombreCliente, int numCuenta, double saldo, double regalo) {
		super(nombreCliente, numCuenta, saldo);
		this.regalo = regalo;
	}

	public double getRegalo() {
		return regalo;
	}

	public void setRegalo(double regalo) {
		this.regalo = regalo;
	}

	@Override
	public String toString() {
		return "CuentaJoven [regalo=" + regalo + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void ingresarDinero(double cantIngresada) {
		setSaldo(super.getSaldo()+cantIngresada+regalo);

	}

	@Override
	public void retirarDinero(double cantRetirada) {
		setSaldo(super.getSaldo()-cantRetirada);
		
	}
	
	
	
	
}
