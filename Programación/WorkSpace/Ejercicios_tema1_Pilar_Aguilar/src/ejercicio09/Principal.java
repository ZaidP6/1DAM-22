package ejercicio09;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cantNavasPueblo = 1500;
		double campNou = 105000;
		double estadioOlimpico = 65000;
		double teatro = 600;
		double navasCamp, navasEstadio;
		double navasTeatro;
		double conv2 = 1;
		
		System.out.println("Bienvenido. Hoy vamos a calcular cuántos Navas caben en diferentes sitios: ");
		navasCamp = (campNou * conv2)/ cantNavasPueblo;
		System.out.printf("En el Camp Nou caben %.2f Navas.\n", navasCamp );
		
		navasEstadio = estadioOlimpico * conv2 / cantNavasPueblo;
		System.out.printf("En el estadio Olímpico caben %.2f Navas.\n", navasEstadio);
		
		navasTeatro = teatro * conv2 / cantNavasPueblo;
		System.out.printf("En el teatro caben %.2f Navas.\n", navasTeatro);
		System.out.println("Gracias por usar nuesto programa.");
		
		
		
		
		
	}

}
