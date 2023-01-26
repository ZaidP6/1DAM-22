package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double suplemento= 0;
		int op = 0;
		double cant_fija= 0;
		
		
		Furgoneta f = new Furgoneta("Peugeot Rifter", 1500, 110, "Categoría B", 150);
		Motocicleta m = new Motocicleta("Yamaha FZ6", 600, 98 ,"Categoría C", 4);
		Coche c = new Coche("Puegeot 208", 1600, 130, "Categoria B", 5);
		
		
		
		System.out.println("Bienvenido");
		
		
		do {
			System.out.println("Por favor, elija una opción.");
			imprimirMenu();
			op = Leer.datoInt();
			
			switch (op) {
			case 1:
				System.out.println("Por favor indica a cuánto esta la base");
				cant_fija = Leer.datoDouble();
				break;

			case 2:	
				
				System.out.println(f.calcularImpuesto(suplemento));
				break;
				
			case 3:
				System.out.println(m.calcularImpuesto(suplemento));
				break;
				
			case 4:
				System.out.println(c.calcularImpuesto(suplemento));
				break;
				
			case 0:
				System.out.println("Hasta la próxima");
				break;
				
			default:
				break;
			}
			
			
			
		}while (op != 0);
		
		
	}
	
	public static void imprimirMenu(){
		System.out.println("******************************************************");
		System.out.println("1 - Introducir la cantidad fija establecida.");
		System.out.println("2 - Calcular impuesto Furgoneta");
		System.out.println("3 - Calcular impuesto Motocicleta");
		System.out.println("4 - Calcular impuesto Coche");
		System.out.println("0 - Salir");
		System.out.println("******************************************************");
	}

}
