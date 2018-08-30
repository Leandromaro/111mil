/*
Se desea obtener la fecha de nacimiento de una persona 
y a partir de eso calcular su edad
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese el año en el que nacio");
        int ano=pant.nextInt();
        System.out.println("ingrese año actual");
        int anoA=pant.nextInt();
        int edad=anoA-ano;
        System.out.println("su edad es "+edad+" años");
    }
    
}
