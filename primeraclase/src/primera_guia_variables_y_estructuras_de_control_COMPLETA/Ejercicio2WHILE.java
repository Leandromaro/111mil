package primera_guia_variables_y_estructuras_de_control_COMPLETA;

import java.util.Scanner;

public class Ejercicio2WHILE {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a=scan.nextInt(), cont=0, cont2=1;
        while(cont2<=a){
            if (a%cont2==0){
                cont++;
            }
            cont2++;
        }
        if (cont>2){
            System.out.println("el numero no es primo");
        }
        else{
            System.out.println("el numero es primo");
        }
    }
}
