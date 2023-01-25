package ejercicio02;

public class Documento {

	private String nombreEmpresa;
    private String cIF;
    private String direccion;
    


   


    public void imprimirDoc(){
    	
    	System.out.println("//////////////////////////////////////////////////////");
         System.out.println("Nombre de la empresa: \t\t"+nombreEmpresa);
         System.out.println("CIF de la empresa: \t\t"+cIF);
         System.out.println("Dirección de la empresa: \t"+direccion);
         
         
    }

	@Override
	public String toString() {
		return "Documento [nombreEmpresa=" + nombreEmpresa + ", cIF=" + cIF + ", direccion=" + direccion
				+ ", toString()=" + super.toString() + "]";
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	/**
	 * @param nombreEmpresa the nombreEmpresa to set
	 */
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	/**
	 * @return the cIF
	 */
	public String getcIF() {
		return cIF;
	}

	/**
	 * @param cIF the cIF to set
	 */
	public void setcIF(String cIF) {
		this.cIF = cIF;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}



	public Documento(String nombreEmpresa, String cIF, String direccion) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.cIF = cIF;
		this.direccion = direccion;
	}
	
}
