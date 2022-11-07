package ejercicio13;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   	Realizar un programa que calcule el salario mensual de un vendedor. Este será el resultado de
			un sueldo fijo 1000€ mensuales más un porcentaje de las ventas realizadas. Lo que se cobra
			por ventas se calculará mediante el 20 % de lo vendido en total al mes.
		 */
		
		//variables
		
		int sueldoF = 1000, conv1 = 100, descuento = 20 ;
		double sueldoMes, sueldoVentas;
		
		
		//programa
		
		System.out.println("Bienvenido al programa del ejercicio 13");
		sueldoVentas = sueldoF * descuento / conv1;
		
		System.out.printf("La cantidad ganada por las ventas es de: %.2f€.\n",sueldoVentas);
		sueldoMes = sueldoF + sueldoVentas;
		
		System.out.printf("Por tanto, el sueldo total al mes sería: %.2f€.",sueldoMes);
		
		
	}

}
