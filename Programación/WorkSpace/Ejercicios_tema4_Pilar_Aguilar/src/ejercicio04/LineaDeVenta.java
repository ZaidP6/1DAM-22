package ejercicio04;


public class LineaDeVenta {

	private int cantidad;
	private Producto pro;
	

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Producto getPro() {
		return pro;
	}

	public void setPro(Producto pro) {
		this.pro = pro;
	}

	public String toString() {
		return "LineaDeVenta [cantidad=" + cantidad + ", pro=" + pro + ", toString()=" + super.toString() + "]";
	}

	public LineaDeVenta(int cantidad, Producto pro) {
		super();
		this.cantidad = cantidad;
		this.pro = pro;
	}

	public static void imprimirProducto() {
		
		System.out.println("Bienvenido a La Oficina");
		System.out.println("Le ha atendido Pilar");
		System.out.println("Cantidad\t\tProducto\tPrecio");
		System.out.println(" "+"\t\t");
		
		
	}
	
}
