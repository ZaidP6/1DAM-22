package ejercicio1;

import java.util.Arrays;
import java.util.Random;

public class Pasteleria {

	private String sabor;
	private double precioLitro;
	private double volumen;
	private boolean extraNormal;
	private int [] cantTartas;
	
	public Pasteleria(String sabor, double precioLitro, double volumen, boolean extraNormal, int[] cantTartas) {
		this.sabor = sabor;
		this.precioLitro = precioLitro;
		this.volumen = volumen;
		this.extraNormal = extraNormal;
		this.cantTartas = cantTartas;
	}
	public Pasteleria() {
		
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
	public boolean isExtraNormal() {
		return extraNormal;
	}
	public void setExtraNormal(boolean extraNormal) {
		this.extraNormal = extraNormal;
	}
	public int[] getCantTartas() {
		return cantTartas;
	}
	public void setCantTartas(int[] cantTartas) {
		this.cantTartas = cantTartas;
	}
	public void rellenarTartas(int hasta, int desde) {
		int uno=1;
		Random rnd =new Random(System.nanoTime());
		for(int i=0;i<cantTartas.length;i++) {
			cantTartas[i]=rnd.nextInt(hasta-desde+uno)+desde;
		}
	}
	public void imprimirTartas() {
		System.out.println("------");
		System.out.println("SEMANA");
		System.out.println("------");
		for(int i=0;i<cantTartas.length;i++) {
			System.out.println("DÍA "+(1+i)+"= "+cantTartas[i]+" tartas");
		}
	}
	public double calcularPrecioFab() {
		return precioLitro*volumen;
	}
	public void imprimirPrecioFab() {
		System.out.printf("El precio del litro es: %.2f€\n",precioLitro);
		System.out.printf("El volumen en litros es: %.2f litros\n",volumen);
		System.out.printf("El coste de fabricación es: %.2f€\n",calcularPrecioFab());
	}
	public double calcularPrecioVent(double porcent) {
		int cien=100;
		return calcularPrecioFab()+(calcularPrecioFab()*porcent/cien);
	}
	public void imprimirPrecioVent(double porcent) {
		System.out.printf("Precio de fabricación: %.2f€\n",calcularPrecioFab());
		System.out.printf("Porcentaje aplicado de ganancia: %.2f porciento\n", porcent);
		System.out.printf("Precio de venta al público: %.2f€\n", calcularPrecioVent(porcent));
	}
	public double calcularExtra(double porcent, double costeExtra) {
		if(extraNormal) {
			return calcularPrecioVent(porcent)+costeExtra;
		}else {
			return calcularPrecioVent(porcent);
		}
	}
	public void imprimirExtra(double porcent, double costeExtra) {
		if(extraNormal) {
			System.out.printf("El coste añadido por extra es: +%.2f€\n", costeExtra);
			System.out.printf("El nuevo precio de venta con el extra es de: %.2f€\n", calcularExtra(porcent, costeExtra));
		}else {
			System.out.println("No se ha añadido extra");
		}
	}
	public int calcularTotalTartas() {
		int totalTartas=0;
		for(int i=0;i<cantTartas.length;i++) {
			totalTartas+=cantTartas[i];
		}
		return totalTartas;
	}
	public void imprimirTotalTartas() {
		imprimirTartas();
		System.out.println("------");
		System.out.println("TOTAL = "+calcularTotalTartas());
	}
	public void cambiarDiaTarta(int cambiarDia, int cambiarTartas) {
		cantTartas[cambiarDia-1]=cambiarTartas;
	}
	public double calcularMediaTartas(){
		return calcularTotalTartas()/cantTartas.length;
	}
	public void imprimirMediaTartas() {
		imprimirTotalTartas();
		System.out.printf("MEDIA = %.2f al día\n", calcularMediaTartas());
	}
	@Override
	public String toString() {
		return "Pasteleria [sabor=" + sabor + ", precioLitro=" + precioLitro + ", volumen=" + volumen + ", extraNormal="
				+ extraNormal + ", cantTartas=" + Arrays.toString(cantTartas) + "]";
	}
	
	
}
