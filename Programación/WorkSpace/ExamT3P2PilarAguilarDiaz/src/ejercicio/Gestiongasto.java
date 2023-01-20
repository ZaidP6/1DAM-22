package ejercicio;

import java.util.Arrays;

public class Gestiongasto {

	
	private Gasto []compra;
	
	
	public Gestiongasto() {
		super();
	}

	public Gestiongasto(Gasto[] compra) {
		super();
		this.compra = compra;
	}

	@Override
	public String toString() {
		return "Gestiongasto [compra=" + Arrays.toString(compra) + "]";
	}

	public Gasto[] getCompra() {
		return compra;
	}

	public void setCompra(Gasto[] compra) {
		this.compra = compra;
	}
	
	
	/*public String findByConcept() {
		
		}
	 */
	public String findById() {
		
		boolean encontrado = false;
		int i = 0;
				while (i<compra.length && !encontrado) {
					
					
				}
				return null;
		
	}
	
	
	/*public double calcularCantTotalGast() {
	 * double cantTotalGast;
		for (int i = 0; i < compra.length; i++) {
			cantTotalGast = compra[cantGastada];
		}
	}*/
	
	public void mostrarCompras() {
		
		for (int i = 0; i < compra.length; i++) {
			
			System.out.println("Articulo "+(i+1)+": "+compra[i]);
		}
	}
	
	public double calcularPresupuesto(double presupuesto, boolean siPresupuesto) {
		
		double cantTotalGast=0.0;
		
		if(cantTotalGast<presupuesto)
			siPresupuesto =true;
		return presupuesto-cantTotalGast;
	}
	
	/*public static void cargarDatos() {
		
		compra[0]= new compra(ropa, 1, 12.5);
		compra[1]= new compra(tecnologia, 2, 25.6);
		compra[2]= new compra(drogueria, 2, 25.6);
	}*/
	
	/*public Gasto guardarCompra(String concepto, String idArticulo, double cantGastada) {
		
		for (int i = 0; i < compra.length; i++) {
			
			compra[i];
		}
		
	}*/
	
}
