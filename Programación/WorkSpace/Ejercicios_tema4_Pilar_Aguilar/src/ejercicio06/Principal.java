package ejercicio06;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	*Implementar un programa para un banco, donde se gestione la parte de cuentas de un usuario. 
	*Este banco solo y exclusivamente tiene 3 tipos de cuentas, cuenta corriente, cuenta joven y 
	*cuenta empresa. Cada una de ellas se caracteriza por:
		• La cuenta corriente paga mantenimiento fijo y acumula puntos cuando se usa en el cajero.
		• La cuenta joven no tiene mantenimiento y además, se le regala 1€ cada vez que hace un 
			ingreso.
		• La cuenta de empresa, no tiene cuota de mantenimiento, pero el banco cobra un euro a la 
		empresa cuando saca dinero ya que está pensada para hacer transferencias y no usar dinero 
		en efectivo.
	El cliente tendrá un saldo, podrá sacar o meter dinero (reintegro e ingreso) por el cajero y 
	dependiendo del tipo de cuenta se le hará un determinado cálculo y se le actualizará el saldo. 
	Hacer una clase oficina con un array de cuentas y probar los métodos anteriores, calcular el 
	total de dinero que tiene la oficina entre todas las cuentas, cuánto se ha ganado la oficina 
	por las veces que las cuentas de empresa han sacado dinero, cuánto ha gastado la oficina del 
	banco en regalar el euro cuando se ingresa dinero en una cuenta joven, etc.
	Ampliación: Quien lo desee, puede plantearse alguna clase más, como la clase cliente que puede 
	tener varias cuentas o que en la clase Oficina también haya un atributo que sea la lista de 
	Clientes.
	*/
		
	Cuenta [] listaCuentas;
	Oficina ofi;
	int tam = 3, op = 0;
	double cantIngresada = 0.0, cantRetirada = 0.0;
	
	
		
	
	listaCuentas= new Cuenta[tam];
	listaCuentas[0] = new CuentaCorriente("Pepe", 0001, 1500.00, 100.00, 0);
	listaCuentas[1]= new CuentaJoven("Manolo", 0002, 500.65, 0.0);
	listaCuentas[2]= new CuentaEmpresa("Azulejos S.L", 0003, 50000.43, 0);
	
	
	do {
		System.out.println("Elija una opción");
		imprimirMenu();
		op = Leer.datoInt();
		
		switch (op) {
			case 1:
				System.out.println("Indique la cantidad que va a ingresar");
				cantIngresada = Leer.datoDouble();
				for (int i = 0; i < listaCuentas.length; i++) {
					listaCuentas[i].ingresarDinero(cantIngresada);
				}
				
				break;
			
			case 2:
				System.out.println("Indique la cantidad que va a retirar");
				cantRetirada = Leer.datoDouble();
				for (int i = 0; i < listaCuentas.length; i++) {
					listaCuentas[i].retirarDinero(cantRetirada);
				}
				break;
				
			case 3: 
				//System.out.println(ofi.calcularTotalCuentas());
				break;
			case 4:
				//ofi.calcularGanancias(cantIngresada);
				break;
				
			case 5:
				//ofi.calcularPerdidas(cantIngresada);
				break;
				
			case 0:
				System.out.println("Gracias por usar el prgrama");
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		
	} while (op != 0);
	
	
		
	}
	
	public static void imprimirMenu() {
		System.out.println("**********************************");
		System.out.println("1 - Ingresar dinero");
		System.out.println("2 - Retirar dinero");
		System.out.println("3 - Total dinero en oficina");
		System.out.println("4 - Total ganancias oficina");
		System.out.println("5 - Total perdidas oficina");
		System.out.println("0 - Salir");
		System.out.println("**********************************");
	}

}
