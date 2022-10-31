package ejercicio05;

//import java.util.Scanner;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		double cantidadEuros;
		double valorDolar = 1.0266;
		double valorCambio;
		
		
		//PROGRAMA
		
		//Scanner leer = new Scanner (System.in);
		System.out.println("Bienvenido al conversor de euros a dólares.\n¿Cuántos euros quiere convertir?");
		cantidadEuros = Leer.datoDouble();
		
		valorCambio = cantidadEuros * valorDolar;
		System.out.printf("%.2f€ en dólares son: $%.2f.\n", cantidadEuros, valorCambio);
		System.out.println("Gracias por usar nuestro programa.\nHasta la próxima.");
		
	}

}
