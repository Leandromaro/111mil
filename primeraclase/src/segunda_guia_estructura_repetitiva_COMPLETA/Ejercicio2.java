/*ingrese un numero positivo y mostrar desde el 1 hasta dicho numero
*/
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numero=pant.nextInt();
        for (int x=1;x<=numero;x++){
            System.out.println(x);
        }
    }
    
}
