/*
En una empresa se requiere calcular el salario semanal de cada uno de los n obreros que
laboran en ella. El salario se obtiene de la siguiente forma:
a. Si el obrero trabaja 40 horas o menos se le paga $20 por hora
b. Si trabaja más de 40 horas se le paga $20 por cada una de las primeras 40 horas y $25
por cada hora extra.
 */
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese la cantidad de obreros");
        int cantidadObreros=pant.nextInt();
        for (int x=1;x<cantidadObreros+1;x++){
            int pago,horasExtra,totalSemanal=0;
            System.out.println("ObreroNº"+x+" cuantos dias trabajo esta semana?");
            int diasTrabajados=pant.nextInt();
            for (int i=1;i<diasTrabajados+1;i++){
                System.out.println("ObreroNº"+x+" ingrese su cantidad de horas en el DiaNº"+i);
                int horas=pant.nextInt();
                if (horas>40){
                    horasExtra=horas-40;
                    pago=((horas-horasExtra)*20)+(horasExtra*25);
                    totalSemanal=pago+totalSemanal;
                }
                else if (horas<=40 && horas>0){
                    pago=horas*20;
                    totalSemanal=pago+totalSemanal;
                }
                else if (horas==0){
                    System.out.println("error usted ingreso un 0");
                    i--;
                }
            }
            System.out.println("salario semanal del ObreroNº"+x+" es "+totalSemanal);
        }
    }
    
}
