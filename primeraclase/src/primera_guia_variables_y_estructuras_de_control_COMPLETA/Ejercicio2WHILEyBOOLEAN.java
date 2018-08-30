package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio2WHILEyBOOLEAN {
public static void main (String[]args){
    Scanner scan = new Scanner(System.in);
    System.out.println("ingrese un numero");
    int num=scan.nextInt(), i=2;
    boolean condition=true;
    while (condition && i<num){
        if (num%i==0){
            condition=false;
        }
        i++;
    }
    if (condition){
        System.out.println("el numero es primo");
    }
    else{
        System.out.println("el numero no es primo");
    }
}    
}
