package ejercicio12;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I = V/R  amperios
		
		double conv1 = 10;
		double conv2 = 3;
		double ka;
		double tension = 250;
		double resistencia = 20;
		double intensidad;
		
		ka = Math.pow(conv1, conv2);
		resistencia = ka * resistencia;
		intensidad = tension / resistencia;
		
		System.out.println("Bienvenido.\nEn este ejercicio vamos a calcular la intensidad de un circuito teniendo como datos la resistencia eléctrica y la tensión. ");
		System.out.printf("La fórmula de la intensidad es I=V/R, por tanto la Intensidad es de %.2f Amperios.\n", intensidad);
		System.out.println("Gracias por confiar en nosotros. Hasta la próxima.");
		
		
		
		
		
		
	}

}
