package ejemplo02_claseSet;

public class Alumno {

	private String nombre;
	private int edad;
	private double notaMedia;
	
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", notaMedia=" + notaMedia + ", toString()="
				+ super.toString() + "]";
	}

	public Alumno(String nombre, int edad, double notaMedia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.notaMedia = notaMedia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	
}
