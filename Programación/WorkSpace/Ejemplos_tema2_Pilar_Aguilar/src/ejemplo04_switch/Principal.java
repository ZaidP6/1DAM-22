package ejemplo04_switch;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARIABLES
		
		int aplicacion;
		
		//PROGRAMA
		
		System.out.println("--------------------------");
		System.out.println("\tBIENVENIDO");
		System.out.println("--------------------------");
		System.out.println("Elija una opción del siguiente menú para abrirla.");
		System.out.println("1 - Abrir la aplicaión cámara.");
		System.out.println("2 - Abrir la aplicaión calculadora.");
		System.out.println("3 - Abrir la aplicación ajustes");
		System.out.println("4 - Abrir la aplicación calendario.");
		System.out.println("5 - Abrir la aplicación WhatsApp.");
		
		aplicacion = Leer.datoInt();
		
		switch (aplicacion) 
		{
			case 1:
				System.out.println("Ha eligido la aplicaión cámara. En unos segundos se abrirá.");
				break;
			case 2:
				System.out.println("Ha elegido la aplicación calculadora. En unos segundos se abrirá.");
				break;
			case 3:
				System.out.println("Ha elegido la aplicación ajustes. En unos segundos se abrirá.");
				break;
			case 4:
				System.out.println("Ha elegido la aplicación calendario. En unos segundos se abrirá.");
				break;
			case 5:
				System.out.println("Ha elegido la aplicación WhatsApp. En unos segundos se abrirá.");
			default:
				System.out.println("Lo siento, no se encunetra la aplicación.");
				break;
		}
		System.out.println("FIN DEL PROGRAMA.\nGracias por elegirnos.");
		
	}

}
