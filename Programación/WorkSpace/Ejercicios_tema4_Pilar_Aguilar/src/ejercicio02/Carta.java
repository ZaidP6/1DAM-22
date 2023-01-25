package ejercicio02;

public class Carta extends Documento {

	private String fecha;

	
	
	public Carta(String nombreEmpresa, String cIF, String direccion, String fecha) {
		super(nombreEmpresa, cIF, direccion);
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Carta [fecha=" + fecha + ", toString()=" + super.toString() + "]";
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
    
	public void imprimirDoc(){

        super.imprimirDoc();
        System.out.println("Fecha: \t\t\t\t"+fecha);
        System.out.println("//////////////////////////////////////////////////////");
        
   }
	
}
