package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//variables
		
		int tam = 0;
		int valor1 = 0;
		int valor2 = 0;
		int suma = 0;
		int mayor = 0;
		int menor = 0;
		int [] aleatorio;
		
		// programa
		
		
		System.out.println("Bienvenido al programa del ejercicio 5.");
		System.out.println("Introduzca el tamaño de array.");
		
		tam = Leer.datoInt();
		
		aleatorio = new int [tam];
		
		for(int i = 0; i < aleatorio.length; i++) {
			System.out.println("Introduzca "+(tam--)+" numeros");
			aleatorio[i] = Leer.datoInt();
		}
		
		//para sumar los arrays
		
		for(int i = 0;i < aleatorio.length;i++) {
			suma = suma + aleatorio[i];
		}
		
		System.out.println("La suma de los arrays es de: "+suma);
		
		//para sacar mayor y menor
		
		//mayor = menor = aleatorio[0];
		for(int i = 0; i< aleatorio.length;i++) {
			if(aleatorio[i]<menor) {
				menor = aleatorio[i];
			}
			
			if(aleatorio[i]>mayor) {
				mayor = aleatorio[i];
			}
			
		}
		
		System.out.println("El mayor número es: "+mayor);
		System.out.println(" ");
		System.out.println("El menor número es: "+menor);
		
		//para cambiar uno de los elementos del array

		System.out.println("Por favor, indique qué elemento quiere cambiar");
		valor1 = Leer.datoInt();
		System.out.println("¿Cuál es el nuevo valor?");

		aleatorio[valor1]= Leer.datoInt();
		
		for (int i=0; i<aleatorio.length; i++) {
			
			System.out.println(+aleatorio[i]);
		}
	}

}
