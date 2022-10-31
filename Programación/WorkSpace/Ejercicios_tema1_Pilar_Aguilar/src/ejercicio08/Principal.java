package ejercicio08;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		
		double longitud1;
		double radio1 = 3;
		double radio2 =5.2;
		double area2;
		double pi = Math.PI;
		double convlong = 2; 
		
		//PROGRAMA
		
			longitud1 = convlong*pi*radio1;
			area2 = pi*radio2*radio2;
			
			System.out.println("Bienvenido.\nEn este ejercico calcularemos la longitud de una circunferencia y el área de otra diferente.");
			System.out.println("Para calcular la longitud de la circunferencia usaremos la fórmula 2πr y para el área usaremos πr^2.");
			System.out.printf("La longitud de la primera circunferencia, cuyo radio es de 3m, es de %.2fm.\n", longitud1);
			System.out.printf("El área de la segunda circunferencia, cuyo radio era de 5,2m, es de %.2fm^2.\n", area2);
			System.out.println("Esperemos que le haya gustado.\nHasta la próxima.");
	}

}
