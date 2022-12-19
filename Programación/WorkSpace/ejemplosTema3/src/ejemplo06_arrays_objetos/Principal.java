package ejemplo06_arrays_objetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam = 5, nVs = 0, seguir = 0;
		double potencia = 0;
		String modelo;Vehiculo v;
		
		
		
		Vehiculo [] lista = new Vehiculo [tam];
		
		do {
			
			System.out.println("Introduce el modelo del vehículo");
			modelo = Leer.dato();
			System.out.println("Introduce la potencia del vehículo");
			potencia = Leer.datoDouble();
			
			v = new Vehiculo(modelo, potencia);
			lista[nVs] = v; // lista [nVs] = new Vehiculo(modelo, potencia);
			
			
			
			System.out.println("¿Desea continuar? Pulse 1 para seguir y 0 para salir");
			seguir = Leer.datoInt();
			
			
		}while(seguir !=0 && nVs<lista.length); 
		
		for (int i = 0; i < nVs; i++) {
			System.out.println(lista[i]);
			}

	}
}
