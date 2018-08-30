/*
ingresar un numero del 0 al 10 y mostrar el numero escrito
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio17 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int a=pant.nextInt();
        if (a==0){
            System.out.println("cero");
        }
        else if (a==1){
            System.out.println("uno");
        }
        else if (a==2){
            System.out.println("dos");
        }
        else if (a==3){
            System.out.println("tres");
        }
        else if (a==4){
            System.out.println("cuatro");
        }
        else if (a==5){
            System.out.println("cinco");
        }
        else if (a==6){
            System.out.println("seis");
        }
        else if (a==7){
            System.out.println("siete");
        }
        else if (a==8){
            System.out.println("ocho");
        }
        else if (a==9){
            System.out.println("nueve");
        }
        else if (a==10){
            System.out.println("Diez");
        }
    }
}
