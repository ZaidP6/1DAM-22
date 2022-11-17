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
		

		int [] preciosLlantas= {10,20,30}; //Baja/Media/Alta
		int [][] preciosCoches={{10,10,10},{20,20,20},{30,30,30}}; //Baja/Media/Alta
		int [][] preciosMotos={{2920,3899,3679},{4095,2199,3499},{7299,6640,5550},{26490,10550,8290}}; //AM/A1/A2/A
		String [] colores= {"Amarillo","Rojo","Azul","Rosa","Verde"}; //Colores para pintar los coches
		String [] [] modelosCoche = new String [numGamas][numModelos]; //Matriz 3x3
		String [] [] modelosMoto ={{"Peugeot Speedfight 50 4T", "Vespa Primavera 50", "Aprilia RX 50 Factory"}, 
									{"Suzuki GSX-S 125", "Sym Symphony 125 SR", "Yamaha Nmax 125"}, {"Yamaha MT-07 limitada", "BMW G 310 GS", "Honda CB 300 R"}, 
									{"Ducati Panigale V4", "Kawasaki Z900", "Yamaha FZ6 ABS S2"}}; //Matriz 4x3
		
		double [][] potenciaM = {{3,3.2,6.8},{15,12,12},{73.4, 34,30.7},{214,125,98}}; //potencia en CV
		double [][] pesoM = {{97,100,104},{133,120,131},{184,169.5,144},{175,210,206}}; //peso en seco en Kg
		int [][] cilindrosM ={{1,1,1},{1,1,1},{2,1,1},{4,4,4}};							//cantidad ed cilindros
		double [][] litrosM = {{8,7,7.5},{11,4.8,7.1},{14,11,10},{16,17,19.4}};			//cantidad de litros de gasolina
		String [][] colorAM = {{"Iceblade", "Flat 6 Red", "Fluo Apple Green", "Bleu France", "Darkside", "Pure"}, {"Blanco", "Marrón", "Negro"}, 
				{"Azul energía", "Blanco", "Naranja","Gris delicado", "Verde", "Negro Glossy"},
				{"Red boost", "2018"}}; //Matriz 3x6  Colores motos AM
		
		String [][] colorA1 = {{"Azul trirón metálico", "Negro titán", "Blanco perlado brillante"}, {"Blanco SR", "Negro SR", "Rojo SR", "Plata SR"},{"Milky white", "Phantom blue","Power grey"}}; //Matriz 3x4 Colores motos A1
		String [][] colorA2 = {{"Cyan storm", "Icon blue", "Tech black", "Storm fluo"}, {"Negro cosmos", "Rally", "40th aniversario", "Triple black", "Gris", "Sport"},
				{"Azul agile mate perlado", "Rojo chromosphere candy","Negro gunpowder mate metalizado", "Amarillo dusk perlado"}}; //Matriz 3x6 Colores motos A2
		String [][] colorA = {{"Rojo Ducati", "Version SP"}, {"Candy lime green", "Metallic spark black", "Pearl robotic white", "50th aniversario", "Versión SE"},
				{"Powerblue", "Competition white", "Midnight black", "Metallic silver"}}; //Matriz 3x5 Colores motos A
		
		
		
		Random rnd=new Random(System.nanoTime());


		do {		//se pregunta el carnet que tiene
			System.out.println("Por favor, indique el índice del carnet que tiene.");
			System.out.println("1 - AM o B con menos de 3 años de antigüedad.");
			System.out.println("2 - A1 o B con más de 3 años de antigüedad");
			System.out.println("3 - A2.");
			System.out.println("4 - A");
			System.out.println("5 - Quiero ver todas las posibiliades.");
			System.out.println("0 - Salir");
			System.out.println("************************************************************************");
			
			opcion4 = Leer.datoInt();
			
			switch (opcion4) { //diferentes opciones segun el carnet elegido
			
				case 1:
					
					do {
					
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
					
						switch (opcion5) { //caracteristicas moto1 AM
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
								
								opcion6 = Leer.datoInt();
								
								if (opcion6 == 1 ) {
									System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
		
								}else {
									System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
									}
								break;
							
							case 2:			//caracteristicas moto2 AM
								System.out.println("Estupendo, usted a eligido la "+modelosMoto[0][1]);
								System.out.println("Estas son las especificaiones técnicas:");
								System.out.println("- Precio: "+preciosMotos[0][1]+"€");
								System.out.println("- Potencia: "+potenciaM[0][1]+"CV");
								System.out.println("- Peso en parado: "+pesoM[0][1]+"Kg");
								System.out.println("- Cantidad de cilindros: "+cilindrosM[0][1]);
								System.out.println("- Capacidad tanque gasolina: "+litrosM[0][1]+"L.");
								System.out.println("- ABS: no.");
								System.out.println("************************************************************************");

								System.out.println("¿Desearía customizar la moto?");
								System.out.println("1 - SÍ.");
								System.out.println("2 - NO.");
								
								opcion6 = Leer.datoInt();
								
								if (opcion6 == 1 ) {
									System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
		
								}else {
									System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
									}
								break;
	
								
							case 3:			//caracteristicas moto3 AM
								System.out.println("Estupendo, usted a eligido la "+modelosMoto[0][2]);
								System.out.println("Estas son las especificaiones técnicas:");
								System.out.println("- Precio: "+preciosMotos[0][2]+"€");
								System.out.println("- Potencia: "+potenciaM[0][2]+"CV");
								System.out.println("- Peso en parado: "+pesoM[0][2]+"Kg");
								System.out.println("- Cantidad de cilindros: "+cilindrosM[0][2]);
								System.out.println("- Capacidad tanque gasolina: "+litrosM[0][2]+"L.");
								System.out.println("- ABS: no.");
								System.out.println("************************************************************************");
								
								System.out.println("¿Desearía customizar la moto?");
								System.out.println("1 - SÍ.");
								System.out.println("2 - NO.");
								
								opcion6 = Leer.datoInt();
								
								if (opcion6 == 1 ) {
									System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
		
								}else {
									System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
									}
								break;
								
							case 0:
								
								
							default:
								break;
						}
					}while(opcion5 != cero);

					break;
					
				case 2:
					
					do { 			//elegimos moto del carnet A1
					
					System.out.println("Estupendo, usted a eligido el carnet A1 o B con más de 3 años. Estas son las motos disponibles específicas para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - "+modelosMoto[1][0]);
					System.out.println("2 - "+modelosMoto[1][1]);
					System.out.println("3 - "+modelosMoto[1][2]);
					System.out.println("0 - Volver a la opción anterior");
					System.out.println("************************************************************************");
					System.out.println("Recuerde que si ha elegido el carnet B, puede acceder también a los coches.");
					System.out.println("¿Qué moto desea ver? Indique el índice, por favor.");
					
					opcion5 = Leer.datoInt();
					System.out.println("************************************************************************");
					
					switch (opcion5) {
						case 1:			//caracteristicas moto1 A1
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[1][0]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[1][0]+"€");
							System.out.println("- Potencia: "+potenciaM[1][0]+"CV");
							System.out.println("- Peso en parado: "+pesoM[1][0]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[1][0]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[1][0]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
						
						case 2:			//caracteristicas moto2 A1
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[1][1]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[1][1]+"€");
							System.out.println("- Potencia: "+potenciaM[1][1]+"CV");
							System.out.println("- Peso en parado: "+pesoM[1][1]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[1][1]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[1][1]+"L.");
							System.out.println("- ABS: no.");
							System.out.println("************************************************************************");

							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
								
						case 3:			//caracteristicas moto3 A1
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[1][2]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[1][2]+"€");
							System.out.println("- Potencia: "+potenciaM[1][2]+"CV");
							System.out.println("- Peso en parado: "+pesoM[1][2]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[1][2]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[1][2]+"L.");
							System.out.println("- ABS: no.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
						
						default:
							break;
				}
					}while(opcion5 != cero);
					
					break;
					
				case 3:			//elegir modelo moto A2
					
					do {
					
					System.out.println("Estupendo, usted a eligido el carnet A2. Estas son las motos disponibles específicas para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - "+modelosMoto[2][0]);
					System.out.println("2 - "+modelosMoto[2][1]);
					System.out.println("3 - "+modelosMoto[2][2]);
					System.out.println("0 - Volver a la opción anterior");
					System.out.println("************************************************************************");
					System.out.println("Recuerde que si ha elegido el carnet B, puede acceder también a los coches.");
					System.out.println("¿Qué moto desea ver? Indique el índice, por favor.");
					
					opcion5 = Leer.datoInt();
					System.out.println("************************************************************************");
					
					switch (opcion5) {		//caracteristicas moto1 A2
						case 1:
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[2][0]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[2][0]+"€");
							System.out.println("- Potencia: "+potenciaM[2][0]+"CV");
							System.out.println("- Peso en parado: "+pesoM[2][0]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[2][0]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[2][0]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
						
						case 2:				//caracteristicas moto2 A2
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[2][1]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[2][1]+"€");
							System.out.println("- Potencia: "+potenciaM[2][1]+"CV");
							System.out.println("- Peso en parado: "+pesoM[2][1]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[2][1]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[2][1]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
	
							
						case 3:				//caracteristicas moto3 A2
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[2][2]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[2][2]+"€");
							System.out.println("- Potencia: "+potenciaM[2][2]+"CV");
							System.out.println("- Peso en parado: "+pesoM[2][2]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[2][2]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[2][2]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");

							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
						
						default:
							break;
				}
					}while(opcion5 != cero);
					
					break;
					
				case 4:			//elegir modelos moto A
					
					do {
					
					System.out.println("Estupendo, usted a eligido el carnet A. Estas son las motos disponibles específicas para usted.\n¿Qué moto quiere ver?");
					System.out.println("1 - "+modelosMoto[3][0]);
					System.out.println("2 - "+modelosMoto[3][1]);
					System.out.println("3 - "+modelosMoto[3][2]);
					System.out.println("0 - Volver a la opción anterior");
					System.out.println("************************************************************************");
					System.out.println("Recuerde que si ha elegido el carnet B, puede acceder también a los coches.");
					System.out.println("¿Qué moto desea ver? Indique el índice, por favor.");
					
					opcion5 = Leer.datoInt();
					System.out.println("************************************************************************");
					
					switch (opcion5) {
						case 1:				//caracteristicas moto1 A
							
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[3][0]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[3][0]+"€");
							System.out.println("- Potencia: "+potenciaM[3][0]+"CV");
							System.out.println("- Peso en parado: "+pesoM[3][0]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[3][0]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[3][0]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
						
						case 2:				//caracteristicas moto2 A
							
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[3][1]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[3][1]+"€");
							System.out.println("- Potencia: "+potenciaM[3][1]+"CV");
							System.out.println("- Peso en parado: "+pesoM[3][1]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[3][1]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[3][1]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
	
							
						case 3:				//caracteristicas moto3 A
							
							System.out.println("Estupendo, usted a eligido la "+modelosMoto[3][2]);
							System.out.println("Estas son las especificaiones técnicas:");
							System.out.println("- Precio: "+preciosMotos[3][2]+"€");
							System.out.println("- Potencia: "+potenciaM[3][2]+"CV");
							System.out.println("- Peso en parado: "+pesoM[3][2]+"Kg");
							System.out.println("- Cantidad de cilindros: "+cilindrosM[3][2]);
							System.out.println("- Capacidad tanque gasolina: "+litrosM[3][2]+"L.");
							System.out.println("- ABS: si.");
							System.out.println("************************************************************************");
							
							System.out.println("¿Desearía customizar la moto?");
							System.out.println("1 - SÍ.");
							System.out.println("2 - NO.");
							
							opcion6 = Leer.datoInt();
							
							if (opcion6 == 1 ) {
								System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);
	
							}else {
								System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
								}
							break;
						
						default:
							break;
				}
					
					}while(opcion5 != cero);
					
					break;
					
				case 5:			//opcion a mostrar todo el catalogo
					
					do {		
					
					System.out.println("Estas son todas las motos disponibles.\n¿Qué moto quiere ver?");
					System.out.println("1 - "+modelosMoto[0][0]);		//AM		
					System.out.println("2 - "+modelosMoto[0][1]);		//AM
					System.out.println("3 - "+modelosMoto[0][2]);		//AM
					System.out.println("4 - "+modelosMoto[1][0]);		//A1
					System.out.println("5 - "+modelosMoto[1][1]);		//A1
					System.out.println("6 - "+modelosMoto[1][2]);		//A1
					System.out.println("7 - "+modelosMoto[2][0]);		//A2
					System.out.println("8 - "+modelosMoto[2][1]);		//A2
					System.out.println("9 - "+modelosMoto[2][2]);		//A2
					System.out.println("10 - "+modelosMoto[3][0]);		//A
					System.out.println("11 - "+modelosMoto[3][1]);		//A
					System.out.println("12 - "+modelosMoto[3][2]);		//A
					opcion5 = Leer.datoInt();
					
					System.out.println("Estas son las especificaiones técnicas:");
					System.out.println("- Precio: "+preciosMotos[opcion4-1][opcion5-1]+"€");
					System.out.println("- Potencia: "+potenciaM[opcion4-1][opcion5-1]+"CV");
					System.out.println("- Peso en parado: "+pesoM[opcion4-1][opcion5-1]+"Kg");
					System.out.println("- Cantidad de cilindros: "+cilindrosM[opcion4-1][opcion5-1]);
					System.out.println("- Capacidad tanque gasolina: "+litrosM[opcion4-1][opcion5-1]+"L.");
					System.out.println("- ABS: si.");
					System.out.println("************************************************************************");
					
					System.out.println("¿Desearía customizar la moto?");
					System.out.println("1 - SÍ.");
					System.out.println("2 - NO.");
					
					opcion6 = Leer.datoInt();
					
					if (opcion6 == 1 ) {
						System.out.println("¡Estupendo! Vamos a customizar la "+modelosMoto[opcion4-1][opcion5-1]);

					}else {
						System.out.println("En ese caso, el precio de tu moto sería: "+preciosMotos[opcion4-1][opcion5-1]+"€");
						}
				
					}while(opcion5 != cero);
				
				default:
					if (opcion5 != 0) {
						System.out.println("Número erróneo, vuelva a introducir otro número.");
					}
					
					break;
			}

			System.out.println("************************************************************************");
			System.out.println("Para salir pulse 0. Para volver al menú pulse cualquier otro número.");
			opcion4 = Leer.datoInt();
			
		}while (opcion4 != cero);
		
		
		System.out.println("Gracias por visitar MOTOCOCHE.");
		
		
	}
}