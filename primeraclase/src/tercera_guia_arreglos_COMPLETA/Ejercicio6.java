/*
 del ejercicio anterior mostar las notas mayores a 6
 */
package tercera_guia_arreglos_COMPLETA;

import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        int a[]= new int[5];
        Scanner pant = new Scanner (System.in);
        for (int x=0;x<(a.length);x++){
            System.out.println("ingrese la nota del alumno "+(x+1));
            a[x]=pant.nextInt();
    }
        for (int x=0;x<(a.length);x++){
            if (a[x]>=6){
                System.out.println("el alumno "+(x+1)+" aprobo");
            }
        }
    
}
}
