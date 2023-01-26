package ejemplo02_figuras;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Figura circulo = new Circulo(1,1,3);
		Figura cuadrado = new Cuadrado(2,2,5);
		
		System.out.printf("El área del cuadrado es de %.2f\n",cuadrado.calcularArea());
		System.out.printf("El área del círculo es de %.2f",circulo.calcularArea());
		
	}

}
