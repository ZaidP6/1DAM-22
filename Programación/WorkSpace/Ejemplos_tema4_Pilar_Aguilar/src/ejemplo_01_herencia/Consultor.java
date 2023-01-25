package ejemplo_01_herencia;

public class Consultor extends Superclase_trabajador {

	int horas;
	double tarifa; //Precio hora

	
	


public Consultor(String nombre, String puesto, int horas, double tarifa) {
		super(nombre, puesto);
		this.horas = horas;
		this.tarifa = tarifa;
	}




@Override
	public String toString() {
		return "Consultor [horas=" + horas + ", tarifa=" + tarifa + ", toString()=" + super.toString() + "]";
	}




/**
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}




	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
	}




	/**
	 * @return the tarifa
	 */
	public double getTarifa() {
		return tarifa;
	}




	/**
	 * @param tarifa the tarifa to set
	 */
	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}




public double calcularPaga(int numHijos) {
		
		return horas*tarifa;
	}
	
	
}
