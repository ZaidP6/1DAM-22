package ejemplo_crud;

import java.util.Arrays;

public class CrudProducto {

	// CRUD: Create, Read, Update, Delete.
	
	private Producto []lista;

	public CrudProducto(Producto[] lista) {
		this.lista = lista;
	}
	
	public CrudProducto() {	
		int cuatro = 4;
		lista = new Producto [cuatro]; 		
	}
	//esto es un warreo, esto es para instanciar un objeto vacio y que no de problema.
	// lo ideal seria crear objeto en el main.

	@Override
	public String toString() {
		return "CrudProducto [lista=" + Arrays.toString(lista) + "]";
	}
	
	public void add(Producto p, int posicion) {
		lista[posicion]=p;
	}
	
	public void editPrecio(String codigo, float precionN) {
		int index = findByIdV2(codigo);
		if(index>=0) {
			lista[index].setPrecioUnitario(precionN);
		}
	}
	
	//Metodo para buscar
	public Producto findById(String codigo) {
		int i = 0;
		boolean encontrado = false;
	
	
	//Mientras no hayamos llegado al final o encontrado lo que buscamos.
	//Al encontrarlo, el bucle para
	while (i<lista.length && !encontrado) {
		Producto deLista = lista[i];
		if(deLista.getCodigo().equalsIgnoreCase(codigo))
			encontrado = true;
		else
			i++;
		}
	if(encontrado)
		return lista[i]; //devolvemos producto buscado
	else
		return null; 	//null es una referencia de Java (objeto nulo/vacio) que no tiene valor para que no de error el indicar un resultado.(no se puede encontrar nada).
	
	}
	
	//Metodo para buscar V2
	public int findByIdV2(String codigo) {
		int i = 0;
		boolean encontrado = false;
		
		while(i<lista.length && !encontrado) {
			Producto deLista = lista[i];
			if(deLista.getCodigo().equalsIgnoreCase(codigo))
				encontrado = true;
			else
				i++;
		}
		if(encontrado)
			return i;
		else
			return -1;
		
	}
}
