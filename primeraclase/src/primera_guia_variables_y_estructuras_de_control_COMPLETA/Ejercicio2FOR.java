package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio2FOR {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a=scan.nextInt(),cont=1;
        for (int i=1; i<=a;i++){
            if (a%i==0){
             cont++;   
            }
        }
        if (cont>3){
            System.out.println("el numero no es primo");
        }
        else{
            System.out.println("el numero es primo");
        }
    }   
}

