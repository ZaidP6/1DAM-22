package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cantRetiro;
		double cantBanco;
		double restBanco;
		
		System.out.println("Bienvenido al banco central.");
		
		System.out.println("¿Cuánto dinero tiene en la cuenta?");
		cantBanco = Leer.datoDouble();
		
		System.out.println("¿Cuánto quiere retirar?");
		cantRetiro = Leer.datoDouble();
		
		restBanco = cantBanco - cantRetiro;
		
		if(cantRetiro > cantBanco) {
			System.out.println("Lo sentimos, no puede retirar una cantidad mayor de lo que tiene.");
			
		}
		
		else {
			System.out.printf("Perfecto, ha retirado %.2f€.\nSu saldo altual es de %.2f€.\nQue tenga un buen día.", cantRetiro, restBanco);
		}
		
	}

}
