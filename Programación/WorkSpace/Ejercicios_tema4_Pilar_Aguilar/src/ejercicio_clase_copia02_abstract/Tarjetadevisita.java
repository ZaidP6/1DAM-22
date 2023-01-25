package ejercicio_clase_copia02_abstract;

public class Tarjetadevisita extends Documento {

	  private String nombrePers;
	  private int movil;
	  private String mail;
	  
	  
	  
	  
	public Tarjetadevisita(String nombreEmpresa, String cIF, String direccion, String nombrePers, int movil,
			String mail) {
		super(nombreEmpresa, cIF, direccion);
		this.nombrePers = nombrePers;
		this.movil = movil;
		this.mail = mail;
	}




	/**
	 * @return the nombrePers
	 */
	public String getNombrePers() {
		return nombrePers;
	}

	/**
	 * @param nombrePers the nombrePers to set
	 */
	public void setNombrePers(String nombrePers) {
		this.nombrePers = nombrePers;
	}

	/**
	 * @return the movil
	 */
	public int getMovil() {
		return movil;
	}

	/**
	 * @param movil the movil to set
	 */
	public void setMovil(int movil) {
		this.movil = movil;
	}

	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}




	@Override
	public String toString() {
		return "Tarjetadevisita [nombrePers=" + nombrePers + ", movil=" + movil + ", mail=" + mail + ", toString()="
				+ super.toString() + "]";
	}

	public void imprimirDoc(){

		System.out.println("//////////////////////////////////////////////////////");
        System.out.println("Nombre de la empresa: \t\t"+getNombreEmpresa());
        System.out.println("CIF de la empresa: \t\t"+getcIF());
        System.out.println("Dirección de la empresa: \t"+getDireccion());
        System.out.println("Nombre: \t\t\t"+nombrePers);
        System.out.println("Teléfono de contacto: \t\t"+movil);
        System.out.println("Correo: \t\t\t"+mail);
        System.out.println("//////////////////////////////////////////////////////");
        
        
   }
	
}
