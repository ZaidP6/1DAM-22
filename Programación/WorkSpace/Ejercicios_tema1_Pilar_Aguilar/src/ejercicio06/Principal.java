package ejercicio06;

//import java.util.Scanner;

import utilidades.Leer;

public class Principal {

	public static void main(String []args) {
		
		/**
		 * precioInicial, precioFinal
		 * descuento , 
		 */
		
		//VARIABLES
		
		double precioInicial, precioFinal;
		double descuento = 20;
		double conv = 100;
		
		//PROGRAMA
		
		System.out.println("Bienvenido al programa Calculador de precios.\n¿Cuánto cuenta el producto que deseas comprar?");
		//Scanner leer = new Scanner (System.in);
		precioInicial = Leer.datoDouble();
		precioFinal = precioInicial - (precioInicial * descuento / conv);
		System.out.printf("Tu producto con un %.2f por ciento de descuento aplicado te costará: %.2f€.\nGracias por utilizar nuestro programa.\nHasta la próxima.",descuento, precioFinal);
	}
}
