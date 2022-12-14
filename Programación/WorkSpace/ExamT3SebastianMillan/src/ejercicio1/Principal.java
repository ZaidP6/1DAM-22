package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		Pasteleria tarta;
		String sabor;
		int tam=7, eleccionExtra=0, opcion=0, cero=0, hasta=0, desde=0, cambiarDia=0, cambiarTartas=0;
		double precioLitro=0.0, volumen=0.0, porcenGan=0.0, costeExtra=0.0;
		boolean extraNormal;
		int [] cantTartas= new int[tam];
		
		System.out.println("---------------------------------------");
		System.out.println("BIENVENIDO AL PROGRAMA DE LA PASTELERÍA");
		System.out.println("---------------------------------------");
		System.out.println("---Vamos a crear una tarta---");
		System.out.println("Indica el sabor de la tarta:");
		sabor=Leer.dato();
		System.out.println("Indica el precio (en euros) del litro de masa para hacer la tarta:");
		precioLitro=Leer.datoDouble();
		System.out.println("Indica el volumen (en litros) que se usa para hacer una tarta:");
		volumen=Leer.datoDouble();
		System.out.println("Pulse 1 si quiere agregar adornos extra/Pulse 0 para no agregar nada extra");
		eleccionExtra=Leer.datoInt();
		if(eleccionExtra==cero) {
			extraNormal=false;
		}else {
			extraNormal=true;
		}
		tarta= new Pasteleria(sabor, precioLitro, volumen, extraNormal, cantTartas);
		do {
			System.out.println("---------------");
			System.out.println("MENÚ PASTELERÍA");
			System.out.println("---------------");
			System.out.println("1 - Introducir aleatoriamente tartas terminadas en una semana");
			System.out.println("2 - Calcular precio fabricación");
			System.out.println("3 - Calcular precio de venta");
			System.out.println("4 - Comprobar extra añadido");
			System.out.println("5 - Calcular total de tartas en la semana");
			System.out.println("6 - Modificar cantidad tartas un día");
			System.out.println("7 - Calcular media de tartas");
			System.out.println("8 - Mostrar datos de la tarta *EXTRA*");
			System.out.println("0 - Salir");
			opcion=Leer.datoInt();
			switch(opcion) {
				case 1:
					System.out.println("Introduce desde qué cantidad vamos a hacer tartas al día:");
					desde=Leer.datoInt();
					System.out.println("Introduce hasta qué cantidad vamos a hacer tartas al día:");
					hasta=Leer.datoInt();
					tarta.rellenarTartas(hasta, desde);
					tarta.imprimirTartas();
					break;
				case 2:
					tarta.calcularPrecioFab();
					tarta.imprimirPrecioFab();
					break;
				case 3:
					System.out.println("Indica el porcentaje de ganancia que desea aplicarle a las tartas:");
					porcenGan=Leer.datoDouble();
					tarta.calcularPrecioVent(porcenGan);
					tarta.imprimirPrecioVent(porcenGan);
					break;
				case 4:
					if(extraNormal) {
						System.out.println("Indica cuánto es el coste del extra de la tarta:");
						costeExtra=Leer.datoDouble();
					}
					tarta.calcularExtra(porcenGan, costeExtra);
					tarta.imprimirExtra(porcenGan, costeExtra);
					break;
				case 5:
					tarta.calcularTotalTartas();
					tarta.imprimirTotalTartas();
					break;
				case 6:
					System.out.println("Indica qué día quieres modificar las tartas terminadas:");
					cambiarDia=Leer.datoInt();
					System.out.println("¿Cuántas tartas se hicieron ese dia entonces?");
					cambiarTartas=Leer.datoInt();
					tarta.cambiarDiaTarta(cambiarDia, cambiarTartas);
					tarta.imprimirTartas();
					break;
				case 7:
					tarta.calcularMediaTartas();
					tarta.imprimirMediaTartas();
					break;
				case 8:
					System.out.println(tarta);
					break;
				case 0:
					System.out.println("Saliendo del programa");
					break;
				default:
					System.out.println("Número del menú introducido erróneo");
					break;
			}
		}while(opcion!=cero);
		System.out.println("--------------------------------");
		System.out.println("Gracias por utilizar el programa");
	}
}
