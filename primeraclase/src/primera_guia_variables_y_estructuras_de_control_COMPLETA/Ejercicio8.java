/*
Ingresar un número por teclado e indicar si es positivo o negativo
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner pant = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero");
        numero=pant.nextInt();
        if (numero<0){
            System.out.println("el numero es negativo");
        }
        else{
            System.out.println("el numero es positivo");
        }
    }
    
}
