/*
Una empresa mayorista desea una aplicación donde al ingresar la cantidad del
producto se desea lo siguiente:
a. Compra menor o igual de $1500 se le aplica el %5 de descuento.
b. Compra mayor de $1500 y menor de $2000 se le aplica el %7 de descuento.
c. Compra mayor de $2000 se le aplica el %10 de descuento.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        int compra, descuento, pagar;
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        compra=pant.nextInt();
        if (compra<=1500){
            descuento=(int)(compra*0.5);
            pagar=compra-descuento;
            System.out.println("debe pagar $"+pagar);
        }
        else if (compra>1500 && compra<2000){
            descuento=(int)(compra*0.7);
            pagar=compra-descuento;
            System.out.println("debe pagar $"+pagar);
        }
        else if (compra>2000){
            descuento=(int)(compra*0.10);
            pagar=compra-descuento;
            System.out.println("debe pagar $"+pagar);
        }
    }
    
}
