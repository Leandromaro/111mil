/*
recibir un numero y mostrar su multiplicacion por 3 y 2
 */
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main (String[] args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese nuemero A");
       int a=pant.nextInt();
       System.out.println("por 3: "+a*3);
       System.out.println("por 2: "+a*2);
    }
}
