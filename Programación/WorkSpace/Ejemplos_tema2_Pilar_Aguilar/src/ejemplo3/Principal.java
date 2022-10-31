package ejemplo3;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		String opcion;
		
		//PROGRAMA
		opcion = Leer.dato();
		
		switch (opcion) 
		{
			case "opcion1":
				System.out.println("hola");
				System.out.println("xxx");
				break;
			
			case "opcion2":
				System.out.println("ty!");
				break;
				
			default:
				System.out.println("Opción inválida");
				break;
			
		}
	
	}

}
