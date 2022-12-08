package ejercicio_examen_objetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op=0, rebajas;
		String nombre, seccion;
		double precioBase, ganancia, descuento, libras, nuevoPrecio, topeGangas;
		boolean rebajado=false;
		double [] precios= {100.0, 3200.0, 300.0};
		
		
		
		System.out.println("Diga el nombre del producto");
		nombre=Leer.dato();
		System.out.println("Diga el precio base");
		precioBase=Leer.datoDouble();
		System.out.println("Diga sección");
		seccion=Leer.dato();
		System.out.println("Diga 1 si es rebajado o 0 si no");
		
		//este trozo iría en el método
		rebajas=Leer.datoInt();
		if(rebajas==1) {
			rebajado=true;
		}
		//creamos objeto con los parámetros 
		Producto p=new Producto(nombre,precioBase,seccion,rebajado);
		
		do {
			
			System.out.println("1.-Para calcular el precio de venta al público");
			System.out.println("2.-Para aplicar el descuento");
			System.out.println("3.-Para conocer lo detalles del producto");
			System.out.println("4.-Para conocer el precio del producto en Libras");
			System.out.println("5.-Para modificar el precio base");
			System.out.println("6.-Para saber si es una Mega Ganga");
			System.out.println("7.-Para calcular el mayor precio");
			System.out.println("0.-Para salir.");
			
			op=Leer.datoInt();
			switch(op) {
				
			case 1:
				System.out.println("Diga ganancia en %");
				ganancia=Leer.datoDouble();
				p.calcularPvp(ganancia);
				//para mostrarlo todo del objeto. 
				//System.out.printf("%s",p);
				System.out.println("El precio de venta es : "+p.getPvp());
				break;
			case 2:
				System.out.println("Diga la rebaja en %");
				descuento=Leer.datoDouble();
				p.calcularPrecioRebajado(descuento);
				System.out.println("El precio de rebaja es : "+p.getPvp());
				break;
				
			case 3:
				
				System.out.printf("%s",p);
				break;
				
			case 4:
				System.out.println("Diga a cuánto está el cambio en Libras");
				libras=Leer.datoDouble();
				System.out.printf("Precio en libras %.2f ",p.calcularLibras(libras));
				break;
				
			case 5:
				System.out.println("Diga nuevo precio");
				nuevoPrecio=Leer.datoDouble();
				p.setPrecioBase(nuevoPrecio);
				break;
				
			case 6:
				System.out.println("Diga el precio máximo para Ganga ");
				topeGangas=Leer.datoDouble();
				p.imprimirGanga(topeGangas);
				
			case 7:
				System.out.printf("el más caro cuesta: €.2f ",p.calcularCaro(precios));
				
			default:
				System.out.println("Opción no válida");
				break;
				
			case 0:
				break;
			}
				
			
		}while(op!=0);

	}	

}

