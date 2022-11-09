package ejemplo10_arrays_bidimensionales;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fil = 5;
		int col = 8;
		int nuevaNota;
		
		
		int [][] miTabla = new int [fil][col];
		for (int i = 0; i < miTabla.length; i++) {
			for (int j = 0; j < miTabla[i].length; j++) {
				miTabla[i][j] = Leer.datoInt();
			}
			
			
		}
		
		System.out.println("Diga la fila q quiere cambiar");
		fil = Leer.datoInt();
		System.out.println("Diga la columna q quiere cambiar");
		col = Leer.datoInt();
		
		nuevaNota = miTabla [fil-1][col-1];
	}

}
