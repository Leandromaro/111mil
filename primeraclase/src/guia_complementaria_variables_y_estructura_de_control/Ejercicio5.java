/*
Elaborar un programa que calcule cuantos DVD necesito para hacer una copia de
seguridad de una carpeta ingresando la cantidad de GB que posee la misma
 */
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int dvd=7;
        System.out.println("ingrese el tamaño de su carpeta en GB");
        int tamano=pant.nextInt();
        int necesario=tamano/dvd;
        System.out.println("necesitara "+necesario+" DVDs");
    }
    
}
