package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0;
		boolean pago = true;
		
		Cancion []listaCan=  new Cancion();
		
		listaCan[0] = {001, "Una loba como yo", "Shakira", 62,true, 2.5 };
		listaCan[1] = {002, "No, no, no", "Amy Winehouse", 34,false, 4.3 };
		listaCan[2] = {003, "I see fire", "Edd Sheeran", 78,false, 3.25 };


		do {
			System.out.println("Por favor, elija una opción.");
			imprimirMenu();
			
			op = Leer.datoInt();
			
			switch (op) { /*Cada case en el que haya que mostrar se usará un public void para imprimir el resultado en pantalla.*/
				case 1:
					/*Se haría creando un método con un for para recorrer todas las canciones 
					 * y que compruebe si pago es false, si es así, que imprima la canción. Si 
					 * fuera true y la cacnión por tanto fuera de pago, éste pasaría a la siguiente sin mostrar nada.*/
					break;
					
				case 2:
					/*En este caso usaríamos un for ya que hay que comprobar todas las canciones. En este bucle se usaria 
					 * un max y éste compararía si la canción de esa posición dura más que lo que hay guardado en max, si 
					 * no lo es pasaría al siguiente, así hast terminar el array. Una vez recorrido se imprimiría la duración 
					 * mayor y a qué canción pertenece.*/
					break;
					
				case 3:
					/*Se haría igual que el case 1 salvo porque éste ha de comparar con un compareTo.El usuario introduciría el intérprete 
					a buscar y con el compareTo iría comparando qué canciones tienen también este intérprete. Luego se imprimiría en 
					pantalla todas las canciones que han coincidido.*/
					break;
					
				case 4:
					/*Cada canción lleva un contador que cada vez que se reproduce la canción entera suma 1. Luego buscaríamos con un for la
					canción que tenga más repeticiones. En este caso sería semejante al case 2, con un max que vaya guardando el mayor y al 
					final indicando qué canción ha sido la más escuchada.*/
					break;
					
				case 5:
					/*Se le pide al usuario que elija una cancnión, una vez elejida se dice que cambie pago a gratis o viceversa, es decir, si 
					había un true poner un false y si había un false poner un true. La canción se buscaría de la misma manera que en el case 1 
					en caso de cambiar de gratis a de pago, si fuera el caso contrario se crearía un nuevo método justo lo contrario para que 
					buscase las canciones de pago y poder poner la que se elija gratis. Cabría ptra posibilidad, sin buscar ninguna en concreto 
					se podría mostrar toda la lista y luego escoger la canción a editar. El muestreo de todas las canciones se aplica en el case 10.*/
					break;
					
				case 6:
					/*Sé que habría que ponerle un - delenate porque te las puede ordenar de mayor a menor (depende se cómo se haya escrito el código).*/
					break;
					
				case 7:
					break;
					
				case 8:
					/*Se le mostraría la lista completa al susuario de canciones, éste debe escribir los id de las canciones que desea añadir a la otra lista.
					Previavente se ha creado una lista nueva en la que se irán guardando los datos de las id que introduzca el usuario. Una vez elegidas, 
					éstas estarán en una lista ArrayList y por tanto ya estrán desordendas para que las pueda reproducir eleatoriamente.*/
					break;
					
				case 9:
					/*Esta opción no es muy diferente a las demás. Habría que recorrer el array con un for, creando una ariable suma que vaya sumando 
					los minutos de cada una de las canciones sobreescribiéndose (suma+=).*/
					break;
					
				case 10:
					/*Digamos que si tenemos todas las canciones en una bolsa, sacarlas de esa bolsa sin importar el orden, es decir, usamos un 
					iterator para mostrar todo el contenido de ese ArrayList.*/
					break;
	
				default:
					System.out.println("Índice incorrecto, vuelva a probar con los números del menú.");
					break;
			}
			
		} while (op != 0);
		
	}

	public static void  imprimirMenu() {
		System.out.println("*****************************************************************************");
		System.out.println("1 - Buscar todas las canciones gratis");
		System.out.println("2 - Buscar la canción de más duración");
		System.out.println("3 - Buscar las canciones del mismo intérprete");
		System.out.println("4 - Buscar la cancnión que más veces se ha escuchado");
		System.out.println("5 - Modificar canción (cambiar precio)");
		System.out.println("6 - Ordenar por intérprete alfabéticamente");
		System.out.println("7 - Ordenar por duración de la canción (de mayor a menor)");
		System.out.println("8 - Crear lista aleatoria");
		System.out.println("9 - Calcular la media de duración");
		System.out.println("10 - Mostrar todas las canciones disponibles");
		System.out.println("*****************************************************************************");
	}
	
}
