package ejemplo_relaciones;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre;
		int edad = 0, topeEdad;
		Cliente c;
		long numero = 0;
		float saldo;
		float interes;
		Cuenta cu;
		
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
		
		cu = new Cuenta (numero, c, saldo, interes);
		System.out.println("Datos cliente "+cu.getC());
		System.out.println("Datos cliente "+c);
		
		System.out.println("Apatir de qué edad se cobra pensión?");
		topeEdad = Leer.datoInt();
		System.out.printf("Su saldo es: %.2f€", cu.ingresarPension(topeEdad));
		
		//version 2
		
		System.out.println("Apatir de qué edad se cobra pensión?");
		topeEdad = Leer.datoInt();
		System.out.printf("Su saldo es: %.2f€", cu.ingresarPensionV2(topeEdad, c));
		
		
	}

}
