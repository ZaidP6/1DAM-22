package ejercicio_04;

import java.util.Objects;

public class Contacto {
	
	private int idContacto;
	private String nombre;
	private String email;
	
	
	//Constructores
	public Contacto(int idContacto, String nombre, String email) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.email = email;
	}
	
	//getters and setters
	public int getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//hascode solo se generan cuando usamos una coleccion tipo has 
	@Override
	public int hashCode() {
		return Objects.hash(email, idContacto, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contacto other = (Contacto) obj;
		return Objects.equals(email, other.email) && idContacto == other.idContacto
				&& Objects.equals(nombre, other.nombre);
	}
	
	//to String 
	@Override
	public String toString() {
		return "Contacto [idContacto=" + idContacto + ", nombre=" + nombre + ", email=" + email + "]";
	}


}
