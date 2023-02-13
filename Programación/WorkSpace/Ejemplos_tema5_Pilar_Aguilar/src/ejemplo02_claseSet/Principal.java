package ejemplo02_claseSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Set<Alumno> listaAlumnos = new HashSet <Alumno>();
		
		Alumno a = new Alumno("Sandra", 46,4.6);
		listaAlumnos.add(a);
		System.out.println(listaAlumnos);
		listaAlumnos.add(new Alumno("Pepe",25,7.8));
		
		Set<String>lista=new HashSet<String>();
		
		lista.add("Pepe");
		lista.add("Luis");
		lista.add("Ricardo");
		lista.add("Lola");
		System.out.println(lista);
		
	}

}
