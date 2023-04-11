package ejercicio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double saldo = 0;
		Scanner sc = new Scanner(System.in);
		
		try {
			Tarjeta tarjeta1 = new Tarjeta();
			tarjeta1.setSaldo(-0.01);
		} catch (RuntimeException ex1) {
			System.out.println(ex1.getMessage());
		}
		
		System.out.println("Introduzca la cantidad que tiene en la tarjeta");
		saldo = sc.nextDouble();
		
		System.out.println("Susaldo actual es de "+saldo+"€.");
	}

}
