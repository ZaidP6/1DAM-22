package ejemplo05_paso_parametro;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //para comprender que dferencia hay en un método al que se le pasa un parametro básico/primitivos o al que se le pasan objetos 
        /*dentro de la clase ppal tenemos un método estatico para no tener que crear una clase con objetos para llamarlos, se hace por 
        //ejemplo con la clase Leer*/
        
        
        
        int x=1, y=2;
        
        System.out.println("Valores e x e y antes de la modificación");
        System.out.println("x="+x+";y="+y);
        modifyPrimitiveTypes(x, y);
        
        System.out.println("Valores de x e y después de la modificación:");
        System.out.println("x="+x+";y="+y);
        
    }
    
    private static void modifyPrimitiveTypes(int x, int y) {
        
        x=5;
        y=10;

    }

}