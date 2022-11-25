package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase;
		int veces = 0;
		
		System.out.println("Bienvenido al no castigador de frases.");
		System.out.println("Escriba la frase que quiere repetir");
		frase = Leer.dato();
		System.out.println("Escriba las veces que quiere que se repita con números.");
		veces = Leer.datoInt();
		
		Copiado copi1 = new Copiado();
		copi1.repetir(veces, frase);
		
		
		
		
	}

}
