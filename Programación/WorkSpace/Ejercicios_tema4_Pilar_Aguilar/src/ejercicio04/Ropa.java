package ejercicio04;

public class Ropa extends Producto{

	private String color;

	public Ropa(double precioUni, String nombrePro, int idPro, String color) {
		super(precioUni, nombrePro, idPro);
		this.color = color;
	}
	

	@Override
	public String toString() {
		return "Ropa [color=" + color + ", toString()=" + super.toString() + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public double calcularPrecio() {
		return super.getPrecioUni();
	}
	

}
