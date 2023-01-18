package ejercicio_examen01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op = 0, uno = 1, rebajas = 0;
		String nombre, seccion;
		double precioBase = 0;
		boolean rebajado = false;
		double porcentajeGanancia = 0.0,porcentajeRebaja = 0.0, precioLibra = 0.0, nuevoPrecioBase = 0.0;
		
		System.out.println("Bienvenido");
		System.out.println("Escriba el nombre del producto.");
		nombre = Leer.dato();
		System.out.println("Escriba el precio base.");
		precioBase = Leer.datoDouble();
		System.out.println("Indique la sección.");
		seccion = Leer.dato();
		System.out.println("Indique 1 si el prodcuto está rebajado. 0 para precio normal.");
		rebajas = Leer.datoInt();
		if (rebajas == uno) {
			rebajado = true;
		}
		
		
		Producto p = new Producto (nombre, precioBase, seccion, rebajado);
	
		
		do {
			System.out.println("*****************************************************");
			System.out.println("Elija entre estas opciones:");
			System.out.println("1 - Calcular precio con el porcentaje de ganancias.");
			System.out.println("2 - Calcular precio rebjado de un producto.");
			System.out.println("3 - Mostrar los datos del producto.");
			System.out.println("4 - Ver precio en libras esterlinas.");
			System.out.println("5 - Modificar precio base.");
			System.out.println("6 - Comprobar si el producto es una ganga.");
			System.out.println("0 - Pulse 0 para salir.");
			System.out.println("*****************************************************");
			
			op = Leer.datoInt();
			
			switch(op) {
				
				case 1: 
					System.out.println("Indique el porcentaje de ganancia (solo el número).");
					porcentajeGanancia = Leer.datoInt();
					p.calcularPVP(porcentajeGanancia);
					
					System.out.printf("El PVP es %.2f€\n",p.getPvp());
					break;
				case 2: 
					System.out.println("Indique el porcentaje de rebaja (solo el número).");
					porcentajeRebaja = Leer.datoDouble();
					p.calcularPrecioReabajado(porcentajeRebaja);
					
					System.out.printf("El nuevo precio del producto es %.2f€.\n",p.getPvp());
					break;
				case 3:
					
					System.out.println(p.toString());
					break;
				case 4: 
					System.out.println("Por favor, indique a cuánto está el cambio.");
					precioLibra = Leer.datoDouble(); 
					p.cambiarMoneda(precioLibra);
					
					System.out.printf("El precio del producto en libras esterlinas es de %.2f\n", p.cambiarMoneda(precioLibra));
					break;
				case 5: 
					System.out.println("Por favor indique el nuevo precio base.");
					 nuevoPrecioBase = Leer.datoDouble();
					 
					 p.setPrecioBase(nuevoPrecioBase);
					 
					 System.out.printf("El nuevo precio base es %.2f€\n", p.getPrecioBase());
					 break;
				case 6:
					p.imprimirGanga();
					break;
			}
			
		}while (op!=0);
			System.out.println("Gracias por usar el programa");
		
		
	}	
}