package ejercicio06;

import java.util.Arrays;

public class Oficina {

	private Cuenta [] listaCuentas;

	public Cuenta[] getListaCuentas() {
		return listaCuentas;
	}

	public void setListaCuentas(Cuenta[] listaCuentas) {
		this.listaCuentas = listaCuentas;
	}

	@Override
	public String toString() {
		return "Oficina [listaCuentas=" + Arrays.toString(listaCuentas) + ", toString()=" + super.toString() + "]";
	}

	public Oficina(Cuenta[] listaCuentas) {
		super();
		this.listaCuentas = listaCuentas;
	}
	
	
	public double calcularTotalCuentas() {
		double suma = 0;
		for (int i = 0; i < listaCuentas.length; i++) {
			suma += listaCuentas[i].getSaldo(); 
		}
		return suma;
	}
	
	public double calcularGanancias(double cantRetirada) {
		double ganancia = 0, cantidad = 0;
		for (int i = 0; i < listaCuentas.length && listaCuentas[i] != null; i++) {
			//ganancia += listaCuentas[i].
			if (listaCuentas[i] instanceof CuentaEmpresa) {
				((CuentaEmpresa)listaCuentas[i]).retirarDinero(cantRetirada);;
				ganancia++;
			}
		}
		
		return ganancia;
	}
	
	
	public double calcularPerdidas(double cantIngresada) {
		double perdida = 0, cantidad = 0;
		for (int i = 0; i < listaCuentas.length && listaCuentas[i] != null; i++) {
			//perdida += listaCuentas[i].
			if (listaCuentas[i] instanceof CuentaEmpresa) {
				((CuentaEmpresa)listaCuentas[i]).ingresarDinero(cantIngresada);
				perdida++;
			}
		
		}
		return perdida;
	}
	
	public Cuenta findById(int codigo) {
		
		int i=0;
		boolean encontrado=false;
		
		while(i<listaCuentas.length && !encontrado) {
			Cuenta aux = listaCuentas[i];
			if(aux.getNumCuenta() == codigo) {
				encontrado=true;
			}else {
				i++;
			}
		}
		if(encontrado) {
			return listaCuentas[i];
		}else {
			return null;
		}
	}
	
	public void mostrarCuentas() {
		for (int i = 0; i < listaCuentas.length && listaCuentas[i] != null; i++) {
			System.out.println(listaCuentas[i]);
		}
	}
	
	public void ingresarSaldoCuenta (Cuenta c, double ingreso) {
		c.ingresarDinero(ingreso);
	}

}
