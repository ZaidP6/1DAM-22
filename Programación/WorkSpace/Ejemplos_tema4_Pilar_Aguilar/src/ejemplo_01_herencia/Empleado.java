package ejemplo_01_herencia;

public class Empleado extends Superclase_trabajador {
	
	private double sueldo;
	private double impuestos;
	

	
	

	public Empleado(String nombre, String puesto, String direcccion, int telefono, int nSS, double sueldo,
			double impuestos) {
		super(nombre, puesto, direcccion, telefono, nSS);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}





	@Override
	public String toString() {
		return super.toString()+ "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}
	
	
	

}
