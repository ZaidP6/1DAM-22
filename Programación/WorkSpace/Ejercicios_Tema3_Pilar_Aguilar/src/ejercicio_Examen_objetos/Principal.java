package ejercicio_Examen_objetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0, rebaja = 0;
		String nombre, seccion;
		double precioBase = 0.0;
		boolean rebajado = false;
		double ganancia  = 0.0;
		
		double [] precios  = {100.0,3200.0,3000.0};	
		
		
		System.out.println("Bienvenido al ejercicio de prueba de examen tema3");
		System.out.println("Escriba el nombre de producto.");
		nombre = Leer.dato();
		System.out.println("Escriba el precio base");
		precioBase = Leer.datoDouble();
		System.out.println("Escriba la sección");
		seccion = Leer.dato();
		System.out.println("Escriba 1 si es rebajado y 0 si no lo es");
		rebaja = Leer.datoInt();
		if(rebaja == 0) {
			rebajado = true;
		}
		
		Producto p = new Producto(nombre, precioBase, seccion, rebajado);
		
		Switch (opcion) {
		
			case 1: 
				System.out.println("Diga ganancia en porcentaje");
				ganancia= Leer.datoDouble();
				p.calcPVP(ganancia);
				System.out.printf("%s", p);
				break;
					
			case 6:
				System.out.println("Mega ganga");
				break;
			
				
			case 7:
				
					
		//default:
			}return ganancia
		}
		
	}


