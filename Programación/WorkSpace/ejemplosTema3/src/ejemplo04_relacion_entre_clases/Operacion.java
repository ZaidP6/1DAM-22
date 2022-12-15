package ejemplo04_relacion_entre_clases;

public class Operacion {

	public Operacion() {

	}

	public Racional multiplicar (Racional f1, Racional f2) {
		
		/*Racional f;
		int num, den;
		
		f = new Racional(num = f1.getNum ()*f2.getNum(), num = f1.getDen()*f2.getDen());
		
		return f;
		*/
		
		return new Racional(f1.getNum ()*f2.getNum(), f1.getDen()*f2.getDen());
		
	}
}
