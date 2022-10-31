package ejemplo06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		
		int[] edad = new int[50];
		int [] edades;
		
		edad [0] = 13;
		edad [3] = 46; // guardado en la casilla numero 4
		edad [49] = 24;
		System.out.println("La edad es: "+edad[3]);
		
		
		
		System.out.println("Buenas. Diga el tamaño de la cantidad de edades que desea guardar:");
		tam = Leer.datoInt();
		edades = new int [tam];
		
		System.out.println("Diga una edad:");
		edades [0] =Leer.datoInt();
		edades [1] =Leer.datoInt();
		
		
		
		/* //para cargar
		for(int i = 0; i < edades.length;i++) {
			
		edades [i] =Leer.datoInt();
		
		System.out.println("datos: "+edades[]);
		}*/
		
		
		//para mostrar
		
		for(int i =0; i< edades.length;i++) {
			System.out.println("Edad:"+edades[i]);
		}
		
		
		
		
		
		
		
		
	}
	

}
