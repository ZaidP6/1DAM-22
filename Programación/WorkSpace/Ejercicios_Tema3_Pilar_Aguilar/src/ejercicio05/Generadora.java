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
					if (prim[i] == prim[j]) {
					prim[j] = random.nextInt(hasta - desde +1)+desde;
				
					}
				}
			}
		return prim;
		}
		
		
	public int[] hacerQuiniela(int num) {
		int hasta = 2, desde =0;
		int []resQ;
		Random rn = new Random(System.nanoTime());
		resQ = new int [num];
		for (int i = 0; i < resQ.length; i++) {
			resQ[i]=rn.nextInt(hasta -desde +1)+desde;
		}
		return resQ;
	
	public void imprimirQuiniela(int []resQ) {
		for (int i = 0; i < resQ.length; i++) {
			if(resQ[i]== 0) {
				System.out.println((i+1)+", ha salido empate");
				
			
			
			}
		}
			
	}

}
