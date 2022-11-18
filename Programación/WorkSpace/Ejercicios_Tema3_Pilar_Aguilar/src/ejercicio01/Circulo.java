package ejercicio01;

public class Circulo {
	
	//atributos
	double radio;
	
	
	//constructores
	public Circulo() {
		
		
	}
	public Circulo(double radio) {
		this.radio = radio;
	}
	
	//metodos
	
	public double calcularArea(double rad) {
		
		double exp2 = 2;
		double resultado = 0.0;
		resultado = Math.PI * Math.pow(rad, exp2);
		return resultado;
	}

}
