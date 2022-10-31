package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1;
		double num2;
		double result;
		int cero = 0;
		
		
		System.out.println("Bienvenido.\nVamos a calcular una división entre dos números.");
		System.out.println("Por favor, esccriba un número.");
		num1 = Leer.datoDouble();
		
		System.out.println("Por favor, esccriba otro número.");
		num2 = Leer.datoDouble();
		
		result = num1 / num2;
		
		if ( num2 == cero) {
			System.out.println("Error.");
		}
		
		
		else {
			
			System.out.printf("El resultado es %.2f.\n",result);
		}
	
	}
}
	
