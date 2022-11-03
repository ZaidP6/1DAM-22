package ejercicio05;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int sala=0, entradas=0, opcion=1;
		double precio1=2.5, precio2=3.5, precio3=4.5, precio4=5.5, total=0;
		System.out.println("Hola, Bienvenido a Cines 'El Ruedas'");
		do {
		System.out.println("Nº Sala\t\t\t   Precio");
		System.out.println("***********");
		System.out.printf("Sala 1 (Infantil) -------- %.2f€\n",precio1);
		System.out.printf("Sala 2 (Normal) ---------- %.2f€\n",precio2);
		System.out.printf("Sala 3 (Sala 3D) --------- %.2f€\n",precio3);
		System.out.printf("Sala 4 (Sala VIP) -------- %.2f€\n",precio4);
		System.out.println("***********");
		System.out.println("¿A qué sala quieres ir?");
		sala=Leer.datoInt();
		switch (sala) {
		case 1:
			System.out.println("¿Cuántas entradas quieres?");
			entradas=Leer.datoInt();
			total=entradas*precio1;
			System.out.printf("El total a pagar es de %.2f€\n", total);
			break;
		case 2:
			System.out.println("¿Cuántas entradas quieres?");
			entradas=Leer.datoInt();
			total=entradas*precio2;
			System.out.printf("El total a pagar es de %.2f€\n", total);
			break;
		case 3:
			System.out.println("¿Cuántas entradas quieres?");
			entradas=Leer.datoInt();
			total=entradas*precio3;
			System.out.printf("El total a pagar es de %.2f€\n", total);
			break;
		case 4:
			System.out.println("¿Cuántas entradas quieres?");
			entradas=Leer.datoInt();
			total=entradas*precio4;
			System.out.printf("El total a pagar es de %.2f€\n", total);
			break;
		default:
			System.out.println("No hay más salas");
		}
		System.out.println("***********");
		System.out.println("Si quiere otra sala pulse cualquier número o pulse 0 para salir");
		opcion=Leer.datoInt();
}while (opcion!=0);
	System.out.println("Gracias por usar el programa");
	}}