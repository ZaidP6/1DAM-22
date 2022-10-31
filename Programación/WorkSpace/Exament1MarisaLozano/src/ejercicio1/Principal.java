package ejercicio1;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double cuotaM=0.0, hipoteca=0.0, cuotasA=12, interes=3.5, cuotasTotales=0.0, años=0.0, dos=2;
		String Cliente="Marisa Lozano Macias", Fecha="11/10/2022", Dni="15442581J",Empleado="";
		System.out.println("Buenos días, indique su nombre");
		
			Empleado=Leer.dato();
			
		System.out.println("Vamos a calcular la cuota mensual de su hipoteca");
		System.out.println("Cuánta cantidad va a pedir");
		
			hipoteca=Leer.datoDouble();
			
		System.out.println("En cuántos años quiere liquidar la cantidad");
		
			años=Leer.datoDouble();
			
			cuotasTotales=cuotasA*años;
		
			cuotaM=(hipoteca*interes)/(cuotasTotales*dos);
		
		System.out.println("Le adjunto el extracto:");
		
		System.out.println("BIENVENIDO A TU BANCO");
		
		System.out.println("Le atiende:"+Empleado);
		System.out.println("Fecha:"+Fecha);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("Nombre\n" +Cliente);
		System.out.println("DNI\n" +Dni);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.printf("Su cuota mensual sería: %.2f Euros",cuotaM);
		




				
	}

}
