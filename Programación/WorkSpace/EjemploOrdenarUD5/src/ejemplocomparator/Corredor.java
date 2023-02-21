package ejemplocomparator;

import java.util.Objects;

public class Corredor implements Comparable <Corredor>{

	
	private int dorsal;
	private double marca;
	private String nombre;
	
	public Corredor(int dorsal, double marca, String nombre) {
		this.dorsal = dorsal;
		this.marca = marca;
		this.nombre=nombre;
	}
	
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public double getMarca() {
		return marca;
	}
	public void setMarca(double marca) {
		this.marca = marca;
	}
	public String getNombre(){
		return nombre;
	}

	@Override
	public String toString() {
		return "Corredor [dorsal=" + dorsal + ", marca=" + marca + ", nombre=" + nombre + "]";
	}

	
	/*Orden natural simple basado, por ejemplo, en uno de los atributos primitivos como el dorsal
	 * usa interface Comparable y se modifica la clase modelo original.
	 * se debe reescribir el método compareTo en la clase modelo definiendo cómo se quiere ordenar*/ 
	
	@Override
	public int compareTo(Corredor c) {
		
		if(this.dorsal < c.dorsal) {
			return -1;

		}else {
			if (this.dorsal > c.dorsal) {
				return 1;
			}
			
			return 0;
		}
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(dorsal, marca, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Corredor other = (Corredor) obj;
		return dorsal == other.dorsal && Double.doubleToLongBits(marca) == Double.doubleToLongBits(other.marca)
				&& Objects.equals(nombre, other.nombre);
	}
	

	  
	
	
}
