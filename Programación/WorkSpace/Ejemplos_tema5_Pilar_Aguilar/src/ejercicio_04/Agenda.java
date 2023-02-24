package ejercicio_04;


import java.util.Iterator;
import java.util.Map;


public class Agenda {
	
	private Map <Contacto,Integer> listado;

	//constructor
	public Agenda(Map<Contacto, Integer> listado) {
		super();
		this.listado = listado;
	}
	
	//getter and setter
	public Map<Contacto, Integer> getListado() {
		return listado;
	}

	public void setListado(Map<Contacto, Integer> listado) {
		this.listado = listado;
	}
	
	//to string 

	@Override
	public String toString() {
		return "Agenda [listado=" + listado + "]";
	}
	//este es el método que hay que utilizar 
	public void addContacto(Contacto c1, Integer int1) {
		listado.put(c1, int1);
	}
	//este no 
	public void addContactoV2(Contacto c1, int num) {
		listado.put(c1, num);
	}
	
	public void mostrarTodos() {
		for(Contacto c1: listado.keySet()){
			
		System.out.println(c1);
		//System.out.println(listado.get(c1));
			
		}
	}
		
		public Contacto findById (int id){
		
			Contacto c;
			Iterator<Contacto> it=listado.keySet().iterator();
			
			while(it.hasNext()) {
				c= it.next();
				if(c.getIdContacto()==id) {
					return c;
				}
			}
		
			return null;
	}	
		
		public void eliminarContacto(int id) {
			listado.remove(findById(id));
			
		}
		
}




