package ejercicio06_bis;

import java.util.Iterator;
import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] precios;
		String [] productos;
		int tam = 0;
		int desde = 0, hasta = 0, suma = 0, mayor = 0, menor = 0;
		
		
		Random num = new Random(System.nanoTime());
		
		System.out.println("Bienvenidos al ejercicio06");
		System.out.println("Por favor introduzca la cantidad de productos.");
		
		tam = Leer.datoInt();
		
		System.out.println("Por favor, indique el valor más pequeño (sin decimales).");
		desde = Leer.datoInt();
		System.out.println("Por favor indique el valor más grande (sin decimales).");
		hasta = Leer.datoInt();
		
		productos = new String [tam];
		precios = new int [tam];
		
		System.out.println("Ponga tantos nombres como de productos se tratasen");
		for (int i = 0; i < productos.length; i++) {
			productos [i] = Leer.dato();

		}
		
		
		for (int i = 0; i < precios.length; i++) {
			precios [i] = num.nextInt(hasta-desde +1)+desde;	
		}
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("Nombre\t\tPrecio");
			System.out.println(productos [i]+"\t\t"+precios [i]+"€.");
		
		for (int j = 0; j < precios.length; j++) {
			suma = suma + precios[j];
			System.out.println("La suma de el precio de todos los prodcytos es de: "+precios[j]);
			
		}
		//System.out.println("La suma de el precio de todos los prodcytos es de: "+precios[]);
			
	}

}
