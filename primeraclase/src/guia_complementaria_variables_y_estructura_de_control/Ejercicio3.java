/*
Obtener la edad de una persona, se desea saber si es mayor de edad o no.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese su edad");
        int edad=pant.nextInt();
        if (edad>=18){
            System.out.println("usted es mayor");
        }
        else{
            System.out.println("usted es menor");
        }
    }
    
}
