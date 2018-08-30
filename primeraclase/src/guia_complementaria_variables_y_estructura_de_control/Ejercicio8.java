/*
Una empresa desea que se realice un programa donde se ingresa el total vendido
de un vendedor del mes y su sueldo, calcular la bonificación,en caso no contar con
la cantidad mínima de ventas informar que ese vendedor está en falta.
a. Mayo de 100 el 20% del sueldo
b. Mayor de 200 el 25% del sueldo
c. Menor de 50 se informa sanción.
*/
package guia_complementaria_variables_y_estructura_de_control;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        int sueldo, venta, bonificacion=0;
        System.out.println("ingrese su sueldo");
        sueldo=pant.nextInt();
        System.out.println("ingrese su el total de su venta");
        venta=pant.nextInt();
        if (venta>100 && venta<200){
            bonificacion=(int)(sueldo*0.20);
            System.out.println("su pago es "+(bonificacion+sueldo));
        }
        else if (venta>200){
            bonificacion=(int)(sueldo*0.25);
            System.out.println("su pago es "+(bonificacion+sueldo));
        }
        else if (venta<50){
            System.out.println("usted esta sancionado");
        }
        else if (venta<10){
            System.out.println("usted esta despedido");
        }
        
    }
    
}
