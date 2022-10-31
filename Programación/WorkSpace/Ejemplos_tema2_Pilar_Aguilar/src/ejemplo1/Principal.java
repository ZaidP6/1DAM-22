package ejemplo1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int edad = 0;
		int mayoria = 18;
		boolean entrada = true;
		
		
		System.out.println("Diga su edad");
		edad = Leer.datoInt();
		
		//if(edad >= mayoria && entrada || edad<60) {
		if(edad >= mayoria && edad <= 60) {
			System.out.println("Puedes entrar");
		}
		else {
			System.out.println("Pilla una entrada");
		}
		System.out.println("Gracias");
		
		
		
	}

}
