package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=8, ceros=0;
		double suma =0;
		double[]num = new double [tam];
		double media;
		
		
		System.out.println("Bienvenido al programa");
		System.out.println("Escriba ocho números");


		for(int i=0; i<num.length; i++) {
			num[i]=Leer.datoDouble();
		}
		
		for(int i=0; i<num.length; i++) {
			suma = num[i];
		}
		
		for(int i=0; i<num.length; i++) {
			if (num[i]==0) {
				ceros++;
			}
		}
		
		
		media = suma/num.length;
		System.out.println("La media de los números es: "+media);
		System.out.printf("Y en total has inrtoducido %d ceros.", ceros);
		
		
	}

}
