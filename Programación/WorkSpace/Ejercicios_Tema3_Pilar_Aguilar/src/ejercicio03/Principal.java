package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 double radio=0.0, altura=0.0, volumen=0.0;
	        
	        Cilindro cil1;
	        
	        System.out.println("Introduzca radio");
	        radio=Leer.datoDouble();
	        System.out.println("Introduzca altura");
	        altura=Leer.datoDouble();
	        
	        cil1=new Cilindro (radio,altura);
	        
	        volumen=cil1.calcularVol(radio, altura);
	        
	        System.out.printf("El volumen es %.2f ",volumen);
		
		
	}

}
