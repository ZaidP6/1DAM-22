package ejercicio05_bis;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		  Solicitar al usuario que introduzca por teclado el tamaño del array.
			• Declarar y definir el array de enteros.
			• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
			• Mostrar por pantalla la suma de todos los elementos.
			• Mostrar el mayor y el menor guardados en el array.
			• Modificar un valor elegido por el usuario
		 */
		
		//variables
		int tam = 0; //tamaño
		int aleatorio []; //array
		int suma=0; //suma
		int hasta, desde, uno=1; //números límite y conversor
		int mayor, menor, op; //para guargar número mayor y menor, y operador al cambiar un número del array
		
		//Rellenar el array
		Random num = new Random(System.nanoTime());
		
		System.out.println("*************************************************************");
		System.out.println("Bienvenido al programa del ejercicio 05");
		System.out.println("*************************************************************");
		
		//Introducir tamaño del array
		System.out.println("Introduzca el tamaño del array.");
		tam=Leer.datoInt();
		
		//Declarar array
		aleatorio= new int [tam];
		
		//Pedir valores max y min
		System.out.println("Indique dos valores.");
		desde = Leer.datoInt();
		hasta = Leer.datoInt();
		System.out.println("*************************************************************");
		
		//Indica al array los números con los que operar y muestra en pantalla el array
		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio [i]= num.nextInt(hasta - desde + uno) +desde;
			System.out.println(aleatorio[i]);
			
		}
		System.out.println("*************************************************************");
		
		//Suma de todos los elementos
		for (int i = 0; i < aleatorio.length; i++) {
			suma = suma + aleatorio[i];	
			
		}
		
		
		System.out.println("La suma de los valores del array sería de: "+suma+".");
		System.out.println("*************************************************************");
		
		//Mostrar el número mayor y menor que ha generado el array
		
		mayor=aleatorio[0];
		menor=aleatorio[0];
		
		for (int i = 0; i < aleatorio.length; i++) {
			
			if(aleatorio[i]>mayor) {
				mayor = aleatorio[i];
			}
			
			if(aleatorio[i]<menor) {
				menor = aleatorio[i];
			}

		}
		
		System.out.println("El número más alto del array es: "+mayor);
		System.out.println("El número más bajo del array es: "+menor);
		System.out.println("*************************************************************");
		
		//Modificar un número del array
		System.out.println("¿Qué elemento desea modificar? Indique un valor del 1 al "+tam);
		op = Leer.datoInt();
		System.out.println("¿Por qué valor desea cambiarlo?");
		aleatorio [op -1] = Leer.datoInt();
		System.out.println("*************************************************************");
		
		//Mostrar el array con el número modificado
		for (int i = 0; i < aleatorio.length; i++) {
			System.out.println(aleatorio[i]);
		}
		System.out.println("*************************************************************"); 
		System.out.println("Gracias por usar el programa.");
	}

}
