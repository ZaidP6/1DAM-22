 package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0, idArticulo = 0, tam = 0;
		String concepto=null;
		double cantGastada = 0.0, presupuesto = 0.0;
		boolean siPresupuesto = true;
		
		
		
		
		//compra = new Gasto(concepto, idArticulo, cantGastada);
		Gestiongasto gestion =new Gestiongasto();
		
		
		System.out.println("Bienvenido al programa, por favor indique la cantidad de regalos que ha comprado.");
		tam = Leer.datoInt();
		
		Gasto []compra = new Gasto[tam];
		
		System.out.println("Por favor indique la opción que desea realizar.");
		
		do {
			imprimirMenu();
			op = Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Por favor, introduzca el concepto del producto.");
					concepto = Leer.dato();
					System.out.println("Por favor, introduzca el identificador del producto.");
					idArticulo = Leer.datoInt();
					System.out.println("Por favor, introduzca el precio del producto.");
					cantGastada = Leer.datoDouble();
					//gestion.guardarCompra(concepto, idArticulo, cantGastada);
					break;
					
				case 2: 
					//gestion.calcularCantTotalGast();
					break;
					
				case 3:
					gestion.mostrarCompras();
					break;
				case 4:
					break;
				case 5:
					gestion.calcularPresupuesto(presupuesto, siPresupuesto);
					break;
					
				default:
					break;
			}
			
			
		}while(op != 0);
		
	}
	
	public static void imprimirMenu() {
		
		System.out.println("----------------------------------------------");
		System.out.println("1 - Introducir gasto nuevo");
		System.out.println("2 - Total de todos los gastos");
		System.out.println("3 - Mostrar todos los gastos");
		System.out.println("4 - Mostrar cantidad gastada");
		System.out.println("5 - Calcular si te has colado comprando o no");
		System.out.println("6 - Modificar gasto");
		System.out.println("7 - Buscar concepto");
		System.out.println("----------------------------------------------");
	}

}
