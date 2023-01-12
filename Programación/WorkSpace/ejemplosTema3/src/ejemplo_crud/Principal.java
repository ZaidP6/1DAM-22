package ejemplo_crud;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrudProducto crud2;
		Producto []listaCrud2;
		int tam;
		int op = 0;
		String nombre, codigo;
		float precioNuevo;
		
		
		
		
		System.out.println("Bienvenido");
		System.out.println("Diga cuántos productos habrá");
		tam = Leer.datoInt();
		
		listaCrud2= new Producto[tam];
		//en la clase CrudProducto debemos tener un constructor con este parámetro.
		crud2=new CrudProducto(listaCrud2);
		
		do {
			//imprimirMenu();
			
			op = Leer.datoInt();
			switch (op) {
				
				case 0:
					break;
				case 1:
					crud2.imprimirTodosLosProductos();
					System.out.println("Diga codigo a buscar");
					codigoABuscar = Leer.dato();
					crud2.findById(codigoABuscar);
					break;
				case 2:
					System.out.println("Diga código de producto");
					codigo = Leer.datoInt();
					System.out.println("Diga el nombre del producto");
					nombre = Leer.dato();
					System.out.println("Diga elñ precio de una unidad");
					precioU = Leer.datoFloat();
					crud2.add(new Producto(codigo, nombre, precioU, true), contadorP);
					contadorP++;
					break;
				case 3:
					System.out.println("Indique el codigo del producto a modificar");
					crud2.imprimirSoloActivos();
					codigo = Leer.dato();
					System.out.println("INdique ele precio nuevo");
					precioNuevo = Leer.datoFloat();
					crud2.editPrecio(codigo, precioNuevo);
					
					break;
					
				case 4:
					System.out.println("Diga el codigo del producto que desea borrar");
					codigo = Leer.dato();
					crud2.delete(crud2.findById(codigo));
					
					break;
					
				case 5: 
					crud2.imprimirSoloActivos();
					
					

				default:
					break;
			}
			
		}while(op!=0);
	}

	public static void imprimirMenu() {
		System.out.println("1 - Listar todos los productos"); //buscar un producto???
		System.out.println("2 - Añadir un nuevo producto");
		System.out.println("3 - Modificar precio de un producto");
		System.out.println("4 - Eliminar un producto");
		System.out.println("5 - Lista solo productos activos");
		System.out.println("0 - Salir");
		System.out.println("Ecriba qué opción quiere elegir");
	}
	
}
