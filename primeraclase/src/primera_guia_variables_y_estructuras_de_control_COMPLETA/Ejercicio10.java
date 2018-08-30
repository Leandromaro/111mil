/*
ingresar un numero de 0 a 99 e indicar si es mayor a 15, en caso de serlo:
obtener el doble del numero y notificarlo, caso contrario solo informar que
no es mayor a 15.
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio10 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero entre el 0 y 99");
        int a=pant.nextInt();
        if (a>15){
            System.out.println(a*2);
        }
        else{
            System.out.println("el numero es menor a 15");
        }
    }
    
}
