package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 0, salida = 0;
		String []producto;
		double[] precio;
		
		System.out.println("Bienvenido");
		do {
			System.out.println("¿cuantos priductos tiene?");
			tam = Leer.datoInt();
			producto = new String[tam];
			precio = new double[tam];
			
			for(int i = 0; i<producto.length;i++) {
				System.out.println("nombre productos");
				producto[i]= Leer.dato();
			}
			for(int i = 0; i<precio.length;i++) {
				System.out.println("precio productos");
				precio[i]= Leer.datoDouble();
			}
			System.out.println("\n");
			for(int i = 0; i<producto.length;i++) {
				System.out.printf("%s\t",precio[i]);
			}
			System.out.println(" ");
			for(int i = 0; i<precio.length;i++) {
				System.out.printf("%.2f€\t",precio[i]);
			}
			System.out.println("\n");
			System.out.println("Pulse 0 para salir o cualquier número");
			salida = Leer.datoInt();
		}while(salida==0);
			System.out.println("Gracias por usar el programa");
			
	}

}
