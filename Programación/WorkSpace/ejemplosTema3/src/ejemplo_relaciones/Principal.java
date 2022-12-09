package ejemplo_relaciones;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad = 0;
		Cliente c;
		long numero = 0;
		float saldo = 0.0;
		float interes = 0.0;
		
		System.out.println("Diga nombre");
		nombre = Leer.dato();
		System.out.println("Diga edad");
		edad = Leer.datoInt();
		
		c = new Cliente (nombre, edad);
		
		System.out.println("Diga numero de cuenta.");
		numero = Leer.datoLong();
		System.out.println("Diga saldo.");
		saldo = Leer.datoFloat();
		System.out.println("Diga interés.");
		interes = Leer.datoFloat();
		
		
		
		
		
	}

}
