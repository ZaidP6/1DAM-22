package ejercicio12;

import utilidades.Leer;

public class Principal {

    public static void main(String[] args) {
    	
        String nombre;
        int reset=1;
        double hTrabajadas=0;
        double hExtra=0;
        double pHora=16;
        double pHoraExtra=20;
        double salarioExtra=0;
        double salarioSem=0;
        double semanas=4;
        double salarioMes=0; 
        double maxHoraSem=40;
        
        System.out.println("Bienvenido a la calculadora de salarios.");
        System.out.println("------------------------------------------");
        do {
            System.out.println("¿Cómo se llama el trabajador?");
            nombre=Leer.dato();
            
            System.out.println("¿Cuántas horas ha trabajado esta semana?");
            hTrabajadas=Leer.datoDouble();
            
            if (hTrabajadas<=40){
                salarioSem=hTrabajadas*pHora;
                salarioMes=salarioSem*semanas;
                System.out.printf("El salario semanal de %s son %.2f€, y el mensual son %.2f€.\n", nombre, salarioSem, salarioMes);
            }else if (hTrabajadas>40){
                salarioSem=hTrabajadas*pHora;
                hExtra=hTrabajadas-maxHoraSem;
                salarioExtra=hExtra*pHoraExtra;
                salarioMes=salarioSem*semanas+salarioExtra;
                System.out.printf("El salario semanal sin horas extras de %s es %.2f€. Añadinedo %.0f horas extra, que serían %.2f€.\nUn total semanal de %.2f€, que al mes son %.2f€.\n\n", nombre, salarioSem, hExtra, salarioExtra, salarioSem+salarioExtra ,salarioSem*semanas+salarioExtra*semanas);
            }
            System.out.println("Pulse cualquier número para calcular otro salario o pulse 0 para salir.");
            reset=Leer.datoInt();
        }while(reset!=0);
        System.out.println("Gracias por usar el programa");
    }

}
