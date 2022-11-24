package ejemplo02;

public class Producto {
	
	    /*Atributos, vamos a ponerle a todos los atributos private, como los atributos están privados, vamos a crear métodos 
	    public, para poder acceder a los atributos, ya que esos métodos public están dentro de la clase de los atributos privados, se llaman
	    Getters and setters*/
	    // A todos los métodos, incluido los constructores se les pone public 
	    private double precio;
	    private String nombre;
	    //Constructor
	    public Producto (double precio, String nombre) {
	        this.precio=precio;
	        this.nombre=nombre;
	    }
	    
	    //Getters and setters, un get y un set por cada atributo
	    //al get no se le pasa nada y devuelve
	    
	    public double getPrecio() {
	        return precio;
	    }
	    
	    //al set se le pasa "lo que sea" y no devuelve 
	    
	    public void setPrecio(double precio) {
	        this.precio=precio;
	    }
	    
	    
	    public String getNombre() {
	        
	        return nombre;    
	    }
	    
	    public void setNombre(String nombre) {
	        
	        this.nombre=nombre;
	    }

	    //toString nos devuelve una cadena con el valor de todos los atributos qu estan definidos en esa clase de todos los metodos
	    
		public String toString() {
			return "Producto [precio=" + precio + ", nombre=" + nombre + "]";
		}
	    
	   
	    
	    

}

