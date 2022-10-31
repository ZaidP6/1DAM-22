package ejercicio10;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double precioFinal;
		double descuento = 20;
		double cant = 4;
		double conv = 100;
		double precioPro;
		
		System.out.println("Bienvenido. Vamos a calcular el precio de un producto con un descuento adicional.");
		System.out.println("¿Cuánto vale su producto?");
		
		precioPro = Leer.datoDouble();
		precioFinal = (precioPro * cant) * descuento / conv;
		
		
		System.out.printf("El precio del producto con el descuento se quedaría en %.2f€\n", precioFinal);
		System.out.println("Gracias por usar nuestro programa. Hasta la próxima.");
	}

}
