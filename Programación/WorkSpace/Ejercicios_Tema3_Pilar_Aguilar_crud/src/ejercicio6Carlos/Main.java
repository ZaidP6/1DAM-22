package ejercicio6Carlos;

import utilidades.Leer;

public class Main {

	public static void main(String[] args) {

		int numIdenEntrada = 0, numFila = 0, numButaca = 0, tam = 0, op = 0;
		double precioEntrada = 0;
		boolean isLibre = false;
		Entrada[] localidades;
		Sala cine;

		
		System.out.println("Indique la capacidad de la sala");
		tam = Leer.datoInt();
		
		localidades = new Entrada[tam];
		
		System.out.println("Indique el precio de una entrada");
		precioEntrada = Leer.datoDouble();
		cine = new Sala(1, localidades.length, localidades);
		cine.cargarEntradas();
		
		do {
			System.out.println("MENU CON BOTONES");
			System.out.println("1. Ver cartelera");
			System.out.println("2. Comprar entrada");
			System.out.println("3. Calcular ganancia del día");
			System.out.println("4. Modificar el precio de la entrada");
			System.out.println("5. Cancelar entrada ya vendida");
			System.out.println("6. Listar localidades ocupadas");
			System.out.println("0. Pulse 0 para salir");
			op=Leer.datoInt();
			switch (op) {
			case 1:
				cine.imprimirCartelera();
				break;
			case 2:
				
			default:
				System.out.println("Te has equivocado");
				break;
			}
			
		}while(op!=0);
		System.out.println("Se cierra el programa");
		
	}

}
