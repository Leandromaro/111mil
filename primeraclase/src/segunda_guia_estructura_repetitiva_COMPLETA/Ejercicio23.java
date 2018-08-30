/*
Crea una aplicación que dibuje una escalera inversa de asteriscos. Nosotros le pasamos la altura
de la escalera inversa por teclado. Este es un ejemplo:
*****
****
***
**
*
 */
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese la altura de la piramide");
        int altura=pant.nextInt();
        for (int x=altura;x>0;x--){
            for (int i=0;i<x;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
