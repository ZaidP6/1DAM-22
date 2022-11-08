package ejercicio05_bis2;

import utilidades.Leer;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Solicitar al usuario que introduzca por teclado el tamaño del array.
		• Declarar y definir el array de enteros.
		• Rellenar el array mediante números aleatorios entre los dos valores que diga el usuario.
		• Mostrar por pantalla la suma de todos los elementos.
		• Mostrar el mayor y el menor guardados en el array.
		• Modificar un valor elegido por el usuario*/
		
		int tam = 0;
		int [] aleatorio;
		int desde = 0;
		int hasta = 0;
		int uno = 1;
		int suma = 0;
		int mayor = 0;
		int menor = 0;
		int op = 0;
		
		Random num = new Random (System.nanoTime());
		
		System.out.println("*********************************************");
		System.out.println("Bienvenido al programa del ejercicio 05.");
		System.out.println("*********************************************");
		
		System.out.println("Por favor introduzca el tamaño del array.");
		tam = Leer.datoInt();
		
		aleatorio = new int [tam];
		System.out.println("*********************************************");
		
		System.out.println("Por favor introduzca el valor mínimo del array.");
		desde = Leer.datoInt();
		System.out.println("Por favor introduzca el valor máximo del array.");
		hasta = Leer.datoInt();
		
		System.out.println("*********************************************");
		//definimos el array
		for (int i = 0; i < aleatorio.length; i++) {
			aleatorio[i] = num.nextInt(hasta -desde + uno)+desde;
			
			System.out.println("Número "+ (i + uno)+": "+aleatorio[i]);
		}
		
		System.out.println("*********************************************");
		
		
		//calculamos la suma de los números del array
		for (int i = 0; i < aleatorio.length; i++) {
			suma = suma + aleatorio[i];
			
			}
			
		System.out.println("La suma de los valores de array es: "+suma);
		System.out.println("*********************************************");
		menor = aleatorio[0];
		mayor = aleatorio[0];
			
			
		for (int i = 0; i > aleatorio.length; i++) {
			if (mayor> aleatorio[i]) {
				mayor = aleatorio[i];
			}
			
			if (menor < aleatorio[i]) {
				menor = aleatorio[i];
			}
			
			System.out.println("El número mayor del array es: "+mayor+".");
			}
			
		System.out.println("Por favor introduzca el número del elemento que desea cambiar.");
		op = Leer.datoInt();
		System.out.println("Por favor introduzca el número nuevo.");
		aleatorio[op-uno] = Leer.datoInt();
		System.out.println("*********************************************");
		
			for (int i = 0; i < aleatorio.length; i++) {
				
				System.out.println("Número "+ (i +uno)+": "+aleatorio[i]);
				
			}
			System.out.println("*********************************************");
			
		
	}

}
