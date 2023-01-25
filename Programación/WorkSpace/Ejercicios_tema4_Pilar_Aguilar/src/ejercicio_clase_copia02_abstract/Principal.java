package ejercicio_clase_copia02_abstract;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fecha;
		int op=0;


        //Documento doc = new Documento();
        Tarjetadevisita tar = new Tarjetadevisita("Empresa Colegio S.L.", "669452876T","Valle Colorado 56, Gelves, Sevilla", "Hermenegildo Zegna", 694583882,"ecolegiosl@gmail.com" );
        Carta car = new Carta("Empresa Colegio S.L.", "669452876T","Valle Colorado 56, Gelves, Sevilla", "24-01-2023");

        System.out.println("Bienvenido");
    	System.out.println("Por favor, introduzca la fecha de hoy con guiones.");
        fecha = Leer.dato();
        
        do {
        	
        	imprimirMenu();
        	System.out.println("Por favor indique una opción.");
        	op = Leer.datoInt();
        	
        	switch (op) {
				case 1:
					
					 doc.imprimirDoc();
					
					break;
				case 2:
					
					tar.imprimirDoc();
					break;
					
				case 3:
					
					car.imprimirDoc();
					break;
				
				case 0:
					break;

			default:
					break;
			}
        	
        }while(op!=0);
        
        
       System.out.println("Hasta la próxima");
		
		
        
	}
	
	public static void imprimirMenu() {
		System.out.println("***************************************");
		System.out.println("1 - Imprimir el documento general.");
		System.out.println("2 - Imprimir la tarjeta de visita.");
		System.out.println("3 - Imprimir la carta.");
		System.out.println("0 - Salir.");
		System.out.println("***************************************");
	}

}
