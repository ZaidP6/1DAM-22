package ejercicio6Carlos;

import java.util.Arrays;

public class Sala {
	
	//Atributos
	
	private int numIden;
	private int totalLocal;
	private Entrada [] localidades;
	
	
	//Constructor
	
	public Sala(int numIden, int totalLocal, Entrada[] localidades) {
	
		this.numIden = numIden;
		this.totalLocal = totalLocal;
		this.localidades = localidades;
	}

	
	
	//Getters and Setters
	
	public int getNumIden() {
		return numIden;
	}

	public void setNumIden(int numIden) {
		this.numIden = numIden;
	}

	public int getTotalLocal() {
		return totalLocal;
	}

	public void setTotalLocal(int totalLocal) {
		this.totalLocal = totalLocal;
	}


	public Entrada[] getLocalidades() {
		return localidades;
	}

	public void setLocalidades(Entrada[] localidades) {
		this.localidades = localidades;
	}


	//To String
	
	public String toString() {
		return "Sala [numIden=" + numIden + ", totalLocal=" + totalLocal + ", tickets="  + ", localidades="
				+ Arrays.toString(localidades) + "]";
	}
	
	
	public void imprimirCartelera() {
		System.out.println("Cartelera cutre con 1 opción");
		System.out.println("Javatar 3: El retorno");
	}
	
	public void cargarEntradas() {
		localidades[0] = new Entrada(1a, 5.50, false, 1,1 );
		localidades[1] = new Entrada(2b, 5.50, false, 1,2 );
		localidades[2] = new Entrada(3c, 5.50, false, 2,3 );
		localidades[3] = new Entrada(4d, 5.50, false, 2,4 );
	}

	public Entrada findByID(String codigo) {
		int i=0;
		boolean encontrado=false;
		while (i<localidades.length && !encontrado) {
			if(localidades[i].getNumIden().equalsIgnoreCase(codigo)) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return localidades[i];
		}else {
			return null;
		}
	}
}
