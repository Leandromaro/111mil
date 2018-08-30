/*
Se desea obtener por teclado la edad de dos hermanos y que muestre cual es mayo
y cual es el menor y cuantos años se llevan.
 */
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese edad del primer hermano");
        int edad1=pant.nextInt();
        System.out.println("ingrese edad del segundo hermano");
        int edad2=pant.nextInt();
        if (edad1>edad2){
            System.out.println("el primer hermano es mayor");
            int llevar=edad1-edad2;
            System.out.println("se llevan "+llevar+" años");
        }
        else if (edad1==edad2){
            System.out.println("tienen la misma edad");
        }
        else{
            System.out.println("el segundo hermano es mayor");
            int llevar=edad2-edad1;
            System.out.println("se llevan "+llevar+" años");
        }
        
    }
    
}
