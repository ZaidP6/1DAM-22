package ejemplo11_array_bidimensional;

import java.util.Random;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int fil = 4, col =3;
		String [] nombres  = {"Marisa, Pilar, Luis, Rob, Pedro"};
		Random r = new Random (System.nanoTime());
		int hasta = 10, desde = 1;
		
		
		int [][] edades = new int[fil][col];
		
		for (int i = 0; i < edades.length; i++) {
			
			for (int j = 0; j < edades[i].length; j++) {
				edades[i][j] = r.nextInt(hasta -desde+1)+desde;
				System.out.print(edades[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}

}
