package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "John Snow";
		String tienda = "Winter is coming";
		String bebida1 = "Coca Cola";
		String comida1 = "Bolsa de Pipas";
		String articulo1 = "Espada Garra";
		
		int cantCoke = 2;
		int cantSword = 1;
		int cantPipas = 1;
		
		double precioCoke = 0.7;
		double precioPipas = 0.4;
		double precioSword = 150;
		double resultCoke;
		double resultPipas;
		double resultSword;
		double resultTotal;
		
		
		resultCoke = cantCoke * precioCoke;
		resultPipas = cantPipas * precioPipas;
		resultSword = cantSword * precioSword;
		resultTotal = resultCoke + resultSword + resultPipas;
		
		System.out.println("Bienvenido a la tienda "+tienda+" Sr."+nombre+".");
		System.out.println("-------------------------------------------------------");
		System.out.println("Usted ha hecho una compra de los siguientes artículos:\n");
		System.out.println("Cant\t\tArtículo\t\tPrecio/Ud\tTotal");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("%d\t\t%s\t\t%.2f€\t\t%.2f€\n",cantCoke, bebida1, precioCoke, resultCoke);
		System.out.printf("%d\t\t%s\t\t%.2f€\t\t%.2f€\n",cantPipas, comida1, precioPipas, resultPipas);
		System.out.printf("%d\t\t%s\t\t%.2f€\t\t%.2f€\n",cantSword, articulo1, precioSword, resultSword);
		System.out.printf("Total precio:\t\t\t\t\t\t%.2f€\n", resultTotal);
		System.out.println("---------------------------------------------------------------");
		System.out.println("Gracias por su visita. Vuelva pronto.");
		
		
		
		
	}

}
