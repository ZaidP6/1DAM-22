package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Muestra los valores de un array con números double, por ejemplo, precios o pagos de algo, 
		 * imprimiendo también la cabecera de dichos valores. Las cabeceras deben estar en otro array de String, 
		 * por ejemplo:
			Enero febrero marzo
			1200.55 2500.45 800.50*/

		int tam = 0, salida = 0;
		String []producto;
		double[] precio;
		
		System.out.println("Bienvenido");
		do {
			System.out.println("¿Cuántos productos tiene?");
			tam = Leer.datoInt();
			producto = new String[tam];
			precio = new double[tam];
			
			//para pedir nombre del producto
			
			for(int i = 0; i<producto.length;i++) {
				System.out.println("nombre productos");
				producto[i]= Leer.dato();
			}
			
			//para pedir precio del producto
			
			for(int i = 0; i<precio.length;i++) {
				System.out.println("precio productos");
				precio[i]= Leer.datoDouble();
			}
			System.out.println("\n");
			
			//te muestra el nombre del producto
			
			for(int i = 0; i<producto.length;i++) {
				System.out.printf("%s\t",producto[i]);
			}
			System.out.println(" ");
			
			//te muestra el precio del producto
			
			for(int i = 0; i<precio.length;i++) {
				System.out.printf("%.2f€\t",precio[i]);
			}
			System.out.println("\n");
			System.out.println("Pulse 0 para salir o cualquier número para volver a hacerlo");
			salida = Leer.datoInt();
			
		}while(salida != 0);
			System.out.println("Gracias por usar el programa");
			
	}

}
