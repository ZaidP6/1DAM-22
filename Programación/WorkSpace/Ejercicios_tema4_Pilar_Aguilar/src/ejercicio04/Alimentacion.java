package ejercicio04;

public class Alimentacion extends Producto {

	private double descuentoCad;
	private int caducidad;
	

	public Alimentacion(double precioUni, String nombrePro, int idPro, double descuentoCad, int caducidad) {
		super(precioUni, nombrePro, idPro);
		this.descuentoCad = descuentoCad;
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "Alimentacion [descuentoCad=" + descuentoCad + ", toString()=" + super.toString() + "]";
	}

	public double getDescuentoCad() {
		return descuentoCad;
	}

	public void setDescuentoCad(double descuentoCad) {
		this.descuentoCad = descuentoCad;
	}

	
	public boolean comprobarCaducidad() {
		boolean prodACaducar = false;
		if(caducidad <= 2) {
			prodACaducar = true;
		}
		return prodACaducar;
		
		}
	
	public double calcularPrecio() {
		if (comprobarCaducidad()) {
			return super.getPrecioUni()-descuentoCad*getPrecioUni()/100;
		}else
			return super.getPrecioUni();
		
	}
}


