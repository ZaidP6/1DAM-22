package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		
		double distancia;
		double consumoL;
		double precioGaso;
		double dineroGastado;
		double conv =100;
		double consumoViaje;
		double conv2 = 1;
		
		
		//PROGRAMA
		
		System.out.println("Bienvenidos.\nHoy vamos a calcular lo que se gasta en gasolina según el consumo del coche.\n¿Cuántos km has recorrido?");
		distancia = Leer.datoDouble();
		
		System.out.println("¿Qué consumo has tenido en esos "+distancia+"km?");
		consumoL = Leer.datoDouble();
		
		System.out.println("¿Qué precio tiene la gasolina ahora? ");
		precioGaso = Leer.datoDouble();
		
		System.out.println("Teniendo esos 3 datos podemos calcular el dinero exacto que has podido gastar en el viaje.");
		consumoViaje = (distancia*consumoL)/conv;
		
		System.out.printf("Has tenido un consumo de %.2f litros en los %.2fkm que has hecho.\n", consumoViaje, distancia);
		dineroGastado = (consumoViaje * precioGaso) / conv2;
		
		System.out.printf("Por tanto, te ha costado %.2f€ realizar esos %.2fkm.\nGracias por usar nuestro programa.\nHasta la próxima.", dineroGastado, distancia);
	}

}
