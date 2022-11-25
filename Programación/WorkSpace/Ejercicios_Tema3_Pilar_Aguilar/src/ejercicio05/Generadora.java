package ejercicio05;

import java.util.Random;

public class Generadora {

	public Generadora() {
		
	}
	
	public int [] generarPrimitiva() {
		int hasta = 49, desde = 1, tam = 6;
		int [] prim;
		
		Random random = new Random (System.nanoTime());
		prim = new int[tam];
		
		for(int i = 0; i < tam; i++) {
			prim[i] = random.nextInt(hasta-desde +1)+desde;
			
			for(int j = 0; j<i;j++) {
				if(j) {
					
				}
			}
		}
		
		return prim;
	}
}
