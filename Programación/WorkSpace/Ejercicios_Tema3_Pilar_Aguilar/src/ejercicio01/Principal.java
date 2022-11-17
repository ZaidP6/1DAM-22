package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double rad, res=0;
		Circulo cir1, cir3, cir2;
		
		
		//FOrma 1: Cascaporra Style
		cir1 = new Circulo (3.4);
		System.out.println(cir1.radio);
		
		//FOrma 1: Leyendo por teclado
		System.out.println("Diga usted el radio");
		rad=  Leer.datoDouble();
		cir2 = new Circulo(rad);
		
		cir3 = new Circulo();
		
		//cómom se llma a un metodo
		res = cir3.calcularArea(2.2);
		System.out.println("El área es: "+res);

	}

}
