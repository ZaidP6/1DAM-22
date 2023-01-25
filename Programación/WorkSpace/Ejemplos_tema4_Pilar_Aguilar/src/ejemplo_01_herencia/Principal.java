package ejemplo_01_herencia;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numHijos;
		
		Superclase_trabajador t = new Superclase_trabajador("Ángel", "Jefe departamento");
		Consultor c = new Consultor ("Rafa", "Junior", 20, 100);
		Empleado e = new Empleado ("Luismi", "Máster and comander", 2000, 15);
		
		System.out.println("Escriba el número de hijos");
		numHijos=Leer.datoInt();
		
		System.out.println(t.calcularPaga(numHijos));
		System.out.println(c.calcularPaga(numHijos));
		System.out.println(e.calcularPaga(numHijos));
		
		
		
	}

}
