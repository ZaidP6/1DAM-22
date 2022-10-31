package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero1;
		int numero2;
	
		
		System.out.println("BIENVENIDOS AL PROGRAMA\nHOY VEREMOS SI DOS NÚMEROS SON IGUALES, MAYORES O MENORES QUE EL OTRO.");
		
		System.out.println("Escriba el primer número (sin decimales) que desea comparar.");
		numero1 = Leer.datoInt();
		
		System.out.println("Escriba el segundo número (sin decimales) que desea comparar.");
		numero2 = Leer.datoInt();
		
		if(numero1 < numero2) {
			
			System.out.printf("%d es mayor que %d",numero2, numero1);
		}
		
		else if(numero2 < numero1) {
			
			System.out.printf("%d es mayor que %d",numero1, numero2);
		}
		
		else {
			
			System.out.printf("%d es igual que %d\n",numero2, numero1);
		}
		
		System.out.println("Gracias por usar el programa.");
	}

}
