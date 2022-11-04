package ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numTiempo=3, conv1=60, conv2=3;
		double tiempoTtl=0,mediaTiempo;
		double []tiempos=new double[numTiempo];
		String[] carreras= {"primera","segunda","tercera"};
		String nombre;
		char respuesta;
		
		System.out.println("Bienvenido al programa del ej.7.");
		
		do {
			
			System.out.println("nombre corredor");
			nombre=Leer.dato();
			
			//para rellenar el array leyendo por teclado
			
			for(int i=0;i<tiempos.length;i++) {
				System.out.println("Introduzca el tiempo de la " +carreras[i] + "carrera en minutos");
			}
			
			//para sumar todos los tiempos de todas las carreras
			
			for(int i=0; i<tiempos.length;i++) {
				tiempoTtl+=tiempos[i];
			}
			tiempoTtl=tiempoTtl/tiempos.length;
			
		}
		
		
			
		
	}

}
