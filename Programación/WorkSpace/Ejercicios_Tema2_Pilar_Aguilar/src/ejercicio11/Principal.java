package ejercicio11;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suspensas = 0, cant = 0, cantFinal = 6, maxNota =10, minAprob = 5;
		double nota = 0,suma = 0, media =0;
		
		System.out.println("Bienvenidos al programa.");
		
		do {
			System.out.println("Escriba la nota.");
			nota = Leer.datoDouble();
			if(nota <= maxNota) {
				if(nota<minAprob) {
					suspensas++;
				}
				suma += nota;
				cant++;
			}else {
				System.out.println("Lo siento, tiene que indicar un número entre 0 y 10. Inténtelo de nuevo");
				}
		}while(cant<cantFinal);
			media = suma/cant;
			
			System.out.printf("La nota media es %.2f y el número de suspensas es de %d.\n\n",media, suspensas);
			System.out.println("Gracias por usar el programa.");
	}
}
