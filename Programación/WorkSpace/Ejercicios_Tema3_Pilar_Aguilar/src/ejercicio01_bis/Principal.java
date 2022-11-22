package ejercicio01_bis;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio = 0, total = 0;
		
		System.out.println("Escriba el tamaño del radio en cm.");
		radio = Leer.datoDouble();
		
		Circulo cir1 = new Circulo (radio);
		
		total = cir1.CalcularArea(radio);
		System.out.println(total+" cm^2");
		
	}

}
