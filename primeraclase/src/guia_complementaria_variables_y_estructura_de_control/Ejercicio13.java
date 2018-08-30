/*
Se desea realizar una aplicación donde al ingresar un numero por teclado se
desea conocer si mayor que 30 si se cumple se desea saber si es par o impar.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {
        int numero;
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        numero=pant.nextInt();
        if (numero>30){
            if (numero%2==0){
                System.out.println("el numero es par");
            }
            else{
                System.out.println("el numero es impar");
            }
        }
        else{
            System.out.println("el numero es menor a 30");
        }
    }
    
}
