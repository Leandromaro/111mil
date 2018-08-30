/*
pedir un numero entre 0 y 9999 y decir si es capicua
*/
package primera_guia_variables_y_estructuras_de_control_COMPLETA;
import java.util.Scanner;
public class Ejercicio15arreglos {
    public static void main (String[]args){
        Scanner pant = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a=pant.nextInt();
        String num = String.valueOf(a);
        char anali[]= num.toCharArray();
        if (num.length()==4){
            if (anali[0]==anali[3] && anali[1]==anali[2]){
                System.out.println("El numero es capicua");    
        }
            else{
                System.out.println("El numero no es capicua");
            }
        }
        else if (num.length()==3){
            if (anali[0]==anali[2]){
                System.out.println("El numero es capicua");
            }
            else{
                System.out.println("El numero no es capicua");
            }
        }
        else if (num.length()==2){
            if (anali[0]==anali[1]){
                System.out.println("El numero es capicua");
            }
            else{
                System.out.println("El numero no es capicua");
            }
        }
        else if (num.length()==1){
            System.out.println("ingreso 1 cifra");
        }
    }   
}
