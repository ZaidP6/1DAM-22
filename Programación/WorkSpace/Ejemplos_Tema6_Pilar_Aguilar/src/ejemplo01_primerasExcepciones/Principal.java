package ejemplo01_primerasExcepciones;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numerador = 10;
		int denominador = 0;
		double resultado = 0;
		
		
		do {
			System.out.println("Diga un denominador");
			if(denominador != 0) {
				resultado = numerador/denominador;
				System.out.println(resultado);
				}else {
					System.out.println("Vuelve a introducir otro número");
				}
				
		} while (denominador!=0);
	}

}
