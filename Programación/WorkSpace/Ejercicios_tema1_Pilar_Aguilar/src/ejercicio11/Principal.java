package ejercicio11;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double velocidad = 8;
		double tiempoHoras = 24;
		double tiempoMin;
		double tiempoSeg;
		double conv1 = 1;
		double conv2 = 1000;
		double convMinSeg = 60;
		double cantLitros;
		double cantMetros;
		
		
		tiempoMin = tiempoHoras * convMinSeg / conv1;
		tiempoSeg = tiempoMin * convMinSeg / conv1;
		cantLitros = tiempoSeg * velocidad / conv1;
		cantMetros = cantLitros * conv1 / conv2;
		
		System.out.println("Bienvenido.\nEste ejercicio pide calcular los metros cúbicos que se pueden sacar en 24 horas si los sacamos con una velocidad de 8 litros por segundo." );
		System.out.printf("Para calcular los m^3 que se sacan del pozo en 24h haremos una serie de cálculos.\nPrimero pasaremos las horas a segundos, dando esto %.0fs.\n",tiempoSeg);
		System.out.printf("Después hemos calculado la cantidad de litros que se sacan, siendo esto %.0fL.\n", cantLitros);
		System.out.printf("Por último, hemos pasado esos litros a m^3, dando este último resultado %.1fm^3.\n", cantMetros);
		System.out.println("Gracias por usar nuestro programa. Hasta la próxima.");
		
		
		
	}

}
