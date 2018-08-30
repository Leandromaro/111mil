/*
pedir un numero entre 0 y 9999 y decir cuantas cifras tiene
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[]args){
       Scanner pant = new Scanner (System.in);
       System.out.println("ingrese un numero entre el 0 y el 9999");
       int a=pant.nextInt();
       if (a>=0 && a<10){
           System.out.println("el numero tiene 1 cifra");
       }
       else if (a>=10 && a<100){
           System.out.println("el numero tiene 2 cifras");
       }
       else if (a>=100 && a<1000){
           System.out.println("el numero tiene 3 cifras");
       }
       else if (a>=1000 && a<=9999){
           System.out.println("el numero tiene 4 cifras");
       }
}
}
