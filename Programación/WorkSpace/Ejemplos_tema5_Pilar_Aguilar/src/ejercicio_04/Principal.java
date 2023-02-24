package ejercicio_04;

import java.util.HashMap;
import java.util.Map;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id;
		
		Contacto c1= new Contacto(1, "Mario", "a@a.com");
		Contacto c2 = new Contacto (2,"Pepi", "b@b.com");
		Contacto c3 =new Contacto(3,"Javi","c@c.com");
		Map <Contacto, Integer> listado=new HashMap<Contacto,Integer>();
		//agregamos con la coleccion 
		listado.put(c1, 222222222);
		listado.put(c2, 111111111);
		//agregamos con los métdodos 
		Agenda a = new Agenda (listado);
		a.addContacto(c3, 333333333);
		
		a.mostrarTodos();
		System.out.println("Introduzca id");
		id=Leer.datoInt();
		System.out.println(a.findById(id));
		System.out.println("Introduzca id");
		id=Leer.datoInt();
		a.eliminarContacto(id);
		a.mostrarTodos();
	}

}
