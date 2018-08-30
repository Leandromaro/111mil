/*
ingresar 2 numeros y decir si son iguales
 */
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main (String[] args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese nuemero A");
       int a=pant.nextInt();
       System.out.println("ingrese numero B");
       int b=pant.nextInt();
       if (a==b){
           System.out.println("los numeros son iguales");
       }
       else{
           System.out.println("los numeros no son iguales");
            }
    }
}
