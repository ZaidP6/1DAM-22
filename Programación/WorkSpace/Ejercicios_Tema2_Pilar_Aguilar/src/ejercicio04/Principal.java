package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero1;
		int numero2 = 2;
		int resto;
		int cero = 0;
		
		
		
		System.out.println("Bienvenido.\nCalculemos si un número es par o no.");
		System.out.println("Introduce un número entero por favor.");
		numero1 = Leer.datoInt();
		
		resto = numero1%numero2;
		
		if (resto == cero) {
			System.out.printf("Estupendo, el número %d es par.",numero1);
		}
		else {
			System.out.printf("Lo sentimos, el número %d es impar.",numero1);
		}
		
		
	}

}
