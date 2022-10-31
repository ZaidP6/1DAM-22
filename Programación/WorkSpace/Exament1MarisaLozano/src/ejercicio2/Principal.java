package ejercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	double cable=100, portalamp= 300, timbres=20, polimeros=3, pCable=0.14, pPorta=0.68, pTimbre=1.5, pPoli=15.5;
	double iva=21, cien=100,pTotalC=0.0, pTotalPorta=0.0, ptotalTim=0.0, ptotalPoli=0.0, ivaCable=0.0, ivaPorta=0.0;
	double ivaTimbr=0.0, ivapoli=0.0, pC=0.0, pPortal=0.0, pTim=0.0, pPol=0.0, pTotaltodo=0.0, dineroCole=400, sobra=0.0;
	double totalIva=0.0;
	
		pC=cable*pCable;
		ivaCable=pC*iva/cien;
		pTotalC=pC+ivaCable;
	
	System.out.printf("El precio total del cable es: %.2f Euros\n",pTotalC);
		pPortal=portalamp*pPorta;
		ivaPorta=pPortal*iva/cien;
		pTotalPorta=pPortal+ivaPorta;
	
	System.out.printf("El precio total de los portalámparas es: %.2f Euros\n",pTotalPorta);
		pTim=timbres*pTimbre;
		ivaTimbr=pTim*iva/cien;
		ptotalTim=pTim+ivaTimbr;
		
	System.out.printf("El precio total de los timbres es: %.2f Euros\n",ptotalTim);
	
		pPol=polimeros*pPoli;
		ivapoli=pPol*iva/cien;
		ptotalPoli=pPol+ivapoli;
		
	System.out.printf("El precio total de los polímeros es: %.2f Euros\n",ptotalPoli);
	
		totalIva=ivaCable+ivaPorta+ivaTimbr+ivapoli;
		pTotaltodo=pTotalC+pTotalPorta+ptotalTim+ptotalPoli;
		sobra=dineroCole-pTotaltodo;
	
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.println("----------                        ALBARÁN DETALLADO                                    -------------");
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.println("\n");
	
	System.out.println("Producto \t\t Cantidad \t\t P.Unitario \t\t Precio total sin IVA");
	System.out.printf("Cable \t\t\t %.2f \t\t %.2f \t\t\t\t\t %.2f €\n",cable,pCable,pC);
	System.out.printf("Portalámparas \t\t %.2f \t\t %.2f \t\t\t\t\t %.2f €\n",portalamp,pPorta,pPortal);
	System.out.printf("Timbres \t\t %.2f \t\t\t %.2f \t\t\t\t\t %.2f €\n",timbres,pTimbre,pTim);
	System.out.printf("Polímeros \t\t %.2f \t\t\t %.2f \t\t\t\t\t %.2f €\n",polimeros,pPoli,pPol);
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.printf("\t\t\t\t\t\t\t\t\t\t IVA %.2f €\n",totalIva);
	System.out.printf("\t\t\t\t\t\t\t\t\t\t TOTAL %.2f €\n",pTotaltodo);
	System.out.printf("\t\t\t\t\t\t\t\t\t\t CAMBIO %.2f €\n",sobra);
	
	System.out.println("----------------------------------------------------------------------------------------------------");
	System.out.printf("Al colegio le sobrarán %.2f €\n",sobra);
		
	
		
		
		

	
	
	

	}

}
