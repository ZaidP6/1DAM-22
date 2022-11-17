package ejercicio01;

public class Circulo {
	
	double radio;
	
	public Circulo() {
		
		
	}
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//metodos
	
	public double calcularArea(double ra) {
		
		double exp2 = 2;
		double resultado = 0.0;
		resultado = Math.PI * Math.pow(ra, exp2);
		return resultado;
	}

}
