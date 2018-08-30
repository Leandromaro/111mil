/*
Se desea calcular el número primo de un número.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        int numero;
        boolean primo=true;
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        numero=pant.nextInt();
        if (numero%2==0 && numero!=2){
            primo=false;
        }
        else if (numero%3==0 && numero!=3){
            primo=false;
        }
        else if (numero%5==0 && numero!=5){
            primo=false;
        }
        else if (numero%7==0 && numero!=7){
            primo=false;
        }
        else if (numero%11==0 && numero!=11){
            primo=false;
        }
        if (primo){
            System.out.println("el numero es primo");
        }
        else{
            System.out.println("el numero no es primo");
        }
    }
    
}
