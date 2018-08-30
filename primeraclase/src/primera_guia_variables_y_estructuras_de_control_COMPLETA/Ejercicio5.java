/*
decir cual de los 2 numeros ingresados es mayor
 */
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main (String[] args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese nuemero A");
       int a=pant.nextInt();
       System.out.println("ingrese numero B");
       int b=pant.nextInt();
       if (a>b){
           System.out.println(a+" es mayor a "+b);
       }
       else{
           System.out.println(b+" es menor "+a);
            }
}
}
