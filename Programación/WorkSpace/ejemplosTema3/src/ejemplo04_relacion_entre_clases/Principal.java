package ejemplo04_relacion_entre_clases;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Racional f1 = new Racional(1,5); 
		Racional f2 = new Racional(2,3);
		
		Racional fTotal;
		Operacion op = new Operacion();
		
		fTotal = op.multiplicar(f1, f2);
		
		
	}

}
