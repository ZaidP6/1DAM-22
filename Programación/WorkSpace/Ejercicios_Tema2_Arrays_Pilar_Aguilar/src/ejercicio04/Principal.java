package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Rellenar un array unidimensional de 10 posiciones con números aleatorios entre 1 y 99 y
			mostrar el número guardado en un lugar que indique el usuario por teclado.*/
		
		int tam = 10;
		int desde = 1;
		int hasta = 99;
		int [] aleatorio = new int [tam];
		int salida = 0;
		int cero = 0, uno = 1;
		int posicion;
		
		
		Random nums = new Random (System.nanoTime());
		
		System.out.println("Bienvenido al programa del ejercicio 04");
		
		for (int i = 0; i < aleatorio.length;i++) {
			aleatorio [i] = nums.nextInt((hasta -desde + uno)+desde);			
		}
		
		for (int i = 0; i < aleatorio.length; i++) {
			System.out.println("Número "+(i+uno)+ ": "+aleatorio[i]);
			
		}
		
		System.out.println("¿Qué posición desea cambiar?");
		posicion = Leer.datoInt();
		System.out.println("¿Por qué número desea cambiarlo?");
		aleatorio[posicion - 1] = Leer.datoInt();
		
		
			
		}
		
		
	}


