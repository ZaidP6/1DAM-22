package ejercicio01_bis;

public class Circulo {
	 double radio;
	 
	 
	 public Circulo(double radio) {
		 this.radio=radio;
	 }
	 public Circulo() {
		
	 }
	 
	 public double CalcularArea(double radio) {
		 double area = 0;
		 int dos = 2;
		 
		 area = Math.PI*Math.pow(radio, dos);
		 
		 return area;
	 }
	 
}
