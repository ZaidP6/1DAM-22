package prueba1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//VARIABLES
		
		double nivelEndeu;
		double deuda1;
		double deuda2;
		double ingreso = 1200;
		double conv1 = 100;
		int limiteEnd = 30;
		int edad;
		String nombre;
		String apellidos;
	
		
		//PROGRAMA
		
		System.out.println("Bienvenido al programa para saber si el banco le aceptará el préstamo.\nPor favor, introduzca su nombre.");
		nombre = Leer.dato();
		
		System.out.println("Por favor, introduzca sus apellidos.");
		apellidos = Leer.dato();
		
		System.out.println("Por favor, introduzca su edad.");
		edad = Leer.datoInt();
		
		System.out.println("Para continuar necesitaremos pedirle algunos datos más.\n¿Cuánto paga al mes de hipoteca?");
		deuda1 = Leer.datoDouble();
		
		System.out.println("¿Cuánto paga al mes por el coche?");
		deuda2 = Leer.datoDouble();
		
		
		nivelEndeu = (deuda1 + deuda2) / ingreso * conv1;
		
		System.out.println("--------------------------------------------");
		System.out.printf("Nombre: \t%s\nApellidos: \t%s\nEdad: \t\t%s\n",nombre, apellidos, edad);
		System.out.println("--------------------------------------------");
		System.out.printf("Ingresos: \t%.2f€\nHipoteca: \t%.2f€\nCoche: \t\t%.2f€\n", ingreso, deuda1, deuda2);
		System.out.println("--------------------------------------------");
		System.out.printf("Teniendo en cuenta los datos, su nivel de endeudamineto es de %.2f.\n",nivelEndeu);
		System.out.printf("Lamentamos decirle que si este dato supera los %d, el banco no le admitirá la solicitud del préstamo.\n"
				+ "En el caso contrario y sea < ó = a %d, el banco aceptará la petición.\n", limiteEnd,limiteEnd);
		System.out.printf("Esperemos que tenga un buen día Sr.%s.",apellidos);
		
		
	}

}
