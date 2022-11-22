package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String total;
        int entero=0,op=0;
        boolean res;
        Operaciones opep1;
        Operaciones opep2;
        
        System.out.println("Bienvenido al programa");
        System.out.println("Introduzca un número entero");
        entero=Leer.datoInt();
        do {
            
            
            System.out.println("1.- Para saber si el número es positivo o negativo");
            System.out.println("2.- Para saber si el número es par o impar");
            System.out.println("3.- Para calcular positivo con boleano");
            System.out.println("0.- Para salir");
                op=Leer.datoInt();
            switch (op){
            
                case 1:
                    opep1= new Operaciones(entero);
                    total=opep1.calcPosi(entero);
                    System.out.println("El número es: "+total);
                    break;
                    
                case 2:
                    opep2=new Operaciones (entero);    
                    total=opep2.calcularPar(entero);
                    System.out.println("El número es: "+total);
                    break;
                //para calcular con boleanos los numeros positivos o negativos 
                case 3:
                    opep1= new Operaciones(entero);
                    opep1.calcularPos(entero);
                    res=opep1.calcularPos(entero);
                    
                    //forma 1
                    System.out.println(res);
                    
                    //forma 2:chachi piruli 
                    opep1.imprimir(opep1.calcularPos(entero));
                    
                    //Forma 3: chachi piruli vol2
                    opep1.imprimir(res);
                    break;
                    
                case 0:
                    break;
                default:
                    System.out.println("Lo sentimos esa opción no está disponible, vuelva a intentarlo");
            }
            
        }while (op!=0);
        
        System.out.println("Gracias por usar el programa");
    }


		
}


