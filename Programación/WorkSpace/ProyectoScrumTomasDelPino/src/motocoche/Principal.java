package motocoche;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int op = 0, cero = 0;
		int carnet = 0;
		int opcion1 = 0; // opcion para elegir moto O coche
		int opcion2 = 0; //elige la gama de coche
		int opcion3 = 0; //elige uno de 3 modelos para cada gama de coche
		int opcion4 = 0; // elige el carnet de moto
		int opcion5 = 0; // elige uno de 3 modelos para cada carnet de moto
		int opcion6 = 0; // ¿desea customizar? Sirve para motos Y coches
		int opcion7 = 0; // Elige una de las opciones de customización
		int opcion8 = 0; // Elige el color
		int numCarnets=4,numModelos=3,numGamas=3,numColores=5,numero=1,hasta,desde,descuento;
		int Si = 1;

		int [] preciosLlantas= {10,20,30}; //Baja/Media/Alta
		int [][] preciosCoches={{10,10,10},{20,20,20},{30,30,30}}; //Baja/Media/Alta
		int [][] preciosMotos={{2920,3899,3679},{4095,2199,3499},{7299,6640,5550},{26490,10550,8290}}; //AM/A1/A2/A
		String [] colores= {"Amarillo","Rojo","Azul","Rosa","Verde"}; //Colores para pintar los coches
		String [] [] modelosCoche = new String [numGamas][numModelos]; //Matriz 3x3
		String [] [] modelosMoto ={{"Peugeot Speedfight 50 4T", "Vespa Primavera 50", "Aprilia RX 50 Factory"}, 
									{"Suzuki GSX-S 125", "Sym Symphony 125 SR", "Yamaha Nmax 125"}, {"Yamaha MT-07 limitada", "BMW G 310 GS", "Honda CB 300 R"}, 
									{"Ducati Panigale V4", "Kawasaki Z900", "Yamaha FZ6 ABS S2"}}; //Matriz 4x3
		double [][] potenciaM = {{3,3.2,6.8},{15,12,12},{73.4, 34,30.7},{214,125,98}};
		double [][] pesoM = {{97,100,104},{133,120,131},{184,169.5,144},{175,210,206}};
		int [][] cilindrosM ={{1,1,1},{1,1,1},{2,1,1},{4,4,4}};
		double [][] litrosM = {{8,7,7.5},{11,4.8,7.1},{14,11,10},{16,17,19.4}};
		String [][] colorAM = {{"Iceblade", "Flat 6 Red", "Fluo Apple Green", "Bleu France", "Darkside", "Pure"}, {"Blanco", "Marrón", "Negro"}, 
				{"Azul energía", "Blanco", "Naranja","Gris delicado", "Verde", "Negro Glossy"},
				{"Red boost", "2018"}}; //Matriz 3x6
		String [][] colorA1 = {{"Azul trirón metálico", "Negro titán", "Blanco perlado brillante"}, {"Blanco SR", "Negro SR", "Rojo SR", "Plata SR"},{"Milky white", "Phantom blue","Power grey"}}; //Matriz 3x4
		String [][] colorA2 = {{"Cyan storm", "Icon blue", "Tech black", "Storm fluo"}, {"Negro cosmos", "Rally", "40th aniversario", "Triple black", "Gris", "Sport"},
				{"Azul agile mate perlado", "Rojo chromosphere candy","Negro gunpowder mate metalizado", "Amarillo dusk perlado"}}; //Matriz 3x6
		String [][] colorA = {{"Rojo Ducati", "Version SP"}, {"Candy lime green", "Metallic spark black", "Pearl robotic white", "50th aniversario", "Versión SE"},
				{"Powerblue", "Competition white", "Midnight black", "Metallic silver"}}; //Matriz 3x5
		
		
		
		Random rnd=new Random(System.nanoTime());


		do {
			System.out.println("Por favor, indique el índice del carnet que tiene.");
			System.out.println("1 - AM o B con menos de 3 años de antigüedad.");
			System.out.println("2 - A1 o B con más de 3 años de antigüedad");
			System.out.println("3 - A2.");
			System.out.println("4 - A");
			System.out.println("0 - Salir");
			System.out.println("************************************************************************");
			
			opcion4 = Leer.datoInt();
			
			switch (opcion4) {
			
				case 1:
					System.out.println("Estupendo, usted a eligido el carnet AM o B. Estas son las motos disponibles específicas para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - "+modelosMoto[0][0]);
					System.out.println("2 - "+modelosMoto[0][1]);
					System.out.println("3 - "+modelosMoto[0][2]);
					System.out.println("0 - Volver a la opción anterior");
					System.out.println("************************************************************************");
					System.out.println("Recuerde que si ha elegido el carnet B, puede acceder también a los coches.");
					System.out.println("¿Qué moto desea ver? Indique el índice, por favor.");
					
					opcion5 = Leer.datoInt();
					System.out.println("************************************************************************");
					
						switch (opcion5) {
							case 1:
								System.out.println("Estupendo, usted a eligido la "+modelosMoto[0][0]);
								System.out.println("Estas son las especificaiones técnicas:");
								System.out.println("- Precio: "+preciosMotos[0][0]+"€");
								System.out.println("- Potencia: "+potenciaM[0][0]+"CV");
								System.out.println("- Peso en parado: "+pesoM[0][0]+"Kg");
								System.out.println("- Cantidad de cilindros: "+cilindrosM[0][0]);
								System.out.println("- Capacidad tanque gasolina: "+litrosM[0][0]+"L.");
								System.out.println("- ABS: no.");
								System.out.println("************************************************************************");
								
								System.out.println("¿Desearía customizar la moto?");
								System.out.println("1 - SÍ.");
								System.out.println("2 - NO.");
								
								
								if (Si == 1 ) {
									System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[0][0]);
		
								}else {
									System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[0][0]+"€");
									}
								break;
							
							case 2:
								System.out.println("Estupendo, usted a eligido la "+modelosMoto[0][1]);
								System.out.println("Estas son las especificaiones técnicas:");
								System.out.println("- Precio: "+preciosMotos[0][1]+"€.");
								System.out.println("- Potencia: 3CV.");
								System.out.println("- Peso en parado: 100Kg.");
								System.out.println("- Cantidad de cilindros: 1.");
								System.out.println("- Capacidad tanque gasolina: 7,5.");
								System.out.println("- ABS: no.");
								System.out.println("************************************************************************");
								break;
	
								
							case 3:
								System.out.println("Estupendo, usted a eligido la Aprilia RX 50 Factory.");
								break;
								
							default:
								break;
						}

					break;
					
				case 2:
					System.out.println("Estupendo, usted a eligido el carnet A1 o B con más de 3 años. Estas son las motos específicas disponibles para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - Suzuki GSX-S 125.");
					System.out.println("2 - Sym Symphony 125 SR.");
					System.out.println("3 - Yamaha Nmax 125.");
					System.out.println("Recuerde que si ha elegido el carnet B, puede acceder también a los coches.");
					opcion5 = Leer.datoInt();
					break;
					
				case 3:
					System.out.println("Estupendo, usted a eligido el carnet A2. Estas son las motos específicas dsiponibles para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - Yamaha MT-07 limitada");
					System.out.println("2 - BMW G 310 GS.");
					System.out.println("3 - Honda CB 300 R.");
					opcion5 = Leer.datoInt();
					break;
					
				case 4:
					System.out.println("Estupendo, usted a eligido el carnet A. Estas son las motos específicas dsiponibles para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - Ducati Panigale V4");
					System.out.println("2 - Kawasaki Z900");
					System.out.println("3 - Yamaha FZ6 ABS S2");
					opcion5 = Leer.datoInt();
					break;
					
				case 5:
					System.out.println("Estas son todas las motos disponibles.\n¿Qué moto quiere ver?");
					System.out.println("1 - Peugeot Speedfight 50 4T.");
					System.out.println("2 - Vespa Primavera 50.");
					System.out.println("3 - Aprilia RX 50 Factory.");
					System.out.println("4 - Suzuki GSX-S 125.");
					System.out.println("5 - Sym Symphony 125 SR.");
					System.out.println("6 - Yamaha Nmax 125.");
					System.out.println("7 - Yamaha MT-07 limitada");
					System.out.println("8 - BMW G 310 GS.");
					System.out.println("9 - Honda CB 300 R.");
					System.out.println("10 - Ducati Panigale V4");
					System.out.println("11 - Kawasaki Z900");
					System.out.println("12 - Yamaha FZ6 ABS S2");
					opcion5 = Leer.datoInt();
					break;
				
				default:
					System.out.println("Número erróneo, vuelva a introducir otro número.");
			}
			
			
			
			System.out.println("************************************************************************");
			System.out.println("Para salir pulse 0. Para volver al menú pulse cualquier otro número.");
			opcion4 = Leer.datoInt();
			
		}while (opcion4 != cero);
		
		
		System.out.println("Gracias por visitar MOTOCOCHE.");
		
		
	}
}