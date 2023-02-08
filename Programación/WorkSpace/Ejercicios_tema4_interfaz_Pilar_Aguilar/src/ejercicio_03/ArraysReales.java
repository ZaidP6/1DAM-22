package ejercicio_03;

import java.util.Arrays;
import java.util.Random;

public class ArraysReales implements IEstadisticas{
	
	private double [] num;
	
	
	public ArraysReales(double[] num) {
		super();
		this.num = num;
	}
	
	

	public double[] getNum() {
		return num;
	}



	public void setNum(double[] num) {
		this.num = num;
	}
	

	@Override
	public String toString() {
		return "ArraysReales [num=" + Arrays.toString(num) + "]";
	}
	
	public double [] rellenarArray() {
		double desde = 0.0;
		double hasta = 100.0;
		Random num1 = new Random (System.nanoTime());
		for (int i = 0; i < num.length; i++) {
			
			num [i]= num1.nextDouble(hasta-desde+1)+desde;
			
		}
		return num;
	}

	@Override
	public double calcularMinimo() {
		
		double menor= num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]<menor) {
				menor=num[i];
			}
			
		}
		return menor;
	}

	@Override
	public double calcularMaximo() {
		double mayor=num[0];
		for (int i = 0; i < num.length; i++) {
			if(num[i]>mayor) {
				mayor= num[i];
			}
			
		}
		return mayor;
	}

	@Override
	public double calcularSumatorio() {
		double suma=0;
		for (int i = 0; i < num.length; i++) {
			suma = suma+num[i];
			
		}
		return suma;
	}
	
	
	
	
}
