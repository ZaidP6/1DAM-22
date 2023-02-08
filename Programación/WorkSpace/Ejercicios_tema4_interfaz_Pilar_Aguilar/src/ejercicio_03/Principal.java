package ejercicio_03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3. Construir una clase ArrayReales que declare un atributo de tipo double[] num, lo rellene aleatoriamente y
		que implemente una interfaz llamada Estadisticas. El contenido de esta interfaz es el siguiente:
		public interface Estadisticas {
		double calcularMinimo( );//Devuelve el menor número del array
		double calcularMaximo( );//Devuelve el mayor número en el array
		double calcularSumatorio( );//Devuelve la suma de los elementos del array
		}*/
		
		int tam=0, op=0;
		
		ArraysReales [] num;
		
		System.out.println("Indique qué tamaño va a tener el array");
		tam=Leer.datoInt();
		
		num = new ArraysReales [tam];
		
		do {
			System.out.println("1-Para rellenar Array");
			System.out.println("2-Para calcular número mínimo");
			System.out.println("3-Para calcular número máximo");
			System.out.println("4 Para calcular suma");
			op=Leer.datoInt();
			
			switch(op) {
			
				case 1:
					
					for (int i = 0; i < num.length; i++) {
						num[i].rellenarArray();
					}
					break;
					
				case 2:
					for (int i = 0; i < num.length; i++) {
						num[i].calcularMinimo();
					}
					break;
				
				case 3:
					for (int i = 0; i < num.length; i++) {
						num[i].calcularMaximo();
					}
					
				case 4:
					for (int i = 0; i < num.length; i++) {
						num[i].calcularSumatorio();
					}
					break;
					
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
					
				default:
					System.out.println("Error");
					break;
			}
			
		}while (op!=0);
	}

}
