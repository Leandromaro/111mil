/*Calcular e imprimir las tablas de multiplicar del 1 al número ingresado. 
Imprimir a qué tabla pertenece y el multiplicando, el multiplicador y el producto 
(con las 3 estructuras).
 */
package segunda_guia_estructura_repetitiva_COMPLETA;
import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner pant = new Scanner (System.in);
        System.out.println("ingrese un numero");
        int numeroIngresado=pant.nextInt(),producto;
        System.out.println("pertenece a la table del "+numeroIngresado);
        for (int x=1;x<=numeroIngresado;x++){
            producto=numeroIngresado*x;
            System.out.println("multiplicando:"+numeroIngresado+"\nmultiplicador:"+x+"\nproducto:"+producto);
        }
    }
}
