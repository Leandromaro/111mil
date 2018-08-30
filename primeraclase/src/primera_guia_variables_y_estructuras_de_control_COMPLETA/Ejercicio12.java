/*
ingresar 4 numeros a,b,c,d y:
b=c c=a a=d d=b
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio12 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese nuemero A");
       int a=pant.nextInt();
        System.out.println("ingrese nuemero B");
       int b=pant.nextInt();
        System.out.println("ingrese nuemero C");
       int c=pant.nextInt();
        System.out.println("ingrese nuemero D");
       int d=pant.nextInt();
       b=c;
       c=a;
       a=d;
       d=b;
       System.out.println("numero A:"+a+"\nnumero B:"+b+"\nnumero C:"+c+"\numero D:"+d);
    }
    
}
