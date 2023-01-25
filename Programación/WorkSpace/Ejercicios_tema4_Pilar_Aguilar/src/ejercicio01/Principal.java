package ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double porGanancia;
		
		Ordenador pc = new Ordenador(512, 4.1, 500, "HP");
		Sobremesa sob = new Sobremesa(512, 4.1, 500, "HP", 50);
		Portatil laptop = new Portatil(512, 4.1, 500, "HP", 268.47);
		
		
		System.out.println("Escriba el porcentaje de ganancia");
		porGanancia=Leer.datoInt();
		
		System.out.println("Precio base de un ordenador: "+pc.calcularPVP(porGanancia)+"€");
		System.out.println("Precio de un sobremesa: "+sob.calcularPVP(porGanancia)+"€");
		System.out.println("Precio de un portátil: "+laptop.calcularPVP(porGanancia)+"€");
		
	}

}
