package ejemplo07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		
		int[] edad = new int[50];
		int [] edades;
		int op;
		int uno  = 1;
		
		int suma = 0;
		
		edad [0] = 13;
		edad [3] = 46; // guardado en la casilla numero 4
		edad [49] = 24;
		System.out.println("La edad es: "+edad[3]);
		
		
		
		System.out.println("Buenas. Diga el tamaño de la cantidad de edades que desea guardar:");
		tam = Leer.datoInt();
		edades = new int [tam];
		
		/*System.out.println("Diga una edad:");
		edades [0] =Leer.datoInt();
		edades [1] =Leer.datoInt();*/
		
		
		
		 //para cargar
		for(int i = 0; i < edades.length;i++) {
			System.out.println("Diga una edad:");
			edades [i] =Leer.datoInt();
		
			//System.out.println("datos: "+edades[i]);
		}
		
		
		//para mostrar
		
		for(int i =0; i< edades.length;i++) {
			System.out.println("Edades:"+edades[i]);
			
			
			System.out.println("¿Qué elemento deseas cambiar?");
			op = Leer.datoInt();
			System.out.println("¿Nuevo valor?");
			edades[op-uno] = Leer.datoInt();
			
		for(int j =0; j< edades.length;j++) {
			System.out.println("Edad:"+edades[j]);
				
			}
		//para sumar
		
		for(int k =0; k< edades.length;k++) {
			suma+= edades[k];
		
		}
		System.out.println("La suma es: "+suma);
		
		}
		
	}
}
