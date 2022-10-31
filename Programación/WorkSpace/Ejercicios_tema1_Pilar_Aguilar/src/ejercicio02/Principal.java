package ejercicio02;

public class Principal {

	public static void main (String[]args) {
		
		/*datos:
		 * area = b · h = 50m · 21m
		 * profundidad = 2.5m
		 * m3 = 1.8€ 
		 * area, litros, precio
		 * 10 litros caben en 1m2 - 1000L en 1m3
		 */
		
		//VARIABLES
		double largo = 50;
		double ancho = 21;
		double area;
		double profundidad = 2.5;
		double precioM3 = 1.8;
		double precioTotal;
		double cantLitros;
		double volumen;
		double conv = Math.pow(10, 3);
		
		
		//PROGRAMA
		
		area = largo * ancho;
		volumen = area * profundidad;
		cantLitros = volumen * conv;
		precioTotal = volumen * precioM3;
		
		
		System.out.printf("El área de la piscina es de %.0fm^2.\n", area);
		System.out.printf("La piscina tiene un volumen de %.0fm^3.\n", volumen);
		System.out.printf("Hacen falta %.0fL para llenar la piscina.\n", cantLitros);
		System.out.printf("Costaría llenar la piscina %.0f€.",precioTotal);
		/*
		 *  System.out.println("El área de la piscina es de "+area+"m^2.\n");
		 *  System.out.println("La piscina tiene un volumen de "+volumen+"m^3.\n");
			System.out.println("Hacen falta "+cantLitros+"L para llenar la piscina.");
		 */
		
		
		
		
		
		
	}

}
