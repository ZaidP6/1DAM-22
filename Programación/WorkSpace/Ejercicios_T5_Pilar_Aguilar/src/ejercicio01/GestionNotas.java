package ejercicio01;

import utilidades.Leer;

public class GestionNotas {

	private String titulo;
	private String fecha;
	private String cuerpo;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	@Override
	public String toString() {
		return "GestionNotas [titulo=" + titulo + ", fecha=" + fecha + ", cuerpo=" + cuerpo + ", toString()="
				+ super.toString() + "]";
	}
	public GestionNotas(String titulo, String fecha, String cuerpo) {
		super();
		this.titulo = titulo;
		this.fecha = fecha;
		this.cuerpo = cuerpo;
	}
	
	
	public GestionNotas buscarNota(int codigo){
		int i = 0;
		boolean exito = false;
		while(){
			
		}
		return null;
	}
	
	public int contarNotas(GestionNotas []lista1) {
		int contador = 0;
		for (int i = 0; i < lista1.length; i++) {
			contador++;
		}
	return contador;
	}

	public void borrarNota(GestionNotas []lista1) {
		int i = 0;
		System.out.println("¿Qué nota desea borrar?");
		i = Leer.datoInt();
		lista1[i] = null;
		System.out.println("Nota borrada.");
	}

	public GestionNotas añadirNota(GestionNotas []lista1) {
		int i = 0;
		boolean exito = false;
		
		
		System.out.println("¿Qué nota desea añadir?");
		i = Leer.datoInt();
		lista1[i] = null;
		System.out.println("Indique el titulo");
		//lista1[i] = Leer.dato();
		System.out.println("Indique la fecha sin espacios y con guiones");
		//lista1[i]= Leer.dato();
		System.out.println("Indique el cuerpo de la nota");
		//lista1[i] = Leer.dato();
		System.out.println("Nota añadida.");
		
		return lista1[i];
	}
	
	
	
}
