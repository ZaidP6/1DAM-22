package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ceros=0;
		double suma =0;
		double media;
		int tam=8;
		double[]num = new double [tam];
		
		System.out.println("Bienvenido al programa");
		System.out.println("Escriba ocho números");


		for(int i=0; i<num.length; i++) {
			num[i]=Leer.datoDouble();
		}
		
		for(int i=0; i<num.length; i++) {
			suma = suma + num[i];
		}
		
		for(int i=0; i<num.length; i++) {
			if (num[i]==0) {
				ceros++;
			}
		}
		
		
		media = suma/tam;
		System.out.println("La media de los números es: "+media);
		System.out.printf("Y en total has inrtoducido %d ceros.", ceros);
		
		
	}

}
