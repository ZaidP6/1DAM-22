package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double num1;
		double num2;
		double result;
		
		int cero = 0;
		int cociente = 2;
		int opcion;
		
		System.out.println("Bienvenido a la calculadora");
		
		do {
		
		System.out.println("----------------------------------------");
		System.out.println("Por favor indica con números el tipo de operación que desea realizar:");
		System.out.println("1 - suma");
		System.out.println("2 - resta");
		System.out.println("3 - multiplicación");
		System.out.println("4 - división");
		System.out.println("5 - indicar si un número es par o impar");
		System.out.println("----------------------------------------");
		System.out.println("Pulse 0 si desea salir del programa");
		System.out.println("----------------------------------------");
		
		opcion = Leer.datoInt();
		
		
			switch(opcion) {
			
			case 1:
				System.out.println("Por favor, indique los dos números separados con un enter.");
				num1 = Leer.datoDouble();
				num2 = Leer.datoDouble();
				result = num1 + num2;
				System.out.printf("El resultado de la suma %.2f + %.2f es: %.2f.\n",num1,num2,result);
				break;
				
			case 2:
				System.out.println("Por favor, indique los dos números separados con un enter.");
				num1 = Leer.datoDouble();
				num2 = Leer.datoDouble();
				result = num1 - num2;
				System.out.printf("El resultado de la resta %.2f - %.2f es: %.2f.\n",num1,num2,result);
				break;
			
			case 3:
				System.out.println("Por favor, indique los dos números separados con un enter.");
				num1 = Leer.datoDouble();
				num2 = Leer.datoDouble();
				result = num1 * num2;
				System.out.printf("El resultado de la multiplicación %.2f x %.2f es: %.2f.\n",num1,num2,result);
				break;
				
			case 4:
				System.out.println("Por favor, indique los dos números separados con un enter.");
				num1 = Leer.datoDouble();
				num2 = Leer.datoDouble();
				if(num2 == 0) {
					System.out.println("Lo sentimos, no es posible realizar la operación.");
					}else {
					result = num1 / num2;
					System.out.printf("El resultado de la división %.2f / %.2f es: %.2f.\n",num1,num2,result);
					}
				break;
				
			case 5:
				System.out.println("Por favor, indique el número a comprobar.");
				num1 = Leer.datoDouble();
				if(num1%cociente == 0)
					System.out.printf("Su número %.2f es par.\n", num1);
				else
					System.out.printf("Su número %.2f es impar.\n", num1);
				break;
				
			case 0: break;
				
			default: 
				System.out.println("Lo sentimos, esta opción no es válida.");
				
			}
			
		}while(opcion != cero);
			System.out.println("Gracias por utilizar el programa.");
	
	}

}
