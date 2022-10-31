package ejemplo08_random;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aleatorio;
		int hasta,desde,tope = 3;
		
		
		Random num = new Random(System.nanoTime());
		
		System.out.println("Vamos a sacar un numero aleatorio.");
		
		System.out.println("Diga el mayor");
		hasta = Leer.datoInt();
		
		System.out.println("Diga el menor");
		desde = Leer.datoInt();
		
		/*aleatorio = num.nextInt(hasta-desde+1)+desde;
		System.out.println("Ha salido el: "+aleatorio);*/
		
		for(int i=0; i<tope;i++) {
			aleatorio = num.nextInt(hasta-desde+1)+desde;
			System.out.println(aleatorio);
		}
		
		
		
	}

}
