package ejemplo01_claseList;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno al = new Alumno("Miguel", 34, 4.9);
		List<String>lista2 = new ArrayList <String>();
		
		List <Alumno> listado = new ArrayList<Alumno>();
		
		
		listado.add(new Alumno("Ángel", 18, 7.4));
		
		
		listado.add(1, al);
		System.out.println(listado);
		System.out.println(listado.size());
		System.out.println(listado.get(1));
		;
		
		
		List <Integer> lista3 = new ArrayList<Integer>();
		
		System.out.println(lista2.add());
		System.out.println(lista2);
		
		
		
		
		
		
	}

}
