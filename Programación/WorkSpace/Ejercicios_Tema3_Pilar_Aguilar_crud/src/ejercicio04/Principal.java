package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 /*Crear un programa con una clase Cliente, caracterizado por dni, nombre, apellidos, activo o no, peso y altura. 
		  * En esta clase, se podrá calcular el índice de masa corporal (IMC)de un Cliente (peso en km/altura 2 en m). Crear la 
		  * clase Gimnasio donde tendremos una lista de cliente como característica y los métodos: Calcular IMC al cliente elegido 
		  * de la lista buscando el cliente, mostrar lista, añadir cliente a la lista, dar de baja, calcular la media de IMC entre 
		  * todos los clientes. Se pueden calcular otras medias como de altura, peso, solo de los mayores de una 
		  * determinada edad... Crear un main para probar todo.
		  */
		
		int op = 0, tam = 0, posicion = 0;
		String dni = null;
		String nombre = null, apellido = null;
		double peso = 0.0, altura = 0.0;
		boolean activo = false;
		Cliente listaC [];
		Gimnasio gym;
		
		
		System.out.println("Bienvenido al programa, por favor elija una opción");
		System.out.println("¿Cuántos clientes va a tener la lista?");
		tam = Leer.datoInt();
		
		listaC=new Cliente[tam];
		gym = new Gimnasio(listaC);
		
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			
			switch (op) {
				case 0:
					System.out.println("Gracias por usar el programa");
					break;
				
				case 1:
					System.out.println("Indique el dni");
					dni = Leer.dato();
					System.out.println("Indique el nombre");
					nombre = Leer.dato();
					System.out.println("Indique el apellido");
					apellido = Leer.dato();
					System.out.println("Indique el peso en kg");
					peso=Leer.datoDouble();
					System.out.println("Indique la altura en metros");
					altura = Leer.datoDouble();
					gym.addCliente(new Cliente(dni, nombre, apellido, true, peso, altura),posicion );
					posicion++;
					
					
					break;
				
				case 2: 
					System.out.println("Indique el dni del cliente");
					dni= Leer.dato();
					gym.findByDni(dni).calcularIMC();
					System.out.printf("El IMC del cliente es: %.2f\n",gym.findByDni(dni).calcularIMC());
					break;
				case 3:
					gym.mostrarLista();
					break;
				case 4 :
					System.out.println("Indique el dni del cliente a dar de baja");
					dni=Leer.dato();
					gym.deleteCliente(dni);
					
					break;
				case 5:
					gym.cargarCliente();
					gym.mostrarLista();
					break;
					
					
				default:
					break;
			}
			
			
			
		}while (op != 0);
		
		
	}
	
	public static void imprimirMenu() {
		
		System.out.println("---------------------------------------------------------");
		System.out.println("1 - Añadir cliente a la lista");
		System.out.println("2 - Calcular IMC de un cliente");
		System.out.println("3 - Mostrar la lista de los clientes");
		System.out.println("4 - Dar de baja un cliente");
		System.out.println("5 - Calcular la media del IMC de todos los clientes");
		System.out.println("6 - Calcular media de altura");
		System.out.println("7 - Calcular media peso");
		System.out.println("0 - Salir");
		System.out.println("---------------------------------------------------------");
	}

}
