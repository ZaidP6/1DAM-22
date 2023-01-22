package ejercicio6;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		/*
		 6. Este ejercicio debería ser mucho más complejo, pero solo debemos hacer lo que se pide, aunque
		en alguna ocasión tenga menos sentido o falten cosas por hacer. Se trata de implementar un
		programa para gestionar un cine con una sola sala.
		Cada Entrada (una de las clases) de cine tendrá un número identificativo, precio, si está libre u
		ocupada, número de la fila y de butaca. Todas las funcionalidades estarán en la clase Sala, que
		estará caracterizada por número identificador, número total de localidades, un objeto tipo Entrada y
		un array de localidades (tipo Entrada).
		Se darán al usuario las siguientes opciones en un switch:
			• Ver cartelera que mostrará el título de la película proyectada.
			• Comprar una entrada comprobando si una localidad está vendida ya anteriormente.
			Todas las entradas valen lo mismo. En este caso, solo hay que mirar si su atributo "libre"
			es verdadero o falso, sin preocuparnos por nada más. Al acabar una venta habrá que
			pasar esa entrada a ocupada.
			• Calcular ganancias totales del día. Para ello al final de cada compra habrá que sumar la
			cantidad en el lugar que se haya habilitado para llevar el dinero total en caja.
			• Modificar el precio de una entrada.
			• Alguno más que se te ocurra.
		*/
		
		String codigo;
		int opcion=0, tam=0, opcionOcup=0, uno=1;
		double gananciaTotal=0.0, precio=0.0;
		Entrada [] localidades;
		Sala crudSala;
		
		System.out.println("------------------------------------------");
		System.out.println("BIENVENIDO AL PROGRAMA DE GESTIÓN DEL CINE");
		System.out.println("------------------------------------------");
		System.out.println("¿Cuántas localidades hay en la sala?");
		tam=Leer.datoInt();
		localidades= new Entrada[tam];
		crudSala= new Sala("cod1a",localidades.length,localidades);
		crudSala.cargarEntradas();
		do {
			System.out.println("------");
			System.out.println(" MENU");
			System.out.println("------");
			System.out.println("1 - Ver cartelera");
			System.out.println("2 - Comprar entrada");
			System.out.println("3 - Calcular ganancia del día");
			System.out.println("4 - Modificar precio de una entrada");
			System.out.println("5 - Cancelar entrada ya vendida");
			System.out.println("6 - Listar localidades ocupadas o libres");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 1:
					crudSala.imprimirCartelera();
					break;
				case 2:
					crudSala.imprimirLocalidades();
					System.out.println("Introduce el código de la entrada que desea comprar:");
					codigo=Leer.dato();
					crudSala.comprarEntrada(crudSala.findByID(codigo));
					break;
				case 3:
					gananciaTotal= crudSala.calcularGananciaTo(crudSala.findByOcup(true));
					System.out.printf("Ganancia entradas vendidas: %.2f",gananciaTotal);
					break;
				case 4:
					System.out.println("Indique el código de la entrada a modificar su precio:");
					codigo=Leer.dato();
					System.out.println("Indique el nuevo precio a modificar:");
					precio=Leer.datoDouble();
					crudSala.editPrecio(crudSala.findByIDV2(codigo), precio);
					break;
				case 5:
					System.out.println("Indique el código de la entrada a cancelar:");
					codigo=Leer.dato();
					crudSala.cancelEntr(crudSala.findByID(codigo));
					break;
				case 6:
					System.out.println("Indique 1 si quiere listar las localidades ocupadas o pulse 0 si quiere listar las libres:");
					opcionOcup=Leer.datoInt();
					if(opcionOcup==uno) {
						crudSala.imprimirLista(crudSala.findByOcup(true));
					}else {
						crudSala.imprimirLista(crudSala.findByOcup(false));
					}
					break;
				case 0:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Número introducido incorrecto");
					break;
			}
		}while(opcion!=0);
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
	}

}
