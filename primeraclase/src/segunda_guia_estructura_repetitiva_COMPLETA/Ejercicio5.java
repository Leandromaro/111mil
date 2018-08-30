/*Construir un programa que calcule el factorial de un valor numérico 
introducido como parámetro o argumento en la línea de comandos. 
 */
package segunda_guia_estructura_repetitiva_COMPLETA;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese el numero");
        int numero=pant.nextInt(), factorial=1;
        for (int x=1;x<=numero;x++){
            factorial=factorial*x;
        }
        System.out.println("factorial de "+numero+" es "+factorial);
    }
    
}
