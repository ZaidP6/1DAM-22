package ejercicio01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GestionNotas nota1 = new GestionNotas("PeliVista", "14-02-23", "Thor, Avengers:End-Game, Guardianes de la galaxia");
		
		List<String> lista1 = new ArrayList<String>();

		lista1.add(new GestionNotas("SerieVista", "15-02-23", "The Mandalorian, Andor, Clone Wars"));
				
	}
				
}
