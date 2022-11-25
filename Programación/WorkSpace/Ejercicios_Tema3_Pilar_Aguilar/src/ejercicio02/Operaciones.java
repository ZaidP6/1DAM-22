package ejercicio02;

public class Operaciones {
	
	
	
	public Operaciones(int entero) {
	
	}

	public String calcPosi(int num) {
		int cero = 0;
		String resultado = "positivo";
		if(num>=cero) {
			//System.out.println("El número "+num+" es positivo.");
			return "positivo";
		}
		else {
			//System.out.println("El número "+num+" es negativo.");
		}
		return resultado;
	}
	
	//para calcularlo con boleanos
    public boolean calcularPos (int ent) {
        
        int cero=0;
        if (ent>cero) {
            return true;
        }else {
            return false;
        }
    }
        
    public void imprimir (boolean b) {
        if (b) {
            System.out.println("Positivo");
        }else {
            System.err.println("Negativo");
        }
    }
	
	public String calcularPar(int num) {
		int resto = 0, dos = 2, cero = 0;
		String resultado = "par";
		resto = num%dos;
		if (resto!=cero) {
			resultado = "impar";
			
		}
		else {
			
		}
		return resultado;
	}
	
	
	
	
	
	
}
