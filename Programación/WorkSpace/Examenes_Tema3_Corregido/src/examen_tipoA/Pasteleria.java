package examen_tipoA;

import java.util.Random;

public class Pasteleria {

	
	private String sabor;
	private double precioLitro;
	private double volumen;
	private boolean extra;
	private int [] cantTartas;
	
	
	public Pasteleria(String sabor, double precioLitro, double volumen, boolean extra, int [] cantTartas) {
		super();
		this.sabor = sabor;
		this.precioLitro = precioLitro;
		this.volumen = volumen;
		this.extra = extra;
	}


	
	public Pasteleria() {
		super();
	}



	public String getSabor() {
		return sabor;
	}



	public void setSabor(String sabor) {
		this.sabor = sabor;
	}



	public double getPrecioLitro() {
		return precioLitro;
	}



	public void setPrecioLitro(double precioLitro) {
		this.precioLitro = precioLitro;
	}



	public double getVolumen() {
		return volumen;
	}



	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}



	public boolean isExtra() {
		return extra;
	}



	public void setExtra(boolean extra) {
		this.extra = extra;
	}



	public int[] getCantTartas() {
		return cantTartas;
	}



	public void setCantSemana(int[] cantSemana) {
		this.cantSemana = cantSemana;
	}
	
	
	public void rellenarTartas(int hasta, int desde) {
		int uno = 1;
		Random aleatorio = new Random(System.nanoTime());
		for (int i = 0; i < cantTartas.length; i++) {
			cantTartas[i] = aleatorio.nextInt(hasta - desde + uno) + desde;
			
		}
	}
	
	public void imprimirTartas() {
		System.out.println("------");
		System.out.println("SEMANA");
		System.out.println("------");
		for (int i = 0; i < cantTartas.length; i++) {
			System.out.println("DÍA"+(1+i));
		}
	}
	
	
	
	
	
}
