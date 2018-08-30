/*
Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le pasamos la altura de la
escalera por teclado. Este es un ejemplo si insertaras un 5 de altura:
*
**
***
****
*****
*/
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese la altura de la piramide");
        int altura=pant.nextInt();
        for (int x=0;x<altura;x++){
            for (int i=0;i<=x;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
