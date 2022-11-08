package ejercicio05_bis3;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		  	• Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.
			• Modificar un valor elegido por el usuario
		 */
		
		int tam = 0, uno = 1, op = 0;
		int desde = 0;
		int hasta = 0;
		int [] aleatorio;
		int suma = 0;
		int mayor = 0,menor = 0;
		
		
		
		Random num = new Random (System.nanoTime());

		System.out.println("*************************************************");
		System.out.println("Bienvenido");
		System.out.println("*************************************************");
		System.out.println("Por favor introduzca el tamaño del array");
		tam = Leer.datoInt();
		
		aleatorio = new int [tam];
		
		System.out.println("*************************************************");
		System.out.println("Por favor introduzca el número más pequeño.");
		desde = Leer.datoInt();
		System.out.println("Por favor introduzca el número más grande.");
		hasta = Leer.datoInt();
		
		System.out.println("*************************************************");
		
		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i] = num.nextInt(hasta - desde +uno)+desde;
			System.out.println("Número "+(i+uno)+": "+aleatorio[i]);
		}
		System.out.println("*************************************************");
		
		for (int i = 0; i < aleatorio.length; i++) {
			suma = suma + aleatorio[i];	
		}
		
		System.out.println("La suma de todos los números del array es: "+suma+".");
		System.out.println("*************************************************");
		
		menor = aleatorio[0];
		mayor = aleatorio [0];
		
		for (int i = 0; i < aleatorio.length; i++) {
			if (i < menor) {
				menor = aleatorio[i];
			}
			if (i> mayor) {
				mayor = aleatorio[i];
			}
			
			
		}
		
		System.out.println("El mayor de los números es el: "+mayor);
		System.out.println("El menor de los números es el: "+menor);
		System.out.println("*************************************************");
		
		
		System.out.println("Por favor introduzca el índice del elemento que desea modificar");
		op = Leer.datoInt();
		System.out.println("Introduzca el nuevo valor.");
		aleatorio [op-1] = Leer.datoInt();
		System.out.println("*************************************************");
		
		for (int i = 0; i < aleatorio.length; i++) {
			System.out.println("Número "+(i+uno)+": "+aleatorio[i]);
			
		}
		System.out.println("*************************************************");
		System.out.println("Gracias por usar nuesto programa. Hasta la próxima.");
		  
		
		
		
		
		
		
		
		
	}

}

