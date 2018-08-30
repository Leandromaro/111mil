package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio16 {
    public static void main (String[]args){
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese una nota del 0 al 10");
        int a=pant.nextInt();
        if (a>=0 && a<=5){
            System.out.println("Insuficiente");
        }
        else if (a>=6 && a<=7){
            System.out.println("Suficiente");
        }
        else if (a>=8 && a<=10){
            System.out.println("Bueno");
        }
    }
}
