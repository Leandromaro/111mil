/*
Determinar cuántos hombres y cuántas mujeres se encuentran en un grupo de n personas,
suponiendo que los datos son extraídos alumno por alumno.
 */
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        boolean condicion=true;
        int contH=0, contM=0;
        while (condicion){
            System.out.println("hay personas por ingresar?si/no");
            String pregunta=pant.next();
            if (pregunta.equals("si")){
                System.out.println("hombre o mujer?\n1=hombre\n2=mujer");
                int opcion=pant.nextInt();
                if (opcion==1){
                    contH++;
                }
                else if (opcion==2){
                    contM++;
                }
                else{
                    System.out.println("vuelva a ingresar");
                }
            }
            else if (pregunta.equals("no")){
                condicion=false;
            }
        }
        System.out.println("cantidad de hombres "+contH);
        System.out.println("cantidad de mujeres "+contM);
        System.out.println("cantidad de personas "+(contH+contM));
    }
    
}
