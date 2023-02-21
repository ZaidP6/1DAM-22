package ejercicio03;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Aula {
	
	private String nombre;
	private Set <Alumno> lista;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<Alumno> getLista() {
		return lista;
	}
	public void setLista(Set<Alumno> lista) {
		this.lista = lista;
	}
	@Override
	public int hashCode() {
		return Objects.hash(lista, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aula other = (Aula) obj;
		return Objects.equals(lista, other.lista) && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Aula [nombre=" + nombre + ", lista=" + lista + ", toString()=" + super.toString() + "]";
	}
	public Aula(String nombre, Set<Alumno> lista) {
		super();
		this.nombre = nombre;
		this.lista = lista;
	}
	
	
	
	public double calcularNotaMedia() {
		double suma = 0.0;
		for (Alumno a:lista) {
			suma+=a.getNotaMedia();
		}
		return suma/lista.size();
	}
	
	public double calcularSuspensos() {
		int susp= 0;
		Iterator<Alumno> it = lista.iterator();
		while(it.hasNext()) {
			if(it.next().getNotaMedia()<5)
				susp++;
		}
		return susp;
	}
	

}
