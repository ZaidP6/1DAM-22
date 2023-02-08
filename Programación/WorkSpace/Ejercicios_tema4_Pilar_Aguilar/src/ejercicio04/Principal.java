package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Hacer un programa que imprima un ticket de compra, basándonos en un supermercado. 
		 * Debemos crear la clase Producto genérica y tres hijas con un atributo más cada una 
		 * (Alimentación, Ropa y Electrónica). Cada Producto genérico deberá estar caracterizado 
		 * por el precio unitario, nombre, código de identificación, etc. 
		 * El precio de los productos de electrónica lleva un impuesto especial por ser de lujo y la alimentación 
		 * un descuento cuando le quedan menos de 2 días para caducar. 
		 * La clase Línea de venta, con un producto y una cantidad y la clase Venta con un array de líneas de venta. 
		 * El ticket debe mostrar una venta completa con varios productos y varias cantidades. Se pueden 
		 * crear los productos directamente en el main antes de empezar. 
		 * Agregar un método solo en la clase alimentación, que avise si al producto le quedan menos de 2 días para caducar. 
		 * Crear un main, crearemos directamente los objetos necesarios. Solo habrá la opción imprimir ticket y listar todos 
		 * los productos guardados, avisando cuando a un producto de alimentación le falten menos de dos días para caducar.*/
		
		int tam = 4, op = 0;
		
		Producto[] prod = new Producto[tam];
		prod[0] = new Alimentacion(12.5, "Pipas", 001, 0.0, 3);
		prod[1]= new Ropa(45.2, "Jeans", 002, "Azul");
		prod[2]= new Electronica(80.15, "Disco Duro", 003, 15.0);
		prod[3] = new Alimentacion(6.5, "Huevos", 004, 25.0, 1);
		
		
		do {
			imprimirMenu();
			
			switch (op) {
			case 1:
				
				
				break;

			default:
				break;
			}
			
			
		} while (op!=0);
	}

	public static void imprimirMenu() {
		System.out.println("1 - IMprimir ticket");
		System.out.println("2 - Listar los productos guardados");
		System.out.println("0 - Salir");
	}
	
}
