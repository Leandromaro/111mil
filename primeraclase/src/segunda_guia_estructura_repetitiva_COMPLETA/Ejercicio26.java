/*
Crea una aplicación que dibuje una pirámide invertida de asteriscos. Nosotros le pasamos la
altura de la pirámide por teclado. Este es un ejemplo:
*********
 *******
  *****
   ***
    *
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese altura");
        int altura=pant.nextInt();
        for (int x=altura;x>=0;x--){
            for (int i=altura-x;i>0;i--){
                System.out.print(" ");
            }
            for (int z=0;z<x;z++){
                System.out.print("*");
            }
            for (int y=0-1;y<x;y++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
    
}
