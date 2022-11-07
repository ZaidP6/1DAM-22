package ejercicio14;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Haga un programa de la interfaz de un cajero automático. Tendrá las opciones, ver saldo,
		retirar dinero, comprar entradas e ingresar dinero. En cada opción se pedirán los datos
		necesarios y se realizarán las operaciones adecuadas. El coste de las entradas se debe restar al
		saldo de dicha cuenta. La cuenta será creada por nosotros con un saldo inicial concreto. */
		
		//variables
		
		int opcion = 0;
		int cero = 0;
		int cantEntrada;
		double saldo = 15000;
		double cantRetirada;
		double cantIngreso;
		double precioEntrada = 36.42;
		double totalEntrada;
		
		
		
		
		
		//programa
		
		System.out.println("****************************************");
		System.out.println("    Bienvenido al cajero automático");
		System.out.println("****************************************");
		
		do {
			System.out.println("Por favor, elija una opción");
			System.out.println("1 - Ver saldo actual.");
			System.out.println("2 - Retirar dinero.");
			System.out.println("3 - Ingresar dinero.");
			System.out.println("4 - Comprar entradas");
			System.out.println("0 - Salir");
			System.out.println("****************************************");
			
			opcion = Leer.datoInt();
			
			switch (opcion) {
			
				case 1:
					System.out.printf("El saldo de la cuenta es %.2f€.\n", saldo);
					break;
					
				case 2:
					System.out.println("¿Qué cantidad desea retirar?");
					cantRetirada = Leer.datoDouble();
					
					if(cantRetirada>saldo) {
						System.out.println("Lo sentimos, saldo insuficiente.");
					
					}else {saldo = saldo - cantRetirada;
					System.out.printf("Ha retirado %.2f€, su saldo actual es de %.2f€.\n\n", cantRetirada, saldo);
					}	
					break;
					
				case 3:
					System.out.println("¿Qué cantidad desea ingresar?");
					cantIngreso = Leer.datoDouble();
					saldo = saldo + cantIngreso;
					System.out.printf("Ha ingresado %.2f. Su saldo actual es de %.2f€\n", cantIngreso, saldo);
					break;
					
				case 4:
					System.out.println("¿Cuántas entradas quiere comprar?");
					cantEntrada = Leer.datoInt();
					totalEntrada= cantEntrada * precioEntrada;
					saldo = saldo - totalEntrada;
					System.out.printf("Ha comprado %d entradas por un total de %.2f€. Su saldo actual es de %.2f€.\n",cantEntrada,totalEntrada,saldo);
					break;
			}
			
			System.out.println("****************************************");
			System.out.println("Para salir pulse 0. Para continuar pulse cualquier otro número.");
			opcion = Leer.datoInt();
			
		}while (opcion != cero);
		
		
		System.out.println("Gracias por usar el cajero.");
		
	}

}
