package ejercicio;

public class Tarjeta {

	private String pin;
	private double saldo;
	
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		if (pin.length() < 5  || pin.length() > 5)
			throw new RuntimeException("El pin debe contener 4 números y 1 letra");
		this.pin = pin;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Tarjeta [pin=" + pin + ", saldo=" + saldo + ", toString()=" + super.toString() + "]";
	}
	public Tarjeta(String pin, double saldo) {
		super();
		this.pin = pin;
		this.saldo = saldo;
	}
	
	
	public Tarjeta() {
		// TODO Auto-generated constructor stub
	}
	public void imprimirSaldo() {
		System.out.println(saldo);
	}
	
}
