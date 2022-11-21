package ejercicio03;

public class Cilindro {

	
	double radio;
	double altura;
	
	
	public Cilindro(double radio, double altura) {
		this.radio = radio;
		this.altura = altura;
	}
	
	public double calcularVol(double radio, double altura) {
		
		int dos = 2;
		
		return Math.PI*Math.pow(radio, dos)*altura;
	}
	
	
}
