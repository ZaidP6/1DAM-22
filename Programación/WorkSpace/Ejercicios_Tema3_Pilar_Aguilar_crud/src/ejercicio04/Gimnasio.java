package ejercicio04;

import java.util.Arrays;
import java.util.Set;

public class Gimnasio {

	

	private Cliente []listaC;

	public Gimnasio(Cliente[] listaC) {
		super();
		this.listaC = listaC;
	}

	@Override
	public String toString() {
		return "Gimnasio [listaC=" + Arrays.toString(listaC) + "]";
	}

	/**
	 * @return the listaC
	 */
	public Cliente[] getListaC() {
		return listaC;
	}

	/**
	 * @param listaC the listaC to set
	 */
	public void setListaC(Cliente[] listaC) {
		this.listaC = listaC;
	}
	
	
 	public Cliente findByDni (String dni) {
        int i=0;
        boolean encontrado =false;
        while (i<listaC.length && !encontrado) {
            Cliente listaDni= listaC[i];
            if(listaDni.getDni().equalsIgnoreCase(dni))
                encontrado=true;
            else
                i++;

        }
        if (encontrado) {
            return listaC[i];
        }else
            return null;

    }
	
	
	public Cliente[] findByName(String nombre) {
		
		 boolean encontrado =false;
		
		for(int i = 0;i<listaC.length && !encontrado;i++) {
			
			Cliente listaNombre = listaC[i];
			if (listaNombre.getNombre().equalsIgnoreCase(nombre)) {
				encontrado = true;
			}else
				i++;
			
		}
		
		return listaC;
	}
	
	
	public void mostrarLista() {
		
		for (int i = 0; i < this.listaC.length; i++) {
			
			System.out.println("Cliente "+(i+1)+": "+listaC[i]);
			
		}
	}
	
	public void cargarCliente() {
	
		listaC[0] = new Cliente("77596845H", "Pepe", "Rasero", true, 86.5, 1.74);
		listaC[1] = new Cliente("77596869P", "Jaime", "Felps", true, 80.5, 1.84);
		listaC[2] = new Cliente("77596545J", "Álvaro", "Ruiz", true, 96.5, 1.94);
	}
	
	public void addCliente(Cliente c, int posicion) {
		
		listaC[posicion]= c;
	}
	
	public void deleteCliente(String dni) {
		
		findByDni(dni).setActivo(false);
	}
}
