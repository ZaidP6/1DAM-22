package ejercicio02;


import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int monedasSem[] = null;
		int tam = 0, hasta= 0, desde = 0, op= 0, max = 0, sem = 0, semSup = 0;
		double media = 0.0, ahorro = 0.0, suma = 0.0;
		
		
		
		
		System.out.println("Bienvenido al programa ahorrador");
		
		
		
		Random rd = new Random (System.nanoTime());
		
		
		do {
			imprimirMenu();
			System.out.println("Por favor, elija una opción.");
			op = Leer.datoInt();
			System.out.println("*******************************************************");
			
			switch (op) {
				case 1:
					
					System.out.println("Durante cuántas semanas quiere ahorrar?");
					tam = Leer.datoInt();
					monedasSem = new int [tam];
					
					System.out.println("Indique el número mínimo de monedas que va a introducir");
					desde = Leer.datoInt();
					System.out.println("Indique el número máximo de monedas que va a introducir");
					hasta = Leer.datoInt();
					for (int i = 0; i < monedasSem.length; i++) {
							monedasSem[i]= rd.nextInt(hasta-desde+1)+desde;
					}
					break;
	
				case 2:
					
					System.out.println("Semana\tMonedas");
					for (int i = 0; i < monedasSem.length; i++) {
						System.out.println((i+1)+"\t"+monedasSem[i]);
					}
					break;
				
				case 3:
					for (int i = 0; i < monedasSem.length; i++) {
						suma += monedasSem[i];
					}
					System.out.printf("La suma de todas las semanas es de: %.0f€\n", suma);
					break;
			
				case 4:
					
					max = 0;
					
					for (int i = 0; i < monedasSem.length; i++) {
						if (monedasSem[max] < monedasSem[i]) {
							max = i;
						}
						
					}
					System.out.println("La semana "+(max+1)+" se ha ahorrado "+monedasSem[max]+"€.");
					break;
					
				case 5: 
					
					media = suma / tam;
					
					System.out.printf("La media de euros ahorrados a la semana es de %.2f€.\n", media);
					
					break;
					
				case 6:
					System.out.println("Indique qué semana desea modificar");
					sem = Leer.datoInt();
					System.out.println("Indique el dato nuevo");
					monedasSem[sem-1] = Leer.datoInt();
					
					System.out.println("Semana\tMonedas");
					for (int i = 0; i < monedasSem.length; i++) {
						System.out.println((i+1)+"\t"+monedasSem[i]);
					}
					break;
					
				case 7:
					for (int i = 0; i < monedasSem.length; i++) {
						if (monedasSem[i]>50) {
							semSup += +1;
						}
					}
					System.out.println("Se ha superado los 50€ en "+semSup+" semanas.");
					break;
					
				case 8:
					System.out.println("¿Qué semana desea ver el porcentaje de ahorro?");
					sem = Leer.datoInt();
					ahorro = monedasSem[sem-1]*100/50;
						
					System.out.println("La semana "+sem+" se ha ahorrado un "+ahorro+"%.");
					
				case 0:
					
					break;
			
		}
			
			
			
		}while(op!=0);
		
		System.out.println("Gracias por usar el programa.");
	}

		public static void imprimirMenu() {
			System.out.println("*******************************************************");
			System.out.println("1 - Rellenar array");
			System.out.println("2 - Mostrar datos");
			System.out.println("3 - Mostrar total ahorrado");
			System.out.println("4 - Semana que más se ha ahorrado y cuánto");
			System.out.println("5 - Mostrar la media de ahorro semanal");
			System.out.println("6 - Modificar una semana");
			System.out.println("7 - Cantidad de semanas con valor superado");
			System.out.println("8 - Porcentaje de ahorro a elegir");
			System.out.println("0 - Salir");
			System.out.println("*******************************************************");
		}
	
}
