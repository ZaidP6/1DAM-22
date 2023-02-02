package ejemplo_interfaces;

public class Animal implements IDepredador, IPresa{

	private String color;
	private int numPatas;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public Animal(String color, int numPatas) {
		super();
		this.color = color;
		this.numPatas = numPatas;
	}
	@Override
	public String toString() {
		return "Animal [color=" + color + ", numPatas=" + numPatas + ", toString()=" + super.toString() + "]";
	}
	
	public void localizar() {
		// TODO Auto-generated method stub
		System.out.println("Estoy localizando");
	}
	public void cazar() {
		// TODO Auto-generated method stub
		System.out.println("Me he cargado algo "+color);
	}
	@Override
	public void huir() {
		// TODO Auto-generated method stub
		System.out.println("Me las piro");
	}
	@Override
	public void observar() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
