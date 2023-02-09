package ejercicio;

import java.util.Arrays;


public class Taquilla {

	private Taquilla [] listaEntradas;

	public Taquilla(Taquilla[] listaEntradas) {
		super();
		this.listaEntradas = listaEntradas;
	}

	@Override
	public String toString() {
		return "Taquilla [listaEntradas=" + Arrays.toString(listaEntradas) + ", toString()=" + super.toString() + "]";
	}

	public Taquilla[] getListaEntradas() {
		return listaEntradas;
	}

	public void setListaEntradas(Taquilla[] listaEntradas) {
		this.listaEntradas = listaEntradas;
	}

	
/*	public Taquilla findById(int codigo) {
		
		int i=0;
		boolean encontrado=false;
		
		while(i<listaEntradas.length && !encontrado) {
			Taquilla aux = listaEntradas[i];
			if((aux.getNAsiento() && aux.getNFila()) == codigo) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return listaEntradas[i];
		}else {
			return null;
		}return null;
	}
	
	*/
	
	public double calcularPrecio() {
		double precioE = 0;
		for (int i = 0; i < listaEntradas.length; i++) {
			//((EntradaGrupos)listaEntradas[i]).calcularPrecio();
		}
		
		return precioE;
	}
	
	public double calcularTotalTaq() {
		double suma = 0;
		for (int i = 0; i < listaEntradas.length; i++) {
			//suma += listaEntradas[i];
		}
		return suma;
	}
}
