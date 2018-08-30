/*
Crea una aplicación que dibuje una pirámide de asteriscos. Nosotros le pasamos la altura de la
pirámide por teclado. Este es un ejemplo, si introducimos 5 de altura:
      *    
     ***
    *****
   *******
  *********

 */
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio25 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese la altura de la piramide");
        int altura=pant.nextInt();
        for (int x=0;x<altura;x++){
            for (int z=altura-x;z>0;z--){
                System.out.print(" ");
            }
            for (int i=0;i<=x;i++){
                System.out.print("*");
            }
            for (int y=x;y>0;y--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
