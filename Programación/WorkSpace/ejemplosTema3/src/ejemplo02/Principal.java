package ejemplo02;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        String nombre;
        double precio=0.0, precioNUevo=0.0;
        Producto prod;
        
        System.out.println("Diga el nombre del producto");
        nombre=Leer.dato();
        System.out.println("Diga el precio base");
        precio=Leer.datoDouble();
        //aquí crea el objeto 
        prod=new Producto (precio,nombre);
        
        //llamas al set y al get para que puedas acceder y modificar los atributos 
        //imprime el nombre del producto.
        System.out.println(prod.getNombre());
        //modifica el precio del producto
        System.out.println("Diga nuevo precio white monday");
         precioNUevo=Leer.datoDouble();
         prod.setPrecio(precioNUevo);
         
        System.out.println("El nuevo precio es de: "+prod.getPrecio()+" Euros");
    }
    
   
    
    

}