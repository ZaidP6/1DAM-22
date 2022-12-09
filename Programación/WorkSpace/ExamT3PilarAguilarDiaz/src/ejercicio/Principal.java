package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sabor, puesto;
		double precioLitro = 0.0, volumen = 0.0, precioTarta = 0.0, cantExtra = 0.0, mediaSem = 0.0, porcentajeGanancia = 0.0;
		boolean extra = true;
		int hasta = 0, desde = 0, puntoExtra = 0, uno = 1, op = 0, dia = 0;
		int [] cantSemana;
		
		System.out.println("BIenvenidos a la pastelería.");
		
		System.out.println("Por favor, introduzca el sabor de la tarta.");
		sabor = Leer.dato();
		System.out.println("Por favor, introduzca el puesto de la tarta (chocolate, fresa, limón, etc).");
		puesto = Leer.dato();
		System.out.println("Por favor, introduzca 1 si quiere que la tarta lleve extra y 0 si no quiere.");
		puntoExtra = Leer.datoInt();
		
		if(puntoExtra == uno) {
			extra = true;
		}else {
			extra =  false;
		}
		
		System.out.println("Por favor, indique el precio/litro.");
		precioLitro = Leer.datoDouble();
		System.out.println("Por favor, indique el volumen de las tartas.");
		volumen = Leer.datoDouble();
		Random aleatorio = new Random();
		
		
		Pasteleria past = new Pasteleria();
		
		do {
			System.out.println("*****************************************************************");
			System.out.println("Por favor, elija entre estas opciones");
			System.out.println("1 - Rellenar array de tartas.");
			System.out.println("2 - Calcular precio fabricación.");
			System.out.println("3 - Calcular el precio de venta.");
			System.out.println("4 - Aplicar extra.");
			System.out.println("5 - Calcular total de tartas en 1 semana.");
			System.out.println("6 - Modificar la cantidad de tartas de un día.");
			System.out.println("7 - Calcular la media de tartas fabricadas en 1 semana.");
			System.out.println("0 - Pulse 0 para salir del programa.");
			System.out.println("*****************************************************************");
			
			op = Leer.datoInt();
			
			switch(op) {
				
			case 1:
				System.out.println("Por favor, indique el mínimo de tartas a fabricar en un día.");
				desde = Leer.datoInt();
				System.out.println("Por favor, indique el máximo de tartas a fabricar en un día.");
				hasta = Leer.datoInt();
				
				past.rellenarCantTartas(hasta, desde);
				
				//System.out.print("Dia 1: "+cantSemana[0]+ "tartas.\n");
				break;
				
			case 2:
				
				past.calcularPreFab(precioTarta);
				System.out.printf("Cuesta %.2f€ fabricar una tarta.\n",precioTarta);
				break;
				
			case 3:
				System.out.println("Por favor, indique el porcentaje de beneficio");
				porcentajeGanancia = Leer.datoDouble();
				//past.calcularPrecioVenta(porcentajeGanancia);
				
				//System.out.printf("El precio de venta al público es de %.2f€.\n", pvp);
				
			case 4:
				
				if(extra) {
					past.ponerExtra(cantExtra);
				}
				System.out.printf("La tarta con el extra costará %.2f€.\n", precioTarta);
				break;
				
			case 5: 
				
				
				break;
			case 6: 
				
				System.out.println("¿Qué día desea modificar?");
				dia = Leer.datoInt();
				
				
				break;
				
			case 7:
				
				past.calcularMediaSem(dia);
				
				System.out.printf("La media de tartasm de toda la semana es de %.2f tartas por día.", mediaSem);
				break;
			}
			
		}while (op != 0);
			System.out.println("Gracias por visitar la pastelería.");
	}
}