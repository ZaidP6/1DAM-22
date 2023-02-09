package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int zona1 = 40, zona2 = 70, op = 0;
		int tam = 6;
		int precioBase = 40, codigo =0, nPersonas = 0;
		EntradaNormal []listaEntradas;
		
		listaEntradas= new EntradaNormal[tam];
		Taquilla taq = new Taquilla(listaEntradas);
		
		listaEntradas[0] = new EntradaNormal(1, 20, 10, 40);
		listaEntradas[1] = new EntradaGrupos(2, 10, 20, 70, 11);
		listaEntradas[2] = new EntradaVip(2, 1, 3, 40, "Jose Luis Rodríguez");
		listaEntradas[3] = new EntradaNormal(2, 10, 20, 70);
		listaEntradas[4] = new EntradaGrupos(2, 10, 20, 40, 18);
		listaEntradas[5] = new EntradaVip(2, 2, 2, 70, "Francisco Pérez Rodríguez");
		
		
		System.out.println("Bienevenido al programa");
		
		do {
			imprimirMenu();
			System.out.println("Indique una opción por favor.");
			op = Leer.datoInt();
			
			switch (op) {
			case 1:
				System.out.println("Indique número personas");
				nPersonas = Leer.datoInt();
				System.out.println("Escriba el codigo de la entrada");
				codigo = Leer.datoInt();
				//taq.calcularPrecio(taq.findById(codigo),nPersonas );
				break;
			
			case 2:
				System.out.println(taq.calcularTotalTaq());
				break;
				
			case 3: 
				
				
			case 0:
				System.out.println("Gracias por usar el programa");
				break;
			default:
				System.out.println("ERROR");
				break;
			}
			
			
			
		} while (op != 0);
		
		
		
		
		
	}

	
	public static void imprimirMenu() {
		System.out.println("*************************************************");
		System.out.println("1 - Calcular el precio de la entrada");
		System.out.println("2 - Mostrar total recaudado en taquilla");
		System.out.println("3 - Mostrar total recaudado de la zona 1");
		System.out.println("4 - Imprimir ticket para VIP");
		System.out.println("5 - Calcular lo que se paga de IVA por cada entrada");
		System.out.println("0 - Salir");
		System.out.println("*************************************************");
	}
	
}
