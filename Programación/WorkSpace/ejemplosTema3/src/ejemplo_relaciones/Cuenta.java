package ejemplo_relaciones;

public class Cuenta {

	private long numero;
	private Cliente c;
	private float saldo;
	private float interesAnual;
	
	
	public Cuenta(long numero, Cliente c, float saldo, float interesAnual) {
		super();
		this.numero = numero;
		this.c = c;
		this.saldo = saldo;
		this.interesAnual = interesAnual;
	}


	public long getNumero() {
		return numero;
	}


	public void setNumero(long numero) {
		this.numero = numero;
	}


	public Cliente getC() {
		return c;
	}


	public void setC(Cliente c) {
		this.c = c;
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public float getInteresAnual() {
		return interesAnual;
	}


	public void setInteresAnual(float interesAnual) {
		this.interesAnual = interesAnual;
	}



	public String toString() {
		return "Cuenta [numero=" + numero + ", c=" + c + ", saldo=" + saldo + ", interesAnual=" + interesAnual + "]";
	}
	
	
	
	
	
}
