package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ejercicio01
		
		String[]nombres= {"Ángel", "Luismi", "Miguel", "Paco"};
		
		for (int i=0; i<nombres.length;i++) {
			System.out.print("\t"+nombres[i]);
		}
		
		
		//Introducir nombre en array por teclado
		
		for (int i=0; i<nombres.length;i++) {
			nombres[i]=Leer.dato();
			System.out.print("\t"+nombres[i]);
		}
		
		//No se puede usar el == para comparar 2 String
		/*if(nombres[i]=="Pepe") {
			
		}*/
		
		
	}

}
