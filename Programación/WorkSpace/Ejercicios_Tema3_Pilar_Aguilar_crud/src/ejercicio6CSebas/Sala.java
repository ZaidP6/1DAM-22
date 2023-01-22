package ejercicio6;

import java.util.Arrays;

public class Sala {
	
	private String codigo;
	private int localidadesTotales;
	private Entrada [] localidades;
	
	public Sala(String codigo, int localidadesTotales, Entrada[] localidades) {
		this.codigo = codigo;
		this.localidadesTotales = localidadesTotales;
		this.localidades = localidades;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getLocalidadesTotales() {
		return localidadesTotales;
	}

	public void setLocalidadesTotales(int localidadesTotales) {
		this.localidadesTotales = localidadesTotales;
	}


	public Entrada[] getLocalidades() {
		return localidades;
	}

	public void setLocalidades(Entrada[] localidades) {
		this.localidades = localidades;
	}
	
	@Override
	public String toString() {
		return "Sala [codigo=" + codigo + ", localidadesTotales=" + localidadesTotales + ", localidades="
				+ Arrays.toString(localidades) + "]";
	}

	public void imprimirCartelera() {
		System.out.println("----------");
		System.out.println("Cartelera");
		System.out.println("----------");
		System.out.println("1 - Avatar : "+localidades[0].getPrecio()+"€");
	}
	public void cargarEntradas() {
		localidades[0] = new Entrada("1ab", 7.5, false, 1,1);
		localidades[1] = new Entrada("2cd", 7.5, false, 1,2);
		localidades[2] = new Entrada("3ef", 7.5, false, 2,1);
		localidades[3] = new Entrada("4gh", 7.5, false, 2,2);

	}
	public Entrada findByID(String codigoBusq) {
		int i=0;
		boolean encontrado=false;
		
		while(i<localidades.length && !encontrado) {
			if(localidades[i].getCodigo().equalsIgnoreCase(codigoBusq)) {
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
	public int findByIDV2(String codigoBusq) {
		int i=0;
		boolean encontrado=false;
		
		while(i<localidades.length && !encontrado) {
			if(localidades[i].getCodigo().equalsIgnoreCase(codigoBusq)) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return i;
		}else {
			return -1;
		}
	}
	public Entrada[] findByOcup(boolean libreOcupBusq) {
		Entrada [] locEncon = new Entrada[localidades.length];
		for(int i=0;i<localidades.length && localidades[i]!=null;i++) {
			if(localidades[i].isLibreOcup()==libreOcupBusq) {
				locEncon[i]=localidades[i];
			}
		}
		return locEncon;
	}
	public void add(Entrada e, int pos) {
		localidades[pos-1]=e;
	}
	public void cancelEntr(Entrada e) {
		e.setLibreOcup(false);
	}
	public void imprimirLocalidades() {
		for(int i=0;i<localidades.length;i++) {
			System.out.println((1+i)+" - "+localidades[i]);
		}
	}
	public void imprimirLista(Entrada[] lista) {
		for(int i=0;i<lista.length && lista[i]!=null;i++) {
			System.out.println((1+i)+" - "+lista[i]);
		}
	}
	public void editPrecio(int i, double precioNuev) {
		//cuidado con los -1
		localidades[i].setPrecio(precioNuev);
	}
	public void comprarEntrada(Entrada e) {
		e.setLibreOcup(true);
	}
	public double calcularGananciaTo(Entrada[] lista) {
		double gananciaTotal=0.0;
		for(int i=0;i<lista.length && lista[i]!=null;i++) {
			gananciaTotal+=lista[i].getPrecio();
		}
		return gananciaTotal;
	}

	
}
