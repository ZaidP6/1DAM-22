package ejemplo2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = 0;
		double topeOferta = 10.0;
		double precio;
		
		
		System.out.println("Diga el precio");
		precio = Leer.datoDouble();
		
		if(precio < topeOferta) {
			System.out.println("Producto en oferta");
		}
		
		
	}

}
