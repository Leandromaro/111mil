/*
ingresar 3 numeros e imprimirlos en orden creciente
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese 3 numeros");
        int a=pant.nextInt();
        int b=pant.nextInt();
        int c=pant.nextInt();
        if (a>b && a>c && b>c){
            System.out.println(a+b+c);
        }
        else if (a>b && a>c && c>b){
            System.out.println(a+c+b);
        }
        else if (b>a && b>c && a>c){
            System.out.println(b+a+c);
        }
        else if (b>a && b>c && c>a){
            System.out.println(b+c+a);
        }
        else if (c>a && c>b && a>b){
            System.out.println(c+a+b);
        }
        else if (c>b && c>a && b>a){
            System.out.println(c+b+a);
        }
        else if (a==b || a==c){
            System.out.println("algunos numeros ingresados son iguales");
        }
        else if (a==b && a==c){
            System.out.println("todos los numeros ingresados son iguales");
        }
    }
}
