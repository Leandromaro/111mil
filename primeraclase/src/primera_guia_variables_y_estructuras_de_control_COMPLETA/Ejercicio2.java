/*
pedir 1 numero y decir si es negativo o positivo
 */
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main (String[] args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese nuemero A");
       int a=pant.nextInt();
       if (a>0){
           System.out.println("el numero es positivo");
       }
       else if(a==0){
           System.out.println("la variable ingresada es 0");
       }
       else{
           System.out.println("el numero es negativo");
            }
    }
}
