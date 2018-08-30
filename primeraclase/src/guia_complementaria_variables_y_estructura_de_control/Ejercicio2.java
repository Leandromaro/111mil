/*
Se desea obtener un número simple por teclado y calcular el cubo del mismo.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero=pant.nextInt();
        System.out.println("el cubo del numero"+numero+" es "+(numero*numero*numero));
    }
    
}
