/*
pedir 2 numeros y decir si uno es multiplo del otro
 */
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main (String[] args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese nuemero A");
       int a=pant.nextInt();
       System.out.println("ingrese numero B");
       int b=pant.nextInt();
       if (a%b==0){
           System.out.println(a+" es multiplo de "+b);
       }
       else if(b%a==0){
           System.out.println(b+" es multiplo de "+a);
            }
       else{
           System.out.println("no son multiplos");
       }
       
    }
}
