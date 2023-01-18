package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] monedas; 
		int semanas=0;
		int max = 0;
		int min = 0;
		int opcion = 0;
		int hasta = 0,desde=0,uno = 1, cero = 0;
		String sem = "semana", mon = "moneda";
		int suma = 0;
		int media =0;
		int ahorro = 0;
		int conv1 = 100;
		
		
		System.out.println("***************************************************************************");
		System.out.println("BIENVENIDO A TU HUCHA VIRTUAL.");
		Random num = new Random (System.nanoTime());
		monedas = new int [semanas];
		
	do {	
		
		
	
		System.out.println("***************************************************************************");
		System.out.println("Opción 1: generar número monedas ahorradas.");
		System.out.println("Opción 2: ver monedas de cada semana.");
		System.out.println("Opción 3: ver el total ahorrado.");
		System.out.println("Opción 4: ver la semana que más se ha ahorrado.");
		System.out.println("Opción 5: ver media ahorro semanal.");
		System.out.println("Opción 6: modificar cantidad ahorrada en una semana.");
		System.out.println("Opción 7: ver media de la familia.");
		System.out.println("Opción 8: ver porcenataje ahorro.");
		System.out.println("Pulse 0 si desea salir.");
		System.out.println("***************************************************************************");
		
		
		System.out.println("Introduzca la opción que desaea hacer.");
		opcion = Leer.datoInt();
		
		
		switch (opcion) {
		
			case 1: 
				System.out.println("¿Durante cuántas semanas vas a ahorrar?");
					semanas = Leer.datoInt();
				System.out.println("Introduzca el mínimo de monedas que va a meter.");
					desde = Leer.datoInt();
					System.out.println("Introduzca el máximo de monedas que va a meter.");
					hasta = Leer.datoInt();
				monedas= new int [semanas];
				
				for (int i = 0; i < monedas.length; i++) {
					
					monedas[i] = num.nextInt(hasta -desde + uno)+desde;
					System.out.println("Semana "+(i+uno)+": "+monedas[i]);
				}
				
				break;
				
			case 2:
				
				for (int i = 0; i < monedas.length; i++) {
					System.out.println(sem+"\t\t"+mon);
					System.out.println(i+1+"\t\t"+monedas[i]);
					
				}
				break;
					
			case 3:
				suma = 0;
				for (int i = 0; i < monedas.length; i++) {
					suma = suma + monedas[i];					
				}
				System.out.println("La suma de todas la monedas es de: "+suma+"€.");
				break;
				
			case 4: 
				min = 0;
				max = 0;
				
				for (int i = 0; i < monedas.length; i++) {
					if (monedas[i]<monedas[min]) {
						min = i;
					}
					if (monedas[i]>monedas[max]) {
						max = i;
					}
					
				}
				System.out.println("La semana que más has ahorrado es la "+(max+1));
				System.out.println("La semana que mennos has ahorrado en la "+(min+1));
				
				break;
			case 5: 
				suma = 0;
				for (int i = 0; i < monedas.length; i++) {
					suma = suma + monedas[i];					
				}
				
				media = suma/monedas.length;
				if (monedas.length == cero) {
					System.out.println("Lo siento, ha habido un error.");
				}else {
					System.out.println("La media sería "+media);
					}
				break;
				
			case 6:
				
				System.out.println("¿Qué semana desea modificar?");
				semanas = Leer.datoInt();
				System.out.println("¿Por qué valor desea modificarlo?");
				monedas[semanas-1] = Leer.datoInt();

				for (int i = 0; i < monedas.length; i++) {
					System.out.println(sem+"\t\t"+mon);
					System.out.println(i+1+"\t\t"+monedas[i]);
					
				}
				
				break;
				
			case 7:
				for(int i = 0; i < monedas.length; i++) {
					if(monedas[i]>50)
						System.out.println("Semana "+(i+1));
				}
				
				break;
				
			case 8:
				media = 50;
				System.out.println("¿De que semana desea ver el porcentaje de ahorro?");
				semanas = Leer.datoInt();
				ahorro = ((monedas[semanas-1])*conv1) / media;
				System.out.println("El ahorro de la semana "+semanas+ " es de:"+ahorro+"%.");
				
				
		}
				
			
	} while (opcion != 0);
	
	System.out.println("Gracias por usar el programa.");
	
	
	
	
	}

}

