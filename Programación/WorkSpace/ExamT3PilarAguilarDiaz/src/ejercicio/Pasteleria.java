package ejercicio;

import java.util.Random;

public class Pasteleria {

	private String sabor;
	private String puesto;
	private double precioLitro;
	private double volumen;
	private boolean extra;
	private int [] cantSemana;
	
	
	public Pasteleria(String sabor, String puesto, double precioLitro, double volumen, boolean extra) {
		
		this.sabor = sabor;
		this.puesto = puesto;
		this.precioLitro = precioLitro;
		this.volumen = volumen;
		this.extra = extra;
	}

	public Pasteleria() {
	
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
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
	
	public double calcularPreFab(double precioTarta) {
		
		precioTarta = volumen*precioLitro;
		return precioTarta;
	}
	
	
	public double ponerExtra (double cantExtra){
		double precioTarta = 0.0;
		
		if (extra == true) {
			precioTarta = precioTarta + cantExtra;
		}	
		return precioTarta;
	}
	
	public int rellenarCantTartas(int hasta, int desde) {
		int uno = 1;
		Random aleatorio = new Random();
		int cantSemana = aleatorio.nextInt(hasta - desde + uno) +desde;
		return cantSemana;
	}
	
	public int calcularCantSemana(int cantTartasSem){
		int semana = 7;
		
		for (int i = 0; i < cantSemana.length; i++) {
			
		}
		return cantTartasSem;
	}
	
	public double calcularMediaSem(double mediaSem) {
		int semana = 7;
		
		//mediaSem = aleatorio[i]/semana;
		return mediaSem;
	}
	
	/*public double calcularPrecioVenta(double porcentajeGanancia) {
		double pvp;
		int cien = 100;
		
		pvp =  precioTarta + precioTarta * porcentajeGanancia / cien;
		
		return pvp;
	}*/
	
}
