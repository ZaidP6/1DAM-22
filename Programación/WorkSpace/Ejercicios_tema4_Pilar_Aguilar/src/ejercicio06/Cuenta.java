package ejercicio06;

public abstract class Cuenta {

	
	private String nombreCliente;
	private int numCuenta;
	private double saldo;
	
	
	@Override
	public String toString() {
		return "Cuenta [nombreCliente=" + nombreCliente + ", numCuenta=" + numCuenta + ", saldo=" + saldo
				+ ", toString()=" + super.toString() + "]";
	}
	public Cuenta(String nombreCliente, int numCuenta, double saldo) {
		super();
		this.nombreCliente = nombreCliente;
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public abstract void ingresarDinero(double cantIngresada);
	public abstract void retirarDinero(double cantRetirada);
	
	
}
